/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp;

import interp.data.SvgObject;
import interp.data.SvgObject.Shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Clase que representa un objeto del lenguaje. Permite obtener su traducción
 * a svg.
 * 
 * @author alicia
 */
public class AnimatedObject {

    /**
     * Enum de los tipos de transformaciones geométricas que se pueden aplicar
     * a un objeto. (ROTATE, SCALE, TRANSLATE)
     */
    public enum Transform{ROTATE,SCALE,TRANSLATE;}
    
    /**
     * Tiempo en segundos a partir del inicio de la animación en el que aparece
     * el objeto.
     */
    private float creationTime;
    
    /**
     * Forma básica que tiene el objeto. (CIRCLE, ELLIPSE, TEXT, LINE, POLYGON,
     * RECTANGLE)
     */
    private SvgObject.Shape objectType;
    
    /**
     * Tiempo en segundos a partir del inicio de la animación en el que se
     * destruye el objeto.
     */
    private float destructionTime;
    
    /**
     * Coordenadas que describen la posición del objeto. Son de la forma
     * {x_0,y_0,...,x_n,y_n} para polígonos y líneas con n vértices y {x,y}
     * para el resto de formas.
     */
    private int[] coords;
    /**
     * Contenido de un objeto de tipo texto. Null para objetos de otros tipos.
     */
    private String text;
    
    /**
     * Map de los nombres de los atributos que tiene el objeto a sus valores.
     */
    private HashMap <String,Object> attributeMap;
    
    /**
     * Lista de animaciones que se aplican al objeto.
     */
    private ArrayList <ObjectAnimation> animationList;
    
    /**
     * Lista de transformaciones que se aplican al objeto.
     */
    private ArrayList <ObjectTransform> transformList;
    
    /**
     * Lista de cambios de atributos que se aplican al objeto después de su
     * creación.
     */
    private ArrayList <ObjectSet> setList;
    

    /**
     * Coordenada x del centro de rotación del objeto.
     */
    private float rotationCenterX;
    
    /**
     * Coordenada y del centro de rotación del objeto.
     */
    private float rotationCenterY;
    
    
    
    /**
     * Creadora copiadora.
     * @param x Un objeto.
     */
    public AnimatedObject(AnimatedObject x){
        creationTime = x.creationTime;
        objectType = x.objectType;
        destructionTime = x.destructionTime;
        coords = x.coords;
        if(x.objectType == SvgObject.Shape.TEXT){
            text = new String(x.text);

        }
        //Shallowcopy!!
        attributeMap = new HashMap<String,Object>(x.attributeMap);
        animationList = new ArrayList <ObjectAnimation>();
        for(ObjectAnimation obj:animationList){
            animationList.add(new ObjectAnimation(obj));
        }
        transformList = new ArrayList<ObjectTransform>();
        for(ObjectTransform obj:transformList){
            transformList.add(new ObjectTransform(obj));
        }
        setList = new ArrayList<ObjectSet>();
        for(ObjectSet obj:setList){
            setList.add(new ObjectSet(obj));
        }
        rotationCenterX = x.rotationCenterX;
        rotationCenterY = x.rotationCenterY;
    }
    
