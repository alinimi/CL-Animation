/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp;

import interp.AnimatedObject.Transform;
import interp.data.SvgObject.Shape;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Clase que representa la animación obtenida a partir del programa. 
 * 
 * @author Alicia
 */
public class Animation{
    /**
     * HashMap de los objetos que hay en la animación. Sus keys son los
     * identificadores de los objetos.
     */
    private HashMap<String,AnimatedObject> objects;
    
    /**
     * Anchura del elemento svg de la animación.
     */
    private int width;
    
    /**
     * Altura del elemento svg de la animación.
     */
    private int height;
    
    /**
     * Último id numérico utilizado. Se utiliza para combinar los objetos de 
     * animaciones diferentes.
     */
    int lastID;
    
    /**
     * Constructor. Crea una ventana de animación sin objetos y con tamaño
     * por defecto 500x500px.
     */
    public Animation(){
        width = 500;
        height = 500;
        objects = new HashMap<String,AnimatedObject>();
        lastID = 0;
    }
    
    /**
     * Setter del tamaño de la animación.
     * @param w Anchura.
     * @param h Altura.
     */
    public void setSize(int w, int h){
        width = w;
        height = h;
    }
    
    /**
     * Copia el objeto con id el primer parámetro. Añade el nuevo objeto al map
     * con id newId.
     * @param id ID del objeto a copiar.
     * @param newId ID del nuevo objeto.
     */
    public void copyObject(String id, String newId){
        AnimatedObject x = objects.get(id);
        AnimatedObject obj = new AnimatedObject(objects.get(id));
        objects.put(newId, obj);
    }
    
    
    /**
     * Crea un objeto y lo añade a la animación
     * @param type tipo de objeto (RECTANGLE, CIRCLE, ELLIPSE, TEXT, LINE, POLYGON)
     * @param id String que sirve como identificador único del objeto.
     * @param coords Coordenadas en píxeles de un punto descriptivo del objeto (el centro en 
     * círculos y elipses, la esquina superior izquierda en rectángulos y la esquina
     * inferior izquierda en textos) o de todos sus puntos en caso de polilíneas
     * y polígonos
     * @param attrs HashMap de atributos del objeto y sus valores en el momento
     * 0s de la animación
     * @param creationTime Momento en segundos en el que aparecerá el objeto en la
     * animación
     */
    public void create(Shape type, String id, int[] coords, HashMap<String,Object> attrs,
        float creationTime){
        if(!objects.containsKey(id)){
            AnimatedObject obj = new AnimatedObject(type, coords, attrs, creationTime);
            
            objects.put(id, obj);
        }
        //error handling
    }
    
    /**
     * Comprueba si existe un objeto con identificador id en la animación
     * @param id Posible identificador de un objeto
     * @return true si existe el objeto; false en caso contrario
     */
    public boolean objectExists(String id){
        return objects.containsKey(id);
    }
    
