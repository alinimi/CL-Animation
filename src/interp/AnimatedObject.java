/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp;

import interp.data.SvgObject;
import interp.data.SvgObject.Shape;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author alicia
 */
public class AnimatedObject {
    public enum Transform{ROTATE,SCALE,TRANSLATE;}
    private float creationTime;
    private SvgObject.Shape objectType;
    private float destructionTime;
    private int[] coords;
    private String text;
    private HashMap <String,Object> attributeMap;
    private ArrayList <ObjectAnimation> animationList;
    private ArrayList <ObjectTransform> transformList;
    private ArrayList <ObjectSet> setList;

    private float rotationCenterX;
    private float rotationCenterY;
    
    
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
    
    //crear objeto
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
    }
    
    public boolean overlappingAnimations(String attr, float start, float end){
        for(ObjectAnimation w:animationList){
            if(w.attribute==attr){
                if((start > w.startTime && start < w.endTime) ||
                        (end > w.startTime && end < w.endTime))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Shape getType(){
        return objectType;
    }
    
    public void setAttribute(String name, String value){
        attributeMap.put(name, value);
    }
    
    public void addAttributes(HashMap<String,Object> attrs){
        attributeMap.putAll(attrs);
        setRotationCenter();
    }
    
    public Object getAttribute(String name){
        return attributeMap.get(name);
    }
    
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
    
    public float getDynamicRotationCenterX(float time){
        float finalX = rotationCenterX;
        float finalTimeX = 0;
        for(ObjectSet set:setList){
            if(set.getTime()<= time){
                String attr=set.getAttribute();
                
                if(attr=="x" && set.getTime()>= finalTimeX){
                    finalX = (float)set.getValue();
                }
            }
            
        }
        for(ObjectAnimation anim:animationList){
            if(anim.startTime >= finalTimeX && anim.startTime < time){
                
            }
        }
        return 0;
    }
    
    public float getDynamicRotationCenterY(float time){
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
        if(s.equals("text-orientation")){
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
        if(objectType == SvgObject.Shape.CIRCLE){
            svg += " \"cx\"=" + coords[0];
            svg += " \"cy\"" + coords[1];
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
        if("line-pattern".equals(name)){
            return "stroke-dasharray";
        }
        return name;
    }
    
    public String getValueString(String name, Object value){
        if("line-pattern".equals(name)){
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
            if(thisTime < time) return -1;
            if(thisTime == time) return 0;
            return 1;
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
                
            }
            svg +=  "\"";
            svg += " to=\""+endValue+"\"";
            if(type==Transform.ROTATE){
                
            }
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
    
    
    
}
