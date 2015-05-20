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
        Animation anim = new Animation();
        anim.setSize(300,300);
        int[] coords = {50,0};
        HashMap<String,Object> attribs = new HashMap<String,Object>();
        attribs.put("stroke", "green");
        attribs.put("stroke-width", 2);
        attribs.put("text", "hello");
        anim.create(SvgObject.Shape.TEXT, "t1", coords, attribs, 2);
        anim.destroy("t1",50);
        anim.modify("t1","y",200,0,2);
        anim.modify("t1", "text-orientation", "vertical", 10);
        int[] c2 = {10,10,100,10,180,100,200,70};
        attribs = new HashMap<String,Object>();
        attribs.put("stroke", "green");
        attribs.put("stroke-width", 2);
        attribs.put("fill","red");
        attribs.put("line-pattern", "alternate");
        anim.create(SvgObject.Shape.LINE, "l1",c2, attribs, 2);
        anim.modify("l1", "fill", "white", 10);
        System.out.println(anim);


    }
    
}
