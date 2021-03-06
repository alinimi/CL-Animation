/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp.data;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

public abstract class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, FLOAT, STRING, OBJECT, ARRAY;}

    /** Type of data*/
    private Type type;

    /**
     * Constructor.
     * @param t Type of the data.
     */
    public Data(Type t) {
        type = t;
    }
    
    /**
     * Returns a copy of the data.
     * @return A data object.
     */
    public abstract Data copy();
    
    /**
     * Constructor for void data
     */
    public Data() {type = Type.VOID; }

    /**
     * Returns the type of data
     * @return the type of the data.
     */
    public Type getType() { return type; }
    
    /**
     * Indicates whether the data is Boolean.
     * @return True if the data is boolean, false otherwise.
     */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /**
     * Indicates whether the data is integer.
     * @return True if the data is an integer, false otherwise.
     */
    public boolean isInteger() { return type == Type.INTEGER; }

    /**
     * Indicates whether the data is void.
     * @return True if the data is void, false otherwise.
     */
    public boolean isVoid() { return type == Type.VOID; }

    /**
     * Indicates whether the data is float.
     * @return True if the data is a float, false otherwise.
     */
    public boolean isFloat() {return type == Type.FLOAT;}
    
    /**
     * Indicates whether the data is string.
     * @return True if the data is a string, false otherwise.
     */
    public boolean isString(){return type==Type.STRING;}
    
    /**
     * Indicates whether the data is object.
     * @return True if the data is an object, false otherwise.
     */
    public boolean isObject(){return type == Type.OBJECT;}
    
    /**
     * Indicates whether the data is array.
     * @return True if the data is an array, false otherwise.
     */
    public boolean isArray(){return type == Type.ARRAY;}
    /**
     * Indicates whether the data is numeric.
     * @return True if the data is an integer or a float, false otherwise.
     */
    public boolean isNumber(){
        return type == Type.INTEGER || type == Type.FLOAT;
    }

    
    /**
     * Returns a string representing the data in textual form.
     * @return textual representation of the data.
     */
    public String toString() {
        return "This variable cannot be written";
        //TODO
    }
    
}
