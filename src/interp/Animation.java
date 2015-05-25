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
 *
 * @author Alicia
 */
public class Animation{
    private HashMap<String,AnimatedObject> objects;
    private int width;
    private int height;
    int lastID;
    
    /**
     * Constructor. Crea una ventana de animación sin objetos
     */
    public Animation(){
        width = 500;
        height = 500;
        objects = new HashMap<String,AnimatedObject>();
        lastID = 0;
    }
    
    public void setSize(int w, int h){
        width = w;
        height = h;
    }
    
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
     * @param id
     * @param xIni
     * @param yIni
     * @param xEnd
     * @param yEnd
     * @param timeStart
     * @param timeEnd
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
     *
     * @param id
     * @param xEnd
     * @param yEnd
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
     *
     * @param id
     * @param sizeEnd
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
     *
     * @param id
     * @param sizeStart
     * @param sizeEnd
     * @param timeStart
     * @param timeEnd
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
     *
     * @param id
     * @param angleEnd
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
     *
     * @param id
     * @param angleStart
     * @param angleEnd
     * @param timeStart
     * @param timeEnd
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
     *
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
    
    public void merge(Animation x){
        for(AnimatedObject obj: x.objects.values()){
            objects.put(Integer.toString(lastID), obj);
            ++lastID;
        }
    }
}
