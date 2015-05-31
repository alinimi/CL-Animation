/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import parser.SvgLexer;

/**
 * Class that represents a boolean variable.
 * 
 * @author Alicia
 */
public class SvgBoolean extends Data{
    /**
     * The value of the data.
     */
    private boolean value;
    
    /**
     * Constructor.
     * @param b A boolean value.
     */
    public SvgBoolean(boolean b){
        super(Type.BOOLEAN);
        value = b;
    }
    
    /**
     * Copy constructor.
     * @param x A boolean Data object.
     */
    public SvgBoolean(SvgBoolean x){
        super(Type.BOOLEAN);
        value = x.getValue();
    }
    
    /**
     * Gets the boolean value of the data.
     * @return The boolean value.
     */
    public boolean getValue(){
        return value;
    }
    
    /**
     * Sets the boolean value of the data.
     * @param b The new boolean value
     */
    public void setValue(boolean b){
        value = b;
    }
    
    /**
     * Evaluates relational operations with another boolean Data.
     * @param op Token that represents the operation.
     * @param d A boolean data.
     * @return A new data that represents the result of the operation.
     */
    public Data evaluateRelational (int op, SvgBoolean d) {
        switch (op) {
            case SvgLexer.COMP_EQUAL: return new SvgBoolean(getValue() == d.getValue());
            case SvgLexer.NOT_EQUAL: return new SvgBoolean(getValue() != d.getValue());
            default: assert false; 
        }
        return null;
    }
    
    /**
     * Returns a copy of the data.
     * @return A data object.
     */
    @Override
    public Data copy(){
        return new SvgBoolean(this);
    }
    
    /**
     * Gets a textual representation of the data.
     * @return "true" or "false"
     */
    @Override
    public String toString() {
        if (value) return "true";
        else return "false";
    }
    
    /**
     * Appends the string passed as an argument to the textual representation
     * of the boolean and returns the result.
     * @param s An SvgString.
     * @return The result of the concatenation.
     */
    public SvgString concat(SvgString s){
        return new SvgString(value+s.getValue());
    }
}
