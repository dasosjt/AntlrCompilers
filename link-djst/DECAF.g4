grammar DECAF;

//---------------------------Keywords-------------------------------//
CLASS : 'class';
STRUCT : 'struct';
TRUE : 'true';
FALSE : 'false';
INT : 'int';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
RETURN : 'return';
CHAR : 'char';
BOOLEAN : 'boolean';
VOID : 'void';
SCAN : 'scan';
PRINT : 'print';

//-------------------------Characters------------------------------//
fragment LETTER: ('a'..'z' | 'A'..'Z');
WS: [ \t\r\n]+ ->	channel(HIDDEN);//Whitespace declaration	
fragment DIGIT: ('0'..'9');
CHR : '\''(LETTER|DIGIT|' '|EXC|'"'|'#'|'$'|'%'|'^'|'&'|'*'|LPARENT|RPARENT|PLUS|'_'|MINUS|'?'|'\''|'.'|','|'<'|'>'|':'|';'|'`'|'~'|'@'|'\"') '\''; 
ID: LETTER(DIGIT|LETTER)*;
NUM: (DIGIT)+;
STRING: '\"'(LETTER|DIGIT|' '|EXC|'"'|'#'|'$'|'%'|'^'|'&'|'*'|LPARENT|RPARENT|PLUS|'_'|MINUS|'?'|'\''|'.'|','|'<'|'>'|':'|';'|'`'|'~'|'@'|'\"'|[\s])+'\"';
COMMENT: '//'(~('\r'|'\n'))*{skip();};
COMA: ','; 
AND: '&&';
OR:'||';
LBRACE: '{';
RBRACE: '}';
DOTCOMMA: ';';
RCORCH: ']';
LCORCH: '[';
LPARENT: '(';
RPARENT: ')';
EQ: '=';
DOT: '.';
PLUS: '+';
MINUS: '-';
EXC: '!';
AST: '*';
SLSH: '/';
PRCNT: '%';
MTHAN: '>';
LTHAN: '<';
EQMTHAN: '>=';
EQLTHAN: '<=';
EQEQ: '==';
NOTEQ: '!=';

program: CLASS ID LBRACE (declaration)* RBRACE; 

declaration: structDeclaration | varDeclaration | methodDeclaration;
			
varDeclaration: varType ID DOTCOMMA | varType ID LCORCH NUM RCORCH DOTCOMMA | ID ID DOTCOMMA | ID ID LCORCH NUM RCORCH DOTCOMMA;

structDeclaration: STRUCT ID LBRACE (varDeclaration)* RBRACE;

varType: (INT | CHAR | BOOLEAN | (STRUCT ID) | structDeclaration | VOID);
		
methodDeclaration: methodType ID LPARENT (parameterDeclaration(COMA parameterDeclaration)*)? RPARENT block;

methodType: INT | CHAR | BOOLEAN | VOID;
			
parameterDeclaration: parameterType ID | parameterType ID LCORCH RCORCH;
		 
parameterType: INT | CHAR | BOOLEAN ;
			
block: LBRACE (varDeclaration)* (statement)* RBRACE ;

statement: ifBlock | returnBlock | whileBlock | declaredMethodCall DOTCOMMA | assignation | orExpression DOTCOMMA | print ;

assignation: location EQ (orExpression | scan ) DOTCOMMA ;
whileBlock:  WHILE LPARENT orExpression RPARENT block ;
returnBlock: RETURN (nExpression) DOTCOMMA ;

//----------------------Scan Print-------------------------------//
print: PRINT LPARENT ( STRING | location ) RPARENT DOTCOMMA;
scan: SCAN LPARENT RPARENT;

ifBlock: IF LPARENT orExpression RPARENT block elseBlock;
elseBlock: ELSE ifBlock | ELSE block | /* epsilon */;
location: declaredVariable | dotLocation;
dotLocation: variable ( DOT location) | arrayVariable ( DOT location);
declaredVariable: variable | arrayVariable;
variable: ID;
arrayVariable: ID LCORCH orExpression RCORCH ;
expressionInP: LPARENT orExpression RPARENT ;

//---------------------Operator Priority-------------------------//
nExpression: orExpression | ;
orExpression: andExpression | orExpression OR andExpression;
andExpression: equalsExpression | andExpression AND equalsExpression;
equalsExpression: relationExpression | equalsExpression eq_op relationExpression;
relationExpression: addSubsExpression | relationExpression rel_op addSubsExpression;
addSubsExpression: mulDivExpression | addSubsExpression as_op mulDivExpression;
mulDivExpression: prExpression | mulDivExpression md_op prExpression;
prExpression: basicExpression | prExpression pr_op basicExpression;
basicExpression: LPARENT (INT|CHAR) RPARENT basic | MINUS basic | EXC basic | basic;
basic : expressionInP | location | declaredMethodCall | literal;
arg: orExpression;
declaredMethodCall: ID LPARENT (arg(COMA arg)*)? RPARENT;

//---------------------------Operators---------------------------//
as_op : PLUS | MINUS;
md_op: AST | SLSH ;
pr_op: PRCNT;
rel_op: LTHAN | MTHAN | EQLTHAN | EQMTHAN ;
eq_op: EQEQ | NOTEQ;
cond_op: AND | OR;

//-----------------------------Types---------------------------//
literal: int_literal | char_literal | bool_literal;
int_literal: NUM;
char_literal: CHR;
bool_literal: TRUE | FALSE;

