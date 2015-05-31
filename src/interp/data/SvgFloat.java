/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

/**
 * Class that represents a float value. It's a type of SvgNumber.
 * 
 * @author Alicia
 */
public class SvgFloat extends SvgNumber{
    /**
     * The value.
     */
    private float value;
    
    
    /**
     * Constructor.
     * @param v The float value.
     */
    public SvgFloat(float v){
        super(Type.FLOAT);
        value = v;
    }
    
    /**
     * Copy constructor.
     * @param x A SvgFloat object.
     */
    public SvgFloat(SvgFloat x){
        super(Type.FLOAT);
        value = x.getValue();
    }
    
    /**
     * Gets the float value.
     * @return The value of the object.
     */
   public float getValue(){
       return value;
   }
   
    
   /**
    * Gets the float value. Used for arithmetic with integers and floats.
    * @return The value of the object. 
    */
    @Override
    public float getFloatValue(){
        return value;
    }
    
    /**
     * Sets the float value.
     * @param v Float value.
     */
    public void setValue(float v){
        value = v;
    }
    
    /**
     * Makes a copy of the object.
     * @return A new Data object.
     */
    @Override
    public Data copy(){
        return new SvgFloat(this);
    }

    /**
     * Gets a textual representation of the Data.
     * @return A string representing the Data in textual form.
     */
    @Override
    public String toString() {
        return Float.toString(getValue());
    }

}
