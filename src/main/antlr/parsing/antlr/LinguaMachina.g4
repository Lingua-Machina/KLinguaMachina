grammar LinguaMachina;

WS: [ \r\t\n]+ -> channel(HIDDEN);

COMMENT: '#' (~'#')* '#' -> channel(HIDDEN);

fragment Digit: [0-9] ;

fragment Ident: [a-zA-Z_][a-zA-Z0-9_]* ;

BlockLiteralParam: ':' Ident;

IntegerLiteral: Digit+ ;

DoubleLiteral:
      IntegerLiteral '.' IntegerLiteral 'e' IntegerLiteral
    | IntegerLiteral '.' IntegerLiteral
    | IntegerLiteral 'e' IntegerLiteral
;

StringLiteral: '"' (('\\' .) | ~'"')* '"';

CharLiteral: '$' ~[ \r\t\n] ;

SymbolLiteral: '\'' [a-zA-Z0-9_$.:]+ ;

Identifier: Ident;

LowerOrEq: '<=';
GreaterOrEq: '>=';
Lower: '<';
Greater: '>';

compOp: LowerOrEq | Lower | GreaterOrEq | Greater;

arrayLiteral: '[' (items+=expression (',' items+=expression)*)? ']';

blockLiteral: '{' (params+=BlockLiteralParam+ '|')? blockStatements? '}';

literal:
      IntegerLiteral
    | DoubleLiteral
    | StringLiteral
    | CharLiteral
    | SymbolLiteral
    | Identifier
    | arrayLiteral
    | blockLiteral
;

expression: orExpr;

paramExpression: unary;

orExpr: andExpr ('||' andExpr)* ;

andExpr: eqExpr ('&&' eqExpr)* ;

eqExpr: compExpr (('==' | '!=') compExpr)? ;

compExpr: arithExpr (compOp arithExpr)? ;

arithExpr: termExpr (('+' | '-') termExpr)* ;

termExpr: factorExpr ('*' factorExpr)* ;

factorExpr: messageExpr ('/' messageExpr)? ;

atom:
      literal
    | '(' expression ')'
;

unary:
      '-' atom
    | '!' atom
    | atom
;

messageExpr: receiver=unary (messageSelector messageCascadeOrChain?)? ;

messageSelector:
    (keywords+=Identifier
          (':' values+=paramExpression
              (keywords+=Identifier ':' values+=paramExpression)*
          )?
    )
;

messageCascadeOrChain:
      messageChain
    | messageCascade
;

messageCascade: ('|' messageCascadeOrChainMember)+ ;

messageChain: ('|>' messageCascadeOrChainMember)+ ;

messageCascadeOrChainMember:
      messageSelector
    | '(' messageSelector messageCascadeOrChain? ')'
;

varDeclaration: Identifier ':=' expression;

varAssignment: Identifier '=' expression;

compileStatementMethodParams:
    (keywords+=Identifier
        (':' variables+=Identifier
            (keywords+=Identifier ':' variables+=Identifier)*
        )?
    )
;

compileStatement: expression '>>' compileStatementMethodParams '{' blockStatements? '}';

blockStatement:
    statement # normalStatement
    | '<' expression # localReturn
    | '^' expression # nonLocalReturn
;

statement:
      expression
    | varDeclaration
    | varAssignment
    | compileStatement
;

blockStatements: stmts+=blockStatement (';' stmts+=blockStatement)* ';'? ;

statements: stmts+=statement (';' stmts+=statement)* ';'? ;

root: statements EOF;
