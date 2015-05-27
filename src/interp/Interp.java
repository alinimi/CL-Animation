/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import interp.data.*;
import parser.*;

import java.util.ArrayList;
import interp.Animation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

/** Class that implements the interpreter of the language. */

public class Interp {

    private static final String[] rectangleAttribueTypes = {"rx","ry"};
    private static final String[] textAtrributeTypes = {"font-style","font-weight","font-orientation","font-size"};
    private static final String[] generalAttributeTypes = {"fill","fill-opacity","stroke","stroke-pattern","stroke-width"};

    private static final HashMap<String,Integer> defaultFunctions = new HashMap<String,Integer>(){{
        put("size",1);
        put("canvas_size",2);
    }};

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,SvgTree> FuncName2Tree;

    private Animation animation;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(SvgTree T, String tracefile) {
        System.out.println("Init interp");
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        animation = new Animation();
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }
    
    
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(SvgTree T, PrintWriter pw) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        animation = new Animation();
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        trace = pw;

        function_nesting = -1;
    }
    
    

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
    }

    public String getSvgCode() {
        return animation.toString();
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(SvgTree T) {
        assert T != null && T.getType() == SvgLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,SvgTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            SvgTree f = T.getChild(i);
            assert f.getType() == SvgLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            } else if (defaultFunctions.containsKey(fname)){
                int numParams = f.getChild(1).getChildCount();
                if (numParams == defaultFunctions.get(fname)) {
                    throw new RuntimeException("Function " + fname + " with " + numParams + 
                        " parameter is a default function of the language");
                }
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See SvgTree.java for details.
     */
    private void PreProcessAST(SvgTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case SvgLexer.INT: T.setIntValue(); break;
            case SvgLexer.STRING: T.setStringValue(); break;
            case SvgLexer.BOOLEAN: T.setBooleanValue(); break;
            case SvgLexer.FLOAT: T.setFloatValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(SvgTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, SvgTree args) {

        if (funcname.equals("canvas_size") && args.getChildCount() == 2) {
            int w = args.getChild(0).getIntValue();
            int l = args.getChild(1).getIntValue();
            animation.setSize(w,l);
            return new SvgVoid();
            // set canvas size
        } else if (funcname.equals("size") && args.getChildCount() == 1) {
            Data d = evaluateExpression(args.getChild(0));
            checkArray(d);
            return new SvgInt(((SvgArray) d).size());
        }
        // Get the AST of the function
        SvgTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        SvgTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new SvgVoid();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (SvgTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }

    private Data executeInstructions (SvgTree t) {
        assert t != null;
        Data result = null;
        if (t.getType() == SvgLexer.LIST_INSTR) {
            result =  executeListInstructions(t);
        } else {
            result = executeInstruction(t);
        }
        return result;
    }

    private SvgBoolean evaluateITE (SvgTree t) {
        assert t != null;
        if (t.getType() == SvgLexer.ELSE) return new SvgBoolean(true);
        else {
            Data value = evaluateExpression(t.getChild(0));
            checkBoolean(value);
            return (SvgBoolean) value;
        }
    }

    private Data executeITE (SvgTree t) {
        assert t != null;
        Data result = null;
        if (t.getType() == SvgLexer.ELSE) {
            result = executeInstructions(t.getChild(0));
        } else {
            result = executeInstructions(t.getChild(1));
        }
        return result;
    }

    private HashMap<String,Object> getGeneralAttributes(int type, SvgTree t, boolean creationTime) {
        assert t != null;
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        for (int i = 0; i < t.getChildCount(); i++) {
            SvgTree attr = t.getChild(i);
            existAttribute(type, attr.getText(), creationTime);
            Object o = generateAttribute(attr);
            attrs.put(attr.getText(), o);
        }
        return attrs;
    }

    private HashMap<String,Object> getAttributes(SvgTree t, boolean creationTime) {
        int type = t.getChild(0).getType();
        int size = t.getChildCount();
        Data d;
        HashMap<String,Object> attrs = getGeneralAttributes(type, t.getChild(size - 2), creationTime);
        switch (type) {
            case SvgLexer.TEXT:
                d = evaluateExpression(t.getChild(4)); checkString(d);
                attrs.put("text",((SvgString) d).getValue());
                break;

            case SvgLexer.CIRCLE:
                d = evaluateExpression(t.getChild(3)); checkNumber(d);
                attrs.put("r",getFloatValue(d));
                break;

            case SvgLexer.RECTANGLE:
                d = evaluateExpression(t.getChild(4)); checkNumber(d);
                attrs.put("width",getFloatValue(d));
                d = evaluateExpression(t.getChild(5)); checkNumber(d);
                attrs.put("height",getFloatValue(d));
                if (t.getChildCount() == 10) {
                    d = evaluateExpression(t.getChild(6)); checkNumber(d);
                    attrs.put("rx",getFloatValue(d));
                    d = evaluateExpression(t.getChild(7)); checkNumber(d);
                    attrs.put("ry",getFloatValue(d));
                }
                break;

            case SvgLexer.ELLIPSE:
                d = evaluateExpression(t.getChild(4)); checkNumber(d);
                attrs.put("rx",getFloatValue(d));
                d = evaluateExpression(t.getChild(5)); checkNumber(d);
                attrs.put("ry",getFloatValue(d));
                break;
                
        }
        return attrs;
    }

    private int getXCoordinate(SvgTree t) {
        Data d = evaluateExpression(t.getChild(0));
        checkNumber(d);
        return getIntValue(d);
    }

    private int getYCoordinate(SvgTree t) {
        Data d = evaluateExpression(t.getChild(1));
        checkNumber(d);
        return getIntValue(d);
    }

    private float getFloatValue(Data d) {
        if (d.isInteger()) {
            return ((SvgInt) d).getFloatValue();
        } else if (d.isFloat()) {
            return ((SvgFloat) d).getFloatValue();
        } else {
            throw new RuntimeException ("It was expected a Number type");
        }
    }

    private int getIntValue(Data d) {
        return (int) getFloatValue(d);
    }

    private int[] generateCoordinates(SvgTree t) {
        assert t != null;
        int[] coords;
        if (t.getType() == SvgLexer.LIST_COORD) {
            coords = new int[t.getChildCount()*2];
            for (int i = 0; i < t.getChildCount(); i++) {
                coords[2*i] = getXCoordinate(t.getChild(i));
                coords[2*i+1] = getYCoordinate(t.getChild(i));
            }
        } else {
            coords = new int[]{getXCoordinate(t),getYCoordinate(t)};
        }
        
        return coords;
    }

    private void makeInitialTransformations(SvgTree t) {
        assert t != null;
        int type = t.getChild(0).getType();
        String id = t.getChild(1).getText();
        switch(type) {
            case SvgLexer.TEXT:
            case SvgLexer.RECTANGLE:
            case SvgLexer.ELLIPSE:
            Data d = evaluateExpression(t.getChild(3));
            checkNumber(d);
            animation.rotate(id, (int) getFloatValue(d));
        }
    }

    private SvgObject.Shape lexer2shape(int lexerId) {
        SvgObject.Shape shape;
        switch(lexerId) {
            case SvgLexer.TEXT:
                shape = SvgObject.Shape.TEXT;
                break;

            case SvgLexer.CIRCLE:
                shape = SvgObject.Shape.CIRCLE;
                break;

            case SvgLexer.RECTANGLE:
                shape = SvgObject.Shape.RECTANGLE;
                break;

            case SvgLexer.ELLIPSE:
                shape = SvgObject.Shape.ELLIPSE;
                break;

            case SvgLexer.LINE:
                shape = SvgObject.Shape.LINE;
                break;

            case SvgLexer.POLYGON:
                shape = SvgObject.Shape.POLYGON;
                break;

            default:
                throw new RuntimeException ("Not correct Shape " + lexerId);
        }
        return shape;
    }

        private int shape2lexer(SvgObject.Shape shapeId) {
        int lexer;
        switch(shapeId) {
            case TEXT:
                lexer = SvgLexer.TEXT;
                break;

            case CIRCLE:
                lexer = SvgLexer.CIRCLE;
                break;

            case RECTANGLE:
                lexer = SvgLexer.RECTANGLE;
                break;

            case ELLIPSE:
                lexer = SvgLexer.ELLIPSE;
                break;

            case LINE:
                lexer = SvgLexer.LINE;
                break;

            case POLYGON:
                lexer = SvgLexer.POLYGON;
                break;

            default:
                throw new RuntimeException ("Not correct lexer " + shapeId);
        }
        return lexer;
    }

    String getAnimationId(SvgTree t) {
        if (t.getType() == SvgLexer.ARRAY_POS) {
            Data position = evaluateExpression(t.getChild(0)); checkInteger(position);
            return t.getText() + "-" + getIntValue(position); 
        } else return t.getText();
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (SvgTree t) {
        assert t != null;
        setLineNumber(t);
        Data value; // The returned value
        String id;
        String aId;
        Data d;
        int intType;
        int lexerId;
        SvgBoolean booleanValue;
        float startTime;
        float endTime;
        Data startTimeD;
        Data endTimeD;
        HashMap<String,Object> attrs;

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case SvgLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                SvgTree leftSide = t.getChild(0);
                if (leftSide.getType() == SvgLexer.ARRAY_POS) {
                    Data position = evaluateExpression(leftSide.getChild(0)); checkInteger(position);
                    Stack.defineVariable (leftSide.getText(),getIntValue(position),value);
                } else {
                    Stack.defineVariable (leftSide.getText(), value);
                }
                if (value.isObject()) {
                    String oldVar = t.getChild(1).getText();
                    animation.copyObject(oldVar,leftSide.getText());
                }
                return null;

            // If-then-else
            case SvgLexer.ITE:
                int ninstr = t.getChildCount();
                for (int i = 0; i < ninstr; ++i) {
                    SvgTree currentTree = t.getChild(i);
                    booleanValue = evaluateITE(currentTree);
                    if(booleanValue.getValue()) return executeITE(currentTree);
                }
                return null;

            // for
            case SvgLexer.FOR:
                executeInstruction(t.getChild(0));
                SvgTree inst = t.getChild(3);
                while (true) {
                    value = evaluateExpression(t.getChild(1));
                    checkBoolean(value);
                    if (!((SvgBoolean) value).getValue()) return null;
                    Data r = executeInstructions(inst);
                    if (r != null) return r;
                    executeInstruction(t.getChild(2));
                }

            // Return
            case SvgLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new SvgVoid(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case SvgLexer.READ:
                String token = null;
                Data val;
                try {
                    token = stdin.next();
                    val = new SvgInt(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case SvgLexer.WRITE:
                SvgTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == SvgLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString());
                return null;

            // Function call
            case SvgLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            case SvgLexer.CREATE:
                SvgObject.Shape shapeType = lexer2shape(t.getChild(0).getType());
                id = t.getChild(1).getText();
                aId = getAnimationId(t.getChild(1));
                d = new SvgObject(aId, shapeType);
                if (t.getChild(1).getType() == SvgLexer.ARRAY_POS) {
                    Data position = evaluateExpression(t.getChild(1).getChild(0)); checkInteger(position);
                    Stack.defineVariable (id,getIntValue(position),d);
                } else {   
                    if (Stack.existsVariable(id)) throw new RuntimeException ("Variable " + id + " it was previously declared");
                    Stack.defineVariable (id, d);
                }

                int[] initialCoords = generateCoordinates(t.getChild(2));
                attrs = getAttributes(t, true);
                value = evaluateExpression(t.getChild(t.getChildCount() - 1));
                checkNumber(value);
                animation.create(shapeType,aId, initialCoords,attrs, getFloatValue(value));
                makeInitialTransformations(t);

                System.out.println("");
                System.out.println(shapeType);
                System.out.println(id);
                System.out.println(Arrays.toString(initialCoords));
                System.out.println(attrs);
                System.out.println(getFloatValue(value));
                return null;

            case SvgLexer.DESTROY:
                aId = getAnimationId(t.getChild(0));
                // Comprobació de que existeix l'objecte.
                d = evaluateExpression(t.getChild(0));
                checkSvgObject(d);
                value = evaluateExpression(t.getChild(1));
                checkNumber(value);
                animation.destroy(aId, getIntValue(value));

                System.out.println("");
                System.out.println(aId);
                System.out.println(getIntValue(value));
                return null;

            case SvgLexer.MODIFY:
                id = t.getChild(0).getText();
                aId = getAnimationId(t.getChild(0));
                d = evaluateExpression(t.getChild(0));
                checkSvgObject(d);
                lexerId = shape2lexer(((SvgObject) d).getShape());
                attrs = getGeneralAttributes(lexerId, t.getChild(1), false);
                startTimeD = evaluateExpression(t.getChild(2)); checkNumber(startTimeD);
                endTime = -1;
                if (t.getChildCount() == 4) {
                    endTimeD = evaluateExpression(t.getChild(3)); checkNumber(endTimeD);
                    endTime = getFloatValue(endTimeD);
                }

                for (Map.Entry<String, Object> entry : attrs.entrySet()) {
                    String key = entry.getKey();
                    Object objValue = entry.getValue();
                    boolean overlap = false;
                    if (t.getChildCount() == 4) {
                        overlap = animation.modify(aId, key, objValue, getFloatValue(startTimeD), endTime);
                    } else {
                        animation.modify(aId,key,objValue, getFloatValue(startTimeD));
                    }
                    if (overlap) {
                        System.out.println("WARNING: Object " + id + " has multiple definitions of modify " +
                            "in the interval of time from " + getFloatValue(startTimeD) + " to " + endTime);
                    }
                }

                System.out.println("");
                System.out.println(lexerId);
                System.out.println(id);
                System.out.println(attrs);
                System.out.println(getFloatValue(startTimeD));
                System.out.println(endTime);
                return null;

            case SvgLexer.MOVE:
                aId = getAnimationId(t.getChild(0));
                d = evaluateExpression(t.getChild(0));
                checkSvgObject(d);
                int xIni = getXCoordinate(t.getChild(1));
                int yIni = getYCoordinate(t.getChild(1));
                int xEnd = getXCoordinate(t.getChild(2));
                int yEnd = getYCoordinate(t.getChild(2));
                startTimeD = evaluateExpression(t.getChild(3));
                checkNumber(startTimeD);
                endTimeD = evaluateExpression(t.getChild(4));
                checkNumber(endTimeD);
                animation.move(aId,xIni,yIni,xEnd,yEnd,getFloatValue(startTimeD),getFloatValue(endTimeD));

                System.out.println("");
                System.out.println(aId);
                System.out.println(xIni);
                System.out.println(yIni);
                System.out.println(xEnd);
                System.out.println(yEnd);
                System.out.println(getIntValue(startTimeD));
                System.out.println(getIntValue(endTimeD));
                return null;

            case SvgLexer.SCALE:
                aId = getAnimationId(t.getChild(0));
                d = evaluateExpression(t.getChild(0));
                checkSvgObject(d);
                Data scaleX = evaluateExpression(t.getChild(1)); checkNumber(scaleX);
                Data scaleY = evaluateExpression(t.getChild(2)); checkNumber(scaleY);
                startTimeD = evaluateExpression(t.getChild(3)); checkNumber(startTimeD);
                endTimeD = evaluateExpression(t.getChild(4)); checkNumber(endTimeD);
                animation.scale(aId,getFloatValue(scaleX), getFloatValue(scaleY),
                    getFloatValue(startTimeD),getFloatValue(endTimeD));

                System.out.println("");
                System.out.println(aId);
                System.out.println(scaleX);
                System.out.println(scaleY);
                System.out.println(getFloatValue(startTimeD));
                System.out.println(getFloatValue(endTimeD));
                return null;

            case SvgLexer.ROTATE:
                aId = getAnimationId(t.getChild(0));
                d = evaluateExpression(t.getChild(0));
                checkSvgObject(d);
                Data startAngle = evaluateExpression(t.getChild(1)); checkNumber(startAngle);
                Data endAngle = evaluateExpression(t.getChild(2)); checkNumber(endAngle);
                startTimeD = evaluateExpression(t.getChild(3)); checkNumber(startTimeD);
                endTimeD = evaluateExpression(t.getChild(4)); checkNumber(endTimeD);
                animation.rotate(aId,getFloatValue(startAngle),getFloatValue(endAngle),
                    getFloatValue(startTimeD),getFloatValue(endTimeD));
                
                System.out.println("");
                System.out.println(aId);
                System.out.println(getIntValue(startAngle));
                System.out.println(getIntValue(endAngle));
                System.out.println(getFloatValue(startTimeD));
                System.out.println(getFloatValue(endTimeD));
                return null;

            case SvgLexer.SOURCE:
                String file = t.getChild(0).getText();
                file = file.substring(1, file.length()-1);
                ANTLRFileStream in = null;
                try {
                    in = new ANTLRFileStream(file);
                } catch (IOException e) {
                    System.err.println ("Error: file " + file + " could not be opened.");
                    System.exit(1);
                }

                // Creates the lexer
                SvgLexer lex = new SvgLexer(in);
                CommonTokenStream tokens = new CommonTokenStream(lex);

                // Creates and runs the parser. As a result, an AST is created
                SvgParser parser = new SvgParser(tokens);
                SvgTreeAdaptor adaptor = new SvgTreeAdaptor();
                parser.setTreeAdaptor(adaptor);
                SvgParser.prog_return result = null;
                try {
                    result = parser.prog();
                } catch (Exception e) {} // Just catch the exception (nothing to do)

                // Check for parsing errors
                int nerrors = parser.getNumberOfSyntaxErrors();
                if (nerrors > 0) {
                    System.err.println (nerrors + " errors detected. " +
                                    "The program has not been executed.");
                    System.exit(1);
                }

                // Get the AST
                SvgTree newT = (SvgTree)result.getTree();
                System.out.println(newT.toString());
                System.out.println(newT.getChild(0).toString());
                Interp I = null;
                int linenumber = -1;
                try {
                    I = new Interp(newT, trace); // prepares the interpreter
                    I.Run();                  // Executes the code
                    animation.merge(I.animation);
                } catch (RuntimeException e) {
                    if (I != null) linenumber = I.lineNumber();
                    System.err.print ("Runtime error");
                    if (linenumber < 0) System.err.print (": ");
                    else System.err.print (" (" + file + ", line " + linenumber + "): ");
                    System.err.println (e.getMessage() + ".");
                    System.err.format (I.getStackTrace());
                } catch (StackOverflowError e) {
                    if (I != null) linenumber = I.lineNumber();
                    System.err.print("Stack overflow error");
                    if (linenumber < 0) System.err.print (".");
                    else System.err.println (" (" + file + ", line " + linenumber + ").");
                    System.err.format (I.getStackTrace(5));
                }
                return null;
            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

    Data evaluateRelational(Data value1, Data value2, int type) {
        if (value1.getType() == value2.getType()) {
            if (value1.isNumber()) {
                value1 = ((SvgNumber) value1).evaluateRelational(type, (SvgNumber) value2);
            } else if (value1.isString()) {
                value1 = ((SvgString) value1).evaluateRelational(type, (SvgString) value2);
            } else if (value1.isBoolean()) {
                value1 = ((SvgBoolean) value1).evaluateRelational(type, (SvgBoolean) value2);
            } else {
                throw new RuntimeException("Data type cannot be compared");
            }   
        } else {
            throw new RuntimeException ("Incompatible types in relational expression");
        }
        return value1;
    }

    Data evaluateArithmetic(Data value1, Data value2, int type) {
        if (value1.getType() == value2.getType()) {
            checkNumber(value1);
            if (value1.isInteger()) {
                value1 = ((SvgInt) value1).evaluateArithmetic(type, (SvgInt) value2);
            } else {
                value1 = ((SvgNumber) value1).evaluateArithmetic(type, (SvgNumber) value2);
            }            
            
        } else {
            throw new RuntimeException("Error at performing an arithmetic operation with elements of different type");
        }
        return value1;        
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(SvgTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case SvgLexer.ID:
                value = Stack.getVariable(t.getText()).copy();
                break;
            // An integer literal
            case SvgLexer.INT:
                value = new SvgInt(t.getIntValue());
                break;
            // A Boolean literal
            case SvgLexer.BOOLEAN:
                value = new SvgBoolean(t.getBooleanValue());
                break;
            case SvgLexer.FLOAT:
                value = new SvgFloat(t.getFloatValue());
                break;
            case SvgLexer.STRING:
                value = new SvgString(t.getStringValue());
                break;
            case SvgLexer.ARRAY_POS:
                Data position = evaluateExpression(t.getChild(0));
                checkInteger(position);
                value = Stack.getVariable(t.getText(), getIntValue(position)).copy();
                break;

            case SvgLexer.ARRAY_CONST:
                ArrayList<Data> aux = new ArrayList<Data>();
                if (t.getChildCount() > 0) {
                    Data.Type dataType = evaluateExpression(t.getChild(0)).getType();
                    for (int i = 0; i < t.getChildCount(); i++) {
                        Data d = evaluateExpression(t.getChild(i));
                        if (dataType != d.getType()) {
                            throw new RuntimeException ("All positions in an array have to be of the same data type");
                        }
                        aux.add(d);
                    }
                }
                value = new SvgArray(aux);
                break;

            // A function call. Checks that the function returns a result.
            case SvgLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            
                
                
                
                
                
                
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case SvgLexer.PLUS:
                    checkInteger(value);
                    break;
                case SvgLexer.MINUS:
                    checkInteger(value);
                    ((SvgInt) value).setValue(-((SvgInt) value).getValue());
                    break;
                case SvgLexer.NOT:
                    checkBoolean(value);
                    ((SvgBoolean) value).setValue(!((SvgBoolean) value).getValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case SvgLexer.COMP_EQUAL:
            case SvgLexer.NOT_EQUAL:
            case SvgLexer.LT:
            case SvgLexer.LE:
            case SvgLexer.GT:
            case SvgLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                value = evaluateRelational(value, value2, type);
                break;

            // Arithmetic operators
            case SvgLexer.PLUS:
            case SvgLexer.MINUS:
            case SvgLexer.MUL:
            case SvgLexer.DIV:
            case SvgLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                value = evaluateArithmetic(value, value2, type);
                break;

            // Boolean operators
            case SvgLexer.AND:
            case SvgLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, (SvgBoolean) value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private SvgBoolean evaluateBoolean (int type, SvgBoolean v, SvgTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case SvgLexer.AND:
                // Short circuit if v is false
                if (!v.getValue()) return v;
                break;
        
            case SvgLexer.OR:
                // Short circuit if v is true
                if (v.getValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        Data d = evaluateExpression(t);
        checkBoolean(d);
        return (SvgBoolean) d;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }

    private void checkNumber(Data b) {
        if (!b.isNumber()) {
            throw new RuntimeException ("Expecting a number");
        }
    }

    private void checkString(Data b) {
        if (!b.isString()) {
            throw new RuntimeException ("Expecting a String");
        }
    }

    private void checkArray(Data b) {
        if (!b.isArray()) {
            throw new RuntimeException ("Expecting an array");
        }
    }

    private void checkSvgObject(Data b) {
        if (!b.isObject()) {
            String id = ((SvgObject) b).getID();
            throw new RuntimeException ("Variable " + id + " it is not a figure");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting integer expression");
        }
    }

    private void checkColor(SvgTree t) {
        // El cas de que sigui un color predefinit (Vermell, groc, verd o blau) ja ha estat comprovat durant el parsing
        assert t != null;
        if (t.getType() == SvgLexer.RGB) {
            for(int i = 0; i < 3; i++) {
                Data d = evaluateExpression(t.getChild(i));
                checkInteger(d);
                int value = getIntValue(d);
                if (value < 0 || value > 255) {
                    throw new RuntimeException("Color value " + value + " not valid, correct range [0,255]");
                }
            }
        }
    }

    private String getColor(SvgTree t) {
        assert t != null;
        String color;
        if (t.getType() == SvgLexer.RGB) {
            String[] a = new String[3];
            checkColor(t);
            for(int i = 0; i < 3; i++) {
                Data d  = evaluateExpression(t.getChild(i));
                a[i] = d.toString();
            }
            color = "rgb(" + a[0] + "," + a[1] + "," + a[2] + ")";
        } else {
            color = t.getText();
        }
        return color;
    }

    private void checkOpacity(SvgTree t) {
        assert t != null;
        Data d = evaluateExpression(t); checkNumber(d);
        float value = getFloatValue(d);
        if (value < 0. || value > 1.) {
            throw new RuntimeException("Opacity value " + value + " not valid, correct range [0,1]");
        } 
    }

    private void checkFontWeight(SvgTree t) {
        if (t.getType() == SvgLexer.INT) {
            int value = Integer.parseInt(t.getText());
            for (int i = 100; i <= 900; i += 100) {
                if (i == value) return;
            }
            throw new RuntimeException("font-weight value " + value + " not valid, correct options are" +
                "(100 | 200 | 300 | 400 | 500 | 600 | 700 | 800 | 900)");
        }
    }

        private Object generateAttribute (SvgTree t) {
        assert t != null;
        SvgTree value = t.getChild(0);
        assert value != null;
        Object ret;
        int type = t.getType();
        switch (type) {
            case SvgLexer.FILL:
                checkColor(value);
                ret = getColor(value);
                break;

            case SvgLexer.FILLOPACITY:
                checkOpacity(value);
                ret = getFloatValue(evaluateExpression(value));
                break;

            case SvgLexer.STROKE:
                checkColor(value);
                ret = getColor(value);
                break;

            case SvgLexer.FONTWEIGHT:
                checkFontWeight(value);
                ret = value.getText();
                break;

            case SvgLexer.RX:
            case SvgLexer.RY:
                Data d = evaluateExpression(value);
                checkNumber(d);
                ret = getFloatValue(d);
                break;

            default:
                ret = value.getText();
                break;
        }
        return ret;
    }

    private void existAttribute (int type, String attr, boolean creationTime) {
        boolean generalAttribute = Arrays.asList(generalAttributeTypes).contains(attr);

        switch (type) {
            case SvgLexer.TEXT:
                boolean textAttribute = Arrays.asList(textAtrributeTypes).contains(attr);
                if (attr.equals("font-orientation") && !creationTime) {
                    throw new RuntimeException("Atrribute 'font-orientation' of type TEXT can only be defined at the creation statement");
                }
                if (!generalAttribute && !textAttribute) {
                    throw new RuntimeException ("The attribute '" + attr + "' for variable " + Integer.toString(type) + " of type TEXT does not exist");
                }
                break;

            case SvgLexer.RECTANGLE:
                boolean rectangleAttrigute = Arrays.asList(rectangleAttribueTypes).contains(attr);
                if (!generalAttribute && !rectangleAttrigute) {
                    throw new RuntimeException ("The attribute '" + attr + "' for variable" + Integer.toString(type)
                    + " of type RECTANGLE does not exist");
                }
                break;

            default:
                if (!generalAttribute) {
                    throw new RuntimeException ("Attribute '" + attr + "' for " + Integer.toString(type) + " does not exist");
                }
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (SvgTree AstF, SvgTree args) {
        if (args != null) setLineNumber(args);
        SvgTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            SvgTree p = pars.getChild(i); // Parameters of the callee
            SvgTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == SvgLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != SvgLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(SvgTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        SvgTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            SvgTree p = params.getChild(i);
            if (p.getType() == SvgLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(SvgTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        SvgTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            SvgTree p = params.getChild(i);
            if (p.getType() == SvgLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
