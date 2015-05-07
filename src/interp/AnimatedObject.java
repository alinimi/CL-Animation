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

/**
 *
 * @author alicia
 */
public class AnimatedObject {
    public enum Transform{ROTATE,SCALE,TRANSLATE;}
    private int creationTime;
    private SvgObject.Shape objectType;
    private int destructionTime;
    private int[] coords;
    String text;
    private HashMap <String,Object> attributeMap;
    private ArrayList <ObjectAnimation> animationList;
    private ArrayList <ObjectTransform> transformList;
    private int rotationCenterX;
    private int rotationCenterY;
    
    
    //crear objeto
    public AnimatedObject(Shape type, int[] coordinates,
            HashMap<String,Object> attrs, String txt, int startTime){
        //type
        objectType = type;
        
        //coords
        coords = coordinates;
        
        //attrs
        attributeMap = attrs;
        
        //text
        text = txt;
        
        if(startTime == 0) creationTime = -1;
        else creationTime = 0;
        
        animationList = new ArrayList <ObjectAnimation>();
        transformList = new ArrayList <ObjectTransform>();
        
        setRotationCenter();
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
    
    public void addAnimation(int st, int et, String attr, 
                String sv, String ev){
        ObjectAnimation an = new ObjectAnimation(st,et,attr,sv,ev);
        animationList.add(an);
    }
    
    public void addTransform(Transform type, int st, int et, String sv, String ev){
        ObjectTransform t = new ObjectTransform(st,et,type,sv,ev);
        transformList.add(t);
    }

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }

    public int getDestructionTime() {
        return destructionTime;
    }

    
    public boolean hasAttribute(String name){
        return attributeMap.containsKey(name);
    }
    public void setDestructionTime(int destructionTime) {
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
    public int getRotationCenterX(){
        return rotationCenterX;
    }
    public int getRotationCenterY(){
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
        String value = (String)attributeMap.get(s);
        return s + "=\""+value+"\"";
    }
    
    @Override
    public String toString(){
        String tab = "\t";
        String tag = getTag();
        String svg = tab+"<"+tag;
        for(String s: attributeMap.keySet()){
            svg += " "+getAttributeString(s);
        }
        svg += ">\n";
        if(text!=null){
            svg += "\t\t"+text+"\n";
        }
        for(ObjectAnimation anim: animationList){
            svg += anim.toString();
        }
        for(ObjectTransform tr: transformList){
            svg += tr.toString();
        }
        svg += "\t</"+tag+">\n";
        return svg;
    }
    
    private class ObjectAnimation {
        private int startTime;
        private int endTime;
        private String attribute;
        private String startValue;
        private String endValue;
        public ObjectAnimation(int st, int et, String attr, 
                String sv, String ev){
            startTime = st;
            endTime = et;
            attribute = attr;
            startValue = sv;
            endValue = ev;
        }
        
        @Override
        public String toString(){
            String svg = "\t\t<animate";
            svg += " attributeName=\""+attribute+"\"";
            svg += " from=\""+startValue+"\"";
            svg += " to=\""+endValue+"\"";
            int dur = endTime-startTime;
            svg += " dur=\""+dur+"\"";
            svg += " fill=\"freeze\"";
            svg += "/>\n";
            return svg;
        }

    }
    private class ObjectTransform{
        private Transform type;
        private String startValue;
        private String endValue;
        private int startTime;
        private int endTime;
        public ObjectTransform(int st, int et, Transform t, String sv, String ev){
            type = t;
            startTime = st;
            endTime = et;
            startValue = sv;
            endValue = ev;
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
            svg += " type=\""+tag+"\"";
            svg += " from=\""+startValue+"\"";
            svg += " to=\""+endValue+"\"";
            svg += " begin=\""+startTime+"\"";
            svg += " end=\""+endTime+"\"";
            svg += "/>\n";
            return svg;
        }
    }
    
}
