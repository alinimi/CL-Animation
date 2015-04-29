// $ANTLR 3.4 /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g 2015-04-29 22:01:51

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SvgLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__69=69;
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
    public static final int WRITE=67;
    public static final int WS=68;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SvgLexer() {} 
    public SvgLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SvgLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g"; }

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:6:7: ( '&' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:7:7: ( ',' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:8:7: ( ':' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:9:7: ( ';' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:10:7: ( '[' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:10:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:11:7: ( ']' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:11:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:12:7: ( 'alternate' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:12:9: 'alternate'
            {
            match("alternate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:13:7: ( 'blue' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:13:9: 'blue'
            {
            match("blue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:14:7: ( 'bold' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:14:9: 'bold'
            {
            match("bold"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:15:7: ( 'bolder' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:15:9: 'bolder'
            {
            match("bolder"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:16:7: ( 'dots' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:16:9: 'dots'
            {
            match("dots"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:17:7: ( 'fill' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:17:9: 'fill'
            {
            match("fill"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:18:7: ( 'fill-opacity' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:18:9: 'fill-opacity'
            {
            match("fill-opacity"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:19:7: ( 'font-style' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:19:9: 'font-style'
            {
            match("font-style"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:20:7: ( 'font-weight' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:20:9: 'font-weight'
            {
            match("font-weight"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:21:7: ( 'green' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:21:9: 'green'
            {
            match("green"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:22:7: ( 'horizontal' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:22:9: 'horizontal'
            {
            match("horizontal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:23:7: ( 'italic' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:23:9: 'italic'
            {
            match("italic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:24:7: ( 'lighter' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:24:9: 'lighter'
            {
            match("lighter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:25:7: ( 'line-pattern' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:25:9: 'line-pattern'
            {
            match("line-pattern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:26:7: ( 'line-width' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:26:9: 'line-width'
            {
            match("line-width"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:27:7: ( 'lines' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:27:9: 'lines'
            {
            match("lines"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:28:7: ( 'normal' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:28:9: 'normal'
            {
            match("normal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:29:7: ( 'oblique' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:29:9: 'oblique'
            {
            match("oblique"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:30:7: ( 'orientation' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:30:9: 'orientation'
            {
            match("orientation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:31:7: ( 'red' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:31:9: 'red'
            {
            match("red"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:32:7: ( 'vertical' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:32:9: 'vertical'
            {
            match("vertical"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:33:7: ( 'yellow' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:33:9: 'yellow'
            {
            match("yellow"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:34:7: ( '{' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:34:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:35:7: ( '}' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:267:9: ( '=' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:267:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "COMP_EQUAL"
    public final void mCOMP_EQUAL() throws RecognitionException {
        try {
            int _type = COMP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:268:12: ( '==' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:268:14: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMP_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:269:10: ( '!=' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:269:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:270:9: ( '<' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:270:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:271:9: ( '<=' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:271:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:272:9: ( '>' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:272:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:273:9: ( '>=' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:273:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:274:9: ( '+' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:274:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:275:9: ( '-' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:275:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:276:9: ( 'true' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:276:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:277:9: ( 'false' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:277:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:278:9: ( '*' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:278:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:279:9: ( '/' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:279:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:280:9: ( '%' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:280:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:281:9: ( '(' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:281:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:282:9: ( ')' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:282:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:283:9: ( 'for' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:283:11: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:284:9: ( 'not' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:284:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:285:9: ( 'and' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:285:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:286:9: ( 'or' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:286:11: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:287:9: ( 'if' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:287:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:288:9: ( 'then' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:288:11: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:289:9: ( 'else' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:289:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:290:9: ( 'Create' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:290:11: 'Create'
            {
            match("Create"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DESTROY"
    public final void mDESTROY() throws RecognitionException {
        try {
            int _type = DESTROY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:291:9: ( 'Destroy' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:291:12: 'Destroy'
            {
            match("Destroy"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESTROY"

    // $ANTLR start "MODIFY"
    public final void mMODIFY() throws RecognitionException {
        try {
            int _type = MODIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:292:9: ( 'Modify' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:292:11: 'Modify'
            {
            match("Modify"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODIFY"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:293:9: ( 'Move' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:293:11: 'Move'
            {
            match("Move"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:294:9: ( 'Scale' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:294:11: 'Scale'
            {
            match("Scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:295:9: ( 'Rotate' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:295:11: 'Rotate'
            {
            match("Rotate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:296:9: ( 'Source' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:296:11: 'Source'
            {
            match("Source"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:297:9: ( 'text' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:297:11: 'text'
            {
            match("text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "CIRCLE"
    public final void mCIRCLE() throws RecognitionException {
        try {
            int _type = CIRCLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:298:9: ( 'circle' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:298:11: 'circle'
            {
            match("circle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCLE"

    // $ANTLR start "RECTANGLE"
    public final void mRECTANGLE() throws RecognitionException {
        try {
            int _type = RECTANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:299:11: ( 'rectangle' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:299:13: 'rectangle'
            {
            match("rectangle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECTANGLE"

    // $ANTLR start "ELLIPSE"
    public final void mELLIPSE() throws RecognitionException {
        try {
            int _type = ELLIPSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:300:9: ( 'ellipse' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:300:11: 'ellipse'
            {
            match("ellipse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELLIPSE"

    // $ANTLR start "LINE"
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:301:9: ( 'line' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:301:11: 'line'
            {
            match("line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE"

    // $ANTLR start "POLYGON"
    public final void mPOLYGON() throws RecognitionException {
        try {
            int _type = POLYGON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:302:9: ( 'polygon' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:302:11: 'polygon'
            {
            match("polygon"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POLYGON"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:303:9: ( 'elif' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:303:11: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:304:9: ( 'endif' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:304:11: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:305:9: ( 'func' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:305:11: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:306:9: ( 'endfunc' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:306:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:307:9: ( 'return' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:307:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:308:9: ( 'read' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:308:11: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:309:9: ( 'write' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:309:11: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:310:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:310:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:310:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:311:9: ( ( '0' .. '9' )+ )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:311:13: ( '0' .. '9' )+
            {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:311:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:312:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:312:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:312:11: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:312:25: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:315:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
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
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:315:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:315:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:315:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:315:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:316:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:316:16: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:316:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:320:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:320:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:320:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:320:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:320:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:326:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:326:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:329:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:329:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:8: ( T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | EQUAL | COMP_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | TRUE | FALSE | MUL | DIV | MOD | LPAREN | RPAREN | FOR | NOT | AND | OR | IF | THEN | ELSE | CREATE | DESTROY | MODIFY | MOVE | SCALE | ROTATE | SOURCE | TEXT | CIRCLE | RECTANGLE | ELLIPSE | LINE | POLYGON | ELIF | ENDIF | FUNC | ENDFUNC | RETURN | READ | WRITE | ID | INT | FLOAT | COMMENT | STRING | WS )
        int alt10=79;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:10: T__69
                {
                mT__69(); 


                }
                break;
            case 2 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:16: T__70
                {
                mT__70(); 


                }
                break;
            case 3 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:22: T__71
                {
                mT__71(); 


                }
                break;
            case 4 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:28: T__72
                {
                mT__72(); 


                }
                break;
            case 5 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:34: T__73
                {
                mT__73(); 


                }
                break;
            case 6 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:40: T__74
                {
                mT__74(); 


                }
                break;
            case 7 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:46: T__75
                {
                mT__75(); 


                }
                break;
            case 8 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:52: T__76
                {
                mT__76(); 


                }
                break;
            case 9 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:58: T__77
                {
                mT__77(); 


                }
                break;
            case 10 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:64: T__78
                {
                mT__78(); 


                }
                break;
            case 11 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:70: T__79
                {
                mT__79(); 


                }
                break;
            case 12 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:76: T__80
                {
                mT__80(); 


                }
                break;
            case 13 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:82: T__81
                {
                mT__81(); 


                }
                break;
            case 14 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:88: T__82
                {
                mT__82(); 


                }
                break;
            case 15 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:94: T__83
                {
                mT__83(); 


                }
                break;
            case 16 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:100: T__84
                {
                mT__84(); 


                }
                break;
            case 17 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:106: T__85
                {
                mT__85(); 


                }
                break;
            case 18 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:112: T__86
                {
                mT__86(); 


                }
                break;
            case 19 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:118: T__87
                {
                mT__87(); 


                }
                break;
            case 20 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:124: T__88
                {
                mT__88(); 


                }
                break;
            case 21 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:130: T__89
                {
                mT__89(); 


                }
                break;
            case 22 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:136: T__90
                {
                mT__90(); 


                }
                break;
            case 23 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:142: T__91
                {
                mT__91(); 


                }
                break;
            case 24 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:148: T__92
                {
                mT__92(); 


                }
                break;
            case 25 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:154: T__93
                {
                mT__93(); 


                }
                break;
            case 26 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:160: T__94
                {
                mT__94(); 


                }
                break;
            case 27 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:166: T__95
                {
                mT__95(); 


                }
                break;
            case 28 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:172: T__96
                {
                mT__96(); 


                }
                break;
            case 29 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:178: T__97
                {
                mT__97(); 


                }
                break;
            case 30 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:184: T__98
                {
                mT__98(); 


                }
                break;
            case 31 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:190: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 32 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:196: COMP_EQUAL
                {
                mCOMP_EQUAL(); 


                }
                break;
            case 33 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:207: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 34 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:217: LT
                {
                mLT(); 


                }
                break;
            case 35 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:220: LE
                {
                mLE(); 


                }
                break;
            case 36 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:223: GT
                {
                mGT(); 


                }
                break;
            case 37 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:226: GE
                {
                mGE(); 


                }
                break;
            case 38 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:229: PLUS
                {
                mPLUS(); 


                }
                break;
            case 39 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:234: MINUS
                {
                mMINUS(); 


                }
                break;
            case 40 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:240: TRUE
                {
                mTRUE(); 


                }
                break;
            case 41 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:245: FALSE
                {
                mFALSE(); 


                }
                break;
            case 42 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:251: MUL
                {
                mMUL(); 


                }
                break;
            case 43 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:255: DIV
                {
                mDIV(); 


                }
                break;
            case 44 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:259: MOD
                {
                mMOD(); 


                }
                break;
            case 45 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:263: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 46 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:270: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 47 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:277: FOR
                {
                mFOR(); 


                }
                break;
            case 48 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:281: NOT
                {
                mNOT(); 


                }
                break;
            case 49 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:285: AND
                {
                mAND(); 


                }
                break;
            case 50 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:289: OR
                {
                mOR(); 


                }
                break;
            case 51 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:292: IF
                {
                mIF(); 


                }
                break;
            case 52 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:295: THEN
                {
                mTHEN(); 


                }
                break;
            case 53 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:300: ELSE
                {
                mELSE(); 


                }
                break;
            case 54 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:305: CREATE
                {
                mCREATE(); 


                }
                break;
            case 55 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:312: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 56 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:320: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 57 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:327: MOVE
                {
                mMOVE(); 


                }
                break;
            case 58 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:332: SCALE
                {
                mSCALE(); 


                }
                break;
            case 59 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:338: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 60 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:345: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 61 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:352: TEXT
                {
                mTEXT(); 


                }
                break;
            case 62 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:357: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 63 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:364: RECTANGLE
                {
                mRECTANGLE(); 


                }
                break;
            case 64 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:374: ELLIPSE
                {
                mELLIPSE(); 


                }
                break;
            case 65 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:382: LINE
                {
                mLINE(); 


                }
                break;
            case 66 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:387: POLYGON
                {
                mPOLYGON(); 


                }
                break;
            case 67 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:395: ELIF
                {
                mELIF(); 


                }
                break;
            case 68 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:400: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 69 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:406: FUNC
                {
                mFUNC(); 


                }
                break;
            case 70 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:411: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 71 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:419: RETURN
                {
                mRETURN(); 


                }
                break;
            case 72 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:426: READ
                {
                mREAD(); 


                }
                break;
            case 73 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:431: WRITE
                {
                mWRITE(); 


                }
                break;
            case 74 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:437: ID
                {
                mID(); 


                }
                break;
            case 75 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:440: INT
                {
                mINT(); 


                }
                break;
            case 76 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:444: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 77 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:450: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 78 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:458: STRING
                {
                mSTRING(); 


                }
                break;
            case 79 :
                // /home/jordivilaseca/FIB/CL/CL-Animation/src/parser/Svg.g:1:465: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff\15\53\2\uffff\1\104\1\uffff\1\106\1\110\2\uffff\1\53\1"+
        "\uffff\1\115\3\uffff\11\53\1\uffff\1\131\2\uffff\14\53\1\150\3\53"+
        "\1\157\3\53\6\uffff\3\53\2\uffff\13\53\2\uffff\1\53\1\u0088\5\53"+
        "\1\u008e\5\53\1\uffff\3\53\1\u0097\2\53\1\uffff\1\u009a\27\53\1"+
        "\uffff\1\u00b3\1\u00b5\1\u00b6\1\u00b8\1\53\1\uffff\1\53\1\u00bb"+
        "\4\53\1\u00c2\1\53\1\uffff\2\53\1\uffff\2\53\1\u00c8\2\53\1\u00cb"+
        "\1\u00cc\1\u00cd\1\u00ce\1\53\1\u00d0\5\53\1\u00d6\7\53\1\uffff"+
        "\1\53\5\uffff\1\u00e1\1\uffff\1\u00e2\3\53\1\uffff\1\u00e8\1\uffff"+
        "\5\53\1\uffff\2\53\4\uffff\1\53\1\uffff\1\u00f1\4\53\1\uffff\1\u00f6"+
        "\4\53\1\u00fb\1\53\1\u00fd\4\uffff\1\53\1\u00ff\1\53\3\uffff\1\u0101"+
        "\3\53\1\u0105\1\53\1\u0107\1\53\1\uffff\1\53\1\u010a\1\53\1\u010c"+
        "\1\uffff\1\u010d\1\u010e\1\u010f\1\53\1\uffff\1\53\1\uffff\1\53"+
        "\1\uffff\1\u0113\1\uffff\1\u0114\2\53\1\uffff\1\53\1\uffff\1\u0118"+
        "\1\u0119\1\uffff\1\u011a\4\uffff\1\u011b\2\53\2\uffff\2\53\1\u0120"+
        "\4\uffff\1\u0121\2\53\1\u0124\2\uffff\1\u0125\1\53\2\uffff\1\u0127"+
        "\1\uffff";
    static final String DFA10_eofS =
        "\u0128\uffff";
    static final String DFA10_minS =
        "\1\11\6\uffff\2\154\1\157\1\141\1\162\1\157\1\146\1\151\1\157\1"+
        "\142\3\145\2\uffff\1\75\1\uffff\2\75\2\uffff\1\145\1\uffff\1\52"+
        "\3\uffff\1\154\1\162\1\145\1\157\1\143\1\157\1\151\1\157\1\162\1"+
        "\uffff\1\56\2\uffff\1\164\1\144\1\165\1\154\1\164\1\154\1\156\1"+
        "\154\1\156\1\145\1\162\1\141\1\60\1\147\1\162\1\154\1\60\1\141\1"+
        "\162\1\154\6\uffff\1\165\1\145\1\170\2\uffff\1\151\1\144\1\145\1"+
        "\163\1\144\1\141\1\165\1\164\1\162\1\154\1\151\2\uffff\1\145\1\60"+
        "\1\145\1\144\1\163\1\154\1\164\1\60\1\163\1\143\1\145\1\151\1\154"+
        "\1\uffff\1\150\1\145\1\155\1\60\1\151\1\145\1\uffff\1\60\1\164\1"+
        "\165\1\144\1\164\1\154\1\145\1\156\1\164\1\145\1\151\2\146\1\141"+
        "\1\164\1\151\1\145\1\154\1\162\1\141\1\143\1\171\1\164\1\162\1\uffff"+
        "\3\60\2\55\1\uffff\1\145\1\60\1\156\1\172\1\151\1\164\1\55\1\141"+
        "\1\uffff\1\161\1\156\1\uffff\1\141\1\162\1\60\1\151\1\157\4\60\1"+
        "\160\1\60\1\146\1\165\1\164\1\162\1\146\1\60\1\145\1\143\1\164\1"+
        "\154\1\147\1\145\1\156\1\uffff\1\162\4\uffff\1\163\1\60\1\uffff"+
        "\1\60\1\157\1\143\1\145\1\160\1\60\1\uffff\1\154\1\165\1\164\2\156"+
        "\1\uffff\1\143\1\167\4\uffff\1\163\1\uffff\1\60\1\156\1\145\1\157"+
        "\1\171\1\uffff\1\60\3\145\1\157\1\60\1\141\1\60\4\uffff\1\156\1"+
        "\60\1\162\3\uffff\1\60\1\145\1\141\1\147\1\60\1\141\1\60\1\145\1"+
        "\uffff\1\143\1\60\1\171\1\60\1\uffff\3\60\1\156\1\uffff\1\164\1"+
        "\uffff\1\164\1\uffff\1\60\1\uffff\1\60\1\164\1\154\1\uffff\1\154"+
        "\1\uffff\2\60\1\uffff\1\60\4\uffff\1\60\1\145\1\141\2\uffff\1\151"+
        "\1\145\1\60\4\uffff\1\60\1\154\1\157\1\60\2\uffff\1\60\1\156\2\uffff"+
        "\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\6\uffff\1\156\2\157\1\165\1\162\1\157\1\164\1\151\1\157\1"+
        "\162\3\145\2\uffff\1\75\1\uffff\2\75\2\uffff\1\162\1\uffff\1\57"+
        "\3\uffff\1\156\1\162\1\145\3\157\1\151\1\157\1\162\1\uffff\1\71"+
        "\2\uffff\1\164\1\144\1\165\1\154\1\164\1\154\1\162\1\154\1\156\1"+
        "\145\1\162\1\141\1\172\1\156\1\164\1\154\1\172\1\164\1\162\1\154"+
        "\6\uffff\1\165\1\145\1\170\2\uffff\1\163\1\144\1\145\1\163\1\166"+
        "\1\141\1\165\1\164\1\162\1\154\1\151\2\uffff\1\145\1\172\1\145\1"+
        "\144\1\163\1\154\1\164\1\172\1\163\1\143\1\145\1\151\1\154\1\uffff"+
        "\1\150\1\145\1\155\1\172\1\151\1\145\1\uffff\1\172\1\164\1\165\1"+
        "\144\1\164\1\154\1\145\1\156\1\164\1\145\1\151\1\146\1\151\1\141"+
        "\1\164\1\151\1\145\1\154\1\162\1\141\1\143\1\171\1\164\1\162\1\uffff"+
        "\4\172\1\55\1\uffff\1\145\1\172\1\156\1\172\1\151\1\164\1\172\1"+
        "\141\1\uffff\1\161\1\156\1\uffff\1\141\1\162\1\172\1\151\1\157\4"+
        "\172\1\160\1\172\1\146\1\165\1\164\1\162\1\146\1\172\1\145\1\143"+
        "\1\164\1\154\1\147\1\145\1\156\1\uffff\1\162\4\uffff\1\167\1\172"+
        "\1\uffff\1\172\1\157\1\143\1\145\1\167\1\172\1\uffff\1\154\1\165"+
        "\1\164\2\156\1\uffff\1\143\1\167\4\uffff\1\163\1\uffff\1\172\1\156"+
        "\1\145\1\157\1\171\1\uffff\1\172\3\145\1\157\1\172\1\141\1\172\4"+
        "\uffff\1\156\1\172\1\162\3\uffff\1\172\1\145\1\141\1\147\1\172\1"+
        "\141\1\172\1\145\1\uffff\1\143\1\172\1\171\1\172\1\uffff\3\172\1"+
        "\156\1\uffff\1\164\1\uffff\1\164\1\uffff\1\172\1\uffff\1\172\1\164"+
        "\1\154\1\uffff\1\154\1\uffff\2\172\1\uffff\1\172\4\uffff\1\172\1"+
        "\145\1\141\2\uffff\1\151\1\145\1\172\4\uffff\1\172\1\154\1\157\1"+
        "\172\2\uffff\1\172\1\156\2\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\35\1\36\1\uffff\1\41"+
        "\2\uffff\1\46\1\47\1\uffff\1\52\1\uffff\1\54\1\55\1\56\11\uffff"+
        "\1\112\1\uffff\1\116\1\117\24\uffff\1\40\1\37\1\43\1\42\1\45\1\44"+
        "\3\uffff\1\115\1\53\13\uffff\1\113\1\114\15\uffff\1\63\6\uffff\1"+
        "\62\30\uffff\1\61\5\uffff\1\57\10\uffff\1\60\2\uffff\1\32\30\uffff"+
        "\1\10\1\uffff\1\11\1\13\1\15\1\14\2\uffff\1\105\6\uffff\1\101\5"+
        "\uffff\1\110\2\uffff\1\50\1\64\1\75\1\65\1\uffff\1\103\5\uffff\1"+
        "\71\10\uffff\1\16\1\17\1\51\1\20\3\uffff\1\24\1\25\1\26\10\uffff"+
        "\1\104\4\uffff\1\72\4\uffff\1\111\1\uffff\1\12\1\uffff\1\22\1\uffff"+
        "\1\27\3\uffff\1\107\1\uffff\1\34\2\uffff\1\66\1\uffff\1\70\1\74"+
        "\1\73\1\76\3\uffff\1\23\1\30\3\uffff\1\100\1\106\1\67\1\102\4\uffff"+
        "\1\33\1\7\2\uffff\1\77\1\21\1\uffff\1\31";
    static final String DFA10_specialS =
        "\u0128\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\27\1\55\2\uffff\1\37\1\1"+
            "\1\uffff\1\40\1\41\1\35\1\32\1\2\1\33\1\uffff\1\36\12\54\1\3"+
            "\1\4\1\30\1\26\1\31\2\uffff\2\53\1\43\1\44\10\53\1\45\4\53\1"+
            "\47\1\46\7\53\1\5\1\uffff\1\6\1\uffff\1\53\1\uffff\1\7\1\10"+
            "\1\50\1\11\1\42\1\12\1\13\1\14\1\15\2\53\1\16\1\53\1\17\1\20"+
            "\1\51\1\53\1\21\1\53\1\34\1\53\1\22\1\52\1\53\1\23\1\53\1\24"+
            "\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\1\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\63",
            "\1\66\7\uffff\1\64\5\uffff\1\65\5\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\73\15\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76\17\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "\1\105",
            "\1\107",
            "",
            "",
            "\1\113\2\uffff\1\112\11\uffff\1\111",
            "",
            "\1\114\4\uffff\1\114",
            "",
            "",
            "",
            "\1\116\1\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\13\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\132\1\uffff\12\54",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141\3\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\151\6\uffff\1\152",
            "\1\153\1\uffff\1\154",
            "\1\155",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\156\21\53",
            "\1\163\1\uffff\1\161\1\160\17\uffff\1\162",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\173\2\uffff\1\172\6\uffff\1\171",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\21\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\2\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b4\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b7\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22"+
            "\53\1\u00c1\7\53",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c9",
            "\1\u00ca",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "",
            "",
            "",
            "",
            "\1\u00df\3\uffff\1\u00e0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\6\uffff\1\u00e7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "",
            "",
            "\1\u00f0",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\u00fe",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0100",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0106",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0108",
            "",
            "\1\u0109",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u010b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0110",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0122",
            "\1\u0123",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0126",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | EQUAL | COMP_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | TRUE | FALSE | MUL | DIV | MOD | LPAREN | RPAREN | FOR | NOT | AND | OR | IF | THEN | ELSE | CREATE | DESTROY | MODIFY | MOVE | SCALE | ROTATE | SOURCE | TEXT | CIRCLE | RECTANGLE | ELLIPSE | LINE | POLYGON | ELIF | ENDIF | FUNC | ENDFUNC | RETURN | READ | WRITE | ID | INT | FLOAT | COMMENT | STRING | WS );";
        }
    }
 

}