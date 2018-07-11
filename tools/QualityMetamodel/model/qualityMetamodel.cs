SYNTAXDEF qualitymetamodel
FOR <http://www.univaq.disim.it/mde/qualitymm>
START QualityModel
 OPTIONS {
	usePredefinedTokens = "false";
	disableTokenSorting = "true";
	overrideResourceFactory = "false";
	overrideBuilder = "false";
	overrideBuilderAdapter = "false";
	overrideManifest = "false";
	disableLaunchSupport = "true";
	overrideLineBreakpoint = "false";
	overrideLineBreakpointAdapter = "false";
	overrideUIManifest = "false";
	overrideNewFileWizard = "false";
	overrideNewFileWizardPage = "false";
	overrideNewProjectWizard = "false";
	overrideUIPluginXML = "false";
	overrideProjectFile = "false";
	overrideBuildProperties = "false";
	overrideProposalPostProcessor = "false";
}

TOKENS {
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	DEFINE NOTOP $'not'$;
	DEFINE BOOLOP $('and'|'or'|'xor'|'implies')$;
	DEFINE INTOP $('div'|'mod')$;
	DEFINE RELOP $('>'|'<'|'>='|'<=')$;
	DEFINE EQ $'='$;
	DEFINE NEQ $'<>'$;
	DEFINE ADDOP $('-'|'+')$;
	DEFINE MULOP $('*'|'/')$;
	DEFINE COMMENT $'--'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FLOAT INTEGER + $'.'($ + DIGIT + $)+$;
	DEFINE INTEGER $'-'?($ + DIGIT + $)+$;
	DEFINE STRINGTYPE $'String'$;
	DEFINE BOOLEANTYPE $'Boolean'$;
	DEFINE INTEGERTYPE $'Integer'$;
	DEFINE REALTYPE $'Real'$;
	DEFINE COLLECTIONTYPE $'Collection'$;
	DEFINE BAGTYPE $'Bag'$;
	DEFINE ORDEREDSETTYPE $'OrderedSet'$;
	DEFINE SEQUENCETYPE $'Sequence'$;
	DEFINE SETTYPE $'Set'$;
	DEFINE OCLANYTYPE $'OclAny'$;
	DEFINE OCLTYPE $'OclType'$;
	DEFINE TUPLETYPE $'TupleType'$;
	DEFINE TUPLE $'Tuple'$;
	DEFINE MAPTYPE $'Map'$;
	DEFINE LAMBDATYPE $'Lambda'$;
	DEFINE ENVTYPE $'Env'$;
	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"NOTOP" COLOR #800040, BOLD;
	"BOOLOP" COLOR #800040, BOLD;
	"INTOP" COLOR #800040, BOLD;
	"static" COLOR #800040, BOLD;
	"COMMENT" COLOR #53876D;
	"FLOAT" COLOR #2A00FF;
	"INTEGER" COLOR #2A00FF;
	"STRINGTYPE" COLOR #00C000;
	"BOOLEANTYPE" COLOR #00C000;
	"INTEGERTYPE" COLOR #00C000;
	"REALTYPE" COLOR #00C000;
	"COLLECTIONTYPE" COLOR #00C000;
	"BAGTYPE" COLOR #00C000;
	"ORDEREDSETTYPE" COLOR #00C000;
	"SEQUENCETYPE" COLOR #00C000;
	"SETTYPE" COLOR #00C000;
	"OCLANYTYPE" COLOR #00C000;
	"OCLTYPE" COLOR #00C000;
	"TUPLE" COLOR #00C000;
	"TUPLETYPE" COLOR #00C000;
	"MAPTYPE" COLOR #00C000;
	"LAMBDATYPE" COLOR #00C000;
	"ENVTYPE" COLOR #00C000;
	"true" COLOR #00D0FF;
	"false" COLOR #00D0FF;
	"iterate" COLOR #000000;
	"UNSET" COLOR  #01DF01;
}
 


