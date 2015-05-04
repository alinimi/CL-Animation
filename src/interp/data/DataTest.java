/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interp.data;

import parser.SvgLexer;

/**
 *
 * @author alicia
 */
public class DataTest {

    public static void testArithmetic(SvgInt n, SvgInt m){
        SvgInt sum = n.evaluateArithmetic(SvgLexer.PLUS, m);
        System.out.println("3 + 5 = "+sum.getValue());
        SvgInt sub = n.evaluateArithmetic(SvgLexer.MINUS, m);
        System.out.println("3 - 5 = "+sub.getValue());
        SvgInt mult = n.evaluateArithmetic(SvgLexer.MUL, m);
        System.out.println("3 * 5 = "+mult.getValue());
        
        SvgInt div = n.evaluateArithmetic(SvgLexer.DIV, m);
        System.out.println("3 / 5 = "+div.getValue());
        
        SvgInt mod = n.evaluateArithmetic(SvgLexer.MOD, m);
        System.out.println("3 % 5 = "+mod.getValue());        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvgInt n = new SvgInt(3);
        System.out.println("Type: "+n.getType());
        System.out.println("Value: "+n.getValue());
        System.out.println("Float Value: "+n.getFloatValue());
        SvgInt m = new SvgInt(5);
        testArithmetic(n,m);
        SvgString s = new SvgString("helloworld");
        System.out.println("String value: "+s.getValue());
        SvgString t = (SvgString) s.concat(new SvgString("345"));
        System.out.println("Concat Test: "+t.getValue());
    }
    
}
