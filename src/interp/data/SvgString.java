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
public class SvgString extends Data{
    String value;
    public SvgString(String s){
        super(Type.STRING);
        value = s;
    }
    
    public SvgString(SvgString x){
        super(Type.STRING);
        value = x.getValue();
    }
    
    public String getValue(){
        return value;
    }
    
    public void setValue(String v){
        value = v;
    }
    
    public int getLength(){
        return value.length();
    }
    
    public SvgString concat(SvgString d){
        return new SvgString(getValue()+d.getValue());
    }
    
    @Override
    public String toString(){
        return value;
    }
    
    public Data evaluateRelational (int op, SvgString d) {
        switch (op) {
            case SvgLexer.COMP_EQUAL: return new SvgBoolean(getValue().equals(d.getValue()));
            case SvgLexer.NOT_EQUAL: return new SvgBoolean(!getValue().equals(d.getValue()));
                //TODOmaybe otras comparaciones
            default: assert false; 
        }
        return null;
    }
    
    @Override
    public Data copy(){
        return new SvgString(this);
    }
}
