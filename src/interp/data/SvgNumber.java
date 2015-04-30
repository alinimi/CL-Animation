/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import parser.SvgLexer;

/**
 *
 * @author Alicia
 */
public abstract class SvgNumber extends Data{
    
    
    public SvgNumber(Type t){
        super(t);
    }
       /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    public void checkDivZero(SvgNumber d) {
        if(d.getFloatValue()==0.0){
             throw new RuntimeException ("Division by zero");
        }
    }
        
    public abstract float getFloatValue();
    
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
                return new SvgFloat(getFloatValue()* d.getFloatValue());
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
    
}
