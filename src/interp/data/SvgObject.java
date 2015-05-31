/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

/**
 * Abstract class that represents an svg object variable.
 * 
 * @author Alicia
 */
public class SvgObject extends Data{
    /**
     * Identifier of the object.
     */
    private String id;
    /**
     * Basic shape of the object. One of TEXT, CIRCLE, RECTANGLE, ELLIPSE, 
     * LINE or POLYGON.
     */
    private Shape shape;
    
    /**
     * Enumerates the possible shapes an object can have.
     */
    public enum Shape {TEXT,CIRCLE,RECTANGLE,ELLIPSE,LINE,POLYGON;}
    
    /**
     * Empty constructor. Doesn't have an object attached.
     */
    public SvgObject(){
        super(Type.OBJECT);
    }
    
    /**
     * Constructor.
     * @param ident ID of the object. 
     * @param s Shape of the object.
     */
    public SvgObject(String ident, Shape s){
        super(Type.OBJECT);
        id = ident;
        shape = s;
    }
    
    /**
     * Copy constructor.
     * @param x An SvgObject.
     */
    public SvgObject(SvgObject x){
        super(Type.OBJECT);
        id = x.getID();
        shape = x.getShape();
    }

    /**
     * Getter of the object identifier.
     * @return The object ID.
     */
    public String getID(){
        return id;
    }
    
    
    /**
     * Getter of the basic shape of the object.
     * @return One of the possible shapes.
     */
    public Shape getShape(){
        return shape;
    }
    
    /**
     * Setter of the shape of the object.
     * @param s One of the possible shapes.
     */
    public void setShape(Shape s){
        shape = s;
    }
    
    /**
     * Setter of the object ID.
     * @param s A string that uniquely identifies the object.
     */
    public void setID(String s){
        id = s;
    }
    
    /**
     * Makes a copy of the object.
     * @return A new Data object.
     */
    @Override 
    public Data copy(){
        return new SvgObject(this);
    }
}
