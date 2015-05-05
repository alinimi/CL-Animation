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
    
    
    public static void testArrays(){
        SvgArray s = new SvgArray(new SvgString("!"),5);
        s.setData(3, new SvgString("World"));
        for(int i = 0; i < 6; ++i){
            System.out.print(s.getValue(i)+" ");
        }
        System.out.println(s.toString());
        SvgArray x = new SvgArray(new SvgString("!"),0);
        System.out.println(x.getValue(0));
        System.out.println(x);
        SvgArray y = new SvgArray(x,1);
        System.out.println(y);
        
    }
    
    
    public static void testArithmeticFloat(SvgNumber n, SvgNumber m){
        SvgFloat sum = n.evaluateArithmetic(SvgLexer.PLUS, m);
        System.out.println("3 + 5 = "+sum.getValue());
        SvgFloat sub = n.evaluateArithmetic(SvgLexer.MINUS, m);
        System.out.println("3 - 5 = "+sub.getValue());
        SvgFloat mult = n.evaluateArithmetic(SvgLexer.MUL, m);
        System.out.println("3 * 5 = "+mult.getValue());
        
        SvgFloat div = n.evaluateArithmetic(SvgLexer.DIV, m);
        System.out.println("3 / 5 = "+div.getValue());
        
        SvgFloat mod = n.evaluateArithmetic(SvgLexer.MOD, m);
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
        System.out.println("float second param");
        testArithmeticFloat(n,new SvgFloat(5));
        System.out.println("float first param");
        testArithmeticFloat(new SvgFloat(3), m);
        System.out.println("both floats");
        testArithmeticFloat(new SvgFloat(3),new SvgFloat(5));
        SvgString s = new SvgString("helloworld");
        System.out.println("String value: "+s.getValue());
        SvgString t = (SvgString) s.concat(new SvgString("345"));
        System.out.println("Concat Test: "+t.getValue());
        testArrays();
    }
    
}
