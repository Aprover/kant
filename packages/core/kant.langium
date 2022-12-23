grammar Kant

entry Protocol:
    elements+=Element*;

Element:
    FunctionDef | PropertyDef | KnowledgeBase | Principal | Communication | ScenarioBranching | Check;

UniversalIntroduction:
    ('forall' args+=ID (',' args+=ID)* ':')
;

FunctionDef:
    'function'
	(intro=UniversalIntroduction)?
	name+=ID
	('(' params+=FunctionParam (',' params+=FunctionParam)* ')')?
	( 'with' key=FunctionKey)?
	(
		'->' return=FunctionReturn
	)?
	(randomized?='randomized')?
	(ow?='one' 'way')?
;

FunctionParam:
    (variadic?='...')? name=ID (opt?='?')? ('=' type=KnowledgeValue)?
;

FunctionKey:
    elements+=FunctionKeyElement
	| '{' elements+=FunctionKeyElement (',' elements+=FunctionKeyElement)* '}';

FunctionKeyElement:
    name+=ID ('=' type=KnowledgeValue)?
;

FunctionReturn:
    elements+=FunctionReturnElement
	| '{' elements+=FunctionReturnElement (',' elements+=FunctionReturnElement)* '}'
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
    inverter=ID 'invert' function=ID
;

KnowledgeBase:
    (shared?='shared')? 'knowledge' knowledge=Knowledge;

Principal:
    'principal' name+=ID (',' name+=ID)* ('know' knowledge=Knowledge)?;

Knowledge:
    KnowledgeDef | KnowledgeValue;

KnowledgeDef:
    (name+=ID | KnowledgeDefDestructuring) '=' value=KnowledgeValue
	| ('const' | 'fresh') (name+=ID | '{' name+=ID (',' name+=ID)* '}');

KnowledgeDefDestructuring:
    KnowledgeDefSetDestructuring
	| KnowledgeDefListDestructuring
;

KnowledgeDefSetDestructuring:
    '{' (assignments+=KnowledgeDefSetDesctructuringAssignment (',' assignments+=KnowledgeDefSetDesctructuringAssignment)*)? '}'
;

KnowledgeDefSetDesctructuringAssignment:
    name=ID ('=' from=ID)?
;

KnowledgeDefListDestructuring:
    '[' (assignments+=KnowledgeDefListDesctructuringAssignment (',' assignments+=KnowledgeDefListDesctructuringAssignment)*)? ']'
;

KnowledgeDefListDesctructuringAssignment:
    '...'
	|  '_'
	| name=ID
;

KnowledgeValue:
    KnowledgeRef
	| KnowledgeList
	| KnowledgeSet
	| KnowledgeGenerator
	| KnowledgeFromFunction
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
    name=ID '(' args=KnowledgeFromFunctionArg? ')'
	('with' key=KnowledgeValue)?;

KnowledgeFromFunctionArg:
    (args+=KnowledgeValue (',' args+=KnowledgeValue)* )
	| KnowledgeSpreading
;

Communication:
    from+=ID (',' from+=ID)* '->' to+=ID (',' to+=ID)* ':' knowledge=Knowledge;

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
    (here?='here')? (only?='only')? (target+=ID (',' target+=ID)*) ('should' (not?='not')? 'know') knowledge=KnowledgeValue;

EqualityCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)+ 'should' (not?='not')? 'be' 'equal';

FreshnessCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)* 'should' (not?='not')? 'be' 'fresh';

LinkabilityCheck:
    knowledge+=KnowledgeRef (',' knowledge+=KnowledgeRef)+ 'should' (not?='not')? 'be' 'linked';

AuthenticationCheck:
    principal=ID 'should' 'authenticate' target=ID 'with' knowledge=KnowledgeValue;


terminal ID returns string: (/[a-z]/|/[A-Z]/) (/[a-z]/|/[A-Z]/|'_'|/[0-9]/)*;
terminal STRING returns string: '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"';
hidden terminal WS:             /\s+/;
hidden terminal ML_COMMENT:     /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT:     /\/\/[^\n\r]*/;