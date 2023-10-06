grammar Kant

entry Protocol:
    elements+=Element*;

Element:
    FunctionDef | FunctionInversionDef | PropertyDef | SharedKnowledgeDef | Principals | PrincipalKnowledgeDef | Communication | ScenarioBranching | Check | TypeDefinition ;

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
	//(intro=UniversalIntroduction)?

	name=ID
	('(' (variadic?='...')? (var+=ID ':' params+=ParamType) ((',' (var+=ID ':' params+=ParamType))*)? ')')
	( 'with' key=FunctionKey)?
	(
		'->' return=FunctionReturn
	)
	(randomized?='randomized')?
	(ow?='one' 'way')?
;

FunctionInversionDef:
    'function'
	intro=UniversalIntroduction
	name=ID
    // FunctionParam -> X 
	('(' params+=KnowledgeFromFunction (',' params+=KnowledgeFromFunction)* ')')?
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
;

FunctionReturnInvElement:
    name+=ID 
;

FunctionReturn:
    '[' elements+=FunctionReturnElement ']'
	| '[' elements+=FunctionReturnElement (',' elements+=FunctionReturnElement)* ']'
;

FunctionReturnElement:
    name+=ID (':' type=ParamType)
;

PropertyDef:
    'property' property=(KnowledgeEqualityDef | FunctionInversionPairing)
;

KnowledgeEqualityDef:
    (intro=UniversalIntroduction)?
	value=KnowledgeValue 'equals' target=KnowledgeValue
;

FunctionInversionPairing:
    inverter=[FunctionInversionDef:ID] 'invert' function=[FunctionDef:ID]
;

SharedKnowledgeDef:
    'shared' 'knowledge' knowledge=Knowledge
;

Principals:
    'principal' elements+=Principal (',' elements+=Principal)*
;

Principal:
    name=ID
;

PrincipalKnowledgeDef:
    target+=[Principal:ID] (',' target+=[Principal:ID])* 'know' '{' knowledge+=Knowledge (';' knowledge+=Knowledge)* ';' '}'
;

Knowledge:
    KnowledgeDef;

KnowledgeDef:
    KnowledgeDefBuiltin
    | KnowledgeDefCustom
    | StateDefinition
;

KnowledgeDefBuiltin:
    type=('const' | 'fresh') (name+=ID (':' customType=[Type:ID]) | name+=ID (':' customType=[Type:ID]) (',' name+=ID (':' customType=[Type:ID]))*)
;

StateDefinition:
    'state' (name+=ID | name+=ID (',' name+=ID)*)
;

KnowledgeDefCustom:
    left=(KnowledgeDefCustomName | KnowledgeDefDestructuring) '=' value=KnowledgeValue
;

KnowledgeDefCustomName:
    name=ID
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

ListAccess:
    ref=ID '[' index=INT ']'
;

KnowledgeRef:
    ref=ID;

// TODO: write validation functions to:
    // 1. check cross-reference is correct
    // 2. check no one way functions is passed as argument in a function inversion def

KnowledgeFromFunction:
    invoked=ID '(' (variadic?='...')?  args=KnowledgeFromFunctionArgsElements  ')'
	('with' (keys+=KnowledgeValue | '{' keys+=KnowledgeValue (',' keys+=KnowledgeValue)* '}'))?;



KnowledgeFromFunctionArgsElements:
    (args+=KnowledgeValue (',' args+=KnowledgeValue)* )
;

Communication:
    ('(' messageId=ID ')')? from=[Principal:ID] '->' to+=[Principal:ID] (',' to+=[Principal:ID])* ':' (ref=KnowledgeRef)
;

ScenarioBranching:
    ScenarioOptional
	| ScenarioAlternatives;

ScenarioOptional:
    'optionally' scenario+=Scenario;

ScenarioAlternatives:
    'alternatively' ('or' scenario+=Scenario) ('or' scenario+=Scenario)+;

Scenario:
    (name=STRING)? '{' elements+=Element+ '}';

Check:
    'check' (KnowledgeCheck
	| EqualityCheck
	| FreshnessCheck
	| LinkabilityCheck
	| AuthenticationCheck);

KnowledgeCheck:
    (here?='here')? (only?='only')? (target+=[Principal:ID] (',' target+=[Principal:ID])*) ('should' (not?='not')? 'know') knowledge=KnowledgeValue;

EqualityCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)+ 'should' (not?='not')? 'be' 'equal';

FreshnessCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)* 'should' (not?='not')? 'be' 'fresh';

LinkabilityCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)+ 'should' (not?='not')? 'be' 'linked';

AuthenticationCheck:
    from=[Principal:ID] 'should' 'authenticate' target=[Principal:ID] 'with' knowledge=KnowledgeValue;


terminal ID returns string: /[a-zA-Z]([a-zA-Z0-9_])*/;
terminal STRING returns string: '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"';
terminal INT returns number: /[0-9]+/;
hidden terminal WS:             /\s+/;
hidden terminal ML_COMMENT:     /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT:     /\/\/[^\n\r]*/;
