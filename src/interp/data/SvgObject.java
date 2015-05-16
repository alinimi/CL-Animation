/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

/**
 *
 * @author Alicia
 */
public class SvgObject extends Data{
    private final String id;
    private boolean isNull;
    private Shape shape;
    
    public enum Shape {TEXT,CIRCLE,RECTANGLE,ELLIPSE,LINE,POLYGON;}
    //id como int o como string?
    public SvgObject(String ident, Shape s){
        super(Type.STRING);
        isNull = false;
        id = ident;
        shape = s;
    }
    
    public SvgObject(){
        id = "";
        isNull = true;
    }

    public String getID(){
        if(!isNull){
            return id;
        }
        return null;
    }
    public Shape getShape(){
        return shape;
    }
}
