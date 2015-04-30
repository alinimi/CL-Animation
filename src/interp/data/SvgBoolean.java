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
public class SvgBoolean extends Data{
    boolean value;
    public SvgBoolean(boolean b){
        super(Type.BOOLEAN);
        value = b;
    }
    
    public boolean getValue(){
        return value;
    }
    
    public void setValue(boolean b){
        value = b;
    }
    
    public Data evaluateRelational (int op, SvgBoolean d) {
        switch (op) {
            case SvgLexer.COMP_EQUAL: return new SvgBoolean(getValue() == d.getValue());
            case SvgLexer.NOT_EQUAL: return new SvgBoolean(getValue() != d.getValue());
            default: assert false; 
        }
        return null;
    }
}
