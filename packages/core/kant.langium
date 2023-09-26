grammar Kant

entry Protocol:
    elements+=Element*;

Element:
    FunctionDef | PropertyDef | SharedKnowledgeDef | Principals | PrincipalKnowledgeDef | Communication | ScenarioBranching | Check;

UniversalIntroduction:
    ('forall' args+=ID (',' args+=ID)* ':')
;

FunctionDef:
    'function'
	(intro=UniversalIntroduction)?
	name=ID
	('(' params+=FunctionParam (',' params+=FunctionParam)* ')')?
	( 'with' key=FunctionKey)?
	(
		'->' return=FunctionReturn
	)
	(randomized?='randomized')?
	(ow?='one' 'way')?
;

FunctionParam:
    (variadic?='...')? name=ID (opt?='?')? ('=' type=KnowledgeValue)?
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
    target+=[Principal:ID] (',' target+=[Principal:ID])* 'know' '{' knowledge+=Knowledge (',' knowledge+=Knowledge)* '}'
;

Knowledge:
    KnowledgeDef | KnowledgeValue;

KnowledgeDef:
    KnowledgeDefBuiltin
    | KnowledgeDefCustom
;

KnowledgeDefBuiltin:
    type=('const' | 'fresh' | 'state' ) (name+=ID | '{' name+=ID (',' name+=ID)* '}')
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
	| KnowledgeList
	| KnowledgeSet
	| KnowledgeGenerator
	| KnowledgeFromFunction
    | ListAccess
;

ListAccess:
    ref=ID '[' index=INT ']'
;

KnowledgeList:
    '[' (values+=(KnowledgeValue | KnowledgeSpreading) (',' values+=(KnowledgeValue | KnowledgeSpreading))*)? ']';

KnowledgeRef:
    ref=ID ('.' access+=ID)*;

KnowledgeSet:
    '{' (content+=(Knowledge | KnowledgeSpreading) (',' content+=(Knowledge | KnowledgeSpreading))*)? '}';

KnowledgeSpreading:
    '...' ref=(KnowledgeRef | KnowledgeSet | KnowledgeList);

KnowledgeGenerator:
    'gen' type=STRING;

KnowledgeFromFunction:
    invoked=[FunctionDef:ID] '(' args=KnowledgeFromFunctionArgs? ')'
	('with' key=KnowledgeValue)?;

KnowledgeFromFunctionArgs:
    KnowledgeFromFunctionArgsElements
	| KnowledgeSpreading
;

KnowledgeFromFunctionArgsElements:
    (args+=KnowledgeValue (',' args+=KnowledgeValue)* )
;

Communication:
    ('(' messageId=ID ')')? from=[Principal:ID] '->' to+=[Principal:ID] (',' to+=[Principal:ID])* ':' (ref+=KnowledgeRef | '[' ref+=KnowledgeRef (',' ref+=KnowledgeRef)* ']')
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
