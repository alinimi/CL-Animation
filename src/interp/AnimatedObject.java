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
private float creationTime;
    private SvgObject.Shape objectType;
    private float destructionTime;
    private int[] coords;
    String text;
    private HashMap <String,Object> attributeMap;
    private ArrayList <ObjectAnimation> animationList;
    private ArrayList <ObjectTransform> transformList;
    private int rotationCenterX;
    private int rotationCenterY;
    
    
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
    
    public void addAnimation(float st, float et, String attr, 
                Object ev){
        ObjectAnimation an = new ObjectAnimation(st,et,attr,ev);
        animationList.add(an);
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
        String value = attributeMap.get(s).toString();
        return s + "=\""+value+"\"";
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
        svg += "\t</"+tag+">\n";
        return svg;
    }
    
    private class ObjectAnimation {
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
        
        @Override
        public String toString(){
            String svg = "\t\t<animate";
            svg += " attributeName=\""+attribute+"\"";
            svg += " to=\""+endValue.toString()+"\"";
            float dur = endTime-startTime;
            svg += " begin=\""+startTime+"\"";
            svg += " dur=\""+dur+"\"";
            svg += " fill=\"freeze\"";
            svg += "/>\n";
            return svg;
        }


    }
    private class ObjectTransform{
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
            svg += " additive=\"sum\"";
            svg += "/>\n";
            return svg;
        }
    }
    
}
