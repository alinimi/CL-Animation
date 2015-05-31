/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import java.util.ArrayList;

/**
 * Class that represents an array.
 * 
 * @author Alicia
 */
public class SvgArray extends Data{
    /**
     * The array.
     */
    private ArrayList<Data> value;
    /**
     * Indicates the type of the elements of the array.
     */
    private Type elementType;
    /** Value of the data */


    /**
     * Copy constructor.
     * @param x Array.
     */
    public SvgArray(SvgArray x){
        super(Type.ARRAY);
        elementType = x.getElementType();
        value = new ArrayList<Data>();
        ArrayList<Data> d = x.getAllValues();
        for(int i = 0; i < d.size();++i){
            value.add(d.get(i).copy());
        }
    }
    
    /**
     * Constructor for an empty array. Doesn't set the type of the elements.
     */
    public SvgArray(){
        super(Type.ARRAY);
        value = new ArrayList<Data>();
    }
    
    /**
     * Constructor. Sets the value of the SvgArray to the ArrayList passed as
     * an argument 
     * @param v A data array.
     */
    public SvgArray(ArrayList<Data> v){
        super(Type.ARRAY);
        setValue(v);
    }
    
    /**
     * Crea un array de tamaño index+1 donde el elemento index es d y el resto
     * son elementos neutros de su mismo tipo.
     * @param d
     * @param index
     */
    public SvgArray(Data d, int index) { 
        super(Type.ARRAY);
        value = new ArrayList<Data>(index+1);
        elementType = d.getType();
        fillIndexPositions(0,index);
        value.add(d);
    }
    
    /**
     * Gets the value stored in the position index of the array.
     */
    public Data getValue(int index) {
        assert index < value.size();
        return value.get(index);
    }

    /**
     * Gets the length of the data array.
     * @return Number of elements in the array.
     */
    public int size() {
        return value.size();
    }
    
    
    /**
     * Gets all the data contained in the array.
     * @return An ArrayList that contains all the data in the array.
     */
    public ArrayList<Data> getAllValues(){
        return value;
    }
    
    /**
     * Replaces all the data in the array. 
     * @param d The new data of the array.
     */
    public void setValue(ArrayList<Data> d){
        if(d.size()!=0){
            elementType = d.get(0).getType();
            value = d;
        }
        else{
            value = d;
        }
    }

    /**
     * Gets the type of the elements of the array.
     * @return One of VOID, BOOLEAN, INTEGER, FLOAT, STRING, OBJECT, ARRAY.
     */
    public Type getElementType(){
        return elementType;
    }

    
    /**
     * Sets the data in the index position to d. If index is larger than size,
     * the positions between size and index will be filled with empty or neutral
     * elements.
     * @param index The index of the data.
     * @param d The new data.
     */
    public void setData(int index,Data d) {
        if(d.getType()==elementType){
            if(index >= value.size()){
                fillIndexPositions(value.size(),index);
                value.add(d);
            }
            else{
                value.set(index,d);
            }
        }
        else{
            elementType = d.getType();
            value = new ArrayList<Data>(index+1);
            fillIndexPositions(0,index);
            value.add(d);
        }
    }


    /**
     * Returns a representation of the array in textual form.
     * @return A string of the form "[value[0],value[1]...,value[size-1]]"
     */
    @Override
    public String toString() {
        String s = "[ ";
        for(int i = 0; i< value.size();++i){
            s += value.get(i).toString() + " ";
        }
        s += "]";
        return s;
    }


    /**
     * Fills the positions of the array between begin and index with empty or
     * neutral elements of the same type of the existing elements of the array.
     * @param begin Starting position.
     * @param index The position following the last new empty element.
     */
    private void fillIndexPositions(int begin, int index) {
        switch(elementType){
            case BOOLEAN:
                for(int i = begin; i < index; ++i){
                    value.add(new SvgBoolean(false));
                }
                break;
            case INTEGER:
                for(int i = begin; i < index; ++i){
                    value.add(new SvgInt(0));
                }
                break;
            case FLOAT:
                for(int i = begin; i < index; ++i){
                    value.add(new SvgFloat((float) 0.0));
                }
                break;
            case STRING:
                for(int i = begin; i < index; ++i){
                    value.add(new SvgString(""));
                }
                break;
            case OBJECT:
                for(int i = begin; i < index; ++i){
                    value.add(new SvgObject());
                }
                break;
            case ARRAY:
                for(int i = begin; i < index;++i){
                    value.add(new SvgArray());
                }
                break;
        }
    }
    
    /**
     * Returns a copy of the data.
     * @return A data object.
     */
    @Override
    public Data copy(){
        SvgArray x = new SvgArray(this);
        return x;
    }
    
    /**
     * Appends the string passed as an argument to the textual representation
     * of the array and returns the result.
     * @param s An SvgString.
     * @return The result of the concatenation.
     */
    public SvgString concat(SvgString s){
        return new SvgString(toString()+s);
    }
}
