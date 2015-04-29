// $ANTLR 3.4 /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g 2015-04-29 18:58:07

package parser;
import interp.SvgTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SvgParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARRAY", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "COMP_EQUAL", "COORD", "CREATE", "DESTROY", "DIV", "ELIF", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "ITE", "LE", "LINE", "LIST_ATTR", "LIST_COORD", "LIST_FUNCTIONS", "LIST_INSTR", "LPAREN", "LT", "MINUS", "MOD", "MODIFY", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "POLYGON", "PREF", "PVALUE", "READ", "RECTANGLE", "RETURN", "RGB", "ROTATE", "RPAREN", "SCALE", "SOURCE", "STRING", "TEXT", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "','", "':'", "';'", "'['", "']'", "'alternate'", "'blue'", "'bold'", "'bolder'", "'dots'", "'fill'", "'fill-opacity'", "'font-style'", "'font-weight'", "'green'", "'horizontal'", "'italic'", "'lighter'", "'line-pattern'", "'line-width'", "'lines'", "'normal'", "'oblique'", "'orientation'", "'red'", "'vertical'", "'yellow'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARRAY=6;
    public static final int ASSIGN=7;
    public static final int BOOLEAN=8;
    public static final int CIRCLE=9;
    public static final int COMMENT=10;
    public static final int COMP_EQUAL=11;
    public static final int COORD=12;
    public static final int CREATE=13;
    public static final int DESTROY=14;
    public static final int DIV=15;
    public static final int ELIF=16;
    public static final int ELLIPSE=17;
    public static final int ELSE=18;
    public static final int ENDFUNC=19;
    public static final int ENDIF=20;
    public static final int EQUAL=21;
    public static final int ESC_SEQ=22;
    public static final int FALSE=23;
    public static final int FLOAT=24;
    public static final int FOR=25;
    public static final int FUNC=26;
    public static final int FUNCALL=27;
    public static final int GE=28;
    public static final int GT=29;
    public static final int ID=30;
    public static final int IF=31;
    public static final int INT=32;
    public static final int ITE=33;
    public static final int LE=34;
    public static final int LINE=35;
    public static final int LIST_ATTR=36;
    public static final int LIST_COORD=37;
    public static final int LIST_FUNCTIONS=38;
    public static final int LIST_INSTR=39;
    public static final int LPAREN=40;
    public static final int LT=41;
    public static final int MINUS=42;
    public static final int MOD=43;
    public static final int MODIFY=44;
    public static final int MOVE=45;
    public static final int MUL=46;
    public static final int NOT=47;
    public static final int NOT_EQUAL=48;
    public static final int OR=49;
    public static final int PARAMS=50;
    public static final int PLUS=51;
    public static final int POLYGON=52;
    public static final int PREF=53;
    public static final int PVALUE=54;
    public static final int READ=55;
    public static final int RECTANGLE=56;
    public static final int RETURN=57;
    public static final int RGB=58;
    public static final int ROTATE=59;
    public static final int RPAREN=60;
    public static final int SCALE=61;
    public static final int SOURCE=62;
    public static final int STRING=63;
    public static final int TEXT=64;
    public static final int THEN=65;
    public static final int TRUE=66;
    public static final int WHILE=67;
    public static final int WRITE=68;
    public static final int WS=69;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SvgParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SvgParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SvgParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final SvgParser.prog_return prog() throws RecognitionException {
        SvgParser.prog_return retval = new SvgParser.prog_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token EOF2=null;
        SvgParser.func_return func1 =null;


        SvgTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:11: ( func )+ EOF
            {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog208);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog211);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 66:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:66:24: ^( LIST_FUNCTIONS ( func )+ )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:70:1: func : FUNC ^ ID params '{' ! block_instructions '}' !;
    public final SvgParser.func_return func() throws RecognitionException {
        SvgParser.func_return retval = new SvgParser.func_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        SvgParser.params_return params5 =null;

        SvgParser.block_instructions_return block_instructions7 =null;


        SvgTree FUNC3_tree=null;
        SvgTree ID4_tree=null;
        SvgTree char_literal6_tree=null;
        SvgTree char_literal8_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:70:9: ( FUNC ^ ID params '{' ! block_instructions '}' !)
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:70:11: FUNC ^ ID params '{' ! block_instructions '}' !
            {
            root_0 = (SvgTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func253); 
            FUNC3_tree = 
            (SvgTree)adaptor.create(FUNC3)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func256); 
            ID4_tree = 
            (SvgTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func258);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            char_literal6=(Token)match(input,98,FOLLOW_98_in_func260); 

            pushFollow(FOLLOW_block_instructions_in_func263);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            char_literal8=(Token)match(input,99,FOLLOW_99_in_func265); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final SvgParser.params_return params() throws RecognitionException {
        SvgParser.params_return retval = new SvgParser.params_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        SvgParser.paramlist_return paramlist10 =null;


        SvgTree char_literal9_tree=null;
        SvgTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:11: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_params285);  
            stream_LPAREN.add(char_literal9);


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==70) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params287);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_params290);  
            stream_RPAREN.add(char_literal11);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 74:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:33: ^( PARAMS ( paramlist )? )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:74:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:78:1: paramlist : param ( ',' ! param )* ;
    public final SvgParser.paramlist_return paramlist() throws RecognitionException {
        SvgParser.paramlist_return retval = new SvgParser.paramlist_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal13=null;
        SvgParser.param_return param12 =null;

        SvgParser.param_return param14 =null;


        SvgTree char_literal13_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:78:10: ( param ( ',' ! param )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:78:12: param ( ',' ! param )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist316);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:78:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==71) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:78:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,71,FOLLOW_71_in_paramlist319); 

            	    pushFollow(FOLLOW_param_in_paramlist322);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:83:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final SvgParser.param_return param() throws RecognitionException {
        SvgParser.param_return retval = new SvgParser.param_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token id=null;
        Token char_literal15=null;

        SvgTree id_tree=null;
        SvgTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:83:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==70) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:83:13: '&' id= ID
                    {
                    char_literal15=(Token)match(input,70,FOLLOW_70_in_param347);  
                    stream_70.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param351);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SvgTree)adaptor.nil();
                    // 83:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:83:26: ^( PREF[$id,$id.text] )
                        {
                        SvgTree root_1 = (SvgTree)adaptor.nil();
                        root_1 = (SvgTree)adaptor.becomeRoot(
                        (SvgTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:84:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param374);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SvgTree)adaptor.nil();
                    // 84:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:84:22: ^( PVALUE[$id,$id.text] )
                        {
                        SvgTree root_1 = (SvgTree)adaptor.nil();
                        root_1 = (SvgTree)adaptor.becomeRoot(
                        (SvgTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:88:1: block_instructions : ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) ;
    public final SvgParser.block_instructions_return block_instructions() throws RecognitionException {
        SvgParser.block_instructions_return retval = new SvgParser.block_instructions_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        SvgParser.instruction_return instruction16 =null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:89:9: ( ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:89:14: ( instruction )+
            {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:89:14: ( instruction )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= CREATE && LA5_0 <= DESTROY)||LA5_0==FOR||(LA5_0 >= ID && LA5_0 <= IF)||(LA5_0 >= MODIFY && LA5_0 <= MOVE)||LA5_0==READ||LA5_0==RETURN||LA5_0==ROTATE||(LA5_0 >= SCALE && LA5_0 <= SOURCE)||LA5_0==WRITE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:89:15: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_block_instructions411);
            	    instruction16=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction16.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 89:31: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:89:34: ^( LIST_INSTR ( instruction )+ )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:93:1: instruction : ( assign ';' !| ite_stmt | for_stmt | create ';' !| destroy ';' !| modify ';' !| move ';' !| scale ';' !| rotate ';' !| source ';' !| funcall ';' !| read ';' !| write ';' !| return_stmt ';' !);
    public final SvgParser.instruction_return instruction() throws RecognitionException {
        SvgParser.instruction_return retval = new SvgParser.instruction_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal18=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal42=null;
        SvgParser.assign_return assign17 =null;

        SvgParser.ite_stmt_return ite_stmt19 =null;

        SvgParser.for_stmt_return for_stmt20 =null;

        SvgParser.create_return create21 =null;

        SvgParser.destroy_return destroy23 =null;

        SvgParser.modify_return modify25 =null;

        SvgParser.move_return move27 =null;

        SvgParser.scale_return scale29 =null;

        SvgParser.rotate_return rotate31 =null;

        SvgParser.source_return source33 =null;

        SvgParser.funcall_return funcall35 =null;

        SvgParser.read_return read37 =null;

        SvgParser.write_return write39 =null;

        SvgParser.return_stmt_return return_stmt41 =null;


        SvgTree char_literal18_tree=null;
        SvgTree char_literal22_tree=null;
        SvgTree char_literal24_tree=null;
        SvgTree char_literal26_tree=null;
        SvgTree char_literal28_tree=null;
        SvgTree char_literal30_tree=null;
        SvgTree char_literal32_tree=null;
        SvgTree char_literal34_tree=null;
        SvgTree char_literal36_tree=null;
        SvgTree char_literal38_tree=null;
        SvgTree char_literal40_tree=null;
        SvgTree char_literal42_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:94:9: ( assign ';' !| ite_stmt | for_stmt | create ';' !| destroy ';' !| modify ';' !| move ';' !| scale ';' !| rotate ';' !| source ';' !| funcall ';' !| read ';' !| write ';' !| return_stmt ';' !)
            int alt6=14;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==74) ) {
                    alt6=1;
                }
                else if ( (LA6_1==LPAREN) ) {
                    alt6=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case FOR:
                {
                alt6=3;
                }
                break;
            case CREATE:
                {
                alt6=4;
                }
                break;
            case DESTROY:
                {
                alt6=5;
                }
                break;
            case MODIFY:
                {
                alt6=6;
                }
                break;
            case MOVE:
                {
                alt6=7;
                }
                break;
            case SCALE:
                {
                alt6=8;
                }
                break;
            case ROTATE:
                {
                alt6=9;
                }
                break;
            case SOURCE:
                {
                alt6=10;
                }
                break;
            case READ:
                {
                alt6=12;
                }
                break;
            case WRITE:
                {
                alt6=13;
                }
                break;
            case RETURN:
                {
                alt6=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:94:13: assign ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction452);
                    assign17=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign17.getTree());

                    char_literal18=(Token)match(input,73,FOLLOW_73_in_instruction454); 

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:95:13: ite_stmt
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction474);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:96:13: for_stmt
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction496);
                    for_stmt20=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:97:13: create ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_instruction518);
                    create21=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create21.getTree());

                    char_literal22=(Token)match(input,73,FOLLOW_73_in_instruction520); 

                    }
                    break;
                case 5 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:98:13: destroy ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_instruction540);
                    destroy23=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy23.getTree());

                    char_literal24=(Token)match(input,73,FOLLOW_73_in_instruction542); 

                    }
                    break;
                case 6 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:99:13: modify ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_instruction561);
                    modify25=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify25.getTree());

                    char_literal26=(Token)match(input,73,FOLLOW_73_in_instruction563); 

                    }
                    break;
                case 7 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:100:13: move ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_instruction583);
                    move27=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move27.getTree());

                    char_literal28=(Token)match(input,73,FOLLOW_73_in_instruction585); 

                    }
                    break;
                case 8 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:101:13: scale ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_scale_in_instruction607);
                    scale29=scale();

                    state._fsp--;

                    adaptor.addChild(root_0, scale29.getTree());

                    char_literal30=(Token)match(input,73,FOLLOW_73_in_instruction609); 

                    }
                    break;
                case 9 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:102:13: rotate ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_instruction630);
                    rotate31=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate31.getTree());

                    char_literal32=(Token)match(input,73,FOLLOW_73_in_instruction632); 

                    }
                    break;
                case 10 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:103:13: source ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_source_in_instruction652);
                    source33=source();

                    state._fsp--;

                    adaptor.addChild(root_0, source33.getTree());

                    char_literal34=(Token)match(input,73,FOLLOW_73_in_instruction654); 

                    }
                    break;
                case 11 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:104:13: funcall ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction674);
                    funcall35=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall35.getTree());

                    char_literal36=(Token)match(input,73,FOLLOW_73_in_instruction676); 

                    }
                    break;
                case 12 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:105:13: read ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction695);
                    read37=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read37.getTree());

                    char_literal38=(Token)match(input,73,FOLLOW_73_in_instruction697); 

                    }
                    break;
                case 13 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:106:13: write ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction719);
                    write39=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write39.getTree());

                    char_literal40=(Token)match(input,73,FOLLOW_73_in_instruction721); 

                    }
                    break;
                case 14 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:107:13: return_stmt ';' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction742);
                    return_stmt41=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt41.getTree());

                    char_literal42=(Token)match(input,73,FOLLOW_73_in_instruction744); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:111:1: assign : variable eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] variable expr ) ;
    public final SvgParser.assign_return assign() throws RecognitionException {
        SvgParser.assign_return retval = new SvgParser.assign_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token eq=null;
        SvgParser.variable_return variable43 =null;

        SvgParser.expr_return expr44 =null;


        SvgTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:111:9: ( variable eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] variable expr ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:111:13: variable eq= EQUAL expr
            {
            pushFollow(FOLLOW_variable_in_assign766);
            variable43=variable();

            state._fsp--;

            stream_variable.add(variable43.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign770);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign772);
            expr44=expr();

            state._fsp--;

            stream_expr.add(expr44.getTree());

            // AST REWRITE
            // elements: variable, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 111:36: -> ^( ASSIGN[$eq,\":=\"] variable expr )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:111:39: ^( ASSIGN[$eq,\":=\"] variable expr )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class return_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:115:1: return_stmt : RETURN ^ ( expr )? ;
    public final SvgParser.return_stmt_return return_stmt() throws RecognitionException {
        SvgParser.return_stmt_return retval = new SvgParser.return_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token RETURN45=null;
        SvgParser.expr_return expr46 =null;


        SvgTree RETURN45_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:115:13: ( RETURN ^ ( expr )? )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:115:17: RETURN ^ ( expr )?
            {
            root_0 = (SvgTree)adaptor.nil();


            RETURN45=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt803); 
            RETURN45_tree = 
            (SvgTree)adaptor.create(RETURN45)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(RETURN45_tree, root_0);


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:115:25: ( expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= FALSE && LA7_0 <= FLOAT)||LA7_0==ID||LA7_0==INT||LA7_0==LPAREN||LA7_0==MINUS||LA7_0==NOT||LA7_0==PLUS||LA7_0==TRUE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:115:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt806);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class variable_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:1: variable : ( ID | array ) ;
    public final SvgParser.variable_return variable() throws RecognitionException {
        SvgParser.variable_return retval = new SvgParser.variable_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token ID47=null;
        SvgParser.array_return array48 =null;


        SvgTree ID47_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:9: ( ( ID | array ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:13: ( ID | array )
            {
            root_0 = (SvgTree)adaptor.nil();


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:13: ( ID | array )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==74) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EQUAL) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:14: ID
                    {
                    ID47=(Token)match(input,ID,FOLLOW_ID_in_variable826); 
                    ID47_tree = 
                    (SvgTree)adaptor.create(ID47)
                    ;
                    adaptor.addChild(root_0, ID47_tree);


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:118:17: array
                    {
                    pushFollow(FOLLOW_array_in_variable828);
                    array48=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array48.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class array_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:121:1: array : id= ID '[' INT ']' -> ^( ARRAY[$id,$id.text] INT ) ;
    public final SvgParser.array_return array() throws RecognitionException {
        SvgParser.array_return retval = new SvgParser.array_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token id=null;
        Token char_literal49=null;
        Token INT50=null;
        Token char_literal51=null;

        SvgTree id_tree=null;
        SvgTree char_literal49_tree=null;
        SvgTree INT50_tree=null;
        SvgTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:121:9: (id= ID '[' INT ']' -> ^( ARRAY[$id,$id.text] INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:121:11: id= ID '[' INT ']'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_array850);  
            stream_ID.add(id);


            char_literal49=(Token)match(input,74,FOLLOW_74_in_array852);  
            stream_74.add(char_literal49);


            INT50=(Token)match(input,INT,FOLLOW_INT_in_array854);  
            stream_INT.add(INT50);


            char_literal51=(Token)match(input,75,FOLLOW_75_in_array856);  
            stream_75.add(char_literal51);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 121:32: -> ^( ARRAY[$id,$id.text] INT )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:121:35: ^( ARRAY[$id,$id.text] INT )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(ARRAY, id, (id!=null?id.getText():null))
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class create_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:127:1: create : CREATE ^ objecte_create attributes ( FLOAT | INT )? ;
    public final SvgParser.create_return create() throws RecognitionException {
        SvgParser.create_return retval = new SvgParser.create_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token CREATE52=null;
        Token set55=null;
        SvgParser.objecte_create_return objecte_create53 =null;

        SvgParser.attributes_return attributes54 =null;


        SvgTree CREATE52_tree=null;
        SvgTree set55_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:127:9: ( CREATE ^ objecte_create attributes ( FLOAT | INT )? )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:127:11: CREATE ^ objecte_create attributes ( FLOAT | INT )?
            {
            root_0 = (SvgTree)adaptor.nil();


            CREATE52=(Token)match(input,CREATE,FOLLOW_CREATE_in_create889); 
            CREATE52_tree = 
            (SvgTree)adaptor.create(CREATE52)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(CREATE52_tree, root_0);


            pushFollow(FOLLOW_objecte_create_in_create892);
            objecte_create53=objecte_create();

            state._fsp--;

            adaptor.addChild(root_0, objecte_create53.getTree());

            pushFollow(FOLLOW_attributes_in_create913);
            attributes54=attributes();

            state._fsp--;

            adaptor.addChild(root_0, attributes54.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:127:73: ( FLOAT | INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FLOAT||LA9_0==INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
                    {
                    set55=(Token)input.LT(1);

                    if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (SvgTree)adaptor.create(set55)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class objecte_create_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objecte_create"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:131:1: objecte_create : ( TEXT ID INT INT STRING | CIRCLE ID INT INT INT | RECTANGLE ID INT INT INT INT ( INT INT )? | ELLIPSE ID INT INT INT INT | LINE ID list_min_2_coord | POLYGON ID list_min_2_coord );
    public final SvgParser.objecte_create_return objecte_create() throws RecognitionException {
        SvgParser.objecte_create_return retval = new SvgParser.objecte_create_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token TEXT56=null;
        Token ID57=null;
        Token INT58=null;
        Token INT59=null;
        Token STRING60=null;
        Token CIRCLE61=null;
        Token ID62=null;
        Token INT63=null;
        Token INT64=null;
        Token INT65=null;
        Token RECTANGLE66=null;
        Token ID67=null;
        Token INT68=null;
        Token INT69=null;
        Token INT70=null;
        Token INT71=null;
        Token INT72=null;
        Token INT73=null;
        Token ELLIPSE74=null;
        Token ID75=null;
        Token INT76=null;
        Token INT77=null;
        Token INT78=null;
        Token INT79=null;
        Token LINE80=null;
        Token ID81=null;
        Token POLYGON83=null;
        Token ID84=null;
        SvgParser.list_min_2_coord_return list_min_2_coord82 =null;

        SvgParser.list_min_2_coord_return list_min_2_coord85 =null;


        SvgTree TEXT56_tree=null;
        SvgTree ID57_tree=null;
        SvgTree INT58_tree=null;
        SvgTree INT59_tree=null;
        SvgTree STRING60_tree=null;
        SvgTree CIRCLE61_tree=null;
        SvgTree ID62_tree=null;
        SvgTree INT63_tree=null;
        SvgTree INT64_tree=null;
        SvgTree INT65_tree=null;
        SvgTree RECTANGLE66_tree=null;
        SvgTree ID67_tree=null;
        SvgTree INT68_tree=null;
        SvgTree INT69_tree=null;
        SvgTree INT70_tree=null;
        SvgTree INT71_tree=null;
        SvgTree INT72_tree=null;
        SvgTree INT73_tree=null;
        SvgTree ELLIPSE74_tree=null;
        SvgTree ID75_tree=null;
        SvgTree INT76_tree=null;
        SvgTree INT77_tree=null;
        SvgTree INT78_tree=null;
        SvgTree INT79_tree=null;
        SvgTree LINE80_tree=null;
        SvgTree ID81_tree=null;
        SvgTree POLYGON83_tree=null;
        SvgTree ID84_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:131:15: ( TEXT ID INT INT STRING | CIRCLE ID INT INT INT | RECTANGLE ID INT INT INT INT ( INT INT )? | ELLIPSE ID INT INT INT INT | LINE ID list_min_2_coord | POLYGON ID list_min_2_coord )
            int alt11=6;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt11=1;
                }
                break;
            case CIRCLE:
                {
                alt11=2;
                }
                break;
            case RECTANGLE:
                {
                alt11=3;
                }
                break;
            case ELLIPSE:
                {
                alt11=4;
                }
                break;
            case LINE:
                {
                alt11=5;
                }
                break;
            case POLYGON:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:131:17: TEXT ID INT INT STRING
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    TEXT56=(Token)match(input,TEXT,FOLLOW_TEXT_in_objecte_create946); 
                    TEXT56_tree = 
                    (SvgTree)adaptor.create(TEXT56)
                    ;
                    adaptor.addChild(root_0, TEXT56_tree);


                    ID57=(Token)match(input,ID,FOLLOW_ID_in_objecte_create953); 
                    ID57_tree = 
                    (SvgTree)adaptor.create(ID57)
                    ;
                    adaptor.addChild(root_0, ID57_tree);


                    INT58=(Token)match(input,INT,FOLLOW_INT_in_objecte_create961); 
                    INT58_tree = 
                    (SvgTree)adaptor.create(INT58)
                    ;
                    adaptor.addChild(root_0, INT58_tree);


                    INT59=(Token)match(input,INT,FOLLOW_INT_in_objecte_create963); 
                    INT59_tree = 
                    (SvgTree)adaptor.create(INT59)
                    ;
                    adaptor.addChild(root_0, INT59_tree);


                    STRING60=(Token)match(input,STRING,FOLLOW_STRING_in_objecte_create965); 
                    STRING60_tree = 
                    (SvgTree)adaptor.create(STRING60)
                    ;
                    adaptor.addChild(root_0, STRING60_tree);


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:132:17: CIRCLE ID INT INT INT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    CIRCLE61=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_objecte_create983); 
                    CIRCLE61_tree = 
                    (SvgTree)adaptor.create(CIRCLE61)
                    ;
                    adaptor.addChild(root_0, CIRCLE61_tree);


                    ID62=(Token)match(input,ID,FOLLOW_ID_in_objecte_create988); 
                    ID62_tree = 
                    (SvgTree)adaptor.create(ID62)
                    ;
                    adaptor.addChild(root_0, ID62_tree);


                    INT63=(Token)match(input,INT,FOLLOW_INT_in_objecte_create996); 
                    INT63_tree = 
                    (SvgTree)adaptor.create(INT63)
                    ;
                    adaptor.addChild(root_0, INT63_tree);


                    INT64=(Token)match(input,INT,FOLLOW_INT_in_objecte_create998); 
                    INT64_tree = 
                    (SvgTree)adaptor.create(INT64)
                    ;
                    adaptor.addChild(root_0, INT64_tree);


                    INT65=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1000); 
                    INT65_tree = 
                    (SvgTree)adaptor.create(INT65)
                    ;
                    adaptor.addChild(root_0, INT65_tree);


                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:133:17: RECTANGLE ID INT INT INT INT ( INT INT )?
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    RECTANGLE66=(Token)match(input,RECTANGLE,FOLLOW_RECTANGLE_in_objecte_create1018); 
                    RECTANGLE66_tree = 
                    (SvgTree)adaptor.create(RECTANGLE66)
                    ;
                    adaptor.addChild(root_0, RECTANGLE66_tree);


                    ID67=(Token)match(input,ID,FOLLOW_ID_in_objecte_create1020); 
                    ID67_tree = 
                    (SvgTree)adaptor.create(ID67)
                    ;
                    adaptor.addChild(root_0, ID67_tree);


                    INT68=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1028); 
                    INT68_tree = 
                    (SvgTree)adaptor.create(INT68)
                    ;
                    adaptor.addChild(root_0, INT68_tree);


                    INT69=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1030); 
                    INT69_tree = 
                    (SvgTree)adaptor.create(INT69)
                    ;
                    adaptor.addChild(root_0, INT69_tree);


                    INT70=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1032); 
                    INT70_tree = 
                    (SvgTree)adaptor.create(INT70)
                    ;
                    adaptor.addChild(root_0, INT70_tree);


                    INT71=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1034); 
                    INT71_tree = 
                    (SvgTree)adaptor.create(INT71)
                    ;
                    adaptor.addChild(root_0, INT71_tree);


                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:133:52: ( INT INT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:133:53: INT INT
                            {
                            INT72=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1037); 
                            INT72_tree = 
                            (SvgTree)adaptor.create(INT72)
                            ;
                            adaptor.addChild(root_0, INT72_tree);


                            INT73=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1039); 
                            INT73_tree = 
                            (SvgTree)adaptor.create(INT73)
                            ;
                            adaptor.addChild(root_0, INT73_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:134:17: ELLIPSE ID INT INT INT INT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    ELLIPSE74=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_objecte_create1059); 
                    ELLIPSE74_tree = 
                    (SvgTree)adaptor.create(ELLIPSE74)
                    ;
                    adaptor.addChild(root_0, ELLIPSE74_tree);


                    ID75=(Token)match(input,ID,FOLLOW_ID_in_objecte_create1063); 
                    ID75_tree = 
                    (SvgTree)adaptor.create(ID75)
                    ;
                    adaptor.addChild(root_0, ID75_tree);


                    INT76=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1071); 
                    INT76_tree = 
                    (SvgTree)adaptor.create(INT76)
                    ;
                    adaptor.addChild(root_0, INT76_tree);


                    INT77=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1073); 
                    INT77_tree = 
                    (SvgTree)adaptor.create(INT77)
                    ;
                    adaptor.addChild(root_0, INT77_tree);


                    INT78=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1075); 
                    INT78_tree = 
                    (SvgTree)adaptor.create(INT78)
                    ;
                    adaptor.addChild(root_0, INT78_tree);


                    INT79=(Token)match(input,INT,FOLLOW_INT_in_objecte_create1077); 
                    INT79_tree = 
                    (SvgTree)adaptor.create(INT79)
                    ;
                    adaptor.addChild(root_0, INT79_tree);


                    }
                    break;
                case 5 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:135:17: LINE ID list_min_2_coord
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    LINE80=(Token)match(input,LINE,FOLLOW_LINE_in_objecte_create1095); 
                    LINE80_tree = 
                    (SvgTree)adaptor.create(LINE80)
                    ;
                    adaptor.addChild(root_0, LINE80_tree);


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_objecte_create1102); 
                    ID81_tree = 
                    (SvgTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    pushFollow(FOLLOW_list_min_2_coord_in_objecte_create1110);
                    list_min_2_coord82=list_min_2_coord();

                    state._fsp--;

                    adaptor.addChild(root_0, list_min_2_coord82.getTree());

                    }
                    break;
                case 6 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:136:17: POLYGON ID list_min_2_coord
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    POLYGON83=(Token)match(input,POLYGON,FOLLOW_POLYGON_in_objecte_create1128); 
                    POLYGON83_tree = 
                    (SvgTree)adaptor.create(POLYGON83)
                    ;
                    adaptor.addChild(root_0, POLYGON83_tree);


                    ID84=(Token)match(input,ID,FOLLOW_ID_in_objecte_create1132); 
                    ID84_tree = 
                    (SvgTree)adaptor.create(ID84)
                    ;
                    adaptor.addChild(root_0, ID84_tree);


                    pushFollow(FOLLOW_list_min_2_coord_in_objecte_create1140);
                    list_min_2_coord85=list_min_2_coord();

                    state._fsp--;

                    adaptor.addChild(root_0, list_min_2_coord85.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objecte_create"


    public static class list_min_2_coord_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_min_2_coord"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:1: list_min_2_coord : coord coord ( coord )* -> ^( LIST_COORD ( coord )+ ) ;
    public final SvgParser.list_min_2_coord_return list_min_2_coord() throws RecognitionException {
        SvgParser.list_min_2_coord_return retval = new SvgParser.list_min_2_coord_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        SvgParser.coord_return coord86 =null;

        SvgParser.coord_return coord87 =null;

        SvgParser.coord_return coord88 =null;


        RewriteRuleSubtreeStream stream_coord=new RewriteRuleSubtreeStream(adaptor,"rule coord");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:18: ( coord coord ( coord )* -> ^( LIST_COORD ( coord )+ ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:20: coord coord ( coord )*
            {
            pushFollow(FOLLOW_coord_in_list_min_2_coord1163);
            coord86=coord();

            state._fsp--;

            stream_coord.add(coord86.getTree());

            pushFollow(FOLLOW_coord_in_list_min_2_coord1165);
            coord87=coord();

            state._fsp--;

            stream_coord.add(coord87.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:32: ( coord )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:32: coord
            	    {
            	    pushFollow(FOLLOW_coord_in_list_min_2_coord1167);
            	    coord88=coord();

            	    state._fsp--;

            	    stream_coord.add(coord88.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: coord
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 139:39: -> ^( LIST_COORD ( coord )+ )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:139:42: ^( LIST_COORD ( coord )+ )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(LIST_COORD, "LIST_COORD")
                , root_1);

                if ( !(stream_coord.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_coord.hasNext() ) {
                    adaptor.addChild(root_1, stream_coord.nextTree());

                }
                stream_coord.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_min_2_coord"


    public static class coord_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coord"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:142:1: coord : INT ',' INT -> ^( COORD INT INT ) ;
    public final SvgParser.coord_return coord() throws RecognitionException {
        SvgParser.coord_return retval = new SvgParser.coord_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token INT89=null;
        Token char_literal90=null;
        Token INT91=null;

        SvgTree INT89_tree=null;
        SvgTree char_literal90_tree=null;
        SvgTree INT91_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:142:7: ( INT ',' INT -> ^( COORD INT INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:142:9: INT ',' INT
            {
            INT89=(Token)match(input,INT,FOLLOW_INT_in_coord1203);  
            stream_INT.add(INT89);


            char_literal90=(Token)match(input,71,FOLLOW_71_in_coord1205);  
            stream_71.add(char_literal90);


            INT91=(Token)match(input,INT,FOLLOW_INT_in_coord1207);  
            stream_INT.add(INT91);


            // AST REWRITE
            // elements: INT, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 142:25: -> ^( COORD INT INT )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:142:28: ^( COORD INT INT )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(COORD, "COORD")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coord"


    public static class destroy_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destroy"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:147:1: destroy : DESTROY ^ ID ( FLOAT | INT ) ;
    public final SvgParser.destroy_return destroy() throws RecognitionException {
        SvgParser.destroy_return retval = new SvgParser.destroy_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token DESTROY92=null;
        Token ID93=null;
        Token set94=null;

        SvgTree DESTROY92_tree=null;
        SvgTree ID93_tree=null;
        SvgTree set94_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:147:9: ( DESTROY ^ ID ( FLOAT | INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:147:11: DESTROY ^ ID ( FLOAT | INT )
            {
            root_0 = (SvgTree)adaptor.nil();


            DESTROY92=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1238); 
            DESTROY92_tree = 
            (SvgTree)adaptor.create(DESTROY92)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(DESTROY92_tree, root_0);


            ID93=(Token)match(input,ID,FOLLOW_ID_in_destroy1242); 
            ID93_tree = 
            (SvgTree)adaptor.create(ID93)
            ;
            adaptor.addChild(root_0, ID93_tree);


            set94=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set94)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destroy"


    public static class modify_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:152:1: modify : MODIFY ^ ID attributes ( FLOAT | INT ) ( FLOAT | INT ) ;
    public final SvgParser.modify_return modify() throws RecognitionException {
        SvgParser.modify_return retval = new SvgParser.modify_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token MODIFY95=null;
        Token ID96=null;
        Token set98=null;
        Token set99=null;
        SvgParser.attributes_return attributes97 =null;


        SvgTree MODIFY95_tree=null;
        SvgTree ID96_tree=null;
        SvgTree set98_tree=null;
        SvgTree set99_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:152:9: ( MODIFY ^ ID attributes ( FLOAT | INT ) ( FLOAT | INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:152:11: MODIFY ^ ID attributes ( FLOAT | INT ) ( FLOAT | INT )
            {
            root_0 = (SvgTree)adaptor.nil();


            MODIFY95=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify1274); 
            MODIFY95_tree = 
            (SvgTree)adaptor.create(MODIFY95)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(MODIFY95_tree, root_0);


            ID96=(Token)match(input,ID,FOLLOW_ID_in_modify1279); 
            ID96_tree = 
            (SvgTree)adaptor.create(ID96)
            ;
            adaptor.addChild(root_0, ID96_tree);


            pushFollow(FOLLOW_attributes_in_modify1290);
            attributes97=attributes();

            state._fsp--;

            adaptor.addChild(root_0, attributes97.getTree());

            set98=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set98)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set99=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set99)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify"


    public static class attributes_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributes"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:1: attributes : '{' attribute ( ',' attribute )* '}' -> ^( LIST_ATTR ( attribute )+ ) ;
    public final SvgParser.attributes_return attributes() throws RecognitionException {
        SvgParser.attributes_return retval = new SvgParser.attributes_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        SvgParser.attribute_return attribute101 =null;

        SvgParser.attribute_return attribute103 =null;


        SvgTree char_literal100_tree=null;
        SvgTree char_literal102_tree=null;
        SvgTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:13: ( '{' attribute ( ',' attribute )* '}' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:15: '{' attribute ( ',' attribute )* '}'
            {
            char_literal100=(Token)match(input,98,FOLLOW_98_in_attributes1329);  
            stream_98.add(char_literal100);


            pushFollow(FOLLOW_attribute_in_attributes1331);
            attribute101=attribute();

            state._fsp--;

            stream_attribute.add(attribute101.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:29: ( ',' attribute )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==71) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:30: ',' attribute
            	    {
            	    char_literal102=(Token)match(input,71,FOLLOW_71_in_attributes1334);  
            	    stream_71.add(char_literal102);


            	    pushFollow(FOLLOW_attribute_in_attributes1336);
            	    attribute103=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute103.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            char_literal104=(Token)match(input,99,FOLLOW_99_in_attributes1340);  
            stream_99.add(char_literal104);


            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 155:50: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:155:53: ^( LIST_ATTR ( attribute )+ )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(LIST_ATTR, "LIST_ATTR")
                , root_1);

                if ( !(stream_attribute.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:158:1: attribute : ( 'fill' ^ ':' ! color | 'fill-opacity' ^ ':' ! FLOAT | 'line' ^ ':' ! color | 'line-pattern' ^ ':' ! ( 'dots' | 'lines' | 'alternate' ) | 'line-width' ^ ':' ! INT | text_attributes );
    public final SvgParser.attribute_return attribute() throws RecognitionException {
        SvgParser.attribute_return retval = new SvgParser.attribute_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token string_literal105=null;
        Token char_literal106=null;
        Token string_literal108=null;
        Token char_literal109=null;
        Token FLOAT110=null;
        Token string_literal111=null;
        Token char_literal112=null;
        Token string_literal114=null;
        Token char_literal115=null;
        Token set116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token INT119=null;
        SvgParser.color_return color107 =null;

        SvgParser.color_return color113 =null;

        SvgParser.text_attributes_return text_attributes120 =null;


        SvgTree string_literal105_tree=null;
        SvgTree char_literal106_tree=null;
        SvgTree string_literal108_tree=null;
        SvgTree char_literal109_tree=null;
        SvgTree FLOAT110_tree=null;
        SvgTree string_literal111_tree=null;
        SvgTree char_literal112_tree=null;
        SvgTree string_literal114_tree=null;
        SvgTree char_literal115_tree=null;
        SvgTree set116_tree=null;
        SvgTree string_literal117_tree=null;
        SvgTree char_literal118_tree=null;
        SvgTree INT119_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:158:13: ( 'fill' ^ ':' ! color | 'fill-opacity' ^ ':' ! FLOAT | 'line' ^ ':' ! color | 'line-pattern' ^ ':' ! ( 'dots' | 'lines' | 'alternate' ) | 'line-width' ^ ':' ! INT | text_attributes )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt14=1;
                }
                break;
            case 82:
                {
                alt14=2;
                }
                break;
            case LINE:
                {
                alt14=3;
                }
                break;
            case 89:
                {
                alt14=4;
                }
                break;
            case 90:
                {
                alt14=5;
                }
                break;
            case 83:
            case 84:
            case 94:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:158:15: 'fill' ^ ':' ! color
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal105=(Token)match(input,81,FOLLOW_81_in_attribute1372); 
                    string_literal105_tree = 
                    (SvgTree)adaptor.create(string_literal105)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal105_tree, root_0);


                    char_literal106=(Token)match(input,72,FOLLOW_72_in_attribute1385); 

                    pushFollow(FOLLOW_color_in_attribute1388);
                    color107=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color107.getTree());

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:159:15: 'fill-opacity' ^ ':' ! FLOAT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal108=(Token)match(input,82,FOLLOW_82_in_attribute1404); 
                    string_literal108_tree = 
                    (SvgTree)adaptor.create(string_literal108)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal108_tree, root_0);


                    char_literal109=(Token)match(input,72,FOLLOW_72_in_attribute1409); 

                    FLOAT110=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_attribute1412); 
                    FLOAT110_tree = 
                    (SvgTree)adaptor.create(FLOAT110)
                    ;
                    adaptor.addChild(root_0, FLOAT110_tree);


                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:160:15: 'line' ^ ':' ! color
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal111=(Token)match(input,LINE,FOLLOW_LINE_in_attribute1428); 
                    string_literal111_tree = 
                    (SvgTree)adaptor.create(string_literal111)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal111_tree, root_0);


                    char_literal112=(Token)match(input,72,FOLLOW_72_in_attribute1441); 

                    pushFollow(FOLLOW_color_in_attribute1444);
                    color113=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color113.getTree());

                    }
                    break;
                case 4 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:161:15: 'line-pattern' ^ ':' ! ( 'dots' | 'lines' | 'alternate' )
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal114=(Token)match(input,89,FOLLOW_89_in_attribute1460); 
                    string_literal114_tree = 
                    (SvgTree)adaptor.create(string_literal114)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal114_tree, root_0);


                    char_literal115=(Token)match(input,72,FOLLOW_72_in_attribute1465); 

                    set116=(Token)input.LT(1);

                    if ( input.LA(1)==76||input.LA(1)==80||input.LA(1)==91 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (SvgTree)adaptor.create(set116)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:162:15: 'line-width' ^ ':' ! INT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal117=(Token)match(input,90,FOLLOW_90_in_attribute1490); 
                    string_literal117_tree = 
                    (SvgTree)adaptor.create(string_literal117)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal117_tree, root_0);


                    char_literal118=(Token)match(input,72,FOLLOW_72_in_attribute1497); 

                    INT119=(Token)match(input,INT,FOLLOW_INT_in_attribute1500); 
                    INT119_tree = 
                    (SvgTree)adaptor.create(INT119)
                    ;
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;
                case 6 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:163:15: text_attributes
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_text_attributes_in_attribute1516);
                    text_attributes120=text_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, text_attributes120.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class text_attributes_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "text_attributes"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:166:1: text_attributes : ( 'font-style' ^ ':' ! ( 'normal' | 'italic' | 'oblique' ) | 'font-weight' ^ ':' ! ( 'normal' | 'bold' | 'bolder' | 'lighter' | INT ) | 'orientation' ^ ':' ! ( 'horizontal' | 'vertical' ) );
    public final SvgParser.text_attributes_return text_attributes() throws RecognitionException {
        SvgParser.text_attributes_return retval = new SvgParser.text_attributes_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token string_literal121=null;
        Token char_literal122=null;
        Token set123=null;
        Token string_literal124=null;
        Token char_literal125=null;
        Token set126=null;
        Token string_literal127=null;
        Token char_literal128=null;
        Token set129=null;

        SvgTree string_literal121_tree=null;
        SvgTree char_literal122_tree=null;
        SvgTree set123_tree=null;
        SvgTree string_literal124_tree=null;
        SvgTree char_literal125_tree=null;
        SvgTree set126_tree=null;
        SvgTree string_literal127_tree=null;
        SvgTree char_literal128_tree=null;
        SvgTree set129_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:166:17: ( 'font-style' ^ ':' ! ( 'normal' | 'italic' | 'oblique' ) | 'font-weight' ^ ':' ! ( 'normal' | 'bold' | 'bolder' | 'lighter' | INT ) | 'orientation' ^ ':' ! ( 'horizontal' | 'vertical' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt15=1;
                }
                break;
            case 84:
                {
                alt15=2;
                }
                break;
            case 94:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:166:19: 'font-style' ^ ':' ! ( 'normal' | 'italic' | 'oblique' )
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal121=(Token)match(input,83,FOLLOW_83_in_text_attributes1537); 
                    string_literal121_tree = 
                    (SvgTree)adaptor.create(string_literal121)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal121_tree, root_0);


                    char_literal122=(Token)match(input,72,FOLLOW_72_in_text_attributes1540); 

                    set123=(Token)input.LT(1);

                    if ( input.LA(1)==87||(input.LA(1) >= 92 && input.LA(1) <= 93) ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (SvgTree)adaptor.create(set123)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:167:19: 'font-weight' ^ ':' ! ( 'normal' | 'bold' | 'bolder' | 'lighter' | INT )
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal124=(Token)match(input,84,FOLLOW_84_in_text_attributes1573); 
                    string_literal124_tree = 
                    (SvgTree)adaptor.create(string_literal124)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal124_tree, root_0);


                    char_literal125=(Token)match(input,72,FOLLOW_72_in_text_attributes1575); 

                    set126=(Token)input.LT(1);

                    if ( input.LA(1)==INT||(input.LA(1) >= 78 && input.LA(1) <= 79)||input.LA(1)==88||input.LA(1)==92 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (SvgTree)adaptor.create(set126)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:168:19: 'orientation' ^ ':' ! ( 'horizontal' | 'vertical' )
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    string_literal127=(Token)match(input,94,FOLLOW_94_in_text_attributes1616); 
                    string_literal127_tree = 
                    (SvgTree)adaptor.create(string_literal127)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(string_literal127_tree, root_0);


                    char_literal128=(Token)match(input,72,FOLLOW_72_in_text_attributes1618); 

                    set129=(Token)input.LT(1);

                    if ( input.LA(1)==86||input.LA(1)==96 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (SvgTree)adaptor.create(set129)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "text_attributes"


    public static class color_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "color"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:1: color : ( 'red' | 'blue' | 'green' | 'yellow' | rgb ) ;
    public final SvgParser.color_return color() throws RecognitionException {
        SvgParser.color_return retval = new SvgParser.color_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        SvgParser.rgb_return rgb134 =null;


        SvgTree string_literal130_tree=null;
        SvgTree string_literal131_tree=null;
        SvgTree string_literal132_tree=null;
        SvgTree string_literal133_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:7: ( ( 'red' | 'blue' | 'green' | 'yellow' | rgb ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:9: ( 'red' | 'blue' | 'green' | 'yellow' | rgb )
            {
            root_0 = (SvgTree)adaptor.nil();


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:9: ( 'red' | 'blue' | 'green' | 'yellow' | rgb )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt16=1;
                }
                break;
            case 77:
                {
                alt16=2;
                }
                break;
            case 85:
                {
                alt16=3;
                }
                break;
            case 97:
                {
                alt16=4;
                }
                break;
            case LPAREN:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:10: 'red'
                    {
                    string_literal130=(Token)match(input,95,FOLLOW_95_in_color1651); 
                    string_literal130_tree = 
                    (SvgTree)adaptor.create(string_literal130)
                    ;
                    adaptor.addChild(root_0, string_literal130_tree);


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:16: 'blue'
                    {
                    string_literal131=(Token)match(input,77,FOLLOW_77_in_color1653); 
                    string_literal131_tree = 
                    (SvgTree)adaptor.create(string_literal131)
                    ;
                    adaptor.addChild(root_0, string_literal131_tree);


                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:23: 'green'
                    {
                    string_literal132=(Token)match(input,85,FOLLOW_85_in_color1655); 
                    string_literal132_tree = 
                    (SvgTree)adaptor.create(string_literal132)
                    ;
                    adaptor.addChild(root_0, string_literal132_tree);


                    }
                    break;
                case 4 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:31: 'yellow'
                    {
                    string_literal133=(Token)match(input,97,FOLLOW_97_in_color1657); 
                    string_literal133_tree = 
                    (SvgTree)adaptor.create(string_literal133)
                    ;
                    adaptor.addChild(root_0, string_literal133_tree);


                    }
                    break;
                case 5 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:171:40: rgb
                    {
                    pushFollow(FOLLOW_rgb_in_color1659);
                    rgb134=rgb();

                    state._fsp--;

                    adaptor.addChild(root_0, rgb134.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "color"


    public static class rgb_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rgb"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:174:1: rgb : '(' INT ',' INT ',' INT ')' -> ^( RGB INT INT INT ) ;
    public final SvgParser.rgb_return rgb() throws RecognitionException {
        SvgParser.rgb_return retval = new SvgParser.rgb_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal135=null;
        Token INT136=null;
        Token char_literal137=null;
        Token INT138=null;
        Token char_literal139=null;
        Token INT140=null;
        Token char_literal141=null;

        SvgTree char_literal135_tree=null;
        SvgTree INT136_tree=null;
        SvgTree char_literal137_tree=null;
        SvgTree INT138_tree=null;
        SvgTree char_literal139_tree=null;
        SvgTree INT140_tree=null;
        SvgTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:174:7: ( '(' INT ',' INT ',' INT ')' -> ^( RGB INT INT INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:174:9: '(' INT ',' INT ',' INT ')'
            {
            char_literal135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rgb1677);  
            stream_LPAREN.add(char_literal135);


            INT136=(Token)match(input,INT,FOLLOW_INT_in_rgb1679);  
            stream_INT.add(INT136);


            char_literal137=(Token)match(input,71,FOLLOW_71_in_rgb1681);  
            stream_71.add(char_literal137);


            INT138=(Token)match(input,INT,FOLLOW_INT_in_rgb1683);  
            stream_INT.add(INT138);


            char_literal139=(Token)match(input,71,FOLLOW_71_in_rgb1685);  
            stream_71.add(char_literal139);


            INT140=(Token)match(input,INT,FOLLOW_INT_in_rgb1687);  
            stream_INT.add(INT140);


            char_literal141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rgb1689);  
            stream_RPAREN.add(char_literal141);


            // AST REWRITE
            // elements: INT, INT, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 174:37: -> ^( RGB INT INT INT )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:174:40: ^( RGB INT INT INT )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(RGB, "RGB")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rgb"


    public static class move_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:179:1: move : MOVE ^ ID coord ( FLOAT | INT ) ( FLOAT | INT ) ;
    public final SvgParser.move_return move() throws RecognitionException {
        SvgParser.move_return retval = new SvgParser.move_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token MOVE142=null;
        Token ID143=null;
        Token set145=null;
        Token set146=null;
        SvgParser.coord_return coord144 =null;


        SvgTree MOVE142_tree=null;
        SvgTree ID143_tree=null;
        SvgTree set145_tree=null;
        SvgTree set146_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:179:7: ( MOVE ^ ID coord ( FLOAT | INT ) ( FLOAT | INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:179:9: MOVE ^ ID coord ( FLOAT | INT ) ( FLOAT | INT )
            {
            root_0 = (SvgTree)adaptor.nil();


            MOVE142=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1719); 
            MOVE142_tree = 
            (SvgTree)adaptor.create(MOVE142)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(MOVE142_tree, root_0);


            ID143=(Token)match(input,ID,FOLLOW_ID_in_move1722); 
            ID143_tree = 
            (SvgTree)adaptor.create(ID143)
            ;
            adaptor.addChild(root_0, ID143_tree);


            pushFollow(FOLLOW_coord_in_move1730);
            coord144=coord();

            state._fsp--;

            adaptor.addChild(root_0, coord144.getTree());

            set145=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set145)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set146=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set146)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class scale_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scale"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:184:1: scale : SCALE ^ ID INT INT ( FLOAT | INT ) ( FLOAT | INT ) ;
    public final SvgParser.scale_return scale() throws RecognitionException {
        SvgParser.scale_return retval = new SvgParser.scale_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token SCALE147=null;
        Token ID148=null;
        Token INT149=null;
        Token INT150=null;
        Token set151=null;
        Token set152=null;

        SvgTree SCALE147_tree=null;
        SvgTree ID148_tree=null;
        SvgTree INT149_tree=null;
        SvgTree INT150_tree=null;
        SvgTree set151_tree=null;
        SvgTree set152_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:184:7: ( SCALE ^ ID INT INT ( FLOAT | INT ) ( FLOAT | INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:184:9: SCALE ^ ID INT INT ( FLOAT | INT ) ( FLOAT | INT )
            {
            root_0 = (SvgTree)adaptor.nil();


            SCALE147=(Token)match(input,SCALE,FOLLOW_SCALE_in_scale1762); 
            SCALE147_tree = 
            (SvgTree)adaptor.create(SCALE147)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(SCALE147_tree, root_0);


            ID148=(Token)match(input,ID,FOLLOW_ID_in_scale1766); 
            ID148_tree = 
            (SvgTree)adaptor.create(ID148)
            ;
            adaptor.addChild(root_0, ID148_tree);


            INT149=(Token)match(input,INT,FOLLOW_INT_in_scale1773); 
            INT149_tree = 
            (SvgTree)adaptor.create(INT149)
            ;
            adaptor.addChild(root_0, INT149_tree);


            INT150=(Token)match(input,INT,FOLLOW_INT_in_scale1783); 
            INT150_tree = 
            (SvgTree)adaptor.create(INT150)
            ;
            adaptor.addChild(root_0, INT150_tree);


            set151=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set151)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set152=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set152)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scale"


    public static class rotate_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rotate"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:189:1: rotate : ROTATE ^ ID ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT ) ;
    public final SvgParser.rotate_return rotate() throws RecognitionException {
        SvgParser.rotate_return retval = new SvgParser.rotate_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token ROTATE153=null;
        Token ID154=null;
        Token set155=null;
        Token set156=null;
        Token set157=null;
        Token set158=null;

        SvgTree ROTATE153_tree=null;
        SvgTree ID154_tree=null;
        SvgTree set155_tree=null;
        SvgTree set156_tree=null;
        SvgTree set157_tree=null;
        SvgTree set158_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:189:8: ( ROTATE ^ ID ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:189:10: ROTATE ^ ID ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT ) ( FLOAT | INT )
            {
            root_0 = (SvgTree)adaptor.nil();


            ROTATE153=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate1816); 
            ROTATE153_tree = 
            (SvgTree)adaptor.create(ROTATE153)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(ROTATE153_tree, root_0);


            ID154=(Token)match(input,ID,FOLLOW_ID_in_rotate1822); 
            ID154_tree = 
            (SvgTree)adaptor.create(ID154)
            ;
            adaptor.addChild(root_0, ID154_tree);


            set155=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set155)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set156=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set156)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set157=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set157)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            set158=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (SvgTree)adaptor.create(set158)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rotate"


    public static class source_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "source"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:194:1: source : SOURCE ^ STRING ;
    public final SvgParser.source_return source() throws RecognitionException {
        SvgParser.source_return retval = new SvgParser.source_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token SOURCE159=null;
        Token STRING160=null;

        SvgTree SOURCE159_tree=null;
        SvgTree STRING160_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:194:8: ( SOURCE ^ STRING )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:194:10: SOURCE ^ STRING
            {
            root_0 = (SvgTree)adaptor.nil();


            SOURCE159=(Token)match(input,SOURCE,FOLLOW_SOURCE_in_source1869); 
            SOURCE159_tree = 
            (SvgTree)adaptor.create(SOURCE159)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(SOURCE159_tree, root_0);


            STRING160=(Token)match(input,STRING,FOLLOW_STRING_in_source1872); 
            STRING160_tree = 
            (SvgTree)adaptor.create(STRING160)
            ;
            adaptor.addChild(root_0, STRING160_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "source"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:1: ite_stmt : if_stmt ( options {greedy=true; } : else_if_stmt )* ( options {greedy=true; } : else_stmt )? -> ^( ITE if_stmt ( else_if_stmt )* ( else_stmt )? ) ;
    public final SvgParser.ite_stmt_return ite_stmt() throws RecognitionException {
        SvgParser.ite_stmt_return retval = new SvgParser.ite_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        SvgParser.if_stmt_return if_stmt161 =null;

        SvgParser.else_if_stmt_return else_if_stmt162 =null;

        SvgParser.else_stmt_return else_stmt163 =null;


        RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");
        RewriteRuleSubtreeStream stream_if_stmt=new RewriteRuleSubtreeStream(adaptor,"rule if_stmt");
        RewriteRuleSubtreeStream stream_else_if_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_if_stmt");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:13: ( if_stmt ( options {greedy=true; } : else_if_stmt )* ( options {greedy=true; } : else_stmt )? -> ^( ITE if_stmt ( else_if_stmt )* ( else_stmt )? ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:15: if_stmt ( options {greedy=true; } : else_if_stmt )* ( options {greedy=true; } : else_stmt )?
            {
            pushFollow(FOLLOW_if_stmt_in_ite_stmt1892);
            if_stmt161=if_stmt();

            state._fsp--;

            stream_if_stmt.add(if_stmt161.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:23: ( options {greedy=true; } : else_if_stmt )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ELIF) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:49: else_if_stmt
            	    {
            	    pushFollow(FOLLOW_else_if_stmt_in_ite_stmt1904);
            	    else_if_stmt162=else_if_stmt();

            	    state._fsp--;

            	    stream_else_if_stmt.add(else_if_stmt162.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:65: ( options {greedy=true; } : else_stmt )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:91: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_ite_stmt1919);
                    else_stmt163=else_stmt();

                    state._fsp--;

                    stream_else_stmt.add(else_stmt163.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: else_if_stmt, else_stmt, if_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 198:103: -> ^( ITE if_stmt ( else_if_stmt )* ( else_stmt )? )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:106: ^( ITE if_stmt ( else_if_stmt )* ( else_stmt )? )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(ITE, "ITE")
                , root_1);

                adaptor.addChild(root_1, stream_if_stmt.nextTree());

                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:120: ( else_if_stmt )*
                while ( stream_else_if_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_if_stmt.nextTree());

                }
                stream_else_if_stmt.reset();

                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:198:134: ( else_stmt )?
                if ( stream_else_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_stmt.nextTree());

                }
                stream_else_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class if_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:201:1: if_stmt : IF ^ cond inst_stmt ;
    public final SvgParser.if_stmt_return if_stmt() throws RecognitionException {
        SvgParser.if_stmt_return retval = new SvgParser.if_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token IF164=null;
        SvgParser.cond_return cond165 =null;

        SvgParser.inst_stmt_return inst_stmt166 =null;


        SvgTree IF164_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:201:13: ( IF ^ cond inst_stmt )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:201:15: IF ^ cond inst_stmt
            {
            root_0 = (SvgTree)adaptor.nil();


            IF164=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1960); 
            IF164_tree = 
            (SvgTree)adaptor.create(IF164)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(IF164_tree, root_0);


            pushFollow(FOLLOW_cond_in_if_stmt1963);
            cond165=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond165.getTree());

            pushFollow(FOLLOW_inst_stmt_in_if_stmt1965);
            inst_stmt166=inst_stmt();

            state._fsp--;

            adaptor.addChild(root_0, inst_stmt166.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class else_if_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_if_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:204:1: else_if_stmt : ELIF ^ cond inst_stmt ;
    public final SvgParser.else_if_stmt_return else_if_stmt() throws RecognitionException {
        SvgParser.else_if_stmt_return retval = new SvgParser.else_if_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token ELIF167=null;
        SvgParser.cond_return cond168 =null;

        SvgParser.inst_stmt_return inst_stmt169 =null;


        SvgTree ELIF167_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:204:13: ( ELIF ^ cond inst_stmt )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:204:16: ELIF ^ cond inst_stmt
            {
            root_0 = (SvgTree)adaptor.nil();


            ELIF167=(Token)match(input,ELIF,FOLLOW_ELIF_in_else_if_stmt1986); 
            ELIF167_tree = 
            (SvgTree)adaptor.create(ELIF167)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(ELIF167_tree, root_0);


            pushFollow(FOLLOW_cond_in_else_if_stmt1989);
            cond168=cond();

            state._fsp--;

            adaptor.addChild(root_0, cond168.getTree());

            pushFollow(FOLLOW_inst_stmt_in_else_if_stmt1991);
            inst_stmt169=inst_stmt();

            state._fsp--;

            adaptor.addChild(root_0, inst_stmt169.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_if_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:207:1: else_stmt : ELSE ^ inst_stmt ;
    public final SvgParser.else_stmt_return else_stmt() throws RecognitionException {
        SvgParser.else_stmt_return retval = new SvgParser.else_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token ELSE170=null;
        SvgParser.inst_stmt_return inst_stmt171 =null;


        SvgTree ELSE170_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:207:13: ( ELSE ^ inst_stmt )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:207:15: ELSE ^ inst_stmt
            {
            root_0 = (SvgTree)adaptor.nil();


            ELSE170=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2014); 
            ELSE170_tree = 
            (SvgTree)adaptor.create(ELSE170)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(ELSE170_tree, root_0);


            pushFollow(FOLLOW_inst_stmt_in_else_stmt2017);
            inst_stmt171=inst_stmt();

            state._fsp--;

            adaptor.addChild(root_0, inst_stmt171.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:211:1: for_stmt : FOR ^ LPAREN ! assign ';' ! expr ';' ! assign RPAREN ! inst_stmt ;
    public final SvgParser.for_stmt_return for_stmt() throws RecognitionException {
        SvgParser.for_stmt_return retval = new SvgParser.for_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token FOR172=null;
        Token LPAREN173=null;
        Token char_literal175=null;
        Token char_literal177=null;
        Token RPAREN179=null;
        SvgParser.assign_return assign174 =null;

        SvgParser.expr_return expr176 =null;

        SvgParser.assign_return assign178 =null;

        SvgParser.inst_stmt_return inst_stmt180 =null;


        SvgTree FOR172_tree=null;
        SvgTree LPAREN173_tree=null;
        SvgTree char_literal175_tree=null;
        SvgTree char_literal177_tree=null;
        SvgTree RPAREN179_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:211:13: ( FOR ^ LPAREN ! assign ';' ! expr ';' ! assign RPAREN ! inst_stmt )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:211:17: FOR ^ LPAREN ! assign ';' ! expr ';' ! assign RPAREN ! inst_stmt
            {
            root_0 = (SvgTree)adaptor.nil();


            FOR172=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2044); 
            FOR172_tree = 
            (SvgTree)adaptor.create(FOR172)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(FOR172_tree, root_0);


            LPAREN173=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_stmt2047); 

            pushFollow(FOLLOW_assign_in_for_stmt2050);
            assign174=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign174.getTree());

            char_literal175=(Token)match(input,73,FOLLOW_73_in_for_stmt2052); 

            pushFollow(FOLLOW_expr_in_for_stmt2055);
            expr176=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr176.getTree());

            char_literal177=(Token)match(input,73,FOLLOW_73_in_for_stmt2057); 

            pushFollow(FOLLOW_assign_in_for_stmt2060);
            assign178=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign178.getTree());

            RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_stmt2062); 

            pushFollow(FOLLOW_inst_stmt_in_for_stmt2065);
            inst_stmt180=inst_stmt();

            state._fsp--;

            adaptor.addChild(root_0, inst_stmt180.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class cond_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:214:1: cond : LPAREN ! expr RPAREN !;
    public final SvgParser.cond_return cond() throws RecognitionException {
        SvgParser.cond_return retval = new SvgParser.cond_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token LPAREN181=null;
        Token RPAREN183=null;
        SvgParser.expr_return expr182 =null;


        SvgTree LPAREN181_tree=null;
        SvgTree RPAREN183_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:214:9: ( LPAREN ! expr RPAREN !)
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:214:11: LPAREN ! expr RPAREN !
            {
            root_0 = (SvgTree)adaptor.nil();


            LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond2090); 

            pushFollow(FOLLOW_expr_in_cond2093);
            expr182=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr182.getTree());

            RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond2095); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond"


    public static class inst_stmt_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst_stmt"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:1: inst_stmt : ( '{' ! block_instructions '}' !| instruction ) ;
    public final SvgParser.inst_stmt_return inst_stmt() throws RecognitionException {
        SvgParser.inst_stmt_return retval = new SvgParser.inst_stmt_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal184=null;
        Token char_literal186=null;
        SvgParser.block_instructions_return block_instructions185 =null;

        SvgParser.instruction_return instruction187 =null;


        SvgTree char_literal184_tree=null;
        SvgTree char_literal186_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:13: ( ( '{' ! block_instructions '}' !| instruction ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:17: ( '{' ! block_instructions '}' !| instruction )
            {
            root_0 = (SvgTree)adaptor.nil();


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:17: ( '{' ! block_instructions '}' !| instruction )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==98) ) {
                alt19=1;
            }
            else if ( ((LA19_0 >= CREATE && LA19_0 <= DESTROY)||LA19_0==FOR||(LA19_0 >= ID && LA19_0 <= IF)||(LA19_0 >= MODIFY && LA19_0 <= MOVE)||LA19_0==READ||LA19_0==RETURN||LA19_0==ROTATE||(LA19_0 >= SCALE && LA19_0 <= SOURCE)||LA19_0==WRITE) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:18: '{' ! block_instructions '}' !
                    {
                    char_literal184=(Token)match(input,98,FOLLOW_98_in_inst_stmt2118); 

                    pushFollow(FOLLOW_block_instructions_in_inst_stmt2121);
                    block_instructions185=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions185.getTree());

                    char_literal186=(Token)match(input,99,FOLLOW_99_in_inst_stmt2123); 

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:217:49: instruction
                    {
                    pushFollow(FOLLOW_instruction_in_inst_stmt2128);
                    instruction187=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction187.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inst_stmt"


    public static class read_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:221:1: read : READ ^ ID ;
    public final SvgParser.read_return read() throws RecognitionException {
        SvgParser.read_return retval = new SvgParser.read_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token READ188=null;
        Token ID189=null;

        SvgTree READ188_tree=null;
        SvgTree ID189_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:221:9: ( READ ^ ID )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:221:13: READ ^ ID
            {
            root_0 = (SvgTree)adaptor.nil();


            READ188=(Token)match(input,READ,FOLLOW_READ_in_read2156); 
            READ188_tree = 
            (SvgTree)adaptor.create(READ188)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(READ188_tree, root_0);


            ID189=(Token)match(input,ID,FOLLOW_ID_in_read2159); 
            ID189_tree = 
            (SvgTree)adaptor.create(ID189)
            ;
            adaptor.addChild(root_0, ID189_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:1: write : WRITE ^ ( expr | STRING ) ;
    public final SvgParser.write_return write() throws RecognitionException {
        SvgParser.write_return retval = new SvgParser.write_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token WRITE190=null;
        Token STRING192=null;
        SvgParser.expr_return expr191 =null;


        SvgTree WRITE190_tree=null;
        SvgTree STRING192_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:9: ( WRITE ^ ( expr | STRING ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (SvgTree)adaptor.nil();


            WRITE190=(Token)match(input,WRITE,FOLLOW_WRITE_in_write2181); 
            WRITE190_tree = 
            (SvgTree)adaptor.create(WRITE190)
            ;
            root_0 = (SvgTree)adaptor.becomeRoot(WRITE190_tree, root_0);


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:20: ( expr | STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= FALSE && LA20_0 <= FLOAT)||LA20_0==ID||LA20_0==INT||LA20_0==LPAREN||LA20_0==MINUS||LA20_0==NOT||LA20_0==PLUS||LA20_0==TRUE) ) {
                alt20=1;
            }
            else if ( (LA20_0==STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write2185);
                    expr191=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr191.getTree());

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:225:28: STRING
                    {
                    STRING192=(Token)match(input,STRING,FOLLOW_STRING_in_write2189); 
                    STRING192_tree = 
                    (SvgTree)adaptor.create(STRING192)
                    ;
                    adaptor.addChild(root_0, STRING192_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:229:1: expr : boolterm ( OR ^ boolterm )* ;
    public final SvgParser.expr_return expr() throws RecognitionException {
        SvgParser.expr_return retval = new SvgParser.expr_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token OR194=null;
        SvgParser.boolterm_return boolterm193 =null;

        SvgParser.boolterm_return boolterm195 =null;


        SvgTree OR194_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:229:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:229:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2214);
            boolterm193=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm193.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:229:22: ( OR ^ boolterm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:229:23: OR ^ boolterm
            	    {
            	    OR194=(Token)match(input,OR,FOLLOW_OR_in_expr2217); 
            	    OR194_tree = 
            	    (SvgTree)adaptor.create(OR194)
            	    ;
            	    root_0 = (SvgTree)adaptor.becomeRoot(OR194_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2220);
            	    boolterm195=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm195.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:232:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final SvgParser.boolterm_return boolterm() throws RecognitionException {
        SvgParser.boolterm_return retval = new SvgParser.boolterm_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token AND197=null;
        SvgParser.boolfact_return boolfact196 =null;

        SvgParser.boolfact_return boolfact198 =null;


        SvgTree AND197_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:232:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:232:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2240);
            boolfact196=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact196.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:232:22: ( AND ^ boolfact )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:232:23: AND ^ boolfact
            	    {
            	    AND197=(Token)match(input,AND,FOLLOW_AND_in_boolterm2243); 
            	    AND197_tree = 
            	    (SvgTree)adaptor.create(AND197)
            	    ;
            	    root_0 = (SvgTree)adaptor.becomeRoot(AND197_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2246);
            	    boolfact198=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact198.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:1: boolfact : num_expr ( ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final SvgParser.boolfact_return boolfact() throws RecognitionException {
        SvgParser.boolfact_return retval = new SvgParser.boolfact_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token COMP_EQUAL200=null;
        Token NOT_EQUAL201=null;
        Token LT202=null;
        Token LE203=null;
        Token GT204=null;
        Token GE205=null;
        SvgParser.num_expr_return num_expr199 =null;

        SvgParser.num_expr_return num_expr206 =null;


        SvgTree COMP_EQUAL200_tree=null;
        SvgTree NOT_EQUAL201_tree=null;
        SvgTree LT202_tree=null;
        SvgTree LE203_tree=null;
        SvgTree GT204_tree=null;
        SvgTree GE205_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:9: ( num_expr ( ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:13: num_expr ( ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2266);
            num_expr199=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr199.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:22: ( ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COMP_EQUAL||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NOT_EQUAL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:23: ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:23: ( COMP_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt23=6;
                    switch ( input.LA(1) ) {
                    case COMP_EQUAL:
                        {
                        alt23=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt23=2;
                        }
                        break;
                    case LT:
                        {
                        alt23=3;
                        }
                        break;
                    case LE:
                        {
                        alt23=4;
                        }
                        break;
                    case GT:
                        {
                        alt23=5;
                        }
                        break;
                    case GE:
                        {
                        alt23=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:24: COMP_EQUAL ^
                            {
                            COMP_EQUAL200=(Token)match(input,COMP_EQUAL,FOLLOW_COMP_EQUAL_in_boolfact2270); 
                            COMP_EQUAL200_tree = 
                            (SvgTree)adaptor.create(COMP_EQUAL200)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(COMP_EQUAL200_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:38: NOT_EQUAL ^
                            {
                            NOT_EQUAL201=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2275); 
                            NOT_EQUAL201_tree = 
                            (SvgTree)adaptor.create(NOT_EQUAL201)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(NOT_EQUAL201_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:51: LT ^
                            {
                            LT202=(Token)match(input,LT,FOLLOW_LT_in_boolfact2280); 
                            LT202_tree = 
                            (SvgTree)adaptor.create(LT202)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(LT202_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:57: LE ^
                            {
                            LE203=(Token)match(input,LE,FOLLOW_LE_in_boolfact2285); 
                            LE203_tree = 
                            (SvgTree)adaptor.create(LE203)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(LE203_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:63: GT ^
                            {
                            GT204=(Token)match(input,GT,FOLLOW_GT_in_boolfact2290); 
                            GT204_tree = 
                            (SvgTree)adaptor.create(GT204)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(GT204_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:235:69: GE ^
                            {
                            GE205=(Token)match(input,GE,FOLLOW_GE_in_boolfact2295); 
                            GE205_tree = 
                            (SvgTree)adaptor.create(GE205)
                            ;
                            root_0 = (SvgTree)adaptor.becomeRoot(GE205_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2299);
                    num_expr206=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr206.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final SvgParser.num_expr_return num_expr() throws RecognitionException {
        SvgParser.num_expr_return retval = new SvgParser.num_expr_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token PLUS208=null;
        Token MINUS209=null;
        SvgParser.term_return term207 =null;

        SvgParser.term_return term210 =null;


        SvgTree PLUS208_tree=null;
        SvgTree MINUS209_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2319);
            term207=term();

            state._fsp--;

            adaptor.addChild(root_0, term207.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:18: ( ( PLUS ^| MINUS ^) term )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==MINUS||LA26_0==PLUS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:20: ( PLUS ^| MINUS ^)
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==PLUS) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==MINUS) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:21: PLUS ^
            	            {
            	            PLUS208=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2324); 
            	            PLUS208_tree = 
            	            (SvgTree)adaptor.create(PLUS208)
            	            ;
            	            root_0 = (SvgTree)adaptor.becomeRoot(PLUS208_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:238:29: MINUS ^
            	            {
            	            MINUS209=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2329); 
            	            MINUS209_tree = 
            	            (SvgTree)adaptor.create(MINUS209)
            	            ;
            	            root_0 = (SvgTree)adaptor.becomeRoot(MINUS209_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2333);
            	    term210=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term210.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final SvgParser.term_return term() throws RecognitionException {
        SvgParser.term_return retval = new SvgParser.term_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token MUL212=null;
        Token DIV213=null;
        Token MOD214=null;
        SvgParser.factor_return factor211 =null;

        SvgParser.factor_return factor215 =null;


        SvgTree MUL212_tree=null;
        SvgTree DIV213_tree=null;
        SvgTree MOD214_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2357);
            factor211=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor211.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DIV||LA28_0==MOD||LA28_0==MUL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:23: MUL ^
            	            {
            	            MUL212=(Token)match(input,MUL,FOLLOW_MUL_in_term2362); 
            	            MUL212_tree = 
            	            (SvgTree)adaptor.create(MUL212)
            	            ;
            	            root_0 = (SvgTree)adaptor.becomeRoot(MUL212_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:30: DIV ^
            	            {
            	            DIV213=(Token)match(input,DIV,FOLLOW_DIV_in_term2367); 
            	            DIV213_tree = 
            	            (SvgTree)adaptor.create(DIV213)
            	            ;
            	            root_0 = (SvgTree)adaptor.becomeRoot(DIV213_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:241:37: MOD ^
            	            {
            	            MOD214=(Token)match(input,MOD,FOLLOW_MOD_in_term2372); 
            	            MOD214_tree = 
            	            (SvgTree)adaptor.create(MOD214)
            	            ;
            	            root_0 = (SvgTree)adaptor.becomeRoot(MOD214_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2376);
            	    factor215=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor215.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final SvgParser.factor_return factor() throws RecognitionException {
        SvgParser.factor_return retval = new SvgParser.factor_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token NOT216=null;
        Token PLUS217=null;
        Token MINUS218=null;
        SvgParser.atom_return atom219 =null;


        SvgTree NOT216_tree=null;
        SvgTree PLUS217_tree=null;
        SvgTree MINUS218_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (SvgTree)adaptor.nil();


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt29=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt29=1;
                    }
                    break;
                case PLUS:
                    {
                    alt29=2;
                    }
                    break;
                case MINUS:
                    {
                    alt29=3;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:14: NOT ^
                    {
                    NOT216=(Token)match(input,NOT,FOLLOW_NOT_in_factor2399); 
                    NOT216_tree = 
                    (SvgTree)adaptor.create(NOT216)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(NOT216_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:21: PLUS ^
                    {
                    PLUS217=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2404); 
                    PLUS217_tree = 
                    (SvgTree)adaptor.create(PLUS217)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(PLUS217_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:244:29: MINUS ^
                    {
                    MINUS218=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2409); 
                    MINUS218_tree = 
                    (SvgTree)adaptor.create(MINUS218)
                    ;
                    root_0 = (SvgTree)adaptor.becomeRoot(MINUS218_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2414);
            atom219=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom219.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:247:1: atom : ( ID | array | INT | FLOAT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final SvgParser.atom_return atom() throws RecognitionException {
        SvgParser.atom_return retval = new SvgParser.atom_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token b=null;
        Token ID220=null;
        Token INT222=null;
        Token FLOAT223=null;
        Token char_literal225=null;
        Token char_literal227=null;
        SvgParser.array_return array221 =null;

        SvgParser.funcall_return funcall224 =null;

        SvgParser.expr_return expr226 =null;


        SvgTree b_tree=null;
        SvgTree ID220_tree=null;
        SvgTree INT222_tree=null;
        SvgTree FLOAT223_tree=null;
        SvgTree char_literal225_tree=null;
        SvgTree char_literal227_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:247:9: ( ID | array | INT | FLOAT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt31=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 74:
                    {
                    alt31=2;
                    }
                    break;
                case LPAREN:
                    {
                    alt31=6;
                    }
                    break;
                case AND:
                case COMP_EQUAL:
                case DIV:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case RPAREN:
                case 71:
                case 73:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt31=3;
                }
                break;
            case FLOAT:
                {
                alt31=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt31=5;
                }
                break;
            case LPAREN:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:247:13: ID
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    ID220=(Token)match(input,ID,FOLLOW_ID_in_atom2436); 
                    ID220_tree = 
                    (SvgTree)adaptor.create(ID220)
                    ;
                    adaptor.addChild(root_0, ID220_tree);


                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:248:13: array
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_atom2450);
                    array221=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array221.getTree());

                    }
                    break;
                case 3 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:249:13: INT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    INT222=(Token)match(input,INT,FOLLOW_INT_in_atom2464); 
                    INT222_tree = 
                    (SvgTree)adaptor.create(INT222)
                    ;
                    adaptor.addChild(root_0, INT222_tree);


                    }
                    break;
                case 4 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:250:13: FLOAT
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    FLOAT223=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom2478); 
                    FLOAT223_tree = 
                    (SvgTree)adaptor.create(FLOAT223)
                    ;
                    adaptor.addChild(root_0, FLOAT223_tree);


                    }
                    break;
                case 5 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:251:13: (b= TRUE |b= FALSE )
                    {
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:251:13: (b= TRUE |b= FALSE )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==TRUE) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==FALSE) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }
                    switch (alt30) {
                        case 1 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:251:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2495);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:251:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2501);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SvgTree)adaptor.nil();
                    // 251:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:251:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        SvgTree root_1 = (SvgTree)adaptor.nil();
                        root_1 = (SvgTree)adaptor.becomeRoot(
                        (SvgTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:252:13: funcall
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2524);
                    funcall224=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall224.getTree());

                    }
                    break;
                case 7 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:253:13: '(' ! expr ')' !
                    {
                    root_0 = (SvgTree)adaptor.nil();


                    char_literal225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom2538); 

                    pushFollow(FOLLOW_expr_in_atom2541);
                    expr226=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr226.getTree());

                    char_literal227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom2543); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final SvgParser.funcall_return funcall() throws RecognitionException {
        SvgParser.funcall_return retval = new SvgParser.funcall_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token ID228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        SvgParser.expr_list_return expr_list230 =null;


        SvgTree ID228_tree=null;
        SvgTree char_literal229_tree=null;
        SvgTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:13: ID '(' ( expr_list )? ')'
            {
            ID228=(Token)match(input,ID,FOLLOW_ID_in_funcall2566);  
            stream_ID.add(ID228);


            char_literal229=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcall2568);  
            stream_LPAREN.add(char_literal229);


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:20: ( expr_list )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= FALSE && LA32_0 <= FLOAT)||LA32_0==ID||LA32_0==INT||LA32_0==LPAREN||LA32_0==MINUS||LA32_0==NOT||LA32_0==PLUS||LA32_0==TRUE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2570);
                    expr_list230=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list230.getTree());

                    }
                    break;

            }


            char_literal231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcall2573);  
            stream_RPAREN.add(char_literal231);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SvgTree)adaptor.nil();
            // 259:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                SvgTree root_1 = (SvgTree)adaptor.nil();
                root_1 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:51: ^( ARGLIST ( expr_list )? )
                {
                SvgTree root_2 = (SvgTree)adaptor.nil();
                root_2 = (SvgTree)adaptor.becomeRoot(
                (SvgTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:259:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        SvgTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:263:1: expr_list : expr ( ',' ! expr )* ;
    public final SvgParser.expr_list_return expr_list() throws RecognitionException {
        SvgParser.expr_list_return retval = new SvgParser.expr_list_return();
        retval.start = input.LT(1);


        SvgTree root_0 = null;

        Token char_literal233=null;
        SvgParser.expr_return expr232 =null;

        SvgParser.expr_return expr234 =null;


        SvgTree char_literal233_tree=null;

        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:263:10: ( expr ( ',' ! expr )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:263:13: expr ( ',' ! expr )*
            {
            root_0 = (SvgTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2606);
            expr232=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr232.getTree());

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:263:18: ( ',' ! expr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==71) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:263:19: ',' ! expr
            	    {
            	    char_literal233=(Token)match(input,71,FOLLOW_71_in_expr_list2609); 

            	    pushFollow(FOLLOW_expr_in_expr_list2612);
            	    expr234=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr234.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (SvgTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SvgTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog208 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EOF_in_prog211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func253 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func256 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_params_in_func258 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_func260 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_func263 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_func265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_params285 = new BitSet(new long[]{0x1000000040000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_paramlist_in_params287 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_params290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_paramlist319 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_param_in_paramlist322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_70_in_param347 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_param351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions411 = new BitSet(new long[]{0x6A803000C2006002L,0x0000000000000010L});
    public static final BitSet FOLLOW_assign_in_instruction452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_instruction518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_instruction540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_instruction561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_instruction583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scale_in_instruction607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_instruction630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_in_instruction652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_instruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assign766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUAL_in_assign770 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assign772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt803 = new BitSet(new long[]{0x0008850141800002L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_return_stmt806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_array852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_array854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_array856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create889 = new BitSet(new long[]{0x0110000800020200L,0x0000000000000001L});
    public static final BitSet FOLLOW_objecte_create_in_create892 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_attributes_in_create913 = new BitSet(new long[]{0x0000000101000002L});
    public static final BitSet FOLLOW_TEXT_in_objecte_create946 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create953 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create961 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create963 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_STRING_in_objecte_create965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_objecte_create983 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create988 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create996 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create998 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECTANGLE_in_objecte_create1018 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create1020 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1028 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1030 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1032 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1034 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_INT_in_objecte_create1037 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_objecte_create1059 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create1063 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1071 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1073 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1075 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_objecte_create1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_objecte_create1095 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create1102 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_list_min_2_coord_in_objecte_create1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POLYGON_in_objecte_create1128 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_objecte_create1132 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_list_min_2_coord_in_objecte_create1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coord_in_list_min_2_coord1163 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_coord_in_list_min_2_coord1165 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_coord_in_list_min_2_coord1167 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_INT_in_coord1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_coord1205 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_coord1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1238 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_destroy1242 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_destroy1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify1274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_modify1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_attributes_in_modify1290 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_modify1301 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_modify1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_attributes1329 = new BitSet(new long[]{0x0000000800000000L,0x00000000461E0000L});
    public static final BitSet FOLLOW_attribute_in_attributes1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000080L});
    public static final BitSet FOLLOW_71_in_attributes1334 = new BitSet(new long[]{0x0000000800000000L,0x00000000461E0000L});
    public static final BitSet FOLLOW_attribute_in_attributes1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000080L});
    public static final BitSet FOLLOW_99_in_attributes1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_attribute1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_attribute1385 = new BitSet(new long[]{0x0000010000000000L,0x0000000280202000L});
    public static final BitSet FOLLOW_color_in_attribute1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_attribute1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_attribute1409 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FLOAT_in_attribute1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_attribute1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_attribute1441 = new BitSet(new long[]{0x0000010000000000L,0x0000000280202000L});
    public static final BitSet FOLLOW_color_in_attribute1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_attribute1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_attribute1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000008011000L});
    public static final BitSet FOLLOW_set_in_attribute1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_attribute1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_attribute1497 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_attribute1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_attributes_in_attribute1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_text_attributes1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_text_attributes1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000030800000L});
    public static final BitSet FOLLOW_set_in_text_attributes1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_text_attributes1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_text_attributes1575 = new BitSet(new long[]{0x0000000100000000L,0x000000001100C000L});
    public static final BitSet FOLLOW_set_in_text_attributes1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_text_attributes1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_text_attributes1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000100400000L});
    public static final BitSet FOLLOW_set_in_text_attributes1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_color1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_color1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_color1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_color1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rgb_in_color1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_rgb1677 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_rgb1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rgb1681 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_rgb1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rgb1685 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_rgb1687 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_rgb1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1719 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_move1722 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_coord_in_move1730 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_move1735 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_move1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_scale1762 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_scale1766 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_scale1773 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_scale1783 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_scale1789 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_scale1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate1816 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_rotate1822 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_rotate1829 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_rotate1835 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_rotate1841 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_set_in_rotate1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_source1869 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_STRING_in_source1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_ite_stmt1892 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_else_if_stmt_in_ite_stmt1904 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt1960 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_cond_in_if_stmt1963 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000400000010L});
    public static final BitSet FOLLOW_inst_stmt_in_if_stmt1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_else_if_stmt1986 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_cond_in_else_if_stmt1989 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000400000010L});
    public static final BitSet FOLLOW_inst_stmt_in_else_if_stmt1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2014 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000400000010L});
    public static final BitSet FOLLOW_inst_stmt_in_else_stmt2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2044 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_for_stmt2047 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_for_stmt2052 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_for_stmt2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_for_stmt2057 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt2060 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_for_stmt2062 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000400000010L});
    public static final BitSet FOLLOW_inst_stmt_in_for_stmt2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_cond2090 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_cond2093 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_inst_stmt2118 = new BitSet(new long[]{0x6A803000C2006000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_inst_stmt2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_inst_stmt2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_inst_stmt2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read2156 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_read2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write2181 = new BitSet(new long[]{0x8008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_write2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2214 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2217 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolterm_in_expr2220 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2240 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2243 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2246 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2266 = new BitSet(new long[]{0x0001020430000802L});
    public static final BitSet FOLLOW_COMP_EQUAL_in_boolfact2270 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2275 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LT_in_boolfact2280 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LE_in_boolfact2285 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_GT_in_boolfact2290 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_GE_in_boolfact2295 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2319 = new BitSet(new long[]{0x0008040000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2324 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2329 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_num_expr2333 = new BitSet(new long[]{0x0008040000000002L});
    public static final BitSet FOLLOW_factor_in_term2357 = new BitSet(new long[]{0x0000480000008002L});
    public static final BitSet FOLLOW_MUL_in_term2362 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DIV_in_term2367 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOD_in_term2372 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_term2376 = new BitSet(new long[]{0x0000480000008002L});
    public static final BitSet FOLLOW_NOT_in_factor2399 = new BitSet(new long[]{0x0000010141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_factor2404 = new BitSet(new long[]{0x0000010141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_factor2409 = new BitSet(new long[]{0x0000010141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_factor2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_atom2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom2538 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_atom2541 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2566 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcall2568 = new BitSet(new long[]{0x1008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_funcall2570 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcall2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_expr_list2609 = new BitSet(new long[]{0x0008850141800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_list2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});

}