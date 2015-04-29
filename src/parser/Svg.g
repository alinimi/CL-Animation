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

grammar Svg;

options {
    output = AST;
    ASTLabelType = SvgTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_FUNCTIONS; // List of functions (the root of the tree)
    ASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    LIST_ATTR;
    LIST_COORD;
    ITE;
    RGB;
    COORD;
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    ARRAY;
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
}

@header {
package parser;
import interp.SvgTree;
}

@lexer::header {
package parser;
}


// A program is a list of functions
prog    : func+ EOF -> ^(LIST_FUNCTIONS func+)
        ;
            
// A function has a name, a list of parameters and a block of instructions  
func    : FUNC^ ID params '{'! block_instructions '}'!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
        ;

// A list of instructions, all of them gouped in a subtree
block_instructions
        :    (instruction)+   -> ^(LIST_INSTR instruction+)
        ;

// The different types of instructions
instruction
        :   assign ';'!     // Assignment
        |   ite_stmt        // if-then-else
        |   for_stmt        // while statement
        |   create ';'!     // Create object
        |   destroy ';'!    // Destroy object
        |   modify ';'!     // Modify object
        |   move ';'!       // Move object
        |   scale ';'!      // Scale object
        |   rotate ';'!     // Rotate object
        |   source ';'!     // Import script form source
        |   funcall ';'!    // Call to a procedure (no result produced)
        |   read ';'!       // Read a variable
        |   write ';'!      // Write a string or an expression
        |   return_stmt ';'!
        ;

// Assignment
assign  :   variable eq=EQUAL expr -> ^(ASSIGN[$eq,":="] variable expr)
        ;

// Return statement with an expression
return_stmt :   RETURN^ expr?
        ;

variable:   (ID|array)
        ;

array   : id=ID '[' INT ']'    -> ^(ARRAY[$id,$id.text] INT)
        ;

// Create instruccion:
//               |         objecte_create         |
//        Create |ObjectType Name ObjectAttributes| GeneralAttributes   Time     
create  : CREATE^ objecte_create                    attributes          (FLOAT|INT)?
        ;

//              type        Name     ObjectAttributes
objecte_create: TEXT      ID       INT INT STRING
              | CIRCLE    ID       INT INT INT
              | RECTANGLE ID       INT INT INT INT (INT INT)?
              | ELLIPSE   ID       INT INT INT INT
              | LINE      ID       list_min_2_coord
              | POLYGON   ID       list_min_2_coord
              ;

list_min_2_coord : coord coord coord* -> ^(LIST_COORD coord+)
                 ;

coord : INT ',' INT     -> ^(COORD INT INT)
      ;

// Destroy instrucction:
//        Destroy   ObjectId Time
destroy : DESTROY^  ID       (FLOAT|INT)
        ;

// Modify instrucction:
//        Modify    ObjectId    GeneralAttributes   tStart      tEnd
modify  : MODIFY^   ID          attributes          (FLOAT|INT) (FLOAT|INT)
        ;

attributes  : '{' attribute (',' attribute)* '}' -> ^(LIST_ATTR attribute+)
            ;

attribute   : 'fill'^           ':'! color
            | 'fill-opacity'^   ':'! FLOAT
            | 'line'^           ':'! color
            | 'line-pattern'^   ':'! ('dots'|'lines'|'alternate')
            | 'line-width'^     ':'! INT
            | text_attributes
            ;

text_attributes : 'font-style'^ ':'! ('normal' | 'italic' | 'oblique')
                | 'font-weight'^':'! ('normal' | 'bold' | 'bolder' | 'lighter' | INT)
                | 'orientation'^':'! ('horizontal'|'vertical')
                ;

color : ('red'|'blue'|'green'|'yellow'|rgb)
      ;

rgb   : '(' INT ',' INT ',' INT ')' -> ^(RGB INT INT INT)
      ;

// Move instrucction: 
//      Move  objectId x y      TStart      TEnd
move  : MOVE^ ID       coord    (FLOAT|INT) (FLOAT|INT)
      ;

// Scale instrucction:
//      Scale   Name    SizeStart   SizeEnd TStart      TEnd
scale : SCALE^  ID      INT         INT     (FLOAT|INT) (FLOAT|INT)
      ;

// Rotate instrucction:
//       Rotate     Name    AngleStart  AngleEnd    TStart      TEnd
rotate : ROTATE^    ID      (FLOAT|INT) (FLOAT|INT) (FLOAT|INT) (FLOAT|INT)
       ;

// Source instrucction:
// Source ScriptFile
source : SOURCE^ STRING
       ;

// if-then-else (else is optional)
ite_stmt    : if_stmt ( options {greedy=true;}: else_if_stmt )* ( options {greedy=true;}: else_stmt)? -> ^(ITE if_stmt else_if_stmt* else_stmt?)
            ;

if_stmt     : IF^ cond inst_stmt
            ;

else_if_stmt:  ELIF^ cond inst_stmt
            ;

else_stmt   : ELSE^ inst_stmt
            ;

// for statement
for_stmt    :   FOR^ LPAREN! assign ';'! expr ';'! assign RPAREN! inst_stmt 
            ;

cond    : LPAREN! expr RPAREN!
        ;

inst_stmt   :   ('{'! block_instructions '}'! | instruction)
            ;

// Read a variable
read    :   READ^ ID
        ;

// Write a variable
write   :   WRITE^ (expr | STRING )
        ;

// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
        ;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((COMP_EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
        ;

num_expr:   term ( (PLUS^ | MINUS^) term)*
        ;

term    :   factor ( (MUL^ | DIV^ | MOD^) factor)*
        ;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
        ;

atom    :   ID
        |   array
        |   INT
        |   FLOAT
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |   funcall
        |   '('! expr ')'!
        ;



// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
        ;

// Basic tokens
EQUAL   : '=' ;
COMP_EQUAL : '==' ;
NOT_EQUAL: '!=' ;
LT      : '<' ;
LE      : '<=';
GT      : '>';
GE      : '>=';
PLUS    : '+' ;
MINUS   : '-' ;
TRUE    : 'true' ;
FALSE   : 'false';
MUL     : '*';
DIV     : '/';
MOD     : '%' ;
LPAREN  : '(' ;
RPAREN  : ')' ;
WHILE   : 'while' ; // BORRAR, No compilava sense aquest token en un inici.
NOT     : 'not' ;
AND     : 'and' ;
OR      : 'or' ;    
IF      : 'if' ;
THEN    : 'then' ;
ELSE    : 'else' ;
CREATE  : 'Create' ;
DESTROY :  'Destroy';
MODIFY  : 'Modify';
MOVE    : 'Move';
SCALE   : 'Scale';
ROTATE  : 'Rotate';
SOURCE  : 'Source';
TEXT    : 'text';
CIRCLE  : 'circle';
RECTANGLE : 'rectangle';
ELLIPSE : 'ellipse';
LINE    : 'line';
POLYGON : 'polygon';
ELIF    : 'elif' ;
ENDIF   : 'endif' ;
FOR     : 'for' ;
FUNC    : 'func' ;
ENDFUNC : 'endfunc' ;
RETURN  : 'return' ;
READ    : 'read' ;
WRITE   : 'write' ;
ID      :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT     :   '0'..'9'+ ;
FLOAT   : '0'..'9'+ '.' '0'..'9'+;

// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;

// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;