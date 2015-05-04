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
public class SvgObject extends Data{
    private final String id;
    private boolean isNull;
    //id como int o como string?
    public SvgObject(String ident){
        super(Type.STRING);
        isNull = false;
        id = ident;
    }
    
    public SvgObject(){
        id = "";
        isNull = true;
    }

    String getID(){
        if(!isNull){
            return id;
        }
        return null;
    }
}
