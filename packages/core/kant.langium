grammar Kant

entry Protocol:
    elements+=Element*;

Element:
    FunctionDef |  PropertyDef | SharedKnowledgeDef | Principals | PrincipalKnowledgeDef | Communication | Check | TypeDefinition ;

TypeDefinition: 
    'type' (name+=Type | name+=Type (',' name+=Type)*)
;

Type:
    name=ID
;

UniversalIntroduction:
    ('forall' args+=ID (':' customType=[Type:ID]) (',' args+=ID (':' customType=[Type:ID]))* '|')
;

FunctionDef:
    'function'

    // inversion PROPERTY
	//(intro=UniversalIntroduction)?

	name=ID
	('(' (variadic?='...')? (params+=ID ':' typeParams+=ParamType) (',' (params+=ID ':' typeParams+=ParamType))* ')')
	( 'with' key=FunctionKey)?
	(
		'->' return=FunctionReturn
	)
	(randomized?='randomized')?
	(ow?='one' 'way')?
;

FunctionInversionDef:
	intro=UniversalIntroduction
	inverter=[FunctionDef:ID]
    // FunctionParam -> X 
	('(' firstParam=KnowledgeFromFunction (',' otherParams+=KnowledgeValue)* ')')
    ( 'with' key=FunctionInvKey)?
	(
		'->' return=FunctionInvReturn
	)
;

ParamType:
    type=[Type:ID]
;


FunctionKey:
    elements+=FunctionKeyElement
	| '{' elements+=FunctionKeyElement (',' elements+=FunctionKeyElement)* '}'
;

FunctionKeyElement:
    name+=ID (':' type=ParamType)
;

FunctionInvKey:
    elements+=FunctionKeyInvElement
	| '{' elements+=FunctionKeyInvElement (',' elements+=FunctionKeyInvElement)* '}'
;

FunctionKeyInvElement:
    name+=ID 
;

FunctionInvReturn:
    '[' elements+=FunctionReturnInvElement ']'
	| '[' elements+=FunctionReturnInvElement (',' elements+=FunctionReturnInvElement)* ']'
    | elements=KnowledgeFromFunction
;

FunctionReturnInvElement:
    name=ID 
;

FunctionReturn:
    '[' elements+=FunctionReturnElement ']'
	| '[' elements+=FunctionReturnElement (',' elements+=FunctionReturnElement)* ']'
;

FunctionReturnElement:
    name+=ID (':' type=ParamType)
;

PropertyDef:
    'property' property=(KnowledgeEqualityDef | FunctionInversionDef)
;

KnowledgeEqualityDef:
    (intro=UniversalIntroduction)
	value=KnowledgeFromFunction 'equals' target=KnowledgeFromFunction
;

/* FunctionInversionPairing:
    inverter=[FunctionInversionDef:ID] 'invert' function=[FunctionDef:ID]
; */

SharedKnowledgeDef:
    target+=[Principal:ID] (',' target+=[Principal:ID])* 'share' '{'  knowledge+=Knowledge (';' knowledge+=Knowledge)* ';' '}'

;

Principals:
    'principal' elements+=Principal (',' elements+=Principal)*
;

Principal:
    name=ID
;

PrincipalKnowledgeDef:
    target+=[Principal:ID] (',' target+=[Principal:ID])* 'know' '{' state=StateDefinition ';' (transition=StateTransition ';')? knowledge+=Knowledge (';' knowledge+=Knowledge)* ';' '}'
;

Knowledge:
    KnowledgeDef
    
;

KnowledgeDef:
    KnowledgeDefBuiltin
    | KnowledgeDefCustom
    
;

KnowledgeDefBuiltin:
    type=('const' | 'fresh') (name+=ID (':' customType+=[Type:ID]) | name+=ID (':' customType+=[Type:ID]) (',' name+=ID (':' customType+=[Type:ID]))*)
;


State:
    name=ID
;

StateDefinition:
    'state' (label=State)
;

