/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import parser.SvgLexer;

/**
 * Abstract class that represents a numeric value.
 * 
 * @author Alicia
 */
public abstract class SvgNumber extends Data{
    
    /**
     * Constructor that sets the type of the Data.
     * @param t Type of the data. Can be INTEGER or FLOAT.
     */
    public SvgNumber(Type t){
        super(t);
    }
    
      
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     * 
     * @param d Number Data.
     */
    public void checkDivZero(SvgNumber d) {
        if(d.getFloatValue()==0.0){
             throw new RuntimeException ("Division by zero");
        }
    }
        
    
    /**
    * Gets the float value. Used for arithmetic with integers and floats.
    * @return The value of the object. 
    */
    public abstract float getFloatValue();
    
    
    /**
     * Evaluates arithmetic operations that involve floats. 
     * @param op Token that represents the arithmetic operation.
     * @param d Operator.
     * @return Float result of performing the op operation between this data
     * and d.
     */
    public SvgFloat evaluateArithmetic (int op, SvgNumber d) {
        switch (op) {
            case SvgLexer.PLUS: 
                return new SvgFloat(getFloatValue()+ d.getFloatValue()); 
            case SvgLexer.MINUS:
                return new SvgFloat(getFloatValue()- d.getFloatValue()); 
            case SvgLexer.MUL: 
                return new SvgFloat(getFloatValue()* d.getFloatValue());
            case SvgLexer.DIV:
                checkDivZero(d);
                return new SvgFloat(getFloatValue()/ d.getFloatValue());
            case SvgLexer.MOD: checkDivZero(d);
                return new SvgFloat(getFloatValue() % d.getFloatValue());
            default: assert false;
        }
        return null;
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, SvgNumber d) {
        switch (op) {
            case SvgLexer.COMP_EQUAL: return new SvgBoolean(getFloatValue() == d.getFloatValue());
            case SvgLexer.NOT_EQUAL: return new SvgBoolean(getFloatValue() != d.getFloatValue());
            case SvgLexer.LT: return new SvgBoolean(getFloatValue() < d.getFloatValue());
            case SvgLexer.LE: return new SvgBoolean(getFloatValue() <= d.getFloatValue());
            case SvgLexer.GT: return new SvgBoolean(getFloatValue() > d.getFloatValue());
            case SvgLexer.GE: return new SvgBoolean(getFloatValue() >= d.getFloatValue());
            default: assert false; 
        }
        return null;
    }
    
    /**
     * Appends the string passed as an argument to the textual representation
     * of the number and returns the result.
     * @param s An SvgString.
     * @return The result of the concatenation.
     */
    public SvgString concat(SvgString s){
        return new SvgString(toString()+s);
    }
    
}
