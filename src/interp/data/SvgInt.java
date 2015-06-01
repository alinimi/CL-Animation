/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import parser.SvgLexer;

/**
 * Class that represents a float value. It's a type of SvgNumber.
 * 
 * @author Alicia
 */
public class SvgInt extends SvgNumber{
    /**
     * The value of the Data.
     */
    private int value;
    
    /**
     * Constructor.
     * @param v integer value.
     */
    public SvgInt(int v) {
        super(Type.INTEGER);
        value = v; 
    }
    
    /**
     * Copy constructor.
     * @param x SvgInt object.
     */
    public SvgInt(SvgInt x){
        super(Type.INTEGER);
        value = x.getValue();
    }
    
    /**
     * Getter of the int value.
     * @return int value.
     */
    public int getValue(){
        return value;
    }
    
    /**
     * Sets the value of the Data.
     * @param v The new int value.
     */
    public void setValue(int v){
        value = v;
    }
    
    /**
     * Evaluates integer arithmetic operations.
     * @param op Token of the arithmetic operation.
     * @param d Operator.
     * @return Result of performing the op operation between this data
     * and d.
     */
    public SvgInt evaluateArithmetic (int op, SvgInt d) {
        switch (op) {
            case SvgLexer.PLUS: 
                return new SvgInt(getValue()+ d.getValue()); 
            case SvgLexer.MINUS:
                return new SvgInt(getValue()- d.getValue()); 
            case SvgLexer.MUL: 
                return new SvgInt(getValue()* d.getValue());
            case SvgLexer.DIV:
                checkDivZero(d);
                return new SvgInt(getValue()/ d.getValue());
            case SvgLexer.MOD: checkDivZero(d);
                return new SvgInt(getValue() % d.getValue());
            default: assert false;
        }
        return null;
    }

    /**
     * Gets the conversion to float of the value of the Data.
     * @return A float where the integer part is the value of the data and
     * the fractional part is 0.
     */
    @Override
    public float getFloatValue() {
        return (float)value;
    }
    
    /**
     * Makes a copy of the object.
     * @return A new Data object.
     */
    @Override
    public Data copy(){
        return new SvgInt(this);
    }

    /**
     * Gets a textual representation of the Data.
     * @return A string representing the Data in textual form.
     */
    @Override
    public String toString() {
        return Integer.toString(getValue());
    }
    

}
