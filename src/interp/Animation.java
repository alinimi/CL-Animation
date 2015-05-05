/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp;

import java.util.HashMap;

/**
 *
 * @author Alicia
 */
public class Animation{
    private HashMap<String,AnimatedObject> objects;
    private int width;
    private int height;
    
    public Animation(int w, int h){
        width = w;
        height = h;
        objects = new HashMap<String,AnimatedObject>();
    }
    
    /**
     * Crea un objeto con identificador id si no existe.
     * @param id
     * @param type
     * @param attrs
     * @param creationTime
     */
    public void create(String id, String type, HashMap<String,String> attrs,
        int creationTime){
        if(!objects.containsKey(id)){
            AnimatedObject obj = new AnimatedObject(type, creationTime);
            obj.addAttributes(attrs);
            objects.put(id, obj);
        }
        //error handling
    }
    
    public boolean objectExists(String id){
        return objects.containsKey(id);
    }
    
    /**
     * Cambia el tiempo en el que se destruye el objeto (en todos los casos)
     * @param id
     * @param time
     */
    public void destroy(String id, int time){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.setDestructionTime(time);
        }
    }
    
    /**
     * Set del valor del atributo que tiene el objeto desde su creación
     * @param id
     * @param name
     * @param value
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
     * @param id
     * @param name
     * @param valueIni
     * @param valueEnd
     * @param timeStart
     * @param timeEnd
     */
    public void modify(String id, String name, String valueIni, 
            String valueEnd, int timeStart, int timeEnd){
        if(objects.containsKey(id)){
            AnimatedObject obj = objects.get(id);
            obj.addAnimation(timeStart, timeEnd, name, valueIni, valueEnd);
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
    public void move(String id, int xIni, int yIni, 
            int xEnd, int yEnd, int timeStart, int timeEnd){
        //TODO
    }
    
    public void scale(String id, int sizeStart, int sizeEnd, int timeStart, int timeEnd){
        //TODO
    }
    
    
    public void rotate(String id, int angleStart, int angleEnd, int timeStart, int timeEnd){
        //TODO
    }
    
    public String getSvg(){
        //TODO
        return null;
    }
}