    /**
     * Cambia el momento en segundos en el que el objeto id desaparece de la 
     * animación
     * @param id Identificador del objeto
     * @param time Timestamp de la acción
     */
    public void destroy(String id, float time){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.setDestructionTime(time);
        }
    }
    
    /**
     * Set del valor del atributo que tiene el objeto desde su creación
     * @param id Identificador del objeto
     * @param name Nombre del atributo
     * @param value Valor que tiene el atributo al comienzo de la vida del objeto
     */
    public void modify(String id, String name, String value){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.setAttribute(name, value);
        }
    }
    
    /**
     * modifica el atributo name de valueIni a valueEnd en los tiempos
     * especificados
     * @param id Identificador del objeto
     * @param name Nombre del atributo
     * @param valueEnd Valor final del atributo
     * @param timeStart Momento en el que empieza la animación (en segundos)
     * @param timeEnd Momento final de la animación (en segundos)
     * @return cierto si hay una animación del mismo atributo que se solapa en
     * el tiempo con la nueva animación, falso si no existe el objeto id o si 
     * ninguna animación se solapa
     */
    public boolean modify(String id, String name, 
            Object valueEnd, float timeStart, float timeEnd){
        if(objects.containsKey(id)){
            
            AnimatedObject obj = objects.get(id);
            return obj.addAnimation(timeStart, timeEnd, name, valueEnd);
            
        }
        return false;
    }
    
    /**
     * Modifica el valor del atributo name en un momento time determinado.
     * @param id Identificador del objeto.
     * @param name Nombre del atributo.
     * @param valueEnd Valor final del atributo.
     * @param time Momento de la animación en el que se modifica el atributo.
     */
    public void modify(String id, String name, Object valueEnd,
            float time){
        if(objects.containsKey(id)){
            
            AnimatedObject obj = objects.get(id);
            obj.addSet(time, name, valueEnd);
            
        }
    }
    
    /**
     * Mueve el objeto con identificador id de (xIni,yIni) a (xEnd,yEnd) en el
     * intervalo [timeStart,timeEnd]
     * @param id Identificador del objeto.
     * @param xIni Coordenada x del objeto al inicio del move.
     * @param yIni Coordenada y del objeto al inicio del move.
     * @param xEnd Coordenada x del objeto al final del move.
     * @param yEnd Coordenada y del objeto al final del move.
     * @param timeStart Momento de inicio del move.
     * @param timeEnd Momento de final del move.
     */
    public void move(String id, float xIni, float yIni, 
            float xEnd, float yEnd, float timeStart, float timeEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.addTransform(
                    Transform.TRANSLATE, timeStart, timeEnd, 
                    xIni+" "+yIni, xEnd+" "+yEnd);
            
        }
    }
    
    /**
     * Mueve el objeto con identificador id de (xIni,yIni) a (xEnd,yEnd) al
     * principio de la animación.
     * @param id Identificador del objeto.
     * @param xEnd Coordenada x del objeto al final del move.
     * @param yEnd Coordenada y del objeto al final del move.
     */
    public void move(String id, float xEnd, float yEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            String newAttr = "translate("+xEnd+","+yEnd+")";
            if(obj.hasAttribute("transform")){
                String attr = (String)obj.getAttribute("transform");
                attr = attr+", "+newAttr;
                obj.setAttribute("transform", attr);
            }
            else{
                obj.setAttribute("transform", newAttr);
            }
            
        }
    }
    
    /**
     * Multiplica la escala del objeto por sizeEnd. El escalado se hace en las
     * dos dimensiones por igual.
     * @param id Identificador del objeto.
     * @param sizeEnd Factor de escalado.
     */
    public void scale(String id, float sizeEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            String newAttr = "scale("+sizeEnd+","+sizeEnd+")";
            if(obj.hasAttribute("transform")){
                String attr = (String)obj.getAttribute("transform");
                attr = attr+", "+newAttr;
                obj.setAttribute("transform", attr);
            }
            else{
                obj.setAttribute("transform", newAttr);
            }
            
        }
    }
    
    /**
     * Modifica la escala del objeto entre sizeStart y sizeEnd durante el
     * intervalo [timeStart,timeEnd]. El escalado se hace en las dos dimensiones
     * por igual.
     * @param id Identificador del objeto.
     * @param sizeStart Factor de escalado inicial.
     * @param sizeEnd Factor de escalado final.
     * @param timeStart Momento de inicio de la transformacion de escalado.
     * @param timeEnd Momento de final de la transformacion de escalado.
     */
    public void scale(String id, float sizeStart, float sizeEnd, float timeStart, float timeEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.addTransform(
                    Transform.SCALE, timeStart, timeEnd, 
                    sizeStart+" "+sizeStart, sizeEnd+" "+sizeEnd);
            
        }
    }
    
    /**
     * Rota el objeto angleEnd grados antes del inicio de la animación.
     * El centro de rotación depende del objeto.
     * @param id Identificador del objeto.
     * @param angleEnd Ángulo relativo al ángulo anterior.
     */
    public void rotate(String id, float angleEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            String newAttr = "rotate("+angleEnd+" "+
                        obj.getRotationCenterX()+","+obj.getRotationCenterY()+")";
            
            if(obj.hasAttribute("transform")){
                String attr = (String)obj.getAttribute("transform");
                attr = attr+", "+newAttr;
                obj.setAttribute("transform", attr);
            }
            else{
                obj.setAttribute("transform", newAttr);
            }
            
        }
    }
    
    /**
     * Rota el objeto entre angleStart y angleEnd en el intervalo
     * [timeStart,timeEnd]. El centro de rotación depende del objeto.
     * @param id Identificador del objeto.
     * @param angleStart Ángulo inicial de rotación.
     * @param angleEnd Ángulo final.
     * @param timeStart Momento de inicio de la rotación.
     * @param timeEnd Momento de final de la rotación.
     */
    public void rotate(String id, float angleStart, float angleEnd, float timeStart, float timeEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.addTransform(
                    Transform.ROTATE, timeStart, timeEnd, 
                    angleStart+" ", angleEnd+" ");
            
        }
    }
    
    /**
     * Obtiene la representación de la animación en svg.
     * @return Animación especificada en svg
     */
    @Override
    public String toString(){
        String svg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
        svg = svg + "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.0//EN\" \"http://www.w3.org/TR/SVG/DTD/svg10.dtd\" >\n";

        svg = svg+ "<svg width=\""+ width +"\" height=\""+height;
        svg = svg+ "\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">";
        for(String s:objects.keySet()){
            AnimatedObject obj = objects.get(s);
            svg = svg+"\n"+obj.toString();
        }
        svg = svg+"</svg>\n";
        return svg;
    }
    
    /**
     * Añade a la animación los objetos de la animación pasada por parámetro.
     * @param x Animación.
     */
    public void merge(Animation x){
        for(AnimatedObject obj: x.objects.values()){
            objects.put(Integer.toString(lastID), obj);
            ++lastID;
        }
    }
}
