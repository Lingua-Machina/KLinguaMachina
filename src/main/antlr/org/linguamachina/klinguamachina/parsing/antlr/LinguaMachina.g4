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

SymbolLiteral: '\'' [a-zA-Z0-9_$.:/]+ ;

Identifier: Ident;

LowerOrEq: '<=';
GreaterOrEq: '>=';
Lower: '<';
Greater: '>';

Equal: '==';
NotEqual: '!=';

Plus: '+';
Minus: '-';

compOp: LowerOrEq | Lower | GreaterOrEq | Greater;

eqOp: Equal | NotEqual;

arithOp: Plus | Minus;

integerLiteral: IntegerLiteral;

doubleLiteral: DoubleLiteral;

stringLiteral: StringLiteral;

charLiteral: CharLiteral;

symbolLiteral: SymbolLiteral;

identifier: Identifier;

arrayLiteral: '[' (expression (',' expression)*)? ']';

blockLiteral: '{' (params+=BlockLiteralParam+ '|')? blockStatements? '}';

literal:
      integerLiteral
    | doubleLiteral
    | stringLiteral
    | charLiteral
    | symbolLiteral
    | identifier
    | arrayLiteral
    | blockLiteral
;

expression: orExpr;

paramExpression: unary;

orExpr: andExpr ('||' andExpr)* ;

andExpr: eqExpr ('&&' eqExpr)* ;

eqExpr: compExpr (eqOp compExpr)? ;

compExpr: arithExpr (compOp arithExpr)? ;

arithExpr: termExpr (arithOp termExpr)* ;

termExpr: factorExpr ('*' factorExpr)* ;

factorExpr: moduloExpr ('/' moduloExpr)* ;

moduloExpr: messageExpr ('%' messageExpr)? ;

parenExpression: '(' expression ')';

atom:
      literal
    | parenExpression
;

unaryMinus: '-' atom;

unaryNot: '!' atom;

unary:
      unaryMinus
    | unaryNot
    | atom
;

messageExpr: unary messageCascadeOrChain? ;

messageSelector:
    (identifier
          (':' paramExpression
              (identifier ':' paramExpression)*
          )?
    )
;

messageCascadeOrChain:
      messageSelector
    | messageChain
    | messageCascade
;

messageCascade: messageSelector ('|' messageCascadeOrChainMember)+ ;

messageChain: messageSelector ('|>' messageCascadeOrChainMember)+ ;

messageCascadeOrChainMember:
      messageSelector
    | '(' messageCascadeOrChain ')'
;

varDeclaration: identifier ':=' expression;

varAssignment: identifier '=' expression;

methodParams:
    (keywords+=identifier
        (':' params+=identifier
            (keywords+=identifier ':' params+=identifier)*
        )?
    )
;

compileStatement: expression '>>' methodParams '{' blockStatements? '}';

primitiveDeclStatement: expression '::' methodParams '=' symbolLiteral;

localReturn: '<' expression;

nonLocalReturn: '^' expression;

blockStatement:
    statement
    | localReturn
    | nonLocalReturn
;

statement:
      expression
    | varDeclaration
    | varAssignment
    | compileStatement
    | primitiveDeclStatement
;

blockStatements: blockStatement (';' blockStatement)* ';'? ;

statements: statement (';' statement)* ';'? ;

root: statements EOF;