    /**
     * Creadora. Recibe como parámetros el tipo de objeto, sus coordenadas, un
     * map de atributos que tendrá el objeto desde el momento de su creación, y
     * el tiempo en que aparecerá el objeto en la animación.
     * @param type Forma básica del objeto
     * @param coordinates Coordenadas que describen la posición del objeto. Son de la forma
     * {x_0,y_0,...,x_n,y_n} para polígonos y líneas con n vértices y {x,y}
     * para el resto de formas.
     * @param attrs Map de nombres de atributos a sus valores. La clase del valor
     * tiene que implementar toString()
     * @param startTime Momento de creación del objeto
     */
    public AnimatedObject(Shape type, int[] coordinates,
            HashMap<String,Object> attrs, float startTime){
        //type
        objectType = type;
        
        //coords
        coords = coordinates;
        
        //attrs
        attributeMap = attrs;
        


        creationTime = startTime;
        
        animationList = new ArrayList <ObjectAnimation>();
        transformList = new ArrayList <ObjectTransform>();
        setList = new ArrayList <ObjectSet>();
        
        findRotationCenter();
    }
    
    
    /**
     * Comprueba si una animación puede entrar en conflicto con otra que ya 
     * existe en el objeto. Tiene como argumentos los parámetros de una animación.
     * @param attr Atributo que modifica la animación.
     * @param start Segundo en el que empieza la animación.
     * @param end Segundo en el que acaba la animación.
     * @return True si existe una animación en el objeto con el atributo attr
     * que se solape en el tiempo con [start,end]
     */
    public boolean overlappingAnimations(String attr, float start, float end){
        for(ObjectAnimation w:animationList){
            if(attr.equals(w.attribute)){
                if((start >= w.startTime && start <= w.endTime) ||
                        (end >= w.startTime && end <= w.endTime))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Consulta la forma básica del objeto.
     * @return Uno de CIRCLE, ELLIPSE, TEXT, LINE, POLYGON, RECTANGLE
     */
    public Shape getType(){
        return objectType;
    }
    
    /**
     * Modifica el valor del atributo o lo crea si no existe.
     * @param name Nombre del atributo.
     * @param value Nuevo valor del atributo name.
     */
    public void setAttribute(String name, String value){
        attributeMap.put(name, value);
    }
    
    /**
     * Añade varios atributos a la vez.
     * @param attrs Map nombre de atributo-valor.
     */
    public void addAttributes(HashMap<String,Object> attrs){
        attributeMap.putAll(attrs);
        findRotationCenter();
    }
    
    /**
     * Obtiene el valor en el objeto del atributo name.
     * @param name Nombre del atributo.
     * @return Valor del atributo.
     */
    public Object getAttribute(String name){
        return attributeMap.get(name);
    }
    
    /**
     * Añade una animación al objeto. Durante el intervalo [st,et] el atributo
     * attr transiciona entre el valor que tenía anteriormente el atributo, que viene
     * dado por las modificaciones del atributo que se han hecho anteriormente, y
     * un nuevo valor especificado por ev.
     * @param st Tiempo de inicio de la animación.
     * @param et Tiempo de final de la animación.
     * @param attr Atributo del objeto que se modifica en la animación.
     * @param ev Valor del atributo al final de la animación.
     * @return True si la nueva animación se solapa en el tiempo con alguna del 
     * mismo atributo que existiera anteriormente. False en caso contrario.
     */
    public boolean addAnimation(float st, float et, String attr, 
                Object ev){
        boolean overlap = overlappingAnimations(attr,st,et);
        ObjectAnimation an = new ObjectAnimation(st,et,attr,ev);
        animationList.add(an);
        return overlap;
    }
    
    /**
     * Cambia un atributo del objeto en un tiempo determinado.
     * @param time Tiempo en segundos.
     * @param attr Nombre del atributo.
     * @param ev Nuevo valor del atributo.
     */
    public void addSet(float time, String attr, Object ev){
        ObjectSet an = new ObjectSet(time,attr,ev);
        setList.add(an);
    }
    
    /**
     * Añade una transformación geométrica animada al objeto.
     * @param type Tipo de transformación (ROTATE|TRANSLATE|SCALE)
     * @param st Tiempo de inicio de la transformación
     * @param et Tiempo de final de la transformación
     * @param sv Valor inicial de la transformación. String con formato de svg.
     * @param ev Valor final de la transformación. String con formato de svg.
     */
    public void addTransform(Transform type, float st, float et, String sv, String ev){
        ObjectTransform t = new ObjectTransform(st,et,type,sv,ev);
        transformList.add(t);
    }

    /**
     * Momento en el que se crea el objeto.
     * @return Tiempo en segundos a partir del inicio de la animación.
     */
    public float getCreationTime() {
        return creationTime;
    }

    /**
     * Setter del momento de creación del objeto.
     * @param creationTime Tiempo en segundos.
     */
    public void setCreationTime(float creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Getter del momento en el que se destruye el objeto.
     * @return Tiempo en segundos
     */
    public float getDestructionTime() {
        return destructionTime;
    }

    /**
     * Comprueba si el objeto tiene un valor especificado para el atributo name.
     * @param name Nombre del atributo.
     * @return True si el objeto tiene un valor para el atributo name. False en
     * caso contrario
     */
    public boolean hasAttribute(String name){
        return attributeMap.containsKey(name);
    }
    
    /**
     * Setter del momento en el que se destruye el objeto.
     * @param destructionTime Tiempo en segundos.
     */
    public void setDestructionTime(float destructionTime) {
        this.destructionTime = destructionTime;
    }
    
    /**
     * Finds the center of the object, which is used in rotation transforms.
     */
    private void findRotationCenter(){
        if(objectType == Shape.POLYGON || objectType == Shape.LINE){
            int sumX = 0;
            int sumY = 0;
            for(int i = 0; i < coords.length; i+=2){
                sumX += coords[i];
                sumY += coords[i+1];
            }
            rotationCenterX = sumX/coords.length*2;
            rotationCenterY = sumY/coords.length*2;
        } 
        else{
            
            rotationCenterX = coords[0];
            rotationCenterY = coords[1];
        }
    }
    
    /**
     * Getter de la coordenada x del centro de rotación del objeto.
     * @return rotationCenterX.
     */
    public float getRotationCenterX(){
        return rotationCenterX;
    }
    
    /**
     * Getter de la coordenada y del centro de rotación del objeto.
     * @return rotationCenterY.
     */
    public float getRotationCenterY(){
        return rotationCenterY;
    }
    
    /**
     * Obtiene el tag svg asociado al tipo de objeto.
     * @return String que contiene el tag.
     */
    private String getTag(){
        switch(objectType){
            case RECTANGLE:
                return "rect";
            case TEXT:
                return "text";
            case CIRCLE:
                return "circle";
            case ELLIPSE:
                return "ellipse";
            case LINE:
                return "polyline";
            case POLYGON:
                return "polygon";
            default:
                return null;
            
        }
    }
    
    /**
     * Obtiene la traducción a svg del valor del atributo s.
     * @param s Nombre del atributo
     * @return String con el valor del atributo.
     */
    private String getAttributeString(String s){
        if(s.equals("font-orientation")){
            if(((String)attributeMap.get(s)).equals("vertical")){
                return "writing-mode=\"tb\" glyph-orientation-vertical=\"0\"";
            }
            else{
                return "";
            }
        }
        String value = getValueString(s,attributeMap.get(s));
        return getNameString(s) + "=\""+value+"\"";
    }
    
    
    /**
     * Obtiene la traducción a svg del array de coordenadas del objeto.
     * @return Descripción de las coordenadas en formato svg.
     */
    private String getCoordString(){
        String svg = "";
        if(objectType == SvgObject.Shape.CIRCLE ||
                objectType == SvgObject.Shape.ELLIPSE){
            svg += " cx=\"" + coords[0]+ "\"";
            svg += " cy=\"" + coords[1]+ "\"";
        }
        else if(objectType == SvgObject.Shape.LINE ||
                objectType == SvgObject.Shape.POLYGON){
            svg += " points=\"" + coords[0] + ","+ coords[1]; 
            for(int i = 2; i < coords.length; i+=2){
                svg += " "+coords[i] + "," + coords[i+1];
            }
            svg += "\"";
        }
        else {
            svg += " x=\"" + coords[0]+ "\"";
            svg += " y=\"" + coords[1]+ "\"";
        }
       
        return svg;
    }
    
    
    
    /**
     * Obtiene la traducción a svg del objeto.
     * @return String en svg que representa el objeto y sus animaciones
     */
    @Override
    public String toString(){
        String tab = "\t";
        String tag = getTag();
        String svg = tab+"<"+tag;
        
        
        svg += getCoordString();
        
        for(String s: attributeMap.keySet()){
            if(s!="text"){
                svg += " "+getAttributeString(s);
            }
        }
        if(creationTime!=0){
            svg += " display=\"none\"";
        }
        
        if(objectType == SvgObject.Shape.LINE && !hasAttribute("fill")){
            svg += " fill=\"none\"";
        }
        
        svg += ">\n";
        if(hasAttribute("text")){
            svg += "\t\t"+(String)getAttribute("text")+"\n";
        }
        if(creationTime!=0){
            svg += "\t\t<set attributeName=\"display\" to=\"inline\""
                    + " begin=\""+creationTime+"s\" dur=\"indefinite\"/>\n";
        }
        if(destructionTime!=0){
            svg += "\t\t<set attributeName=\"display\" to=\"none\""
                    + " begin=\""+destructionTime+"s\" dur=\"indefinite\"/>\n";
        }
        
        for(ObjectAnimation anim: animationList){
            svg += anim.toString();
        }
        for(ObjectTransform tr: transformList){
            svg += tr.toString();
        }
        for(ObjectSet tr: setList){
            svg += tr.toString();
        }
        svg += "\t</"+tag+">\n";
        

        return svg;
    }
    
    /**
     * Obtiene el nombre en svg del atributo name.
     * @param name Nombre del atributo en el lenguaje.
     * @return String con formato svg.
     */
    private String getNameString(String name){
        if("stroke-pattern".equals(name)){
            return "stroke-dasharray";
        }
        return name;
    }
    
    /**
     * Obtiene la string en formato svg del atributo y su valor
     * @param name Nombre del atributo
     * @param value Valor del atributo
     * @return String en formato svg.
     */
    private String getValueString(String name, Object value){
        if("stroke-pattern".equals(name)){
            String v = (String) value;
            
            if(attributeMap.containsKey("stroke-width")){
                int sw = (int)attributeMap.get("stroke-width");
                if(v.equals("dots")){
                    return sw+","+sw;
                }
                
                else if (v.equals("lines")){
                    sw = 2*sw; 
                    return sw+","+sw;
                }
                else if (v.equals("alternate")){
                    return 2*sw+","+sw+","+sw+","+sw;
                }
                else return "0";
            }
            else{
                if(v.equals("dots")){
                    return "2,2";
                }
                else if(v.equals("lines")){
                    return "4,4";
                }
                else if(v.equals("alternate")){
                    return "4,2,2,2";
                }
                else return "0";
                    
            }
            
            
        }

        else{
            return value.toString();
        }
    }

    /**
     * Clase que representa una animación.
     */
    private class ObjectAnimation{
        /**
         * Tiempo de inicio de la animación.
         */
        private final float startTime;
        /**
         * Tiempo de final de la animación.
         */
        private final float endTime;
        /**
         * Atributo que cambia durante la animación.
         */
        private final String attribute;
        /**
         * Valor que tiene el atributo al final de la animación.
         */
        private final Object endValue;
        
        /**
         * Creadora.
         * @param st Tiempo de inicio de la animación.
         * @param et Tiempo de final de la animación.
         * @param attr Atributo que cambia durante la animación.
         * @param ev Valor que tiene el atributo al final de la animación.
         */
        public ObjectAnimation(float st, float et, String attr, 
                Object ev){
            startTime = st;
            endTime = et;
            attribute = attr;
            endValue = ev;
        }
        
        /**
         * Creadora copiadora.
         * @param x Animación.
         */
        public ObjectAnimation(ObjectAnimation x){
            startTime = x.startTime;
            endTime = x.endTime;
            attribute = x.attribute;
            endValue = x.endValue;
        }
        
        /**
         * Obtiene la traducción a svg de la animación.
         * @return String de un tag animate en formato svg.
         */
        @Override
        public String toString(){
            String svg = "\t\t<animate";
            svg += " attributeName=\""+getNameString(attribute)+"\"";
            svg += " to=\""+getValueString(attribute,endValue)+"\"";
            float dur = endTime-startTime;
            svg += " begin=\""+startTime+"\"";
            svg += " dur=\""+dur+"\"";
            svg += " fill=\"freeze\"";
            svg += "/>\n";
            return svg;
        }
    }
    
    /**
     * Clase que representa un cambio instantáneo en un atributo.
     */
    private class ObjectSet{
        /**
         * Momento en el que se produce el set.
         */
        private final float time;
        /**
         * Atributo que cambia.
         */
        private final String attribute;
        /**
         * Nuevo valor del atributo.
         */
        private final Object value;
        
        /**
         * Creadora.
         * @param t Momento en el que se produce el set.
         * @param attr Atributo que cambia.
         * @param ev Nuevo valor del atributo.
         */
        public ObjectSet(float t , String attr, 
                Object ev){
            time = t;
            attribute = attr;
            value = ev;
        }
        
        /**
         * Creadora copiadora.
         * @param x Set.
         */
        public ObjectSet(ObjectSet x){
            time = x.time;
            attribute = x.attribute;
            value = x.value;
        }

        /**
         * Obtiene la traducción a svg del set.
         * @return String de un tag set en formato svg.
         */
        @Override
        public String toString(){
            String svg = "\t\t<set";
            svg += " attributeName=\""+getNameString(attribute)+"\"";
            svg += " to=\""+getValueString(attribute,value)+"\"";
            svg += " begin=\""+time+"\"";
            svg += " dur=\"indefinite\"";
            svg += "/>\n";
            return svg;
        }
        

    }
    
    /**
     * Clase que representa una transformación geométrica animada.
     */
    private class ObjectTransform{
        /**
         * Tipo de transformación geométrica.
         */
        private final Transform type;
        
        /**
         * Valor inicial de la transformación. En formato svg.
         */
        private final String startValue;
        
        /**
         * Valor final de la transformación. En formato svg.
         */
        private final String endValue;
        
        /**
         * Momento inicial de la transformación.
         */
        private final float startTime;
        
        /**
         * Momento final de la transformación.
         */
        private final float endTime;
        
        /**
         * Creadora.
         * @param st Momento inicial de la transformación.
         * @param et Momento final de la transformación.
         * @param t Tipo de transformación geométrica.
         * @param sv Valor inicial de la transformación. En formato svg.
         * @param ev Valor final de la transformación. En formato svg.
         */
        public ObjectTransform(float st, float et, Transform t, String sv, String ev){
            type = t;
            startTime = st;
            endTime = et;
            startValue = sv;
            endValue = ev;
        }
        
        /**
         * Creadora copiadora.
         * @param x Transformación.
         */
        public ObjectTransform(ObjectTransform x){
            type = x.type;
            startTime = x.startTime;
            endTime = x.endTime;
            startValue = x.startValue;
            endValue = x.endValue;
        }
        

        /**
         * Obtiene el string que indica el tipo de transformación en svg.
         * @return String con el tipo de transformación.
         */
        private String getTag(){
            switch(type){
                case TRANSLATE:
                    return "translate";
                case ROTATE:
                    return "rotate";
                case SCALE:
                    return "scale";
                default:
                    return null;
            }
        }
        
        /**
         * Obtiene la traducción a svg de la transformación.
         * @return String de un tag animateTransform en formato svg.
         */
        @Override
        public String toString(){
            String tag = getTag();
            String svg = "\t\t<animateTransform";
            svg += " attributeName=\"transform\"";
            svg += " type=\""+tag+"\"";
            svg += " from=\""+startValue;
            if(type==Transform.ROTATE){
                svg += " "+ rotationCenterX;
                svg += " "+ rotationCenterY;
            }
            svg +=  "\"";
            svg += " to=\""+endValue;
            if(type==Transform.ROTATE){
                svg += " "+ rotationCenterX;
                svg += " "+ rotationCenterY;
            }
            svg +=  "\"";
            svg += " begin=\""+startTime+"\"";
            svg += " dur=\""+(endTime-startTime)+"\"";
            svg += " additive=\"sum\"";
            svg += " fill=\"freeze\"";
            svg += "/>\n";
            return svg;
        }

    }
    
    


}
