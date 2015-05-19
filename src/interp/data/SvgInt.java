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
public class SvgInt extends SvgNumber{

    private int value;
    
    
    public SvgInt(int v) {
        super(Type.INTEGER);
        value = v; 
    }
    
    public SvgInt(SvgInt x){
        super(Type.INTEGER);
        value = x.getValue();
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int v){
        value = v;
    }
    
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

    @Override
    public float getFloatValue() {
        return (float)value;
    }

    @Override
    public String toString() {
        return Integer.toString(getValue());
    }
    

}
