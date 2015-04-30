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
    private String id;
    //id como int o como string?
    SvgObject(String ident){
        super(Type.STRING);
        id = ident;
    }
    String getID(){
        return id;
    }
}
