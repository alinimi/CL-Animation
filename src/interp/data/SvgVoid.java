/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp.data;

/**
 * Class that represents a Data object without a type.
 * 
 * @author alicia
 */
public class SvgVoid extends Data {
    /**
     * Constructor.
     */
    public SvgVoid(){}

    /**
     * Makes a copy of the object.
     * @return A new Data object.
     */
    public Data copy() {
    	return new SvgVoid();
    }
}
