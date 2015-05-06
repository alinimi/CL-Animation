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
    private HashMap <String,String> attributeMap;
    private ArrayList <ObjectAnimation> animationList;
    private ArrayList <ObjectTransform> transformList;
    
    public AnimatedObject(Shape type, int creationTime){
        objectType = type;
        creationTime = -1;
        destructionTime = -1;
        animationList = new ArrayList <ObjectAnimation>();
        transformList = new ArrayList <ObjectTransform>();
        attributeMap = new HashMap<String,String>();
    }
    
    public Shape getType(){
        return objectType;
    }
    
    public void setAttribute(String name, String value){
        attributeMap.put(name, value);
    }
    
    public void addAttributes(HashMap<String,String> attrs){
        attributeMap.putAll(attrs);
    }
    
    public String getAttribute(String name){
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
    }
    
}
