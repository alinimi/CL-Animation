/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

import static java.sql.Types.NULL;
import java.util.ArrayList;

/**
 *
 * @author Alicia
 */
public class SvgArray extends Data{
    private ArrayList<Data> value;
    private Type elementType;
    /** Value of the data */


    
  
    public SvgArray(){
        super(Type.ARRAY);
    }
    
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
            value = new ArrayList<Data>(index+1);
            fillIndexPositions(0,index);
            value.add(d);
        }
    }


    /** Returns a string representing the data in textual form. */
    public String toString() {
        String s = "[";
        for(int i = 0; i<value.size();++i){
            s+=value.get(i).toString();
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
                    value.add(null);
                }
                break;
            case ARRAY:
                for(int i = begin; i < index;++i){
                    value.add(new SvgArray());
                }
                break;
        }
    }
}