RULES {
	// syntax definition for class 'QualityModel'
	QualityModel ::= "{"
						"name:" name[]"," 
						"metricProviders:" 	"[" metricProviders ("," metricProviders*)* "],"
						"qualityTypes:" "[" qualityTypes* ("," qualityTypes*)* "],"
						"qualityAttributes:" "[" qualityAttributes* ("," qualityAttributes*)* "],"
						"qualityValues:" "[" qualityValues* ("," qualityValues*)*"]"
						"}";
	QualityAttribute::= "{"
						"name:" varName[]","
						"qualityAttributes:""["
						qualityAttributes[]?(","qualityAttributes[])*
						"],"
						"values:" value[]
						"}";
	MetricProvider ::= "{"
		"name:" name[]","
		"description:" description['"','"','\\']","
		"id:" id[]
	"}";
	SingleValue ::= "{"
		"name:" varName[]","
		"measuredBy:" measuredBy[]","
		"type:" valueType[]
		"}";
	AggregatedValue ::= "{"
		"name:" varName[]","
		"calculatedBy:" calculatedBy*","
		"type:" valueType[]
	"}";
	
	Operation::="{"
		"name:" name[]","
		"aggregatedValue:" "["aggregatedValues[] (","aggregatedValues[])*(",")? "]"
		"expr:" ref*
	"}";
	
	TextValueType ::= "{"
		"name:" varName[]"," 
		"type:" "String,"
		"value:"	(value[]|"UNSET")
	"}"; 
	AggregatedValueMetric ::= "AggregatedValueMetric";
	EnumerationMetric ::= "{" 
		"name:" varName[]","
		"set:" "["set* (","set*)*"],"
		"value:" (value[]|"UNSET")
		"}";
	EnumerationItem ::="{"
		"name:" name[]
	"}"; 
	RealValueType ::= "{"
		"name:" varName[]"," 
		"_type:" "Real,"
		"value:"	(value[]|"UNSET")
	"}";
	BooleanValueType ::= "{"
		"name:" varName[] ","
		"type:" "Boolean,"
		"value:"	(value[]|"UNSET")
	"}";
	IntegerValueType ::= "{"
		"name:" varName[] ","
		"type:" "Integer,"
		"value:"	(value[]|"UNSET")
	"}" ;	
	QMM_OCL.Module ::= "module" (name[]|name['"','"','\\']) ";" (!0 metamodels*)? (!0 imports*)? (!0 elements*)?;
	QMM_OCL.Import ::= "import" (name[]|name['"','"','\\']) ";";
	@Foldable
	QMM_OCL.OclFeatureDefinition ::= context_? static["static" : ""] "def" ":" feature;
	QMM_OCL.OclContextDefinition ::= "context" context_;
	QMM_OCL.OclMetamodel ::= "metamodel" (name[]|name['"','"','\\']) (":" uri['\'','\'','\\'])? ";";
	QMM_OCL.OclInstanceModel ::= (name[]|name['"','"','\\']) ":" metamodel[];
	QMM_OCL.LocalVariable ::= varName[] (":" type)? eq[EQ] initExpression;
	QMM_OCL.Attribute ::= (name[]|name['"','"','\\']) ":" type eq[EQ] !1 initExpression ";";
	QMM_OCL.Operation ::= (name[]|name['"','"','\\']) "(" (parameters ("," parameters)*)? ")" ":" returnType eq[EQ] !1 body ";";
	QMM_OCL.Parameter ::= varName[] ":" type;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.OclModelElementExp ::= model[] "!" (name[]|name['"','"','\\']);

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.LambdaCallExp ::= referredVariable[] "(" (arguments ("," arguments)*)? ")";
	
	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.VariableExp ::= referredVariable[];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.SuperExp ::= "super";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.SelfExp ::= "self";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.EnvExp ::= "env";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.StringExp ::= stringSymbol['\'', '\'', '\\'];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.BooleanExp ::= booleanSymbol["true" : "false"];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.RealExp ::= realSymbol[FLOAT];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.IntegerExp ::= integerSymbol[INTEGER];
	
	QMM_OCL.CollectionRange ::= first ".." last;
	QMM_OCL.CollectionItem ::= item;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.BagExp ::= "Bag" "{" (parts ("," parts)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.OrderedSetExp ::= "OrderedSet" "{" (parts ("," parts)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.SequenceExp ::= "Sequence" "{" (parts ("," parts)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.SetExp ::= "Set" "{" (parts ("," parts)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.TupleExp ::= "Tuple" "{" (tuplePart ("," tuplePart)*)? "}";

	QMM_OCL.TuplePart ::= varName[] (":" type)? eq[EQ] initExpression;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.MapExp ::= "Map" "{" (elements ("," elements)*)? "}";

	QMM_OCL.MapElement ::= "(" key "," value ")";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.EnumLiteralExp ::= "#" (name[]|name['"','"','\\']);

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.OclUndefinedExp ::= "OclUndefined";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.LetExp ::= "let" variable "in" in_;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.IfExp ::= "if" condition "then" thenExpression "else" elseExpression "endif";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.BraceExp ::= "(" exp ")";

	@Operator(type="binary_left_associative", weight="1", superclass="OclExpression")
	QMM_OCL.OperatorCallExp ::= source operationName[BOOLOP] argument;

	@Operator(type="binary_left_associative", weight="2", superclass="OclExpression")
	QMM_OCL.EqOpCallExp ::= source (operationName[EQ]|operationName[NEQ]) argument;

	@Operator(type="binary_left_associative", weight="3", superclass="OclExpression")
	QMM_OCL.RelOpCallExp ::= source operationName[RELOP] argument;

	@Operator(type="binary_left_associative", weight="4", superclass="OclExpression")
	QMM_OCL.AddOpCallExp ::= source operationName[ADDOP] argument;

	@Operator(type="binary_left_associative", weight="5", superclass="OclExpression")
	QMM_OCL.IntOpCallExp ::= source operationName[INTOP] argument;

	@Operator(type="binary_left_associative", weight="6", superclass="OclExpression")
	QMM_OCL.MulOpCallExp ::= source operationName[MULOP] argument;

	@Operator(type="unary_prefix", weight="7", superclass="OclExpression")
	QMM_OCL.NotOpCallExp ::= operationName[NOTOP] source;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	QMM_OCL.StaticPropertyCallExp ::= source staticCall;
	
	QMM_OCL.StaticOperationCall ::= "::" (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";
	QMM_OCL.StaticNavigationOrAttributeCall ::= "::" (name[]|name['"','"','\\']);

	@Operator(type="unary_postfix", weight="10", superclass="OclExpression")
	QMM_OCL.PropertyCallExp ::= source calls+;

	QMM_OCL.OperationCall ::= "." (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";
	QMM_OCL.NavigationOrAttributeCall ::= "." (name[]|name['"','"','\\']);
	QMM_OCL.IterateExp ::= "->" "iterate" "(" iterators ("," iterators)* ";" result "|" body ")";
	QMM_OCL.IteratorExp ::= "->" (name[]|name['"','"','\\']) "(" iterators ("," iterators)* "|" body ")";
	QMM_OCL.Iterator ::= varName[] (":" type)?;
	QMM_OCL.CollectionOperationCall ::= "->" (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";

	QMM_OCL.CollectionType ::= name[COLLECTIONTYPE] "(" elementType ")";
	QMM_OCL.StringType ::= name[STRINGTYPE];
	QMM_OCL.BooleanType ::= name[BOOLEANTYPE];
	QMM_OCL.IntegerType ::= name[INTEGERTYPE];
	QMM_OCL.RealType ::= name[REALTYPE];
	QMM_OCL.BagType ::= name[BAGTYPE] "(" elementType ")";
	QMM_OCL.OrderedSetType ::= name[ORDEREDSETTYPE] "(" elementType ")";
	QMM_OCL.SequenceType ::= name[SEQUENCETYPE] "(" elementType ")";
	QMM_OCL.SetType ::= name[SETTYPE] "(" elementType ")";
	QMM_OCL.OclAnyType ::= name[OCLANYTYPE];
	QMM_OCL.OclType ::= name[OCLTYPE];
	QMM_OCL.TupleType ::= (name[TUPLETYPE]|name[TUPLE]) "(" (attributes ("," attributes)*)? ")";
	QMM_OCL.TupleTypeAttribute ::= (name[]|name['"','"','\\']) ":" type;
	QMM_OCL.OclModelElement ::= (model[]|model['"','"','\\']) "!" (name[]|name['"','"','\\']);
	QMM_OCL.MapType ::= name[MAPTYPE] "(" keyType "," valueType ")";
	QMM_OCL.LambdaType ::= name[LAMBDATYPE] "(" (argumentTypes ("," argumentTypes)*)? ")" ":" returnType;
	QMM_OCL.EnvType ::= name[ENVTYPE];
}