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
     * 
     */
    private TreeMap <Float,Coord> dynamicCenters;
    
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
        dynamicCenters = new TreeMap<Float,Coord>();
        dynamicCenters.put((float)0.0,new Coord(rotationCenterX,rotationCenterY));
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
        
        setRotationCenter();
        dynamicCenters = new TreeMap<Float,Coord>();
        dynamicCenters.put((float)0.0,new Coord(rotationCenterX,rotationCenterY));
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
                if((start > w.startTime && start < w.endTime) ||
                        (end > w.startTime && end < w.endTime) ||
                        (start == w.startTime && end == w.endTime))
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
        setRotationCenter();
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
    
    public void addSet(float time, String attr, Object ev){
        ObjectSet an = new ObjectSet(time,attr,ev);
        setList.add(an);
    }
    
    public void addTransform(Transform type, float st, float et, String sv, String ev){
        ObjectTransform t = new ObjectTransform(st,et,type,sv,ev);
        transformList.add(t);
    }

    public float getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }

    public float getDestructionTime() {
        return destructionTime;
    }

    
    public boolean hasAttribute(String name){
        return attributeMap.containsKey(name);
    }
    public void setDestructionTime(float destructionTime) {
        this.destructionTime = destructionTime;
    }
    
    
    public void setRotationCenter(){
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
    
    
    public Coord getDynamicRotationCenter(float time){
        Map.Entry<Float,Coord> closest = dynamicCenters.floorEntry(time);
        float x = rotationCenterX,y = rotationCenterY;
        
        ObjectAnimation[] sortedAnims = (ObjectAnimation[])animationList.toArray();
        Arrays.sort(sortedAnims);
        ArrayList<ArrayList<ObjectAnimation> > split = splitAnims(sortedAnims);

        if(closest == null){
            x = getDynamicRotationCenterX(split,time,0,rotationCenterX);
            y = getDynamicRotationCenterY(split,time,0,rotationCenterY);
        }
        else{
            x = getDynamicRotationCenterX(split,time,closest.getKey(),closest.getValue().x);
            y = getDynamicRotationCenterY(split,time,closest.getKey(),closest.getValue().y);
        }
        dynamicCenters.put(time, new Coord(x,y));
        return new Coord(x,y);

    }
    
    
    public float getDynamicRotationCenterX(ArrayList<ArrayList<ObjectAnimation> > animations, 
           float time, float closestTime, float oldX){
        float finalX = oldX;
        float finalTimeX = 0;
        
        for(ObjectSet set:setList){
            if(set.getTime()<= time && set.getTime() > closestTime){
                String attr=set.getAttribute();
                
                if((attr=="width") && set.getTime()>= finalTimeX){
                    finalX = coords[0]+(float)set.getValue()/2;
                }
            }
            
        }
        
        int i = 0; 
        while( i < animations.size() && 
                !animations.get(i).get(0).attribute.equals("width") ){
            ++i;
        }
        int j = 0;
        ArrayList<ObjectAnimation> xAnims = animations.get(i);
        while(j < xAnims.size() && xAnims.get(j).startTime < time){
            if(xAnims.get(j).startTime > finalTimeX){
                /////coords son ints o floats?
                float difference = (int)xAnims.get(j).endValue-finalX;
                float st = xAnims.get(j).startTime;
                float et = xAnims.get(j).endTime;
                //Anim se corta por otra animación
                if(xAnims.size()>j+1 && xAnims.get(j+1).startTime < xAnims.get(j).endTime){
                    float cutTime = xAnims.get(j+1).startTime;
                    finalX = finalX+difference*(cutTime-st)/(et-st);
                    
                }
                else{
                    finalX = finalX+difference;
                }
                
            }
            ++j;
        }

        return 0;
    }
    
    
    
    public float getDynamicRotationCenterY(ArrayList<ArrayList<ObjectAnimation> >anims,
            float time, float closestTime, float oldX){
        for(ObjectSet set:setList){
        }
        return 0;
    }
    public float getRotationCenterX(){
        return rotationCenterX;
    }
    public float getRotationCenterY(){
        return rotationCenterY;
    }
    

    public String getTag(){
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
    
    public String getAttributeString(String s){
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
    
    
    public String getCoordString(){
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
    
    
    public String getNameString(String name){
        if("stroke-pattern".equals(name)){
            return "stroke-dasharray";
        }
        return name;
    }
    
    public String getValueString(String name, Object value){
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
    
    private static ArrayList<ArrayList<ObjectAnimation> > splitAnims(ObjectAnimation[] animations){
        int i;
        int j;
        i = j = 0;
        ArrayList<ArrayList<ObjectAnimation> > ret = new ArrayList<ArrayList<ObjectAnimation> > ();
        for(ObjectAnimation anim:animations){
            if(ret.get(i)==null){
                ret.set(i, new ArrayList<ObjectAnimation>());
                ret.get(i).add(anim);
                ++j;
            }
            else{
                if(anim.attribute.equals(ret.get(i).get(j-1).attribute)){
                    ret.get(i).add(anim);
                    ++j;
                }
                else{
                    ++i;
                    ret.set(i,new ArrayList<ObjectAnimation>());
                    ret.get(i).add(anim);
                    j = 1;
                }
            }
        }
        return ret;
    }
    
    private class ObjectAnimation implements Comparable{
        private final float startTime;
        private final float endTime;
        private final String attribute;
        private final Object endValue;
        
        public ObjectAnimation(float st, float et, String attr, 
                Object ev){
            startTime = st;
            endTime = et;
            attribute = attr;
            endValue = ev;
        }
        public ObjectAnimation(ObjectAnimation x){
            startTime = x.startTime;
            endTime = x.endTime;
            attribute = x.attribute;
            endValue = x.endValue;
        }
        
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

        @Override
        public int compareTo(Object t) {
            float thisTime = startTime;
            float time = ((ObjectAnimation)t).startTime;
            String thisAttr = attribute;
            String attr = ((ObjectAnimation)t).attribute;
            int compare = thisAttr.compareTo(attr);
            if(compare != 0) return compare;
            return ((Float)thisTime).compareTo((Float)time);
        }
        
        public String getAttrib(){
            return attribute;
        }
        
        
    }
    
    
    private class ObjectSet implements Comparable{
        private final float time;
        private final String attribute;
        private final Object value;
        public ObjectSet(float t , String attr, 
                Object ev){
            time = t;
            attribute = attr;
            value = ev;
        }
        public ObjectSet(ObjectSet x){
            time = x.time;
            attribute = x.attribute;
            value = x.value;
        }
        
        public String getAttribute(){
            return attribute;
        }
        public Object getValue(){
            return value;
        }
        public float getTime(){
            return time;
        }
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
        
        @Override
        public int compareTo(Object t) {
            float thisTime = time;
            float time = ((ObjectSet)t).time;
            if(thisTime < time) return -1;
            if(thisTime == time) return 0;
            return 1;
        }

    }
    
    
    private class ObjectTransform implements Comparable{
        private final Transform type;
        private final String startValue;
        private final String endValue;
        private final float startTime;
        private final float endTime;
        public ObjectTransform(float st, float et, Transform t, String sv, String ev){
            type = t;
            startTime = st;
            endTime = et;
            startValue = sv;
            endValue = ev;
        }
        public ObjectTransform(ObjectTransform x){
            type = x.type;
            startTime = x.startTime;
            endTime = x.endTime;
            startValue = x.startValue;
            endValue = x.endValue;
        }
        
        public String getTag(){
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
        @Override
        public int compareTo(Object t) {
            float thisTime = startTime;
            float time = ((ObjectAnimation)t).startTime;
            if(thisTime < time) return -1;
            if(thisTime == time) return 0;
            return 1;
        }
    }
    
    

    private static class Coord {
        float x;
        float y;
        public Coord(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }
}
