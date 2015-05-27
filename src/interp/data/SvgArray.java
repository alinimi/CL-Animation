/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import java.util.ArrayList;

/**
 *
 * @author Alicia
 */
public class SvgArray extends Data{
    private ArrayList<Data> value;
    private Type elementType;
    /** Value of the data */


    public SvgArray(SvgArray x){
        super(Type.ARRAY);
        elementType = x.getElementType();
        value = new ArrayList<Data>();
        ArrayList<Data> d = x.getAllValues();
        for(int i = 0; i < d.size();++i){
            value.add(d.get(i).copy());
        }
    }
    
  
    public SvgArray(){
        super(Type.ARRAY);
        value = new ArrayList<Data>();
    }
    
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
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public Data getValue(int index) {
        assert index < value.size();
        return value.get(index);
    }

    public int size() {
        return value.size();
    }
    
    public ArrayList<Data> getAllValues(){
        return value;
    }
    
    public void setValue(ArrayList<Data> d){
        if(d.size()!=0){
            elementType = d.get(0).getType();
            value = d;
        }
        else{
            value = d;
        }
    }


    public Type getElementType(){
        return elementType;
    }

    
    /** Defines a Boolean value for the data */
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


    /** Returns a string representing the data in textual form. */
    @Override
    public String toString() {
        String s = "[ ";
        for(int i = 0; i< value.size();++i){
            s += value.get(i).toString() + " ";
        }
        s += "]";
        return s;
    }


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
    
    @Override
    public Data copy(){
        SvgArray x = new SvgArray(this);
        return x;
    }
}
