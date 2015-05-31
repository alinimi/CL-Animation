/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import parser.SvgLexer;

/**
 * Class that represents a string value.
 * 
 * @author Alicia
 */
public class SvgString extends Data{
    /**
     * The value of the string.
     */
    String value;
    
    /**
     * Constructor.
     * @param s A string.
     */
    public SvgString(String s){
        super(Type.STRING);
        value = s;
    }
    
    /**
     * Copy constructor.
     * @param x A SvgString object.
     */
    public SvgString(SvgString x){
        super(Type.STRING);
        value = x.getValue();
    }
    
    /**
     * Getter of the value of the string.
     * @return The value of the string.
     */
    public String getValue(){
        return value;
    }
    
    /**
     * Setter of the value of the string.
     * @param v A string.
     */
    public void setValue(String v){
        value = v;
    }
    
    /**
     * Getter of the length of the string.
     * @return The number of characters that the string comprises.
     */
    public int getLength(){
        return value.length();
    }
    
    
    /**
     * Appends the Data passed as an argument to the string and returns the result.
     * @param d A Data that has a textual representation.
     * @return The result of the concatenation.
     */
    public SvgString concat(Data d){
        if(d.isString()){
            return new SvgString(getValue()+((SvgString)d).toString());
        }
        else if(d.isInteger()){
            return new SvgString(getValue()+((SvgInt)d).toString());
        }
        else if(d.isFloat()){
            return new SvgString(getValue()+((SvgFloat)d).toString());
        }
        else if(d.isBoolean()){
            return new SvgString(getValue()+((SvgBoolean)d).toString());
        }
        else if(d.isArray()){
            return new SvgString(getValue()+((SvgArray)d).toString());
        }
        return null;
        
    }
    
    /**
     * Appends the Number passed as an argument to the string and returns the result.
     * @param d A number.
     * @return The result of the concatenation.
     */
    public SvgString concat(SvgNumber d){
        return new SvgString(value+d.toString());
    }
    
    /**
     * Returns the textual representation of the value. In this case, the 
     * value itself.
     * @return The value of the string.
     */
    @Override
    public String toString(){
        return value;
    }
    
    /**
     * Evaluates relational operations with another boolean Data.
     * @param op Token that represents the operation.
     * @param d A string data.
     * @return A new boolean data that represents the result of the operation.
     */
    public Data evaluateRelational (int op, SvgString d) {
        switch (op) {
            case SvgLexer.COMP_EQUAL: return new SvgBoolean(value.equals(d.value));
            case SvgLexer.NOT_EQUAL: return new SvgBoolean(!value.equals(d.value));
            case SvgLexer.LT: return new SvgBoolean(value.compareTo(d.value) < 0);
            case SvgLexer.LE: return new SvgBoolean(value.compareTo(d.value) <= 0);
            case SvgLexer.GT: return new SvgBoolean(value.compareTo(d.value) > 0);
            case SvgLexer.GE: return new SvgBoolean(value.compareTo(d.value) >= 0);
            default: assert false; 
        }
        return null;
    }
    
    /**
     * Makes a copy of the object.
     * @return A new Data object.
     */
    @Override
    public Data copy(){
        return new SvgString(this);
    }
}
