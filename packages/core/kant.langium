grammar Kant

entry Protocol:
    elements+=Element*;

Element:
    FunctionDef | PropertyDef | SharedKnowledgeDef | Principals | PrincipalKnowledgeDef | Communication | ScenarioBranching | Check | TypeDefinition ;

TypeDefinition: 
    'type' (elements+=Type | elements+=Type (',' elements+=Type)*)
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
	('(' params+=FunctionParam (',' params+=FunctionParam)* ')')?
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
	('(' params+=FunctionParam (',' params+=FunctionParam)* ')')?
    ( 'with' key=FunctionKey)?
	(
		'->' return=FunctionReturn
	)
;

ParamType:
    type=[Type:ID]
;

FunctionParam:
    (variadic?='...')? name=(ParamType | KnowledgeFromFunction)
;

FunctionKey:
    elements+=FunctionKeyElement
	| '{' elements+=FunctionKeyElement (',' elements+=FunctionKeyElement)* '}'
;

FunctionKeyElement:
    name+=ID ('=' type=KnowledgeValue)?
;

FunctionReturn:
    '[' elements+=FunctionReturnElement ']'
	| '[' elements+=FunctionReturnElement (',' elements+=FunctionReturnElement)* ']'
;

FunctionReturnElement:
    name+=ID ('=' type=KnowledgeValue)?
;

PropertyDef:
    'property' property=(KnowledgeEqualityDef | FunctionInversionDef)
;

KnowledgeEqualityDef:
    (intro=UniversalIntroduction)?
	value=KnowledgeValue 'equals' target=KnowledgeValue
;

FunctionInversionDef:
    inverter=[FunctionDef:ID] 'invert' function=[FunctionDef:ID]
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
	| KnowledgeGenerator
	| KnowledgeFromFunction
    | ListAccess
;

ListAccess:
    ref=ID '[' index=INT ']'
;

KnowledgeRef:
    ref=ID;

KnowledgeGenerator:
    'gen' type=STRING;

KnowledgeFromFunction:
    invoked=[FunctionDef:ID] '(' args=KnowledgeFromFunctionArgs? ')'
	('with' (keys+=(KnowledgeRef | KnowledgeFromFunction) | '{' keys+=(KnowledgeRef | KnowledgeFromFunction) (',' keys+=(KnowledgeRef | KnowledgeFromFunction))* '}'))?;

KnowledgeFromFunctionArgs:
    KnowledgeFromFunctionArgsElements
;

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
