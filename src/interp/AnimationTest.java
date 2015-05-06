/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp;

import interp.data.SvgObject;
import java.util.HashMap;

/**
 *
 * @author alicia
 */
public class AnimationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animation anim = new Animation(300,300);
        int[] coords = {0,0};
        HashMap<String,Object> attribs = new HashMap<String,Object>();
        attribs.put("asdf", "ddd");
        anim.create(SvgObject.Shape.TEXT, "text", coords, attribs, "hello", 0);
        System.out.println(anim);
    }
    
}