StateTransition:
   'transition' (tag+=[State:ID] )'=>' (tag+=[State:ID])

;


KnowledgeDefCustom:
    left=(KnowledgeRef | KnowledgeDefDestructuring) '=' value=KnowledgeFromFunction
;


KnowledgeDefDestructuring:
    KnowledgeDefSetDestructuring
	| KnowledgeDefListDestructuring
;

KnowledgeDefSetDestructuring:
    '{' (assignments+=KnowledgeDefSetDestructuringAssignment (',' assignments+=KnowledgeDefSetDestructuringAssignment)*)? '}'
;

KnowledgeDefSetDestructuringAssignment:
    name=ID ('=' from=ID)?
;

KnowledgeDefListDestructuring:
    '[' elements+=KnowledgeDefListDestructuringElement (',' elements+=KnowledgeDefListDestructuringElement*)? ']'
;

KnowledgeDefListDestructuringElement:
    KnowledgeDefListDestructuringSpreading
    | KnowledgeDefListDestructuringSkip
    | KnowledgeDefListDestructuringAssignment;

KnowledgeDefListDestructuringSpreading:
    {infer KnowledgeDefListDestructuringSpreading} '...';

KnowledgeDefListDestructuringSkip:
    {infer KnowledgeDefListDestructuringSkip} '_';

KnowledgeDefListDestructuringAssignment:
    name=ID
;

KnowledgeValue:
    KnowledgeRef
	| KnowledgeFromFunction
    | ListAccess
;

KnowledgeCheck:
    KnowledgeRef
    | ListAccess
;
ListAccess:
    ref=ID '[' index=INT ']'
;

KnowledgeRef:
    ref=ID;

// TODO: write validation functions to:
    // 1. check cross-reference is correct
    // 2. check no one way functions is passed as argument in a function inversion def

KnowledgeFromFunction:
    invoked=[FunctionDef:ID] '(' (variadic?='...')?  args=KnowledgeFromFunctionArgsElements  ')'
	('with' (keys+=KnowledgeValue | '{' keys+=KnowledgeValue (',' keys+=KnowledgeValue)* '}'))?
;

/* KnowledgeFromInversionFunction:
    '[inv]' invoked=[FunctionInversionDef:ID] '(' (variadic?='...')?  args=KnowledgeFromFunctionArgsElements  ')'
	('with' (keys+=KnowledgeValue | '{' keys+=KnowledgeValue (',' keys+=KnowledgeValue)* '}'))?
; */


KnowledgeFromFunctionArgsElements:
    (args+=KnowledgeValue (',' args+=KnowledgeValue)* )
;

Communication:
    ('(' messageId=ID ')')? from=[Principal:ID] '->' to+=[Principal:ID] (',' to+=[Principal:ID])* ':' (ref=KnowledgeRef)
;



Check:
    'check' (ConfidentialityCheck
	| EqualityCheck
	| FreshnessCheck
	| AuthenticationCheck);

ConfidentialityCheck:
    (here?='here')? (only?='only')? (target+=[Principal:ID] (',' target+=[Principal:ID])*) ('should' (not?='not')? 'know') knowledge=KnowledgeCheck;

EqualityCheck:
    knowledge+=KnowledgeCheck(',' knowledge+=KnowledgeCheck)+ 'should' (not?='not')? 'be' 'equal';

FreshnessCheck:
    knowledge+=KnowledgeCheck (',' knowledge+=KnowledgeCheck)* 'should' (not?='not')? 'be' 'fresh';


AuthenticationCheck:
    from=[Principal:ID] 'should' 'authenticate' target=[Principal:ID] 'with' knowledge=KnowledgeCheck;


terminal ID returns string: /[a-zA-Z]([a-zA-Z0-9_])*/;
terminal STRING returns string: '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"';
terminal INT returns number: /[0-9]+/;
hidden terminal WS:             /\s+/;
hidden terminal ML_COMMENT:     /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT:     /\/\/[^\n\r]*/;
