/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alicia
 */
public class AnimatedObject {
    private int creationTime;
    private String objectType;
    private int destructionTime;
    private HashMap <String,String> attributeMap;
    private ArrayList <Animation> animationList;
    
    public AnimatedObject(String type, int creationTime){
        objectType = type;
        creationTime = -1;
        destructionTime = -1;
        animationList = new ArrayList <Animation>();
        attributeMap = new HashMap<String,String>();
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
        Animation an = new Animation(st,et,attr,sv,ev);
        animationList.add(an);
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

    public void setDestructionTime(int destructionTime) {
        this.destructionTime = destructionTime;
    }
    
    
    
    private class Animation {
        private int startTime;
        private int endTime;
        private String attribute;
        private String startValue;
        private String endValue;
        public Animation(int st, int et, String attr, 
                String sv, String ev){
            startTime = st;
            endTime = et;
            attribute = attr;
            startValue = sv;
            endValue = ev;
        }

    }
    
}
