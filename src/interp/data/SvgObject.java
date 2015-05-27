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
    private String id;
    private Shape shape;
    
    public enum Shape {TEXT,CIRCLE,RECTANGLE,ELLIPSE,LINE,POLYGON;}
    //id como int o como string?
    public SvgObject(){
        super(Type.OBJECT);
    }
    public SvgObject(String ident, Shape s){
        super(Type.OBJECT);
        id = ident;
        shape = s;
    }
    
    public SvgObject(SvgObject x){
        super(Type.OBJECT);
        id = x.getID();
        shape = x.getShape();
    }

    public String getID(){
        return id;
    }
    
    
    
    public Shape getShape(){
        return shape;
    }
    
    public void setShape(Shape s){
        shape = s;
    }
    
    public void setID(String s){
        id = s;
    }
    
    @Override 
    public Data copy(){
        return new SvgObject(this);
    }
}
