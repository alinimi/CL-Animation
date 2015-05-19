/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interp.data;

/**
 *
 * @author Alicia
 */
public class SvgFloat extends SvgNumber{
    private float value;
    
    public SvgFloat(float v){
        super(Type.FLOAT);
        value = v;
    }
    
    public SvgFloat(SvgFloat x){
        super(Type.FLOAT);
        value = x.getValue();
    }
    
   public float getValue(){
       return value;
   }
   
    
    @Override
    public float getFloatValue(){
        return value;
    }
    
    public void setValue(float v){
        value = v;
    }
    
    @Override
    public Data copy(){
        return new SvgFloat(this);
    }

}
