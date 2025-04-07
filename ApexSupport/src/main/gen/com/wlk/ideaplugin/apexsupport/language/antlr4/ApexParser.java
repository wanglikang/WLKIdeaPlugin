// Generated from /Users/bytedance/GithubProjects/WLKIdeaPlugin/ApexSupport/src/main/antlr/ApexParser.g4 by ANTLR 4.13.2
package com.wlk.ideaplugin.apexsupport.language.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ApexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, AFTER=2, BEFORE=3, BREAK=4, CATCH=5, CLASS=6, CONTINUE=7, 
		DELETE=8, DO=9, ELSE=10, ENUM=11, EXTENDS=12, FINAL=13, FINALLY=14, FOR=15, 
		GET=16, GLOBAL=17, IF=18, IMPLEMENTS=19, INHERITED=20, INSERT=21, INSTANCEOF=22, 
		INTERFACE=23, MERGE=24, NEW=25, NULL=26, ON=27, OVERRIDE=28, PRIVATE=29, 
		PROTECTED=30, PUBLIC=31, RETURN=32, SYSTEMRUNAS=33, SET=34, SHARING=35, 
		STATIC=36, SUPER=37, SWITCH=38, TESTMETHOD=39, THIS=40, THROW=41, TRANSIENT=42, 
		TRIGGER=43, TRY=44, UNDELETE=45, UPDATE=46, UPSERT=47, VIRTUAL=48, VOID=49, 
		WEBSERVICE=50, WHEN=51, WHILE=52, WITH=53, WITHOUT=54, LIST=55, MAP=56, 
		SYSTEM=57, USER=58, SELECT=59, COUNT=60, FROM=61, AS=62, USING=63, SCOPE=64, 
		WHERE=65, ORDER=66, BY=67, LIMIT=68, SOQLAND=69, SOQLOR=70, NOT=71, AVG=72, 
		COUNT_DISTINCT=73, MIN=74, MAX=75, SUM=76, TYPEOF=77, END=78, THEN=79, 
		LIKE=80, IN=81, INCLUDES=82, EXCLUDES=83, ASC=84, DESC=85, NULLS=86, FIRST=87, 
		LAST=88, GROUP=89, ALL=90, ROWS=91, VIEW=92, HAVING=93, ROLLUP=94, TOLABEL=95, 
		OFFSET=96, DATA=97, CATEGORY=98, AT=99, ABOVE=100, BELOW=101, ABOVE_OR_BELOW=102, 
		SECURITY_ENFORCED=103, SYSTEM_MODE=104, USER_MODE=105, REFERENCE=106, 
		CUBE=107, FORMAT=108, TRACKING=109, VIEWSTAT=110, CUSTOM=111, STANDARD=112, 
		DISTANCE=113, GEOLOCATION=114, GROUPING=115, CONVERT_CURRENCY=116, CALENDAR_MONTH=117, 
		CALENDAR_QUARTER=118, CALENDAR_YEAR=119, DAY_IN_MONTH=120, DAY_IN_WEEK=121, 
		DAY_IN_YEAR=122, DAY_ONLY=123, FISCAL_MONTH=124, FISCAL_QUARTER=125, FISCAL_YEAR=126, 
		HOUR_IN_DAY=127, WEEK_IN_MONTH=128, WEEK_IN_YEAR=129, CONVERT_TIMEZONE=130, 
		YESTERDAY=131, TODAY=132, TOMORROW=133, LAST_WEEK=134, THIS_WEEK=135, 
		NEXT_WEEK=136, LAST_MONTH=137, THIS_MONTH=138, NEXT_MONTH=139, LAST_90_DAYS=140, 
		NEXT_90_DAYS=141, LAST_N_DAYS_N=142, NEXT_N_DAYS_N=143, N_DAYS_AGO_N=144, 
		NEXT_N_WEEKS_N=145, LAST_N_WEEKS_N=146, N_WEEKS_AGO_N=147, NEXT_N_MONTHS_N=148, 
		LAST_N_MONTHS_N=149, N_MONTHS_AGO_N=150, THIS_QUARTER=151, LAST_QUARTER=152, 
		NEXT_QUARTER=153, NEXT_N_QUARTERS_N=154, LAST_N_QUARTERS_N=155, N_QUARTERS_AGO_N=156, 
		THIS_YEAR=157, LAST_YEAR=158, NEXT_YEAR=159, NEXT_N_YEARS_N=160, LAST_N_YEARS_N=161, 
		N_YEARS_AGO_N=162, THIS_FISCAL_QUARTER=163, LAST_FISCAL_QUARTER=164, NEXT_FISCAL_QUARTER=165, 
		NEXT_N_FISCAL_QUARTERS_N=166, LAST_N_FISCAL_QUARTERS_N=167, N_FISCAL_QUARTERS_AGO_N=168, 
		THIS_FISCAL_YEAR=169, LAST_FISCAL_YEAR=170, NEXT_FISCAL_YEAR=171, NEXT_N_FISCAL_YEARS_N=172, 
		LAST_N_FISCAL_YEARS_N=173, N_FISCAL_YEARS_AGO_N=174, DateLiteral=175, 
		TimeLiteral=176, DateTimeLiteral=177, IntegralCurrencyLiteral=178, FIND=179, 
		EMAIL=180, NAME=181, PHONE=182, SIDEBAR=183, FIELDS=184, METADATA=185, 
		PRICEBOOKID=186, NETWORK=187, SNIPPET=188, TARGET_LENGTH=189, DIVISION=190, 
		RETURNING=191, LISTVIEW=192, FindLiteral=193, FindLiteralAlt=194, IntegerLiteral=195, 
		LongLiteral=196, NumberLiteral=197, BooleanLiteral=198, StringLiteral=199, 
		NullLiteral=200, LPAREN=201, RPAREN=202, LBRACE=203, RBRACE=204, LBRACK=205, 
		RBRACK=206, SEMI=207, COMMA=208, DOT=209, ASSIGN=210, GT=211, LT=212, 
		BANG=213, TILDE=214, QUESTIONDOT=215, QUESTION=216, COLON=217, EQUAL=218, 
		TRIPLEEQUAL=219, NOTEQUAL=220, LESSANDGREATER=221, TRIPLENOTEQUAL=222, 
		AND=223, OR=224, COAL=225, INC=226, DEC=227, ADD=228, SUB=229, MUL=230, 
		DIV=231, BITAND=232, BITOR=233, CARET=234, MAPTO=235, ADD_ASSIGN=236, 
		SUB_ASSIGN=237, MUL_ASSIGN=238, DIV_ASSIGN=239, AND_ASSIGN=240, OR_ASSIGN=241, 
		XOR_ASSIGN=242, LSHIFT_ASSIGN=243, RSHIFT_ASSIGN=244, URSHIFT_ASSIGN=245, 
		ATSIGN=246, Identifier=247, WS=248, DOC_COMMENT=249, COMMENT=250, LINE_COMMENT=251;
	public static final int
		RULE_apexFile = 0, RULE_triggerUnit = 1, RULE_triggerCase = 2, RULE_triggerBlock = 3, 
		RULE_triggerBlockMember = 4, RULE_classUnit = 5, RULE_typeDeclaration = 6, 
		RULE_classDeclaration = 7, RULE_enumDeclaration = 8, RULE_enumConstants = 9, 
		RULE_interfaceDeclaration = 10, RULE_typeList = 11, RULE_classBody = 12, 
		RULE_interfaceBody = 13, RULE_classBodyDeclaration = 14, RULE_modifier = 15, 
		RULE_memberDeclaration = 16, RULE_triggerMemberDeclaration = 17, RULE_methodDeclaration = 18, 
		RULE_constructorDeclaration = 19, RULE_fieldDeclaration = 20, RULE_propertyDeclaration = 21, 
		RULE_interfaceMethodDeclaration = 22, RULE_variableDeclarators = 23, RULE_variableDeclarator = 24, 
		RULE_arrayInitializer = 25, RULE_typeRef = 26, RULE_arraySubscripts = 27, 
		RULE_typeName = 28, RULE_typeArguments = 29, RULE_formalParameters = 30, 
		RULE_formalParameterList = 31, RULE_formalParameter = 32, RULE_qualifiedName = 33, 
		RULE_literal = 34, RULE_annotation = 35, RULE_elementValuePairs = 36, 
		RULE_elementValuePair = 37, RULE_elementValue = 38, RULE_elementValueArrayInitializer = 39, 
		RULE_block = 40, RULE_localVariableDeclarationStatement = 41, RULE_localVariableDeclaration = 42, 
		RULE_statement = 43, RULE_ifStatement = 44, RULE_switchStatement = 45, 
		RULE_whenControl = 46, RULE_whenValue = 47, RULE_whenLiteral = 48, RULE_forStatement = 49, 
		RULE_whileStatement = 50, RULE_doWhileStatement = 51, RULE_tryStatement = 52, 
		RULE_returnStatement = 53, RULE_throwStatement = 54, RULE_breakStatement = 55, 
		RULE_continueStatement = 56, RULE_accessLevel = 57, RULE_insertStatement = 58, 
		RULE_updateStatement = 59, RULE_deleteStatement = 60, RULE_undeleteStatement = 61, 
		RULE_upsertStatement = 62, RULE_mergeStatement = 63, RULE_runAsStatement = 64, 
		RULE_expressionStatement = 65, RULE_propertyBlock = 66, RULE_getter = 67, 
		RULE_setter = 68, RULE_catchClause = 69, RULE_finallyBlock = 70, RULE_forControl = 71, 
		RULE_forInit = 72, RULE_enhancedForControl = 73, RULE_forUpdate = 74, 
		RULE_parExpression = 75, RULE_expressionList = 76, RULE_expression = 77, 
		RULE_primary = 78, RULE_methodCall = 79, RULE_dotMethodCall = 80, RULE_creator = 81, 
		RULE_createdName = 82, RULE_idCreatedNamePair = 83, RULE_noRest = 84, 
		RULE_classCreatorRest = 85, RULE_arrayCreatorRest = 86, RULE_mapCreatorRest = 87, 
		RULE_mapCreatorRestPair = 88, RULE_setCreatorRest = 89, RULE_arguments = 90, 
		RULE_soqlLiteral = 91, RULE_query = 92, RULE_subQuery = 93, RULE_selectList = 94, 
		RULE_selectEntry = 95, RULE_fieldName = 96, RULE_fromNameList = 97, RULE_subFieldList = 98, 
		RULE_subFieldEntry = 99, RULE_soqlFieldsParameter = 100, RULE_soqlFunction = 101, 
		RULE_dateFieldName = 102, RULE_locationValue = 103, RULE_coordinateValue = 104, 
		RULE_typeOf = 105, RULE_whenClause = 106, RULE_elseClause = 107, RULE_fieldNameList = 108, 
		RULE_usingScope = 109, RULE_whereClause = 110, RULE_logicalExpression = 111, 
		RULE_conditionalExpression = 112, RULE_fieldExpression = 113, RULE_comparisonOperator = 114, 
		RULE_value = 115, RULE_valueList = 116, RULE_signedNumber = 117, RULE_withClause = 118, 
		RULE_filteringExpression = 119, RULE_dataCategorySelection = 120, RULE_dataCategoryName = 121, 
		RULE_filteringSelector = 122, RULE_groupByClause = 123, RULE_orderByClause = 124, 
		RULE_fieldOrderList = 125, RULE_fieldOrder = 126, RULE_limitClause = 127, 
		RULE_offsetClause = 128, RULE_allRowsClause = 129, RULE_forClauses = 130, 
		RULE_boundExpression = 131, RULE_dateFormula = 132, RULE_signedInteger = 133, 
		RULE_soqlId = 134, RULE_soslLiteral = 135, RULE_soslLiteralAlt = 136, 
		RULE_soslClauses = 137, RULE_soslWithClause = 138, RULE_searchGroup = 139, 
		RULE_fieldSpecList = 140, RULE_fieldSpec = 141, RULE_fieldList = 142, 
		RULE_updateList = 143, RULE_updateType = 144, RULE_networkList = 145, 
		RULE_soslId = 146, RULE_id = 147, RULE_anyId = 148;
	private static String[] makeRuleNames() {
		return new String[] {
			"apexFile", "triggerUnit", "triggerCase", "triggerBlock", "triggerBlockMember", 
			"classUnit", "typeDeclaration", "classDeclaration", "enumDeclaration", 
			"enumConstants", "interfaceDeclaration", "typeList", "classBody", "interfaceBody", 
			"classBodyDeclaration", "modifier", "memberDeclaration", "triggerMemberDeclaration", 
			"methodDeclaration", "constructorDeclaration", "fieldDeclaration", "propertyDeclaration", 
			"interfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
			"arrayInitializer", "typeRef", "arraySubscripts", "typeName", "typeArguments", 
			"formalParameters", "formalParameterList", "formalParameter", "qualifiedName", 
			"literal", "annotation", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "block", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "statement", "ifStatement", "switchStatement", 
			"whenControl", "whenValue", "whenLiteral", "forStatement", "whileStatement", 
			"doWhileStatement", "tryStatement", "returnStatement", "throwStatement", 
			"breakStatement", "continueStatement", "accessLevel", "insertStatement", 
			"updateStatement", "deleteStatement", "undeleteStatement", "upsertStatement", 
			"mergeStatement", "runAsStatement", "expressionStatement", "propertyBlock", 
			"getter", "setter", "catchClause", "finallyBlock", "forControl", "forInit", 
			"enhancedForControl", "forUpdate", "parExpression", "expressionList", 
			"expression", "primary", "methodCall", "dotMethodCall", "creator", "createdName", 
			"idCreatedNamePair", "noRest", "classCreatorRest", "arrayCreatorRest", 
			"mapCreatorRest", "mapCreatorRestPair", "setCreatorRest", "arguments", 
			"soqlLiteral", "query", "subQuery", "selectList", "selectEntry", "fieldName", 
			"fromNameList", "subFieldList", "subFieldEntry", "soqlFieldsParameter", 
			"soqlFunction", "dateFieldName", "locationValue", "coordinateValue", 
			"typeOf", "whenClause", "elseClause", "fieldNameList", "usingScope", 
			"whereClause", "logicalExpression", "conditionalExpression", "fieldExpression", 
			"comparisonOperator", "value", "valueList", "signedNumber", "withClause", 
			"filteringExpression", "dataCategorySelection", "dataCategoryName", "filteringSelector", 
			"groupByClause", "orderByClause", "fieldOrderList", "fieldOrder", "limitClause", 
			"offsetClause", "allRowsClause", "forClauses", "boundExpression", "dateFormula", 
			"signedInteger", "soqlId", "soslLiteral", "soslLiteralAlt", "soslClauses", 
			"soslWithClause", "searchGroup", "fieldSpecList", "fieldSpec", "fieldList", 
			"updateList", "updateType", "networkList", "soslId", "id", "anyId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'calendar_month'", 
			"'calendar_quarter'", "'calendar_year'", "'day_in_month'", "'day_in_week'", 
			"'day_in_year'", "'day_only'", "'fiscal_month'", "'fiscal_quarter'", 
			"'fiscal_year'", "'hour_in_day'", "'week_in_month'", "'week_in_year'", 
			"'converttimezone'", "'yesterday'", "'today'", "'tomorrow'", "'last_week'", 
			"'this_week'", "'next_week'", "'last_month'", "'this_month'", "'next_month'", 
			"'last_90_days'", "'next_90_days'", "'last_n_days'", "'next_n_days'", 
			"'n_days_ago'", "'next_n_weeks'", "'last_n_weeks'", "'n_weeks_ago'", 
			"'next_n_months'", "'last_n_months'", "'n_months_ago'", "'this_quarter'", 
			"'last_quarter'", "'next_quarter'", "'next_n_quarters'", "'last_n_quarters'", 
			"'n_quarters_ago'", "'this_year'", "'last_year'", "'next_year'", "'next_n_years'", 
			"'last_n_years'", "'n_years_ago'", "'this_fiscal_quarter'", "'last_fiscal_quarter'", 
			"'next_fiscal_quarter'", "'next_n_fiscal_quarters'", "'last_n_fiscal_quarters'", 
			"'n_fiscal_quarters_ago'", "'this_fiscal_year'", "'last_fiscal_year'", 
			"'next_fiscal_year'", "'next_n_fiscal_years'", "'last_n_fiscal_years'", 
			"'n_fiscal_years_ago'", null, null, null, null, "'find'", "'email'", 
			"'name'", "'phone'", "'sidebar'", "'fields'", "'metadata'", "'pricebookid'", 
			"'network'", "'snippet'", "'target_length'", "'division'", "'returning'", 
			"'listview'", null, null, null, null, null, null, null, null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?.'", "'?'", "':'", "'=='", "'==='", "'!='", "'<>'", 
			"'!=='", "'&&'", "'||'", "'??'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'=>'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "AFTER", "BEFORE", "BREAK", "CATCH", "CLASS", "CONTINUE", 
			"DELETE", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FOR", 
			"GET", "GLOBAL", "IF", "IMPLEMENTS", "INHERITED", "INSERT", "INSTANCEOF", 
			"INTERFACE", "MERGE", "NEW", "NULL", "ON", "OVERRIDE", "PRIVATE", "PROTECTED", 
			"PUBLIC", "RETURN", "SYSTEMRUNAS", "SET", "SHARING", "STATIC", "SUPER", 
			"SWITCH", "TESTMETHOD", "THIS", "THROW", "TRANSIENT", "TRIGGER", "TRY", 
			"UNDELETE", "UPDATE", "UPSERT", "VIRTUAL", "VOID", "WEBSERVICE", "WHEN", 
			"WHILE", "WITH", "WITHOUT", "LIST", "MAP", "SYSTEM", "USER", "SELECT", 
			"COUNT", "FROM", "AS", "USING", "SCOPE", "WHERE", "ORDER", "BY", "LIMIT", 
			"SOQLAND", "SOQLOR", "NOT", "AVG", "COUNT_DISTINCT", "MIN", "MAX", "SUM", 
			"TYPEOF", "END", "THEN", "LIKE", "IN", "INCLUDES", "EXCLUDES", "ASC", 
			"DESC", "NULLS", "FIRST", "LAST", "GROUP", "ALL", "ROWS", "VIEW", "HAVING", 
			"ROLLUP", "TOLABEL", "OFFSET", "DATA", "CATEGORY", "AT", "ABOVE", "BELOW", 
			"ABOVE_OR_BELOW", "SECURITY_ENFORCED", "SYSTEM_MODE", "USER_MODE", "REFERENCE", 
			"CUBE", "FORMAT", "TRACKING", "VIEWSTAT", "CUSTOM", "STANDARD", "DISTANCE", 
			"GEOLOCATION", "GROUPING", "CONVERT_CURRENCY", "CALENDAR_MONTH", "CALENDAR_QUARTER", 
			"CALENDAR_YEAR", "DAY_IN_MONTH", "DAY_IN_WEEK", "DAY_IN_YEAR", "DAY_ONLY", 
			"FISCAL_MONTH", "FISCAL_QUARTER", "FISCAL_YEAR", "HOUR_IN_DAY", "WEEK_IN_MONTH", 
			"WEEK_IN_YEAR", "CONVERT_TIMEZONE", "YESTERDAY", "TODAY", "TOMORROW", 
			"LAST_WEEK", "THIS_WEEK", "NEXT_WEEK", "LAST_MONTH", "THIS_MONTH", "NEXT_MONTH", 
			"LAST_90_DAYS", "NEXT_90_DAYS", "LAST_N_DAYS_N", "NEXT_N_DAYS_N", "N_DAYS_AGO_N", 
			"NEXT_N_WEEKS_N", "LAST_N_WEEKS_N", "N_WEEKS_AGO_N", "NEXT_N_MONTHS_N", 
			"LAST_N_MONTHS_N", "N_MONTHS_AGO_N", "THIS_QUARTER", "LAST_QUARTER", 
			"NEXT_QUARTER", "NEXT_N_QUARTERS_N", "LAST_N_QUARTERS_N", "N_QUARTERS_AGO_N", 
			"THIS_YEAR", "LAST_YEAR", "NEXT_YEAR", "NEXT_N_YEARS_N", "LAST_N_YEARS_N", 
			"N_YEARS_AGO_N", "THIS_FISCAL_QUARTER", "LAST_FISCAL_QUARTER", "NEXT_FISCAL_QUARTER", 
			"NEXT_N_FISCAL_QUARTERS_N", "LAST_N_FISCAL_QUARTERS_N", "N_FISCAL_QUARTERS_AGO_N", 
			"THIS_FISCAL_YEAR", "LAST_FISCAL_YEAR", "NEXT_FISCAL_YEAR", "NEXT_N_FISCAL_YEARS_N", 
			"LAST_N_FISCAL_YEARS_N", "N_FISCAL_YEARS_AGO_N", "DateLiteral", "TimeLiteral", 
			"DateTimeLiteral", "IntegralCurrencyLiteral", "FIND", "EMAIL", "NAME", 
			"PHONE", "SIDEBAR", "FIELDS", "METADATA", "PRICEBOOKID", "NETWORK", "SNIPPET", 
			"TARGET_LENGTH", "DIVISION", "RETURNING", "LISTVIEW", "FindLiteral", 
			"FindLiteralAlt", "IntegerLiteral", "LongLiteral", "NumberLiteral", "BooleanLiteral", 
			"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTIONDOT", "QUESTION", "COLON", "EQUAL", "TRIPLEEQUAL", 
			"NOTEQUAL", "LESSANDGREATER", "TRIPLENOTEQUAL", "AND", "OR", "COAL", 
			"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MAPTO", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"ATSIGN", "Identifier", "WS", "DOC_COMMENT", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ApexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public void clearCache() {_interp.clearDFA();}

	public ApexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApexFileContext extends ParserRuleContext {
		public TriggerUnitContext triggerUnit() {
			return getRuleContext(TriggerUnitContext.class,0);
		}
		public ClassUnitContext classUnit() {
			return getRuleContext(ClassUnitContext.class,0);
		}
		public ApexFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apexFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterApexFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitApexFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitApexFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApexFileContext apexFile() throws RecognitionException {
		ApexFileContext _localctx = new ApexFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_apexFile);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				triggerUnit();
				}
				break;
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case GLOBAL:
			case INHERITED:
			case INTERFACE:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case TESTMETHOD:
			case TRANSIENT:
			case VIRTUAL:
			case WEBSERVICE:
			case WITH:
			case WITHOUT:
			case ATSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				classUnit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerUnitContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(ApexParser.TRIGGER, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ON() { return getToken(ApexParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public List<TriggerCaseContext> triggerCase() {
			return getRuleContexts(TriggerCaseContext.class);
		}
		public TriggerCaseContext triggerCase(int i) {
			return getRuleContext(TriggerCaseContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TriggerBlockContext triggerBlock() {
			return getRuleContext(TriggerBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ApexParser.EOF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public TriggerUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTriggerUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTriggerUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTriggerUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerUnitContext triggerUnit() throws RecognitionException {
		TriggerUnitContext _localctx = new TriggerUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_triggerUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(TRIGGER);
			setState(303);
			id();
			setState(304);
			match(ON);
			setState(305);
			id();
			setState(306);
			match(LPAREN);
			setState(307);
			triggerCase();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				triggerCase();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(RPAREN);
			setState(316);
			triggerBlock();
			setState(317);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerCaseContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(ApexParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ApexParser.AFTER, 0); }
		public TerminalNode INSERT() { return getToken(ApexParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(ApexParser.DELETE, 0); }
		public TerminalNode UNDELETE() { return getToken(ApexParser.UNDELETE, 0); }
		public TriggerCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTriggerCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTriggerCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTriggerCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerCaseContext triggerCase() throws RecognitionException {
		TriggerCaseContext _localctx = new TriggerCaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_triggerCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==AFTER || _la==BEFORE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553118363904L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<TriggerBlockMemberContext> triggerBlockMember() {
			return getRuleContexts(TriggerBlockMemberContext.class);
		}
		public TriggerBlockMemberContext triggerBlockMember(int i) {
			return getRuleContext(TriggerBlockMemberContext.class,i);
		}
		public TriggerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTriggerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTriggerBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTriggerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerBlockContext triggerBlock() throws RecognitionException {
		TriggerBlockContext _localctx = new TriggerBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_triggerBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LBRACE);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -134763554L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043453232786171L) != 0)) {
				{
				{
				setState(323);
				triggerBlockMember();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerBlockMemberContext extends ParserRuleContext {
		public TriggerMemberDeclarationContext triggerMemberDeclaration() {
			return getRuleContext(TriggerMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TriggerBlockMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerBlockMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTriggerBlockMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTriggerBlockMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTriggerBlockMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerBlockMemberContext triggerBlockMember() throws RecognitionException {
		TriggerBlockMemberContext _localctx = new TriggerBlockMemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_triggerBlockMember);
		try {
			int _alt;
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						modifier();
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(337);
				triggerMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ApexParser.EOF, 0); }
		public ClassUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterClassUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitClassUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitClassUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassUnitContext classUnit() throws RecognitionException {
		ClassUnitContext _localctx = new ClassUnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			typeDeclaration();
			setState(342);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeDeclaration);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28433993197297666L) != 0) || _la==ATSIGN) {
					{
					{
					setState(344);
					modifier();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28433993197297666L) != 0) || _la==ATSIGN) {
					{
					{
					setState(351);
					modifier();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28433993197297666L) != 0) || _la==ATSIGN) {
					{
					{
					setState(358);
					modifier();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ApexParser.CLASS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ApexParser.EXTENDS, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ApexParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(CLASS);
			setState(368);
			id();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(369);
				match(EXTENDS);
				setState(370);
				typeRef();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(373);
				match(IMPLEMENTS);
				setState(374);
				typeList();
				}
			}

			setState(377);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ApexParser.ENUM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ENUM);
			setState(380);
			id();
			setState(381);
			match(LBRACE);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114828269935591412L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || _la==LISTVIEW || _la==Identifier) {
				{
				setState(382);
				enumConstants();
				}
			}

			setState(385);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			id();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				id();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ApexParser.INTERFACE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ApexParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(INTERFACE);
			setState(396);
			id();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(397);
				match(EXTENDS);
				setState(398);
				typeList();
				}
			}

			setState(401);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			typeRef();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(404);
				match(COMMA);
				setState(405);
				typeRef();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(LBRACE);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4770931531372466L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043195528480769L) != 0)) {
				{
				{
				setState(412);
				classBodyDeclaration();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<InterfaceMethodDeclarationContext> interfaceMethodDeclaration() {
			return getRuleContexts(InterfaceMethodDeclarationContext.class);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration(int i) {
			return getRuleContext(InterfaceMethodDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LBRACE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4770931539763186L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043195528445953L) != 0)) {
				{
				{
				setState(421);
				interfaceMethodDeclaration();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ApexParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(430);
					match(STATIC);
					}
				}

				setState(433);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						modifier();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(440);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ApexParser.GLOBAL, 0); }
		public TerminalNode PUBLIC() { return getToken(ApexParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ApexParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ApexParser.PRIVATE, 0); }
		public TerminalNode TRANSIENT() { return getToken(ApexParser.TRANSIENT, 0); }
		public TerminalNode STATIC() { return getToken(ApexParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ApexParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ApexParser.FINAL, 0); }
		public TerminalNode WEBSERVICE() { return getToken(ApexParser.WEBSERVICE, 0); }
		public TerminalNode OVERRIDE() { return getToken(ApexParser.OVERRIDE, 0); }
		public TerminalNode VIRTUAL() { return getToken(ApexParser.VIRTUAL, 0); }
		public TerminalNode TESTMETHOD() { return getToken(ApexParser.TESTMETHOD, 0); }
		public TerminalNode WITH() { return getToken(ApexParser.WITH, 0); }
		public TerminalNode SHARING() { return getToken(ApexParser.SHARING, 0); }
		public TerminalNode WITHOUT() { return getToken(ApexParser.WITHOUT, 0); }
		public TerminalNode INHERITED() { return getToken(ApexParser.INHERITED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifier);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				annotation();
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(GLOBAL);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				match(PRIVATE);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(TRANSIENT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				match(FINAL);
				}
				break;
			case WEBSERVICE:
				enterOuterAlt(_localctx, 10);
				{
				setState(452);
				match(WEBSERVICE);
				}
				break;
			case OVERRIDE:
				enterOuterAlt(_localctx, 11);
				{
				setState(453);
				match(OVERRIDE);
				}
				break;
			case VIRTUAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(454);
				match(VIRTUAL);
				}
				break;
			case TESTMETHOD:
				enterOuterAlt(_localctx, 13);
				{
				setState(455);
				match(TESTMETHOD);
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 14);
				{
				setState(456);
				match(WITH);
				setState(457);
				match(SHARING);
				}
				break;
			case WITHOUT:
				enterOuterAlt(_localctx, 15);
				{
				setState(458);
				match(WITHOUT);
				setState(459);
				match(SHARING);
				}
				break;
			case INHERITED:
				enterOuterAlt(_localctx, 16);
				{
				setState(460);
				match(INHERITED);
				setState(461);
				match(SHARING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_memberDeclaration);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(469);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(470);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TriggerMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTriggerMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTriggerMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTriggerMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerMemberDeclarationContext triggerMemberDeclaration() throws RecognitionException {
		TriggerMemberDeclarationContext _localctx = new TriggerMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_triggerMemberDeclaration);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				enumDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ApexParser.VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case SET:
			case SHARING:
			case SWITCH:
			case TRANSIENT:
			case TRIGGER:
			case WHEN:
			case WITH:
			case WITHOUT:
			case LIST:
			case MAP:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case Identifier:
				{
				setState(481);
				typeRef();
				}
				break;
			case VOID:
				{
				setState(482);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(485);
			id();
			setState(486);
			formalParameters();
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(487);
				block();
				}
				break;
			case SEMI:
				{
				setState(488);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			qualifiedName();
			setState(492);
			formalParameters();
			setState(493);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			typeRef();
			setState(496);
			variableDeclarators();
			setState(497);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<PropertyBlockContext> propertyBlock() {
			return getRuleContexts(PropertyBlockContext.class);
		}
		public PropertyBlockContext propertyBlock(int i) {
			return getRuleContext(PropertyBlockContext.class,i);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			typeRef();
			setState(500);
			id();
			setState(501);
			match(LBRACE);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28434010377232386L) != 0) || _la==ATSIGN) {
				{
				{
				setState(502);
				propertyBlock();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ApexParser.VOID, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					modifier();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case SET:
			case SHARING:
			case SWITCH:
			case TRANSIENT:
			case TRIGGER:
			case WHEN:
			case WITH:
			case WITHOUT:
			case LIST:
			case MAP:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case Identifier:
				{
				setState(516);
				typeRef();
				}
				break;
			case VOID:
				{
				setState(517);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(520);
			id();
			setState(521);
			formalParameters();
			setState(522);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			variableDeclarator();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(525);
				match(COMMA);
				setState(526);
				variableDeclarator();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			id();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(533);
				match(ASSIGN);
				setState(534);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(LBRACE);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
				{
				setState(538);
				expression(0);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						match(COMMA);
						setState(540);
						expression(0);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(546);
					match(COMMA);
					}
				}

				}
			}

			setState(551);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeRefContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public ArraySubscriptsContext arraySubscripts() {
			return getRuleContext(ArraySubscriptsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ApexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ApexParser.DOT, i);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			typeName();
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(554);
					match(DOT);
					setState(555);
					typeName();
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(561);
			arraySubscripts();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySubscriptsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(ApexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ApexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ApexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ApexParser.RBRACK, i);
		}
		public ArraySubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySubscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArraySubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArraySubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArraySubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySubscriptsContext arraySubscripts() throws RecognitionException {
		ArraySubscriptsContext _localctx = new ArraySubscriptsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arraySubscripts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(LBRACK);
					setState(564);
					match(RBRACK);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ApexParser.LIST, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode SET() { return getToken(ApexParser.SET, 0); }
		public TerminalNode MAP() { return getToken(ApexParser.MAP, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeName);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(LIST);
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(571);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(SET);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(575);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(MAP);
				setState(580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(579);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				id();
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(583);
					typeArguments();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ApexParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ApexParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LT);
			setState(589);
			typeList();
			setState(590);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LPAREN);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5333881493184498L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043195528445953L) != 0)) {
				{
				setState(593);
				formalParameterList();
				}
			}

			setState(596);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			formalParameter();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(599);
				match(COMMA);
				setState(600);
				formalParameter();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					modifier();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(612);
			typeRef();
			setState(613);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ApexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ApexParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			id();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(616);
				match(DOT);
				setState(617);
				id();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(ApexParser.LongLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(ApexParser.NumberLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ApexParser.BooleanLiteral, 0); }
		public TerminalNode NULL() { return getToken(ApexParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ATSIGN() { return getToken(ApexParser.ATSIGN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(ATSIGN);
			setState(626);
			qualifiedName();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(627);
				match(LPAREN);
				setState(630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(628);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(629);
					elementValue();
					}
					break;
				}
				setState(632);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			elementValuePair();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114828269935591412L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36028797019029505L) != 0)) {
				{
				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(636);
					match(COMMA);
					}
				}

				setState(639);
				elementValuePair();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			id();
			setState(646);
			match(ASSIGN);
			setState(647);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elementValue);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case NEW:
			case NULL:
			case SET:
			case SHARING:
			case SUPER:
			case SWITCH:
			case THIS:
			case TRANSIENT:
			case TRIGGER:
			case VOID:
			case WHEN:
			case WITH:
			case WITHOUT:
			case LIST:
			case MAP:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case FindLiteral:
			case IntegerLiteral:
			case LongLiteral:
			case NumberLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case LPAREN:
			case LBRACK:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				expression(0);
				}
				break;
			case ATSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(LBRACE);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043453232786171L) != 0)) {
				{
				setState(655);
				elementValue();
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(COMMA);
						setState(657);
						elementValue();
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
			}

			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(665);
				match(COMMA);
				}
			}

			setState(668);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(LBRACE);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -143154274L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043453232786171L) != 0)) {
				{
				{
				setState(671);
				statement();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			localVariableDeclaration();
			setState(680);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					modifier();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(688);
			typeRef();
			setState(689);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public UndeleteStatementContext undeleteStatement() {
			return getRuleContext(UndeleteStatementContext.class,0);
		}
		public UpsertStatementContext upsertStatement() {
			return getRuleContext(UpsertStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public RunAsStatementContext runAsStatement() {
			return getRuleContext(RunAsStatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				switchStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(695);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(696);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(697);
				tryStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(698);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(699);
				throwStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(700);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(701);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(702);
				insertStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(703);
				updateStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(704);
				deleteStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(705);
				undeleteStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(706);
				upsertStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(707);
				mergeStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(708);
				runAsStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(709);
				localVariableDeclarationStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(710);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ApexParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ApexParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(IF);
			setState(714);
			parExpression();
			setState(715);
			statement();
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(716);
				match(ELSE);
				setState(717);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ApexParser.SWITCH, 0); }
		public TerminalNode ON() { return getToken(ApexParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<WhenControlContext> whenControl() {
			return getRuleContexts(WhenControlContext.class);
		}
		public WhenControlContext whenControl(int i) {
			return getRuleContext(WhenControlContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(SWITCH);
			setState(721);
			match(ON);
			setState(722);
			expression(0);
			setState(723);
			match(LBRACE);
			setState(725); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(724);
				whenControl();
				}
				}
				setState(727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(729);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenControlContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(ApexParser.WHEN, 0); }
		public WhenValueContext whenValue() {
			return getRuleContext(WhenValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhenControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhenControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhenControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhenControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenControlContext whenControl() throws RecognitionException {
		WhenControlContext _localctx = new WhenControlContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_whenControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(WHEN);
			setState(732);
			whenValue();
			setState(733);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenValueContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ApexParser.ELSE, 0); }
		public List<WhenLiteralContext> whenLiteral() {
			return getRuleContexts(WhenLiteralContext.class);
		}
		public WhenLiteralContext whenLiteral(int i) {
			return getRuleContext(WhenLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public WhenValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhenValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhenValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhenValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenValueContext whenValue() throws RecognitionException {
		WhenValueContext _localctx = new WhenValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whenValue);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(ELSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				whenLiteral();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(737);
					match(COMMA);
					setState(738);
					whenLiteral();
					}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				typeRef();
				setState(745);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public List<TerminalNode> SUB() { return getTokens(ApexParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ApexParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(ApexParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ApexParser.ADD, i);
		}
		public TerminalNode LongLiteral() { return getToken(ApexParser.LongLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode NULL() { return getToken(ApexParser.NULL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public WhenLiteralContext whenLiteral() {
			return getRuleContext(WhenLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public WhenLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhenLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhenLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhenLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenLiteralContext whenLiteral() throws RecognitionException {
		WhenLiteralContext _localctx = new WhenLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whenLiteral);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(749);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(755);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(756);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
				match(LongLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				id();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				match(LPAREN);
				setState(767);
				whenLiteral();
				setState(768);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ApexParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(FOR);
			setState(773);
			match(LPAREN);
			setState(774);
			forControl();
			setState(775);
			match(RPAREN);
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AFTER:
			case BEFORE:
			case BREAK:
			case CONTINUE:
			case DELETE:
			case DO:
			case FINAL:
			case FOR:
			case GET:
			case GLOBAL:
			case IF:
			case INHERITED:
			case INSERT:
			case INSTANCEOF:
			case MERGE:
			case NEW:
			case NULL:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case RETURN:
			case SYSTEMRUNAS:
			case SET:
			case SHARING:
			case STATIC:
			case SUPER:
			case SWITCH:
			case TESTMETHOD:
			case THIS:
			case THROW:
			case TRANSIENT:
			case TRIGGER:
			case TRY:
			case UNDELETE:
			case UPDATE:
			case UPSERT:
			case VIRTUAL:
			case VOID:
			case WEBSERVICE:
			case WHEN:
			case WHILE:
			case WITH:
			case WITHOUT:
			case LIST:
			case MAP:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case FindLiteral:
			case IntegerLiteral:
			case LongLiteral:
			case NumberLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case ATSIGN:
			case Identifier:
				{
				setState(776);
				statement();
				}
				break;
			case SEMI:
				{
				setState(777);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ApexParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(WHILE);
			setState(781);
			parExpression();
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AFTER:
			case BEFORE:
			case BREAK:
			case CONTINUE:
			case DELETE:
			case DO:
			case FINAL:
			case FOR:
			case GET:
			case GLOBAL:
			case IF:
			case INHERITED:
			case INSERT:
			case INSTANCEOF:
			case MERGE:
			case NEW:
			case NULL:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case RETURN:
			case SYSTEMRUNAS:
			case SET:
			case SHARING:
			case STATIC:
			case SUPER:
			case SWITCH:
			case TESTMETHOD:
			case THIS:
			case THROW:
			case TRANSIENT:
			case TRIGGER:
			case TRY:
			case UNDELETE:
			case UPDATE:
			case UPSERT:
			case VIRTUAL:
			case VOID:
			case WEBSERVICE:
			case WHEN:
			case WHILE:
			case WITH:
			case WITHOUT:
			case LIST:
			case MAP:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case FindLiteral:
			case IntegerLiteral:
			case LongLiteral:
			case NumberLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case ATSIGN:
			case Identifier:
				{
				setState(782);
				statement();
				}
				break;
			case SEMI:
				{
				setState(783);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ApexParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ApexParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(DO);
			setState(787);
			block();
			setState(788);
			match(WHILE);
			setState(789);
			parExpression();
			setState(790);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(ApexParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(TRY);
			setState(793);
			block();
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(795); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(794);
					catchClause();
					}
					}
					setState(797); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(799);
					finallyBlock();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(802);
				finallyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ApexParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(RETURN);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
				{
				setState(806);
				expression(0);
				}
			}

			setState(809);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ApexParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(THROW);
			setState(812);
			expression(0);
			setState(813);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ApexParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(BREAK);
			setState(816);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(ApexParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(CONTINUE);
			setState(819);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessLevelContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ApexParser.AS, 0); }
		public TerminalNode SYSTEM() { return getToken(ApexParser.SYSTEM, 0); }
		public TerminalNode USER() { return getToken(ApexParser.USER, 0); }
		public AccessLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterAccessLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitAccessLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitAccessLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessLevelContext accessLevel() throws RecognitionException {
		AccessLevelContext _localctx = new AccessLevelContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_accessLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(AS);
			setState(822);
			_la = _input.LA(1);
			if ( !(_la==SYSTEM || _la==USER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ApexParser.INSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(INSERT);
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(825);
				accessLevel();
				}
				break;
			}
			setState(828);
			expression(0);
			setState(829);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(UPDATE);
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(832);
				accessLevel();
				}
				break;
			}
			setState(835);
			expression(0);
			setState(836);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ApexParser.DELETE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(DELETE);
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(839);
				accessLevel();
				}
				break;
			}
			setState(842);
			expression(0);
			setState(843);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UndeleteStatementContext extends ParserRuleContext {
		public TerminalNode UNDELETE() { return getToken(ApexParser.UNDELETE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public UndeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undeleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUndeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUndeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUndeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndeleteStatementContext undeleteStatement() throws RecognitionException {
		UndeleteStatementContext _localctx = new UndeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_undeleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(UNDELETE);
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(846);
				accessLevel();
				}
				break;
			}
			setState(849);
			expression(0);
			setState(850);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpsertStatementContext extends ParserRuleContext {
		public TerminalNode UPSERT() { return getToken(ApexParser.UPSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public UpsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUpsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUpsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUpsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpsertStatementContext upsertStatement() throws RecognitionException {
		UpsertStatementContext _localctx = new UpsertStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_upsertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(UPSERT);
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(853);
				accessLevel();
				}
				break;
			}
			setState(856);
			expression(0);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114828269935591412L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || _la==LISTVIEW || _la==Identifier) {
				{
				setState(857);
				qualifiedName();
				}
			}

			setState(860);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MergeStatementContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(ApexParser.MERGE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mergeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(MERGE);
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(863);
				accessLevel();
				}
				break;
			}
			setState(866);
			expression(0);
			setState(867);
			expression(0);
			setState(868);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RunAsStatementContext extends ParserRuleContext {
		public TerminalNode SYSTEMRUNAS() { return getToken(ApexParser.SYSTEMRUNAS, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RunAsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runAsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterRunAsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitRunAsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitRunAsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunAsStatementContext runAsStatement() throws RecognitionException {
		RunAsStatementContext _localctx = new RunAsStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_runAsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(SYSTEMRUNAS);
			setState(871);
			match(LPAREN);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
				{
				setState(872);
				expressionList();
				}
			}

			setState(875);
			match(RPAREN);
			setState(876);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			expression(0);
			setState(879);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBlockContext extends ParserRuleContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitPropertyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitPropertyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBlockContext propertyBlock() throws RecognitionException {
		PropertyBlockContext _localctx = new PropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_propertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28433993197297666L) != 0) || _la==ATSIGN) {
				{
				{
				setState(881);
				modifier();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(887);
				getter();
				}
				break;
			case SET:
				{
				setState(888);
				setter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(ApexParser.GET, 0); }
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(GET);
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(892);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(893);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ApexParser.SET, 0); }
		public TerminalNode SEMI() { return getToken(ApexParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(SET);
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(897);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(898);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ApexParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(CATCH);
			setState(902);
			match(LPAREN);
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(903);
					modifier();
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(909);
			qualifiedName();
			setState(910);
			id();
			setState(911);
			match(RPAREN);
			setState(912);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ApexParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(FINALLY);
			setState(915);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ApexParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ApexParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forControl);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4769694488518642L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 54043453232784123L) != 0)) {
					{
					setState(918);
					forInit();
					}
				}

				setState(921);
				match(SEMI);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
					{
					setState(922);
					expression(0);
					}
				}

				setState(925);
				match(SEMI);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
					{
					setState(926);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_forInit);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ApexParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			typeRef();
			setState(936);
			id();
			setState(937);
			match(COLON);
			setState(938);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(LPAREN);
			setState(943);
			expression(0);
			setState(944);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			expression(0);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947);
				match(COMMA);
				setState(948);
				expression(0);
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arth1ExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ApexParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ApexParser.DIV, 0); }
		public Arth1ExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArth1Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArth1Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArth1Expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CoalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COAL() { return getToken(ApexParser.COAL, 0); }
		public CoalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCoalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCoalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCoalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ApexParser.DOT, 0); }
		public TerminalNode QUESTIONDOT() { return getToken(ApexParser.QUESTIONDOT, 0); }
		public DotMethodCallContext dotMethodCall() {
			return getRuleContext(DotMethodCallContext.class,0);
		}
		public AnyIdContext anyId() {
			return getRuleContext(AnyIdContext.class,0);
		}
		public DotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(ApexParser.BITOR, 0); }
		public BitOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(ApexParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ApexParser.RBRACK, 0); }
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(ApexParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ApexParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ApexParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ApexParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ApexParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ApexParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ApexParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ApexParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ApexParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(ApexParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ApexParser.LSHIFT_ASSIGN, 0); }
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExpressionContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitNotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CARET() { return getToken(ApexParser.CARET, 0); }
		public BitNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arth2ExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ApexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ApexParser.SUB, 0); }
		public Arth2ExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArth2Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArth2Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArth2Expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ApexParser.AND, 0); }
		public LogAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLogAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLogAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLogAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(ApexParser.BITAND, 0); }
		public BitAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(ApexParser.GT, 0); }
		public TerminalNode LT() { return getToken(ApexParser.LT, 0); }
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public CmpExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCmpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCmpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCmpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ApexParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ApexParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ApexParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ApexParser.GT, i);
		}
		public BitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ApexParser.OR, 0); }
		public LogOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLogOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLogOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLogOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(ApexParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ApexParser.COLON, 0); }
		public CondExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCondExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCondExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCondExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TRIPLEEQUAL() { return getToken(ApexParser.TRIPLEEQUAL, 0); }
		public TerminalNode TRIPLENOTEQUAL() { return getToken(ApexParser.TRIPLENOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ApexParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ApexParser.NOTEQUAL, 0); }
		public TerminalNode LESSANDGREATER() { return getToken(ApexParser.LESSANDGREATER, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostOpExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(ApexParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ApexParser.DEC, 0); }
		public PostOpExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterPostOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitPostOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitPostOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(ApexParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ApexParser.BANG, 0); }
		public NegExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterNegExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitNegExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitNegExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreOpExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ApexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ApexParser.SUB, 0); }
		public TerminalNode INC() { return getToken(ApexParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ApexParser.DEC, 0); }
		public PreOpExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterPreOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitPreOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitPreOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(ApexParser.INSTANCEOF, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(955);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(956);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(957);
				match(NEW);
				setState(958);
				creator();
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(959);
				match(LPAREN);
				setState(960);
				typeRef();
				setState(961);
				match(RPAREN);
				setState(962);
				expression(19);
				}
				break;
			case 5:
				{
				_localctx = new SubExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(964);
				match(LPAREN);
				setState(965);
				expression(0);
				setState(966);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new PreOpExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(968);
				_la = _input.LA(1);
				if ( !(((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(969);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(970);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(971);
				expression(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1043);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new Arth1ExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(974);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(975);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(976);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new Arth2ExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(977);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(978);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(979);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(980);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(988);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(981);
							match(LT);
							setState(982);
							match(LT);
							}
							break;
						case 2:
							{
							setState(983);
							match(GT);
							setState(984);
							match(GT);
							setState(985);
							match(GT);
							}
							break;
						case 3:
							{
							setState(986);
							match(GT);
							setState(987);
							match(GT);
							}
							break;
						}
						setState(990);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(991);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(992);
						_la = _input.LA(1);
						if ( !(_la==GT || _la==LT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(994);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(993);
							match(ASSIGN);
							}
						}

						setState(996);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(997);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(998);
						_la = _input.LA(1);
						if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & 31L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(999);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1000);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1001);
						match(BITAND);
						setState(1002);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new BitNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1003);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1004);
						match(CARET);
						setState(1005);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1006);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1007);
						match(BITOR);
						setState(1008);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new LogAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1009);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1010);
						match(AND);
						setState(1011);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new LogOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1012);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1013);
						match(OR);
						setState(1014);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new CoalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1015);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1016);
						match(COAL);
						setState(1017);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new CondExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1018);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1019);
						match(QUESTION);
						setState(1020);
						expression(0);
						setState(1021);
						match(COLON);
						setState(1022);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new AssignExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1024);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1025);
						_la = _input.LA(1);
						if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 68652367873L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1026);
						expression(1);
						}
						break;
					case 14:
						{
						_localctx = new DotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1027);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1028);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==QUESTIONDOT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1031);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
						case 1:
							{
							setState(1029);
							dotMethodCall();
							}
							break;
						case 2:
							{
							setState(1030);
							anyId();
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ArrayExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1033);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1034);
						match(LBRACK);
						setState(1035);
						expression(0);
						setState(1036);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new PostOpExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1038);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1039);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1040);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1041);
						match(INSTANCEOF);
						setState(1042);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPrimaryContext extends PrimaryContext {
		public TerminalNode THIS() { return getToken(ApexParser.THIS, 0); }
		public ThisPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterThisPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitThisPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitThisPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidPrimaryContext extends PrimaryContext {
		public TerminalNode VOID() { return getToken(ApexParser.VOID, 0); }
		public TerminalNode DOT() { return getToken(ApexParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ApexParser.CLASS, 0); }
		public VoidPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterVoidPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitVoidPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitVoidPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SoqlPrimaryContext extends PrimaryContext {
		public SoqlLiteralContext soqlLiteral() {
			return getRuleContext(SoqlLiteralContext.class,0);
		}
		public SoqlPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoqlPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoqlPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoqlPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperPrimaryContext extends PrimaryContext {
		public TerminalNode SUPER() { return getToken(ApexParser.SUPER, 0); }
		public SuperPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSuperPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSuperPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSuperPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRefPrimaryContext extends PrimaryContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ApexParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ApexParser.CLASS, 0); }
		public TypeRefPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeRefPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeRefPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeRefPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdPrimaryContext extends PrimaryContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterIdPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitIdPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitIdPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SoslPrimaryContext extends PrimaryContext {
		public SoslLiteralContext soslLiteral() {
			return getRuleContext(SoslLiteralContext.class,0);
		}
		public SoslPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPrimaryContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLiteralPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLiteralPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLiteralPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_primary);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ThisPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				match(THIS);
				}
				break;
			case 2:
				_localctx = new SuperPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				match(SUPER);
				}
				break;
			case 3:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				literal();
				}
				break;
			case 4:
				_localctx = new TypeRefPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				typeRef();
				setState(1052);
				match(DOT);
				setState(1053);
				match(CLASS);
				}
				break;
			case 5:
				_localctx = new VoidPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				match(VOID);
				setState(1056);
				match(DOT);
				setState(1057);
				match(CLASS);
				}
				break;
			case 6:
				_localctx = new IdPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1058);
				id();
				}
				break;
			case 7:
				_localctx = new SoqlPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1059);
				soqlLiteral();
				}
				break;
			case 8:
				_localctx = new SoslPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1060);
				soslLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(ApexParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ApexParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_methodCall);
		int _la;
		try {
			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case SET:
			case SHARING:
			case SWITCH:
			case TRANSIENT:
			case TRIGGER:
			case WHEN:
			case WITH:
			case WITHOUT:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				id();
				setState(1064);
				match(LPAREN);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
					{
					setState(1065);
					expressionList();
					}
				}

				setState(1068);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(THIS);
				setState(1071);
				match(LPAREN);
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
					{
					setState(1072);
					expressionList();
					}
				}

				setState(1075);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1076);
				match(SUPER);
				setState(1077);
				match(LPAREN);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
					{
					setState(1078);
					expressionList();
					}
				}

				setState(1081);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotMethodCallContext extends ParserRuleContext {
		public AnyIdContext anyId() {
			return getRuleContext(AnyIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public DotMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDotMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDotMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDotMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotMethodCallContext dotMethodCall() throws RecognitionException {
		DotMethodCallContext _localctx = new DotMethodCallContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dotMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			anyId();
			setState(1085);
			match(LPAREN);
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
				{
				setState(1086);
				expressionList();
				}
			}

			setState(1089);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NoRestContext noRest() {
			return getRuleContext(NoRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public MapCreatorRestContext mapCreatorRest() {
			return getRuleContext(MapCreatorRestContext.class,0);
		}
		public SetCreatorRestContext setCreatorRest() {
			return getRuleContext(SetCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			createdName();
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1092);
				noRest();
				}
				break;
			case 2:
				{
				setState(1093);
				classCreatorRest();
				}
				break;
			case 3:
				{
				setState(1094);
				arrayCreatorRest();
				}
				break;
			case 4:
				{
				setState(1095);
				mapCreatorRest();
				}
				break;
			case 5:
				{
				setState(1096);
				setCreatorRest();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdCreatedNamePairContext> idCreatedNamePair() {
			return getRuleContexts(IdCreatedNamePairContext.class);
		}
		public IdCreatedNamePairContext idCreatedNamePair(int i) {
			return getRuleContext(IdCreatedNamePairContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ApexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ApexParser.DOT, i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_createdName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			idCreatedNamePair();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1100);
				match(DOT);
				setState(1101);
				idCreatedNamePair();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdCreatedNamePairContext extends ParserRuleContext {
		public AnyIdContext anyId() {
			return getRuleContext(AnyIdContext.class,0);
		}
		public TerminalNode LT() { return getToken(ApexParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ApexParser.GT, 0); }
		public IdCreatedNamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idCreatedNamePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterIdCreatedNamePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitIdCreatedNamePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitIdCreatedNamePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdCreatedNamePairContext idCreatedNamePair() throws RecognitionException {
		IdCreatedNamePairContext _localctx = new IdCreatedNamePairContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_idCreatedNamePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			anyId();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1108);
				match(LT);
				setState(1109);
				typeList();
				setState(1110);
				match(GT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public NoRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterNoRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitNoRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitNoRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoRestContext noRest() throws RecognitionException {
		NoRestContext _localctx = new NoRestContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_noRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(LBRACE);
			setState(1115);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ApexParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ApexParser.RBRACK, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_arrayCreatorRest);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(LBRACK);
				setState(1120);
				expression(0);
				setState(1121);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(LBRACK);
				setState(1124);
				match(RBRACK);
				setState(1126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1125);
					arrayInitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public List<MapCreatorRestPairContext> mapCreatorRestPair() {
			return getRuleContexts(MapCreatorRestPairContext.class);
		}
		public MapCreatorRestPairContext mapCreatorRestPair(int i) {
			return getRuleContext(MapCreatorRestPairContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public MapCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMapCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMapCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMapCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapCreatorRestContext mapCreatorRest() throws RecognitionException {
		MapCreatorRestContext _localctx = new MapCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_mapCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(LBRACE);
			setState(1131);
			mapCreatorRestPair();
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1132);
				match(COMMA);
				setState(1133);
				mapCreatorRestPair();
				}
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1139);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapCreatorRestPairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MAPTO() { return getToken(ApexParser.MAPTO, 0); }
		public MapCreatorRestPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapCreatorRestPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterMapCreatorRestPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitMapCreatorRestPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitMapCreatorRestPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapCreatorRestPairContext mapCreatorRestPair() throws RecognitionException {
		MapCreatorRestPairContext _localctx = new MapCreatorRestPairContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_mapCreatorRestPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			expression(0);
			setState(1142);
			match(MAPTO);
			setState(1143);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ApexParser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ApexParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public SetCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSetCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSetCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSetCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetCreatorRestContext setCreatorRest() throws RecognitionException {
		SetCreatorRestContext _localctx = new SetCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(LBRACE);
			setState(1146);
			expression(0);
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1147);
				match(COMMA);
				{
				setState(1148);
				expression(0);
				}
				}
				}
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1154);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(LPAREN);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6177691874033652L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 36029054723302139L) != 0)) {
				{
				setState(1157);
				expressionList();
				}
			}

			setState(1160);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoqlLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ApexParser.LBRACK, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ApexParser.RBRACK, 0); }
		public SoqlLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soqlLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoqlLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoqlLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoqlLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoqlLiteralContext soqlLiteral() throws RecognitionException {
		SoqlLiteralContext _localctx = new SoqlLiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_soqlLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(LBRACK);
			setState(1163);
			query();
			setState(1164);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ApexParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ApexParser.FROM, 0); }
		public FromNameListContext fromNameList() {
			return getRuleContext(FromNameListContext.class,0);
		}
		public ForClausesContext forClauses() {
			return getRuleContext(ForClausesContext.class,0);
		}
		public UsingScopeContext usingScope() {
			return getRuleContext(UsingScopeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public AllRowsClauseContext allRowsClause() {
			return getRuleContext(AllRowsClauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(SELECT);
			setState(1167);
			selectList();
			setState(1168);
			match(FROM);
			setState(1169);
			fromNameList();
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1170);
				usingScope();
				}
			}

			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1173);
				whereClause();
				}
			}

			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1176);
				withClause();
				}
			}

			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1179);
				groupByClause();
				}
			}

			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1182);
				orderByClause();
				}
			}

			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1185);
				limitClause();
				}
			}

			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1188);
				offsetClause();
				}
			}

			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(1191);
				allRowsClause();
				}
			}

			setState(1194);
			forClauses();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPDATE) {
				{
				setState(1195);
				match(UPDATE);
				setState(1196);
				updateList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ApexParser.SELECT, 0); }
		public SubFieldListContext subFieldList() {
			return getRuleContext(SubFieldListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ApexParser.FROM, 0); }
		public FromNameListContext fromNameList() {
			return getRuleContext(FromNameListContext.class,0);
		}
		public ForClausesContext forClauses() {
			return getRuleContext(ForClausesContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_subQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(SELECT);
			setState(1200);
			subFieldList();
			setState(1201);
			match(FROM);
			setState(1202);
			fromNameList();
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1203);
				whereClause();
				}
			}

			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1206);
				orderByClause();
				}
			}

			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1209);
				limitClause();
				}
			}

			setState(1212);
			forClauses();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPDATE) {
				{
				setState(1213);
				match(UPDATE);
				setState(1214);
				updateList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectListContext extends ParserRuleContext {
		public List<SelectEntryContext> selectEntry() {
			return getRuleContexts(SelectEntryContext.class);
		}
		public SelectEntryContext selectEntry(int i) {
			return getRuleContext(SelectEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			selectEntry();
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1218);
				match(COMMA);
				setState(1219);
				selectEntry();
				}
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectEntryContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public SoqlIdContext soqlId() {
			return getRuleContext(SoqlIdContext.class,0);
		}
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TypeOfContext typeOf() {
			return getRuleContext(TypeOfContext.class,0);
		}
		public SelectEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSelectEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSelectEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSelectEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectEntryContext selectEntry() throws RecognitionException {
		SelectEntryContext _localctx = new SelectEntryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_selectEntry);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				fieldName();
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1226);
					soqlId();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				soqlFunction();
				setState(1231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1230);
					soqlId();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1233);
				match(LPAREN);
				setState(1234);
				subQuery();
				setState(1235);
				match(RPAREN);
				setState(1237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1236);
					soqlId();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1239);
				typeOf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldNameContext extends ParserRuleContext {
		public List<SoqlIdContext> soqlId() {
			return getRuleContexts(SoqlIdContext.class);
		}
		public SoqlIdContext soqlId(int i) {
			return getRuleContext(SoqlIdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ApexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ApexParser.DOT, i);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fieldName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			soqlId();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1243);
				match(DOT);
				setState(1244);
				soqlId();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromNameListContext extends ParserRuleContext {
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public List<SoqlIdContext> soqlId() {
			return getRuleContexts(SoqlIdContext.class);
		}
		public SoqlIdContext soqlId(int i) {
			return getRuleContext(SoqlIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public FromNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFromNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFromNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFromNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromNameListContext fromNameList() throws RecognitionException {
		FromNameListContext _localctx = new FromNameListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fromNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			fieldName();
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1251);
				soqlId();
				}
				break;
			}
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1254);
				match(COMMA);
				setState(1255);
				fieldName();
				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1256);
					soqlId();
					}
					break;
				}
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubFieldListContext extends ParserRuleContext {
		public List<SubFieldEntryContext> subFieldEntry() {
			return getRuleContexts(SubFieldEntryContext.class);
		}
		public SubFieldEntryContext subFieldEntry(int i) {
			return getRuleContext(SubFieldEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public SubFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSubFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSubFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSubFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubFieldListContext subFieldList() throws RecognitionException {
		SubFieldListContext _localctx = new SubFieldListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_subFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			subFieldEntry();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1265);
				match(COMMA);
				setState(1266);
				subFieldEntry();
				}
				}
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubFieldEntryContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public SoqlIdContext soqlId() {
			return getRuleContext(SoqlIdContext.class,0);
		}
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TypeOfContext typeOf() {
			return getRuleContext(TypeOfContext.class,0);
		}
		public SubFieldEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subFieldEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSubFieldEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSubFieldEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSubFieldEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubFieldEntryContext subFieldEntry() throws RecognitionException {
		SubFieldEntryContext _localctx = new SubFieldEntryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_subFieldEntry);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				fieldName();
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1273);
					soqlId();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				soqlFunction();
				setState(1278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1277);
					soqlId();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				match(LPAREN);
				setState(1281);
				subQuery();
				setState(1282);
				match(RPAREN);
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1283);
					soqlId();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1286);
				typeOf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoqlFieldsParameterContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(ApexParser.ALL, 0); }
		public TerminalNode CUSTOM() { return getToken(ApexParser.CUSTOM, 0); }
		public TerminalNode STANDARD() { return getToken(ApexParser.STANDARD, 0); }
		public SoqlFieldsParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soqlFieldsParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoqlFieldsParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoqlFieldsParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoqlFieldsParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoqlFieldsParameterContext soqlFieldsParameter() throws RecognitionException {
		SoqlFieldsParameterContext _localctx = new SoqlFieldsParameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_soqlFieldsParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 6291457L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoqlFunctionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(ApexParser.AVG, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TerminalNode COUNT() { return getToken(ApexParser.COUNT, 0); }
		public TerminalNode COUNT_DISTINCT() { return getToken(ApexParser.COUNT_DISTINCT, 0); }
		public TerminalNode MIN() { return getToken(ApexParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ApexParser.MAX, 0); }
		public TerminalNode SUM() { return getToken(ApexParser.SUM, 0); }
		public TerminalNode TOLABEL() { return getToken(ApexParser.TOLABEL, 0); }
		public TerminalNode FORMAT() { return getToken(ApexParser.FORMAT, 0); }
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public TerminalNode CALENDAR_MONTH() { return getToken(ApexParser.CALENDAR_MONTH, 0); }
		public DateFieldNameContext dateFieldName() {
			return getRuleContext(DateFieldNameContext.class,0);
		}
		public TerminalNode CALENDAR_QUARTER() { return getToken(ApexParser.CALENDAR_QUARTER, 0); }
		public TerminalNode CALENDAR_YEAR() { return getToken(ApexParser.CALENDAR_YEAR, 0); }
		public TerminalNode DAY_IN_MONTH() { return getToken(ApexParser.DAY_IN_MONTH, 0); }
		public TerminalNode DAY_IN_WEEK() { return getToken(ApexParser.DAY_IN_WEEK, 0); }
		public TerminalNode DAY_IN_YEAR() { return getToken(ApexParser.DAY_IN_YEAR, 0); }
		public TerminalNode DAY_ONLY() { return getToken(ApexParser.DAY_ONLY, 0); }
		public TerminalNode FISCAL_MONTH() { return getToken(ApexParser.FISCAL_MONTH, 0); }
		public TerminalNode FISCAL_QUARTER() { return getToken(ApexParser.FISCAL_QUARTER, 0); }
		public TerminalNode FISCAL_YEAR() { return getToken(ApexParser.FISCAL_YEAR, 0); }
		public TerminalNode HOUR_IN_DAY() { return getToken(ApexParser.HOUR_IN_DAY, 0); }
		public TerminalNode WEEK_IN_MONTH() { return getToken(ApexParser.WEEK_IN_MONTH, 0); }
		public TerminalNode WEEK_IN_YEAR() { return getToken(ApexParser.WEEK_IN_YEAR, 0); }
		public TerminalNode FIELDS() { return getToken(ApexParser.FIELDS, 0); }
		public SoqlFieldsParameterContext soqlFieldsParameter() {
			return getRuleContext(SoqlFieldsParameterContext.class,0);
		}
		public TerminalNode DISTANCE() { return getToken(ApexParser.DISTANCE, 0); }
		public List<LocationValueContext> locationValue() {
			return getRuleContexts(LocationValueContext.class);
		}
		public LocationValueContext locationValue(int i) {
			return getRuleContext(LocationValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode GROUPING() { return getToken(ApexParser.GROUPING, 0); }
		public TerminalNode CONVERT_CURRENCY() { return getToken(ApexParser.CONVERT_CURRENCY, 0); }
		public SoqlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soqlFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoqlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoqlFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoqlFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoqlFunctionContext soqlFunction() throws RecognitionException {
		SoqlFunctionContext _localctx = new SoqlFunctionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_soqlFunction);
		try {
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				match(AVG);
				setState(1292);
				match(LPAREN);
				setState(1293);
				fieldName();
				setState(1294);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(COUNT);
				setState(1297);
				match(LPAREN);
				setState(1298);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				match(COUNT);
				setState(1300);
				match(LPAREN);
				setState(1301);
				fieldName();
				setState(1302);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				match(COUNT_DISTINCT);
				setState(1305);
				match(LPAREN);
				setState(1306);
				fieldName();
				setState(1307);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309);
				match(MIN);
				setState(1310);
				match(LPAREN);
				setState(1311);
				fieldName();
				setState(1312);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1314);
				match(MAX);
				setState(1315);
				match(LPAREN);
				setState(1316);
				fieldName();
				setState(1317);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1319);
				match(SUM);
				setState(1320);
				match(LPAREN);
				setState(1321);
				fieldName();
				setState(1322);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1324);
				match(TOLABEL);
				setState(1325);
				match(LPAREN);
				setState(1326);
				fieldName();
				setState(1327);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1329);
				match(FORMAT);
				setState(1330);
				match(LPAREN);
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1331);
					fieldName();
					}
					break;
				case 2:
					{
					setState(1332);
					soqlFunction();
					}
					break;
				}
				setState(1335);
				match(RPAREN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1337);
				match(CALENDAR_MONTH);
				setState(1338);
				match(LPAREN);
				setState(1339);
				dateFieldName();
				setState(1340);
				match(RPAREN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1342);
				match(CALENDAR_QUARTER);
				setState(1343);
				match(LPAREN);
				setState(1344);
				dateFieldName();
				setState(1345);
				match(RPAREN);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1347);
				match(CALENDAR_YEAR);
				setState(1348);
				match(LPAREN);
				setState(1349);
				dateFieldName();
				setState(1350);
				match(RPAREN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1352);
				match(DAY_IN_MONTH);
				setState(1353);
				match(LPAREN);
				setState(1354);
				dateFieldName();
				setState(1355);
				match(RPAREN);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1357);
				match(DAY_IN_WEEK);
				setState(1358);
				match(LPAREN);
				setState(1359);
				dateFieldName();
				setState(1360);
				match(RPAREN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1362);
				match(DAY_IN_YEAR);
				setState(1363);
				match(LPAREN);
				setState(1364);
				dateFieldName();
				setState(1365);
				match(RPAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1367);
				match(DAY_ONLY);
				setState(1368);
				match(LPAREN);
				setState(1369);
				dateFieldName();
				setState(1370);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1372);
				match(FISCAL_MONTH);
				setState(1373);
				match(LPAREN);
				setState(1374);
				dateFieldName();
				setState(1375);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1377);
				match(FISCAL_QUARTER);
				setState(1378);
				match(LPAREN);
				setState(1379);
				dateFieldName();
				setState(1380);
				match(RPAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1382);
				match(FISCAL_YEAR);
				setState(1383);
				match(LPAREN);
				setState(1384);
				dateFieldName();
				setState(1385);
				match(RPAREN);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1387);
				match(HOUR_IN_DAY);
				setState(1388);
				match(LPAREN);
				setState(1389);
				dateFieldName();
				setState(1390);
				match(RPAREN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1392);
				match(WEEK_IN_MONTH);
				setState(1393);
				match(LPAREN);
				setState(1394);
				dateFieldName();
				setState(1395);
				match(RPAREN);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1397);
				match(WEEK_IN_YEAR);
				setState(1398);
				match(LPAREN);
				setState(1399);
				dateFieldName();
				setState(1400);
				match(RPAREN);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1402);
				match(FIELDS);
				setState(1403);
				match(LPAREN);
				setState(1404);
				soqlFieldsParameter();
				setState(1405);
				match(RPAREN);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1407);
				match(DISTANCE);
				setState(1408);
				match(LPAREN);
				setState(1409);
				locationValue();
				setState(1410);
				match(COMMA);
				setState(1411);
				locationValue();
				setState(1412);
				match(COMMA);
				setState(1413);
				match(StringLiteral);
				setState(1414);
				match(RPAREN);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1416);
				match(GROUPING);
				setState(1417);
				match(LPAREN);
				setState(1418);
				fieldName();
				setState(1419);
				match(RPAREN);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1421);
				match(CONVERT_CURRENCY);
				setState(1422);
				match(LPAREN);
				setState(1423);
				fieldName();
				setState(1424);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateFieldNameContext extends ParserRuleContext {
		public TerminalNode CONVERT_TIMEZONE() { return getToken(ApexParser.CONVERT_TIMEZONE, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public DateFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDateFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDateFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDateFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateFieldNameContext dateFieldName() throws RecognitionException {
		DateFieldNameContext _localctx = new DateFieldNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_dateFieldName);
		try {
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				match(CONVERT_TIMEZONE);
				setState(1429);
				match(LPAREN);
				setState(1430);
				fieldName();
				setState(1431);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				fieldName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationValueContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public TerminalNode GEOLOCATION() { return getToken(ApexParser.GEOLOCATION, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public List<CoordinateValueContext> coordinateValue() {
			return getRuleContexts(CoordinateValueContext.class);
		}
		public CoordinateValueContext coordinateValue(int i) {
			return getRuleContext(CoordinateValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ApexParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public LocationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLocationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLocationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLocationValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationValueContext locationValue() throws RecognitionException {
		LocationValueContext _localctx = new LocationValueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_locationValue);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				fieldName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				boundExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				match(GEOLOCATION);
				setState(1439);
				match(LPAREN);
				setState(1440);
				coordinateValue();
				setState(1441);
				match(COMMA);
				setState(1442);
				coordinateValue();
				setState(1443);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoordinateValueContext extends ParserRuleContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public CoordinateValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinateValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterCoordinateValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitCoordinateValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitCoordinateValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateValueContext coordinateValue() throws RecognitionException {
		CoordinateValueContext _localctx = new CoordinateValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_coordinateValue);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case NumberLiteral:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				signedNumber();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				boundExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOfContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(ApexParser.TYPEOF, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode END() { return getToken(ApexParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public TypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitTypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfContext typeOf() throws RecognitionException {
		TypeOfContext _localctx = new TypeOfContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_typeOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(TYPEOF);
			setState(1452);
			fieldName();
			setState(1454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1453);
				whenClause();
				}
				}
				setState(1456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1458);
				elseClause();
				}
			}

			setState(1461);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(ApexParser.WHEN, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ApexParser.THEN, 0); }
		public FieldNameListContext fieldNameList() {
			return getRuleContext(FieldNameListContext.class,0);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(WHEN);
			setState(1464);
			fieldName();
			setState(1465);
			match(THEN);
			setState(1466);
			fieldNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ApexParser.ELSE, 0); }
		public FieldNameListContext fieldNameList() {
			return getRuleContext(FieldNameListContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(ELSE);
			setState(1469);
			fieldNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldNameListContext extends ParserRuleContext {
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public FieldNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameListContext fieldNameList() throws RecognitionException {
		FieldNameListContext _localctx = new FieldNameListContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_fieldNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			fieldName();
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1472);
				match(COMMA);
				setState(1473);
				fieldName();
				}
				}
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingScopeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ApexParser.USING, 0); }
		public TerminalNode SCOPE() { return getToken(ApexParser.SCOPE, 0); }
		public SoqlIdContext soqlId() {
			return getRuleContext(SoqlIdContext.class,0);
		}
		public UsingScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUsingScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUsingScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUsingScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingScopeContext usingScope() throws RecognitionException {
		UsingScopeContext _localctx = new UsingScopeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_usingScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(USING);
			setState(1480);
			match(SCOPE);
			setState(1481);
			soqlId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ApexParser.WHERE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(WHERE);
			setState(1484);
			logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public List<TerminalNode> SOQLAND() { return getTokens(ApexParser.SOQLAND); }
		public TerminalNode SOQLAND(int i) {
			return getToken(ApexParser.SOQLAND, i);
		}
		public List<TerminalNode> SOQLOR() { return getTokens(ApexParser.SOQLOR); }
		public TerminalNode SOQLOR(int i) {
			return getToken(ApexParser.SOQLOR, i);
		}
		public TerminalNode NOT() { return getToken(ApexParser.NOT, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_logicalExpression);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				conditionalExpression();
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SOQLAND) {
					{
					{
					setState(1487);
					match(SOQLAND);
					setState(1488);
					conditionalExpression();
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				conditionalExpression();
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SOQLOR) {
					{
					{
					setState(1495);
					match(SOQLOR);
					setState(1496);
					conditionalExpression();
					}
					}
					setState(1501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502);
				match(NOT);
				setState(1503);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public FieldExpressionContext fieldExpression() {
			return getRuleContext(FieldExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_conditionalExpression);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(LPAREN);
				setState(1507);
				logicalExpression();
				setState(1508);
				match(RPAREN);
				}
				break;
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case SET:
			case SHARING:
			case SWITCH:
			case TRANSIENT:
			case TRIGGER:
			case WHEN:
			case WITH:
			case WITHOUT:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				fieldExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldExpressionContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public FieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldExpressionContext fieldExpression() throws RecognitionException {
		FieldExpressionContext _localctx = new FieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fieldExpression);
		try {
			setState(1521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				fieldName();
				setState(1514);
				comparisonOperator();
				setState(1515);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				soqlFunction();
				setState(1518);
				comparisonOperator();
				setState(1519);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ApexParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(ApexParser.LT, 0); }
		public TerminalNode GT() { return getToken(ApexParser.GT, 0); }
		public TerminalNode LESSANDGREATER() { return getToken(ApexParser.LESSANDGREATER, 0); }
		public TerminalNode LIKE() { return getToken(ApexParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(ApexParser.IN, 0); }
		public TerminalNode NOT() { return getToken(ApexParser.NOT, 0); }
		public TerminalNode INCLUDES() { return getToken(ApexParser.INCLUDES, 0); }
		public TerminalNode EXCLUDES() { return getToken(ApexParser.EXCLUDES, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_comparisonOperator);
		try {
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				match(NOTEQUAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1525);
				match(LT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1526);
				match(GT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1527);
				match(LT);
				setState(1528);
				match(ASSIGN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1529);
				match(GT);
				setState(1530);
				match(ASSIGN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1531);
				match(LESSANDGREATER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1532);
				match(LIKE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1533);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1534);
				match(NOT);
				setState(1535);
				match(IN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1536);
				match(INCLUDES);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1537);
				match(EXCLUDES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ApexParser.NULL, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ApexParser.BooleanLiteral, 0); }
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode DateLiteral() { return getToken(ApexParser.DateLiteral, 0); }
		public TerminalNode TimeLiteral() { return getToken(ApexParser.TimeLiteral, 0); }
		public TerminalNode DateTimeLiteral() { return getToken(ApexParser.DateTimeLiteral, 0); }
		public DateFormulaContext dateFormula() {
			return getRuleContext(DateFormulaContext.class,0);
		}
		public TerminalNode IntegralCurrencyLiteral() { return getToken(ApexParser.IntegralCurrencyLiteral, 0); }
		public TerminalNode DOT() { return getToken(ApexParser.DOT, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_value);
		int _la;
		try {
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				match(NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				signedNumber();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1543);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1544);
				match(DateLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1545);
				match(TimeLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1546);
				match(DateTimeLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1547);
				dateFormula();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1548);
				match(IntegralCurrencyLiteral);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1549);
					match(DOT);
					setState(1551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IntegerLiteral) {
						{
						setState(1550);
						match(IntegerLiteral);
						}
					}

					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1555);
				match(LPAREN);
				setState(1556);
				subQuery();
				setState(1557);
				match(RPAREN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1559);
				valueList();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1560);
				boundExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(LPAREN);
			setState(1564);
			value();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1565);
				match(COMMA);
				setState(1566);
				value();
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedNumberContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(ApexParser.NumberLiteral, 0); }
		public TerminalNode ADD() { return getToken(ApexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ApexParser.SUB, 0); }
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_signedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(1574);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1577);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==NumberLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ApexParser.WITH, 0); }
		public TerminalNode DATA() { return getToken(ApexParser.DATA, 0); }
		public TerminalNode CATEGORY() { return getToken(ApexParser.CATEGORY, 0); }
		public FilteringExpressionContext filteringExpression() {
			return getRuleContext(FilteringExpressionContext.class,0);
		}
		public TerminalNode SECURITY_ENFORCED() { return getToken(ApexParser.SECURITY_ENFORCED, 0); }
		public TerminalNode SYSTEM_MODE() { return getToken(ApexParser.SYSTEM_MODE, 0); }
		public TerminalNode USER_MODE() { return getToken(ApexParser.USER_MODE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_withClause);
		try {
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				match(WITH);
				setState(1580);
				match(DATA);
				setState(1581);
				match(CATEGORY);
				setState(1582);
				filteringExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583);
				match(WITH);
				setState(1584);
				match(SECURITY_ENFORCED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1585);
				match(WITH);
				setState(1586);
				match(SYSTEM_MODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1587);
				match(WITH);
				setState(1588);
				match(USER_MODE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1589);
				match(WITH);
				setState(1590);
				logicalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilteringExpressionContext extends ParserRuleContext {
		public List<DataCategorySelectionContext> dataCategorySelection() {
			return getRuleContexts(DataCategorySelectionContext.class);
		}
		public DataCategorySelectionContext dataCategorySelection(int i) {
			return getRuleContext(DataCategorySelectionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ApexParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ApexParser.AND, i);
		}
		public FilteringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filteringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFilteringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFilteringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFilteringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilteringExpressionContext filteringExpression() throws RecognitionException {
		FilteringExpressionContext _localctx = new FilteringExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_filteringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			dataCategorySelection();
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1594);
				match(AND);
				setState(1595);
				dataCategorySelection();
				}
				}
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataCategorySelectionContext extends ParserRuleContext {
		public SoqlIdContext soqlId() {
			return getRuleContext(SoqlIdContext.class,0);
		}
		public FilteringSelectorContext filteringSelector() {
			return getRuleContext(FilteringSelectorContext.class,0);
		}
		public DataCategoryNameContext dataCategoryName() {
			return getRuleContext(DataCategoryNameContext.class,0);
		}
		public DataCategorySelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCategorySelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDataCategorySelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDataCategorySelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDataCategorySelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCategorySelectionContext dataCategorySelection() throws RecognitionException {
		DataCategorySelectionContext _localctx = new DataCategorySelectionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dataCategorySelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			soqlId();
			setState(1602);
			filteringSelector();
			setState(1603);
			dataCategoryName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataCategoryNameContext extends ParserRuleContext {
		public List<SoqlIdContext> soqlId() {
			return getRuleContexts(SoqlIdContext.class);
		}
		public SoqlIdContext soqlId(int i) {
			return getRuleContext(SoqlIdContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ApexParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ApexParser.LPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public DataCategoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCategoryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDataCategoryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDataCategoryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDataCategoryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCategoryNameContext dataCategoryName() throws RecognitionException {
		DataCategoryNameContext _localctx = new DataCategoryNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_dataCategoryName);
		int _la;
		try {
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case GET:
			case INHERITED:
			case INSTANCEOF:
			case SET:
			case SHARING:
			case SWITCH:
			case TRANSIENT:
			case TRIGGER:
			case WHEN:
			case WITH:
			case WITHOUT:
			case SYSTEM:
			case USER:
			case SELECT:
			case COUNT:
			case FROM:
			case AS:
			case USING:
			case SCOPE:
			case WHERE:
			case ORDER:
			case BY:
			case LIMIT:
			case SOQLAND:
			case SOQLOR:
			case NOT:
			case AVG:
			case COUNT_DISTINCT:
			case MIN:
			case MAX:
			case SUM:
			case TYPEOF:
			case END:
			case THEN:
			case LIKE:
			case IN:
			case INCLUDES:
			case EXCLUDES:
			case ASC:
			case DESC:
			case NULLS:
			case FIRST:
			case LAST:
			case GROUP:
			case ALL:
			case ROWS:
			case VIEW:
			case HAVING:
			case ROLLUP:
			case TOLABEL:
			case OFFSET:
			case DATA:
			case CATEGORY:
			case AT:
			case ABOVE:
			case BELOW:
			case ABOVE_OR_BELOW:
			case SECURITY_ENFORCED:
			case SYSTEM_MODE:
			case USER_MODE:
			case REFERENCE:
			case CUBE:
			case FORMAT:
			case TRACKING:
			case VIEWSTAT:
			case CUSTOM:
			case STANDARD:
			case DISTANCE:
			case GEOLOCATION:
			case GROUPING:
			case CONVERT_CURRENCY:
			case CALENDAR_MONTH:
			case CALENDAR_QUARTER:
			case CALENDAR_YEAR:
			case DAY_IN_MONTH:
			case DAY_IN_WEEK:
			case DAY_IN_YEAR:
			case DAY_ONLY:
			case FISCAL_MONTH:
			case FISCAL_QUARTER:
			case FISCAL_YEAR:
			case HOUR_IN_DAY:
			case WEEK_IN_MONTH:
			case WEEK_IN_YEAR:
			case CONVERT_TIMEZONE:
			case YESTERDAY:
			case TODAY:
			case TOMORROW:
			case LAST_WEEK:
			case THIS_WEEK:
			case NEXT_WEEK:
			case LAST_MONTH:
			case THIS_MONTH:
			case NEXT_MONTH:
			case LAST_90_DAYS:
			case NEXT_90_DAYS:
			case LAST_N_DAYS_N:
			case NEXT_N_DAYS_N:
			case N_DAYS_AGO_N:
			case NEXT_N_WEEKS_N:
			case LAST_N_WEEKS_N:
			case N_WEEKS_AGO_N:
			case NEXT_N_MONTHS_N:
			case LAST_N_MONTHS_N:
			case N_MONTHS_AGO_N:
			case THIS_QUARTER:
			case LAST_QUARTER:
			case NEXT_QUARTER:
			case NEXT_N_QUARTERS_N:
			case LAST_N_QUARTERS_N:
			case N_QUARTERS_AGO_N:
			case THIS_YEAR:
			case LAST_YEAR:
			case NEXT_YEAR:
			case NEXT_N_YEARS_N:
			case LAST_N_YEARS_N:
			case N_YEARS_AGO_N:
			case THIS_FISCAL_QUARTER:
			case LAST_FISCAL_QUARTER:
			case NEXT_FISCAL_QUARTER:
			case NEXT_N_FISCAL_QUARTERS_N:
			case LAST_N_FISCAL_QUARTERS_N:
			case N_FISCAL_QUARTERS_AGO_N:
			case THIS_FISCAL_YEAR:
			case LAST_FISCAL_YEAR:
			case NEXT_FISCAL_YEAR:
			case NEXT_N_FISCAL_YEARS_N:
			case LAST_N_FISCAL_YEARS_N:
			case N_FISCAL_YEARS_AGO_N:
			case IntegralCurrencyLiteral:
			case FIND:
			case EMAIL:
			case NAME:
			case PHONE:
			case SIDEBAR:
			case FIELDS:
			case METADATA:
			case PRICEBOOKID:
			case NETWORK:
			case SNIPPET:
			case TARGET_LENGTH:
			case DIVISION:
			case RETURNING:
			case LISTVIEW:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				soqlId();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				match(LPAREN);
				setState(1607);
				soqlId();
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1608);
					match(COMMA);
					setState(1609);
					soqlId();
					}
					}
					setState(1614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1615);
				match(LPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilteringSelectorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ApexParser.AT, 0); }
		public TerminalNode ABOVE() { return getToken(ApexParser.ABOVE, 0); }
		public TerminalNode BELOW() { return getToken(ApexParser.BELOW, 0); }
		public TerminalNode ABOVE_OR_BELOW() { return getToken(ApexParser.ABOVE_OR_BELOW, 0); }
		public FilteringSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filteringSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFilteringSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFilteringSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFilteringSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilteringSelectorContext filteringSelector() throws RecognitionException {
		FilteringSelectorContext _localctx = new FilteringSelectorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_filteringSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ApexParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ApexParser.BY, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(ApexParser.HAVING, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode ROLLUP() { return getToken(ApexParser.ROLLUP, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public TerminalNode CUBE() { return getToken(ApexParser.CUBE, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_groupByClause);
		int _la;
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				match(GROUP);
				setState(1622);
				match(BY);
				setState(1623);
				selectList();
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(1624);
					match(HAVING);
					setState(1625);
					logicalExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				match(GROUP);
				setState(1629);
				match(BY);
				setState(1630);
				match(ROLLUP);
				setState(1631);
				match(LPAREN);
				setState(1632);
				fieldName();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1633);
					match(COMMA);
					setState(1634);
					fieldName();
					}
					}
					setState(1639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1640);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1642);
				match(GROUP);
				setState(1643);
				match(BY);
				setState(1644);
				match(CUBE);
				setState(1645);
				match(LPAREN);
				setState(1646);
				fieldName();
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1647);
					match(COMMA);
					setState(1648);
					fieldName();
					}
					}
					setState(1653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1654);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ApexParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ApexParser.BY, 0); }
		public FieldOrderListContext fieldOrderList() {
			return getRuleContext(FieldOrderListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			match(ORDER);
			setState(1659);
			match(BY);
			setState(1660);
			fieldOrderList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOrderListContext extends ParserRuleContext {
		public List<FieldOrderContext> fieldOrder() {
			return getRuleContexts(FieldOrderContext.class);
		}
		public FieldOrderContext fieldOrder(int i) {
			return getRuleContext(FieldOrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public FieldOrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldOrderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldOrderList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldOrderList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrderListContext fieldOrderList() throws RecognitionException {
		FieldOrderListContext _localctx = new FieldOrderListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_fieldOrderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			fieldOrder();
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1663);
				match(COMMA);
				setState(1664);
				fieldOrder();
				}
				}
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOrderContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ApexParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(ApexParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ApexParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ApexParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ApexParser.LAST, 0); }
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public FieldOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrderContext fieldOrder() throws RecognitionException {
		FieldOrderContext _localctx = new FieldOrderContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_fieldOrder);
		int _la;
		try {
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670);
				fieldName();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1671);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(1674);
					match(NULLS);
					setState(1675);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==LAST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				soqlFunction();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1679);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(1682);
					match(NULLS);
					setState(1683);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==LAST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ApexParser.LIMIT, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_limitClause);
		try {
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				match(LIMIT);
				setState(1689);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				match(LIMIT);
				setState(1691);
				boundExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(ApexParser.OFFSET, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_offsetClause);
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694);
				match(OFFSET);
				setState(1695);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(OFFSET);
				setState(1697);
				boundExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllRowsClauseContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(ApexParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(ApexParser.ROWS, 0); }
		public AllRowsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allRowsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterAllRowsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitAllRowsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitAllRowsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllRowsClauseContext allRowsClause() throws RecognitionException {
		AllRowsClauseContext _localctx = new AllRowsClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_allRowsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(ALL);
			setState(1701);
			match(ROWS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClausesContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(ApexParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(ApexParser.FOR, i);
		}
		public List<TerminalNode> VIEW() { return getTokens(ApexParser.VIEW); }
		public TerminalNode VIEW(int i) {
			return getToken(ApexParser.VIEW, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(ApexParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(ApexParser.UPDATE, i);
		}
		public List<TerminalNode> REFERENCE() { return getTokens(ApexParser.REFERENCE); }
		public TerminalNode REFERENCE(int i) {
			return getToken(ApexParser.REFERENCE, i);
		}
		public ForClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterForClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitForClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitForClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClausesContext forClauses() throws RecognitionException {
		ForClausesContext _localctx = new ForClausesContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_forClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(1703);
				match(FOR);
				setState(1704);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 1152991873351024641L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoundExpressionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ApexParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterBoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitBoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitBoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundExpressionContext boundExpression() throws RecognitionException {
		BoundExpressionContext _localctx = new BoundExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_boundExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(COLON);
			setState(1711);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateFormulaContext extends ParserRuleContext {
		public TerminalNode YESTERDAY() { return getToken(ApexParser.YESTERDAY, 0); }
		public TerminalNode TODAY() { return getToken(ApexParser.TODAY, 0); }
		public TerminalNode TOMORROW() { return getToken(ApexParser.TOMORROW, 0); }
		public TerminalNode LAST_WEEK() { return getToken(ApexParser.LAST_WEEK, 0); }
		public TerminalNode THIS_WEEK() { return getToken(ApexParser.THIS_WEEK, 0); }
		public TerminalNode NEXT_WEEK() { return getToken(ApexParser.NEXT_WEEK, 0); }
		public TerminalNode LAST_MONTH() { return getToken(ApexParser.LAST_MONTH, 0); }
		public TerminalNode THIS_MONTH() { return getToken(ApexParser.THIS_MONTH, 0); }
		public TerminalNode NEXT_MONTH() { return getToken(ApexParser.NEXT_MONTH, 0); }
		public TerminalNode LAST_90_DAYS() { return getToken(ApexParser.LAST_90_DAYS, 0); }
		public TerminalNode NEXT_90_DAYS() { return getToken(ApexParser.NEXT_90_DAYS, 0); }
		public TerminalNode LAST_N_DAYS_N() { return getToken(ApexParser.LAST_N_DAYS_N, 0); }
		public TerminalNode COLON() { return getToken(ApexParser.COLON, 0); }
		public SignedIntegerContext signedInteger() {
			return getRuleContext(SignedIntegerContext.class,0);
		}
		public TerminalNode NEXT_N_DAYS_N() { return getToken(ApexParser.NEXT_N_DAYS_N, 0); }
		public TerminalNode N_DAYS_AGO_N() { return getToken(ApexParser.N_DAYS_AGO_N, 0); }
		public TerminalNode NEXT_N_WEEKS_N() { return getToken(ApexParser.NEXT_N_WEEKS_N, 0); }
		public TerminalNode LAST_N_WEEKS_N() { return getToken(ApexParser.LAST_N_WEEKS_N, 0); }
		public TerminalNode N_WEEKS_AGO_N() { return getToken(ApexParser.N_WEEKS_AGO_N, 0); }
		public TerminalNode NEXT_N_MONTHS_N() { return getToken(ApexParser.NEXT_N_MONTHS_N, 0); }
		public TerminalNode LAST_N_MONTHS_N() { return getToken(ApexParser.LAST_N_MONTHS_N, 0); }
		public TerminalNode N_MONTHS_AGO_N() { return getToken(ApexParser.N_MONTHS_AGO_N, 0); }
		public TerminalNode THIS_QUARTER() { return getToken(ApexParser.THIS_QUARTER, 0); }
		public TerminalNode LAST_QUARTER() { return getToken(ApexParser.LAST_QUARTER, 0); }
		public TerminalNode NEXT_QUARTER() { return getToken(ApexParser.NEXT_QUARTER, 0); }
		public TerminalNode NEXT_N_QUARTERS_N() { return getToken(ApexParser.NEXT_N_QUARTERS_N, 0); }
		public TerminalNode LAST_N_QUARTERS_N() { return getToken(ApexParser.LAST_N_QUARTERS_N, 0); }
		public TerminalNode N_QUARTERS_AGO_N() { return getToken(ApexParser.N_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_YEAR() { return getToken(ApexParser.THIS_YEAR, 0); }
		public TerminalNode LAST_YEAR() { return getToken(ApexParser.LAST_YEAR, 0); }
		public TerminalNode NEXT_YEAR() { return getToken(ApexParser.NEXT_YEAR, 0); }
		public TerminalNode NEXT_N_YEARS_N() { return getToken(ApexParser.NEXT_N_YEARS_N, 0); }
		public TerminalNode LAST_N_YEARS_N() { return getToken(ApexParser.LAST_N_YEARS_N, 0); }
		public TerminalNode N_YEARS_AGO_N() { return getToken(ApexParser.N_YEARS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_QUARTER() { return getToken(ApexParser.THIS_FISCAL_QUARTER, 0); }
		public TerminalNode LAST_FISCAL_QUARTER() { return getToken(ApexParser.LAST_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_FISCAL_QUARTER() { return getToken(ApexParser.NEXT_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.NEXT_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode LAST_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.LAST_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode N_FISCAL_QUARTERS_AGO_N() { return getToken(ApexParser.N_FISCAL_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_YEAR() { return getToken(ApexParser.THIS_FISCAL_YEAR, 0); }
		public TerminalNode LAST_FISCAL_YEAR() { return getToken(ApexParser.LAST_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_FISCAL_YEAR() { return getToken(ApexParser.NEXT_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_N_FISCAL_YEARS_N() { return getToken(ApexParser.NEXT_N_FISCAL_YEARS_N, 0); }
		public TerminalNode LAST_N_FISCAL_YEARS_N() { return getToken(ApexParser.LAST_N_FISCAL_YEARS_N, 0); }
		public TerminalNode N_FISCAL_YEARS_AGO_N() { return getToken(ApexParser.N_FISCAL_YEARS_AGO_N, 0); }
		public DateFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterDateFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitDateFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitDateFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateFormulaContext dateFormula() throws RecognitionException {
		DateFormulaContext _localctx = new DateFormulaContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_dateFormula);
		try {
			setState(1799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YESTERDAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				match(YESTERDAY);
				}
				break;
			case TODAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				match(TODAY);
				}
				break;
			case TOMORROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
				match(TOMORROW);
				}
				break;
			case LAST_WEEK:
				enterOuterAlt(_localctx, 4);
				{
				setState(1716);
				match(LAST_WEEK);
				}
				break;
			case THIS_WEEK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1717);
				match(THIS_WEEK);
				}
				break;
			case NEXT_WEEK:
				enterOuterAlt(_localctx, 6);
				{
				setState(1718);
				match(NEXT_WEEK);
				}
				break;
			case LAST_MONTH:
				enterOuterAlt(_localctx, 7);
				{
				setState(1719);
				match(LAST_MONTH);
				}
				break;
			case THIS_MONTH:
				enterOuterAlt(_localctx, 8);
				{
				setState(1720);
				match(THIS_MONTH);
				}
				break;
			case NEXT_MONTH:
				enterOuterAlt(_localctx, 9);
				{
				setState(1721);
				match(NEXT_MONTH);
				}
				break;
			case LAST_90_DAYS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1722);
				match(LAST_90_DAYS);
				}
				break;
			case NEXT_90_DAYS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1723);
				match(NEXT_90_DAYS);
				}
				break;
			case LAST_N_DAYS_N:
				enterOuterAlt(_localctx, 12);
				{
				setState(1724);
				match(LAST_N_DAYS_N);
				setState(1725);
				match(COLON);
				setState(1726);
				signedInteger();
				}
				break;
			case NEXT_N_DAYS_N:
				enterOuterAlt(_localctx, 13);
				{
				setState(1727);
				match(NEXT_N_DAYS_N);
				setState(1728);
				match(COLON);
				setState(1729);
				signedInteger();
				}
				break;
			case N_DAYS_AGO_N:
				enterOuterAlt(_localctx, 14);
				{
				setState(1730);
				match(N_DAYS_AGO_N);
				setState(1731);
				match(COLON);
				setState(1732);
				signedInteger();
				}
				break;
			case NEXT_N_WEEKS_N:
				enterOuterAlt(_localctx, 15);
				{
				setState(1733);
				match(NEXT_N_WEEKS_N);
				setState(1734);
				match(COLON);
				setState(1735);
				signedInteger();
				}
				break;
			case LAST_N_WEEKS_N:
				enterOuterAlt(_localctx, 16);
				{
				setState(1736);
				match(LAST_N_WEEKS_N);
				setState(1737);
				match(COLON);
				setState(1738);
				signedInteger();
				}
				break;
			case N_WEEKS_AGO_N:
				enterOuterAlt(_localctx, 17);
				{
				setState(1739);
				match(N_WEEKS_AGO_N);
				setState(1740);
				match(COLON);
				setState(1741);
				signedInteger();
				}
				break;
			case NEXT_N_MONTHS_N:
				enterOuterAlt(_localctx, 18);
				{
				setState(1742);
				match(NEXT_N_MONTHS_N);
				setState(1743);
				match(COLON);
				setState(1744);
				signedInteger();
				}
				break;
			case LAST_N_MONTHS_N:
				enterOuterAlt(_localctx, 19);
				{
				setState(1745);
				match(LAST_N_MONTHS_N);
				setState(1746);
				match(COLON);
				setState(1747);
				signedInteger();
				}
				break;
			case N_MONTHS_AGO_N:
				enterOuterAlt(_localctx, 20);
				{
				setState(1748);
				match(N_MONTHS_AGO_N);
				setState(1749);
				match(COLON);
				setState(1750);
				signedInteger();
				}
				break;
			case THIS_QUARTER:
				enterOuterAlt(_localctx, 21);
				{
				setState(1751);
				match(THIS_QUARTER);
				}
				break;
			case LAST_QUARTER:
				enterOuterAlt(_localctx, 22);
				{
				setState(1752);
				match(LAST_QUARTER);
				}
				break;
			case NEXT_QUARTER:
				enterOuterAlt(_localctx, 23);
				{
				setState(1753);
				match(NEXT_QUARTER);
				}
				break;
			case NEXT_N_QUARTERS_N:
				enterOuterAlt(_localctx, 24);
				{
				setState(1754);
				match(NEXT_N_QUARTERS_N);
				setState(1755);
				match(COLON);
				setState(1756);
				signedInteger();
				}
				break;
			case LAST_N_QUARTERS_N:
				enterOuterAlt(_localctx, 25);
				{
				setState(1757);
				match(LAST_N_QUARTERS_N);
				setState(1758);
				match(COLON);
				setState(1759);
				signedInteger();
				}
				break;
			case N_QUARTERS_AGO_N:
				enterOuterAlt(_localctx, 26);
				{
				setState(1760);
				match(N_QUARTERS_AGO_N);
				setState(1761);
				match(COLON);
				setState(1762);
				signedInteger();
				}
				break;
			case THIS_YEAR:
				enterOuterAlt(_localctx, 27);
				{
				setState(1763);
				match(THIS_YEAR);
				}
				break;
			case LAST_YEAR:
				enterOuterAlt(_localctx, 28);
				{
				setState(1764);
				match(LAST_YEAR);
				}
				break;
			case NEXT_YEAR:
				enterOuterAlt(_localctx, 29);
				{
				setState(1765);
				match(NEXT_YEAR);
				}
				break;
			case NEXT_N_YEARS_N:
				enterOuterAlt(_localctx, 30);
				{
				setState(1766);
				match(NEXT_N_YEARS_N);
				setState(1767);
				match(COLON);
				setState(1768);
				signedInteger();
				}
				break;
			case LAST_N_YEARS_N:
				enterOuterAlt(_localctx, 31);
				{
				setState(1769);
				match(LAST_N_YEARS_N);
				setState(1770);
				match(COLON);
				setState(1771);
				signedInteger();
				}
				break;
			case N_YEARS_AGO_N:
				enterOuterAlt(_localctx, 32);
				{
				setState(1772);
				match(N_YEARS_AGO_N);
				setState(1773);
				match(COLON);
				setState(1774);
				signedInteger();
				}
				break;
			case THIS_FISCAL_QUARTER:
				enterOuterAlt(_localctx, 33);
				{
				setState(1775);
				match(THIS_FISCAL_QUARTER);
				}
				break;
			case LAST_FISCAL_QUARTER:
				enterOuterAlt(_localctx, 34);
				{
				setState(1776);
				match(LAST_FISCAL_QUARTER);
				}
				break;
			case NEXT_FISCAL_QUARTER:
				enterOuterAlt(_localctx, 35);
				{
				setState(1777);
				match(NEXT_FISCAL_QUARTER);
				}
				break;
			case NEXT_N_FISCAL_QUARTERS_N:
				enterOuterAlt(_localctx, 36);
				{
				setState(1778);
				match(NEXT_N_FISCAL_QUARTERS_N);
				setState(1779);
				match(COLON);
				setState(1780);
				signedInteger();
				}
				break;
			case LAST_N_FISCAL_QUARTERS_N:
				enterOuterAlt(_localctx, 37);
				{
				setState(1781);
				match(LAST_N_FISCAL_QUARTERS_N);
				setState(1782);
				match(COLON);
				setState(1783);
				signedInteger();
				}
				break;
			case N_FISCAL_QUARTERS_AGO_N:
				enterOuterAlt(_localctx, 38);
				{
				setState(1784);
				match(N_FISCAL_QUARTERS_AGO_N);
				setState(1785);
				match(COLON);
				setState(1786);
				signedInteger();
				}
				break;
			case THIS_FISCAL_YEAR:
				enterOuterAlt(_localctx, 39);
				{
				setState(1787);
				match(THIS_FISCAL_YEAR);
				}
				break;
			case LAST_FISCAL_YEAR:
				enterOuterAlt(_localctx, 40);
				{
				setState(1788);
				match(LAST_FISCAL_YEAR);
				}
				break;
			case NEXT_FISCAL_YEAR:
				enterOuterAlt(_localctx, 41);
				{
				setState(1789);
				match(NEXT_FISCAL_YEAR);
				}
				break;
			case NEXT_N_FISCAL_YEARS_N:
				enterOuterAlt(_localctx, 42);
				{
				setState(1790);
				match(NEXT_N_FISCAL_YEARS_N);
				setState(1791);
				match(COLON);
				setState(1792);
				signedInteger();
				}
				break;
			case LAST_N_FISCAL_YEARS_N:
				enterOuterAlt(_localctx, 43);
				{
				setState(1793);
				match(LAST_N_FISCAL_YEARS_N);
				setState(1794);
				match(COLON);
				setState(1795);
				signedInteger();
				}
				break;
			case N_FISCAL_YEARS_AGO_N:
				enterOuterAlt(_localctx, 44);
				{
				setState(1796);
				match(N_FISCAL_YEARS_AGO_N);
				setState(1797);
				match(COLON);
				setState(1798);
				signedInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedIntegerContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public TerminalNode ADD() { return getToken(ApexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ApexParser.SUB, 0); }
		public SignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedIntegerContext signedInteger() throws RecognitionException {
		SignedIntegerContext _localctx = new SignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_signedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(1801);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1804);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoqlIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SoqlIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soqlId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoqlId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoqlId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoqlId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoqlIdContext soqlId() throws RecognitionException {
		SoqlIdContext _localctx = new SoqlIdContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_soqlId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoslLiteralContext extends ParserRuleContext {
		public TerminalNode FindLiteral() { return getToken(ApexParser.FindLiteral, 0); }
		public SoslClausesContext soslClauses() {
			return getRuleContext(SoslClausesContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ApexParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(ApexParser.LBRACK, 0); }
		public TerminalNode FIND() { return getToken(ApexParser.FIND, 0); }
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public SoslLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soslLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoslLiteralContext soslLiteral() throws RecognitionException {
		SoslLiteralContext _localctx = new SoslLiteralContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_soslLiteral);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FindLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				match(FindLiteral);
				setState(1809);
				soslClauses();
				setState(1810);
				match(RBRACK);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				match(LBRACK);
				setState(1813);
				match(FIND);
				setState(1814);
				boundExpression();
				setState(1815);
				soslClauses();
				setState(1816);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoslLiteralAltContext extends ParserRuleContext {
		public TerminalNode FindLiteralAlt() { return getToken(ApexParser.FindLiteralAlt, 0); }
		public SoslClausesContext soslClauses() {
			return getRuleContext(SoslClausesContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ApexParser.RBRACK, 0); }
		public SoslLiteralAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soslLiteralAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoslLiteralAltContext soslLiteralAlt() throws RecognitionException {
		SoslLiteralAltContext _localctx = new SoslLiteralAltContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_soslLiteralAlt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(FindLiteralAlt);
			setState(1821);
			soslClauses();
			setState(1822);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoslClausesContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(ApexParser.IN, 0); }
		public SearchGroupContext searchGroup() {
			return getRuleContext(SearchGroupContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(ApexParser.RETURNING, 0); }
		public FieldSpecListContext fieldSpecList() {
			return getRuleContext(FieldSpecListContext.class,0);
		}
		public List<SoslWithClauseContext> soslWithClause() {
			return getRuleContexts(SoslWithClauseContext.class);
		}
		public SoslWithClauseContext soslWithClause(int i) {
			return getRuleContext(SoslWithClauseContext.class,i);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public SoslClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soslClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoslClausesContext soslClauses() throws RecognitionException {
		SoslClausesContext _localctx = new SoslClausesContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_soslClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(1824);
				match(IN);
				setState(1825);
				searchGroup();
				}
			}

			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1828);
				match(RETURNING);
				setState(1829);
				fieldSpecList();
				}
			}

			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH) {
				{
				{
				setState(1832);
				soslWithClause();
				}
				}
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1838);
				limitClause();
				}
			}

			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPDATE) {
				{
				setState(1841);
				match(UPDATE);
				setState(1842);
				updateList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoslWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ApexParser.WITH, 0); }
		public TerminalNode DIVISION() { return getToken(ApexParser.DIVISION, 0); }
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode DATA() { return getToken(ApexParser.DATA, 0); }
		public TerminalNode CATEGORY() { return getToken(ApexParser.CATEGORY, 0); }
		public FilteringExpressionContext filteringExpression() {
			return getRuleContext(FilteringExpressionContext.class,0);
		}
		public TerminalNode SNIPPET() { return getToken(ApexParser.SNIPPET, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode TARGET_LENGTH() { return getToken(ApexParser.TARGET_LENGTH, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ApexParser.IntegerLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TerminalNode NETWORK() { return getToken(ApexParser.NETWORK, 0); }
		public TerminalNode IN() { return getToken(ApexParser.IN, 0); }
		public NetworkListContext networkList() {
			return getRuleContext(NetworkListContext.class,0);
		}
		public TerminalNode PRICEBOOKID() { return getToken(ApexParser.PRICEBOOKID, 0); }
		public TerminalNode METADATA() { return getToken(ApexParser.METADATA, 0); }
		public TerminalNode USER_MODE() { return getToken(ApexParser.USER_MODE, 0); }
		public TerminalNode SYSTEM_MODE() { return getToken(ApexParser.SYSTEM_MODE, 0); }
		public SoslWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soslWithClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoslWithClauseContext soslWithClause() throws RecognitionException {
		SoslWithClauseContext _localctx = new SoslWithClauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_soslWithClause);
		int _la;
		try {
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				match(WITH);
				setState(1846);
				match(DIVISION);
				setState(1847);
				match(ASSIGN);
				setState(1848);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(WITH);
				setState(1850);
				match(DATA);
				setState(1851);
				match(CATEGORY);
				setState(1852);
				filteringExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1853);
				match(WITH);
				setState(1854);
				match(SNIPPET);
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1855);
					match(LPAREN);
					setState(1856);
					match(TARGET_LENGTH);
					setState(1857);
					match(ASSIGN);
					setState(1858);
					match(IntegerLiteral);
					setState(1859);
					match(RPAREN);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1862);
				match(WITH);
				setState(1863);
				match(NETWORK);
				setState(1864);
				match(IN);
				setState(1865);
				match(LPAREN);
				setState(1866);
				networkList();
				setState(1867);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1869);
				match(WITH);
				setState(1870);
				match(NETWORK);
				setState(1871);
				match(ASSIGN);
				setState(1872);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1873);
				match(WITH);
				setState(1874);
				match(PRICEBOOKID);
				setState(1875);
				match(ASSIGN);
				setState(1876);
				match(StringLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1877);
				match(WITH);
				setState(1878);
				match(METADATA);
				setState(1879);
				match(ASSIGN);
				setState(1880);
				match(StringLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1881);
				match(WITH);
				setState(1882);
				match(USER_MODE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1883);
				match(WITH);
				setState(1884);
				match(SYSTEM_MODE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SearchGroupContext extends ParserRuleContext {
		public TerminalNode FIELDS() { return getToken(ApexParser.FIELDS, 0); }
		public TerminalNode ALL() { return getToken(ApexParser.ALL, 0); }
		public TerminalNode EMAIL() { return getToken(ApexParser.EMAIL, 0); }
		public TerminalNode NAME() { return getToken(ApexParser.NAME, 0); }
		public TerminalNode PHONE() { return getToken(ApexParser.PHONE, 0); }
		public TerminalNode SIDEBAR() { return getToken(ApexParser.SIDEBAR, 0); }
		public SearchGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSearchGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSearchGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSearchGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchGroupContext searchGroup() throws RecognitionException {
		SearchGroupContext _localctx = new SearchGroupContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_searchGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1888);
			match(FIELDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldSpecListContext extends ParserRuleContext {
		public FieldSpecContext fieldSpec() {
			return getRuleContext(FieldSpecContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public List<FieldSpecListContext> fieldSpecList() {
			return getRuleContexts(FieldSpecListContext.class);
		}
		public FieldSpecListContext fieldSpecList(int i) {
			return getRuleContext(FieldSpecListContext.class,i);
		}
		public FieldSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldSpecList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldSpecListContext fieldSpecList() throws RecognitionException {
		FieldSpecListContext _localctx = new FieldSpecListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fieldSpecList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			fieldSpec();
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1891);
					match(COMMA);
					setState(1892);
					fieldSpecList();
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldSpecContext extends ParserRuleContext {
		public List<SoslIdContext> soslId() {
			return getRuleContexts(SoslIdContext.class);
		}
		public SoslIdContext soslId(int i) {
			return getRuleContext(SoslIdContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(ApexParser.WHERE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(ApexParser.USING, 0); }
		public TerminalNode LISTVIEW() { return getToken(ApexParser.LISTVIEW, 0); }
		public TerminalNode ASSIGN() { return getToken(ApexParser.ASSIGN, 0); }
		public TerminalNode ORDER() { return getToken(ApexParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ApexParser.BY, 0); }
		public FieldOrderListContext fieldOrderList() {
			return getRuleContext(FieldOrderListContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public FieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldSpecContext fieldSpec() throws RecognitionException {
		FieldSpecContext _localctx = new FieldSpecContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_fieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			soslId();
			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1899);
				match(LPAREN);
				setState(1900);
				fieldList();
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1901);
					match(WHERE);
					setState(1902);
					logicalExpression();
					}
				}

				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1905);
					match(USING);
					setState(1906);
					match(LISTVIEW);
					setState(1907);
					match(ASSIGN);
					setState(1908);
					soslId();
					}
				}

				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1911);
					match(ORDER);
					setState(1912);
					match(BY);
					setState(1913);
					fieldOrderList();
					}
				}

				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1916);
					limitClause();
					}
				}

				setState(1920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(1919);
					offsetClause();
					}
				}

				setState(1922);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldListContext extends ParserRuleContext {
		public List<SoslIdContext> soslId() {
			return getRuleContexts(SoslIdContext.class);
		}
		public SoslIdContext soslId(int i) {
			return getRuleContext(SoslIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApexParser.COMMA, i);
		}
		public List<FieldListContext> fieldList() {
			return getRuleContexts(FieldListContext.class);
		}
		public FieldListContext fieldList(int i) {
			return getRuleContext(FieldListContext.class,i);
		}
		public TerminalNode TOLABEL() { return getToken(ApexParser.TOLABEL, 0); }
		public TerminalNode LPAREN() { return getToken(ApexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApexParser.RPAREN, 0); }
		public TerminalNode CONVERT_CURRENCY() { return getToken(ApexParser.CONVERT_CURRENCY, 0); }
		public TerminalNode FORMAT() { return getToken(ApexParser.FORMAT, 0); }
		public SoqlFunctionContext soqlFunction() {
			return getRuleContext(SoqlFunctionContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_fieldList);
		try {
			int _alt;
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				soslId();
				setState(1931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1927);
						match(COMMA);
						setState(1928);
						fieldList();
						}
						} 
					}
					setState(1933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				match(TOLABEL);
				setState(1935);
				match(LPAREN);
				setState(1936);
				soslId();
				setState(1937);
				match(RPAREN);
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1938);
					soslId();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1941);
				match(CONVERT_CURRENCY);
				setState(1942);
				match(LPAREN);
				setState(1943);
				soslId();
				setState(1944);
				match(RPAREN);
				setState(1946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1945);
					soslId();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1948);
				match(FORMAT);
				setState(1949);
				match(LPAREN);
				setState(1952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1950);
					soslId();
					}
					break;
				case 2:
					{
					setState(1951);
					soqlFunction();
					}
					break;
				}
				setState(1954);
				match(RPAREN);
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1955);
					soslId();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateListContext extends ParserRuleContext {
		public UpdateTypeContext updateType() {
			return getRuleContext(UpdateTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ApexParser.COMMA, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public UpdateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUpdateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUpdateList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUpdateList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateListContext updateList() throws RecognitionException {
		UpdateListContext _localctx = new UpdateListContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_updateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			updateType();
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1961);
				match(COMMA);
				setState(1962);
				updateList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateTypeContext extends ParserRuleContext {
		public TerminalNode TRACKING() { return getToken(ApexParser.TRACKING, 0); }
		public TerminalNode VIEWSTAT() { return getToken(ApexParser.VIEWSTAT, 0); }
		public UpdateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterUpdateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitUpdateType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitUpdateType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateTypeContext updateType() throws RecognitionException {
		UpdateTypeContext _localctx = new UpdateTypeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_updateType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			_la = _input.LA(1);
			if ( !(_la==TRACKING || _la==VIEWSTAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NetworkListContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ApexParser.StringLiteral, 0); }
		public TerminalNode COMMA() { return getToken(ApexParser.COMMA, 0); }
		public NetworkListContext networkList() {
			return getRuleContext(NetworkListContext.class,0);
		}
		public NetworkListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_networkList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterNetworkList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitNetworkList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitNetworkList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetworkListContext networkList() throws RecognitionException {
		NetworkListContext _localctx = new NetworkListContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_networkList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(StringLiteral);
			setState(1970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1968);
				match(COMMA);
				setState(1969);
				networkList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoslIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ApexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ApexParser.DOT, i);
		}
		public List<SoslIdContext> soslId() {
			return getRuleContexts(SoslIdContext.class);
		}
		public SoslIdContext soslId(int i) {
			return getRuleContext(SoslIdContext.class,i);
		}
		public SoslIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soslId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterSoslId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitSoslId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitSoslId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoslIdContext soslId() throws RecognitionException {
		SoslIdContext _localctx = new SoslIdContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_soslId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			id();
			setState(1977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					match(DOT);
					setState(1974);
					soslId();
					}
					} 
				}
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ApexParser.Identifier, 0); }
		public TerminalNode AFTER() { return getToken(ApexParser.AFTER, 0); }
		public TerminalNode BEFORE() { return getToken(ApexParser.BEFORE, 0); }
		public TerminalNode GET() { return getToken(ApexParser.GET, 0); }
		public TerminalNode INHERITED() { return getToken(ApexParser.INHERITED, 0); }
		public TerminalNode INSTANCEOF() { return getToken(ApexParser.INSTANCEOF, 0); }
		public TerminalNode SET() { return getToken(ApexParser.SET, 0); }
		public TerminalNode SHARING() { return getToken(ApexParser.SHARING, 0); }
		public TerminalNode SWITCH() { return getToken(ApexParser.SWITCH, 0); }
		public TerminalNode TRANSIENT() { return getToken(ApexParser.TRANSIENT, 0); }
		public TerminalNode TRIGGER() { return getToken(ApexParser.TRIGGER, 0); }
		public TerminalNode WHEN() { return getToken(ApexParser.WHEN, 0); }
		public TerminalNode WITH() { return getToken(ApexParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(ApexParser.WITHOUT, 0); }
		public TerminalNode USER() { return getToken(ApexParser.USER, 0); }
		public TerminalNode SYSTEM() { return getToken(ApexParser.SYSTEM, 0); }
		public TerminalNode IntegralCurrencyLiteral() { return getToken(ApexParser.IntegralCurrencyLiteral, 0); }
		public TerminalNode SELECT() { return getToken(ApexParser.SELECT, 0); }
		public TerminalNode COUNT() { return getToken(ApexParser.COUNT, 0); }
		public TerminalNode FROM() { return getToken(ApexParser.FROM, 0); }
		public TerminalNode AS() { return getToken(ApexParser.AS, 0); }
		public TerminalNode USING() { return getToken(ApexParser.USING, 0); }
		public TerminalNode SCOPE() { return getToken(ApexParser.SCOPE, 0); }
		public TerminalNode WHERE() { return getToken(ApexParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(ApexParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ApexParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(ApexParser.LIMIT, 0); }
		public TerminalNode SOQLAND() { return getToken(ApexParser.SOQLAND, 0); }
		public TerminalNode SOQLOR() { return getToken(ApexParser.SOQLOR, 0); }
		public TerminalNode NOT() { return getToken(ApexParser.NOT, 0); }
		public TerminalNode AVG() { return getToken(ApexParser.AVG, 0); }
		public TerminalNode COUNT_DISTINCT() { return getToken(ApexParser.COUNT_DISTINCT, 0); }
		public TerminalNode MIN() { return getToken(ApexParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ApexParser.MAX, 0); }
		public TerminalNode SUM() { return getToken(ApexParser.SUM, 0); }
		public TerminalNode TYPEOF() { return getToken(ApexParser.TYPEOF, 0); }
		public TerminalNode END() { return getToken(ApexParser.END, 0); }
		public TerminalNode THEN() { return getToken(ApexParser.THEN, 0); }
		public TerminalNode LIKE() { return getToken(ApexParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(ApexParser.IN, 0); }
		public TerminalNode INCLUDES() { return getToken(ApexParser.INCLUDES, 0); }
		public TerminalNode EXCLUDES() { return getToken(ApexParser.EXCLUDES, 0); }
		public TerminalNode ASC() { return getToken(ApexParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ApexParser.DESC, 0); }
		public TerminalNode NULLS() { return getToken(ApexParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(ApexParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ApexParser.LAST, 0); }
		public TerminalNode GROUP() { return getToken(ApexParser.GROUP, 0); }
		public TerminalNode ALL() { return getToken(ApexParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(ApexParser.ROWS, 0); }
		public TerminalNode VIEW() { return getToken(ApexParser.VIEW, 0); }
		public TerminalNode HAVING() { return getToken(ApexParser.HAVING, 0); }
		public TerminalNode ROLLUP() { return getToken(ApexParser.ROLLUP, 0); }
		public TerminalNode TOLABEL() { return getToken(ApexParser.TOLABEL, 0); }
		public TerminalNode OFFSET() { return getToken(ApexParser.OFFSET, 0); }
		public TerminalNode DATA() { return getToken(ApexParser.DATA, 0); }
		public TerminalNode CATEGORY() { return getToken(ApexParser.CATEGORY, 0); }
		public TerminalNode AT() { return getToken(ApexParser.AT, 0); }
		public TerminalNode ABOVE() { return getToken(ApexParser.ABOVE, 0); }
		public TerminalNode BELOW() { return getToken(ApexParser.BELOW, 0); }
		public TerminalNode ABOVE_OR_BELOW() { return getToken(ApexParser.ABOVE_OR_BELOW, 0); }
		public TerminalNode SECURITY_ENFORCED() { return getToken(ApexParser.SECURITY_ENFORCED, 0); }
		public TerminalNode USER_MODE() { return getToken(ApexParser.USER_MODE, 0); }
		public TerminalNode SYSTEM_MODE() { return getToken(ApexParser.SYSTEM_MODE, 0); }
		public TerminalNode REFERENCE() { return getToken(ApexParser.REFERENCE, 0); }
		public TerminalNode CUBE() { return getToken(ApexParser.CUBE, 0); }
		public TerminalNode FORMAT() { return getToken(ApexParser.FORMAT, 0); }
		public TerminalNode TRACKING() { return getToken(ApexParser.TRACKING, 0); }
		public TerminalNode VIEWSTAT() { return getToken(ApexParser.VIEWSTAT, 0); }
		public TerminalNode STANDARD() { return getToken(ApexParser.STANDARD, 0); }
		public TerminalNode CUSTOM() { return getToken(ApexParser.CUSTOM, 0); }
		public TerminalNode DISTANCE() { return getToken(ApexParser.DISTANCE, 0); }
		public TerminalNode GEOLOCATION() { return getToken(ApexParser.GEOLOCATION, 0); }
		public TerminalNode GROUPING() { return getToken(ApexParser.GROUPING, 0); }
		public TerminalNode CONVERT_CURRENCY() { return getToken(ApexParser.CONVERT_CURRENCY, 0); }
		public TerminalNode CALENDAR_MONTH() { return getToken(ApexParser.CALENDAR_MONTH, 0); }
		public TerminalNode CALENDAR_QUARTER() { return getToken(ApexParser.CALENDAR_QUARTER, 0); }
		public TerminalNode CALENDAR_YEAR() { return getToken(ApexParser.CALENDAR_YEAR, 0); }
		public TerminalNode DAY_IN_MONTH() { return getToken(ApexParser.DAY_IN_MONTH, 0); }
		public TerminalNode DAY_IN_WEEK() { return getToken(ApexParser.DAY_IN_WEEK, 0); }
		public TerminalNode DAY_IN_YEAR() { return getToken(ApexParser.DAY_IN_YEAR, 0); }
		public TerminalNode DAY_ONLY() { return getToken(ApexParser.DAY_ONLY, 0); }
		public TerminalNode FISCAL_MONTH() { return getToken(ApexParser.FISCAL_MONTH, 0); }
		public TerminalNode FISCAL_QUARTER() { return getToken(ApexParser.FISCAL_QUARTER, 0); }
		public TerminalNode FISCAL_YEAR() { return getToken(ApexParser.FISCAL_YEAR, 0); }
		public TerminalNode HOUR_IN_DAY() { return getToken(ApexParser.HOUR_IN_DAY, 0); }
		public TerminalNode WEEK_IN_MONTH() { return getToken(ApexParser.WEEK_IN_MONTH, 0); }
		public TerminalNode WEEK_IN_YEAR() { return getToken(ApexParser.WEEK_IN_YEAR, 0); }
		public TerminalNode CONVERT_TIMEZONE() { return getToken(ApexParser.CONVERT_TIMEZONE, 0); }
		public TerminalNode YESTERDAY() { return getToken(ApexParser.YESTERDAY, 0); }
		public TerminalNode TODAY() { return getToken(ApexParser.TODAY, 0); }
		public TerminalNode TOMORROW() { return getToken(ApexParser.TOMORROW, 0); }
		public TerminalNode LAST_WEEK() { return getToken(ApexParser.LAST_WEEK, 0); }
		public TerminalNode THIS_WEEK() { return getToken(ApexParser.THIS_WEEK, 0); }
		public TerminalNode NEXT_WEEK() { return getToken(ApexParser.NEXT_WEEK, 0); }
		public TerminalNode LAST_MONTH() { return getToken(ApexParser.LAST_MONTH, 0); }
		public TerminalNode THIS_MONTH() { return getToken(ApexParser.THIS_MONTH, 0); }
		public TerminalNode NEXT_MONTH() { return getToken(ApexParser.NEXT_MONTH, 0); }
		public TerminalNode LAST_90_DAYS() { return getToken(ApexParser.LAST_90_DAYS, 0); }
		public TerminalNode NEXT_90_DAYS() { return getToken(ApexParser.NEXT_90_DAYS, 0); }
		public TerminalNode LAST_N_DAYS_N() { return getToken(ApexParser.LAST_N_DAYS_N, 0); }
		public TerminalNode NEXT_N_DAYS_N() { return getToken(ApexParser.NEXT_N_DAYS_N, 0); }
		public TerminalNode N_DAYS_AGO_N() { return getToken(ApexParser.N_DAYS_AGO_N, 0); }
		public TerminalNode NEXT_N_WEEKS_N() { return getToken(ApexParser.NEXT_N_WEEKS_N, 0); }
		public TerminalNode LAST_N_WEEKS_N() { return getToken(ApexParser.LAST_N_WEEKS_N, 0); }
		public TerminalNode N_WEEKS_AGO_N() { return getToken(ApexParser.N_WEEKS_AGO_N, 0); }
		public TerminalNode NEXT_N_MONTHS_N() { return getToken(ApexParser.NEXT_N_MONTHS_N, 0); }
		public TerminalNode LAST_N_MONTHS_N() { return getToken(ApexParser.LAST_N_MONTHS_N, 0); }
		public TerminalNode N_MONTHS_AGO_N() { return getToken(ApexParser.N_MONTHS_AGO_N, 0); }
		public TerminalNode THIS_QUARTER() { return getToken(ApexParser.THIS_QUARTER, 0); }
		public TerminalNode LAST_QUARTER() { return getToken(ApexParser.LAST_QUARTER, 0); }
		public TerminalNode NEXT_QUARTER() { return getToken(ApexParser.NEXT_QUARTER, 0); }
		public TerminalNode NEXT_N_QUARTERS_N() { return getToken(ApexParser.NEXT_N_QUARTERS_N, 0); }
		public TerminalNode LAST_N_QUARTERS_N() { return getToken(ApexParser.LAST_N_QUARTERS_N, 0); }
		public TerminalNode N_QUARTERS_AGO_N() { return getToken(ApexParser.N_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_YEAR() { return getToken(ApexParser.THIS_YEAR, 0); }
		public TerminalNode LAST_YEAR() { return getToken(ApexParser.LAST_YEAR, 0); }
		public TerminalNode NEXT_YEAR() { return getToken(ApexParser.NEXT_YEAR, 0); }
		public TerminalNode NEXT_N_YEARS_N() { return getToken(ApexParser.NEXT_N_YEARS_N, 0); }
		public TerminalNode LAST_N_YEARS_N() { return getToken(ApexParser.LAST_N_YEARS_N, 0); }
		public TerminalNode N_YEARS_AGO_N() { return getToken(ApexParser.N_YEARS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_QUARTER() { return getToken(ApexParser.THIS_FISCAL_QUARTER, 0); }
		public TerminalNode LAST_FISCAL_QUARTER() { return getToken(ApexParser.LAST_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_FISCAL_QUARTER() { return getToken(ApexParser.NEXT_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.NEXT_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode LAST_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.LAST_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode N_FISCAL_QUARTERS_AGO_N() { return getToken(ApexParser.N_FISCAL_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_YEAR() { return getToken(ApexParser.THIS_FISCAL_YEAR, 0); }
		public TerminalNode LAST_FISCAL_YEAR() { return getToken(ApexParser.LAST_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_FISCAL_YEAR() { return getToken(ApexParser.NEXT_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_N_FISCAL_YEARS_N() { return getToken(ApexParser.NEXT_N_FISCAL_YEARS_N, 0); }
		public TerminalNode LAST_N_FISCAL_YEARS_N() { return getToken(ApexParser.LAST_N_FISCAL_YEARS_N, 0); }
		public TerminalNode N_FISCAL_YEARS_AGO_N() { return getToken(ApexParser.N_FISCAL_YEARS_AGO_N, 0); }
		public TerminalNode FIND() { return getToken(ApexParser.FIND, 0); }
		public TerminalNode EMAIL() { return getToken(ApexParser.EMAIL, 0); }
		public TerminalNode NAME() { return getToken(ApexParser.NAME, 0); }
		public TerminalNode PHONE() { return getToken(ApexParser.PHONE, 0); }
		public TerminalNode SIDEBAR() { return getToken(ApexParser.SIDEBAR, 0); }
		public TerminalNode FIELDS() { return getToken(ApexParser.FIELDS, 0); }
		public TerminalNode METADATA() { return getToken(ApexParser.METADATA, 0); }
		public TerminalNode PRICEBOOKID() { return getToken(ApexParser.PRICEBOOKID, 0); }
		public TerminalNode NETWORK() { return getToken(ApexParser.NETWORK, 0); }
		public TerminalNode SNIPPET() { return getToken(ApexParser.SNIPPET, 0); }
		public TerminalNode TARGET_LENGTH() { return getToken(ApexParser.TARGET_LENGTH, 0); }
		public TerminalNode DIVISION() { return getToken(ApexParser.DIVISION, 0); }
		public TerminalNode RETURNING() { return getToken(ApexParser.RETURNING, 0); }
		public TerminalNode LISTVIEW() { return getToken(ApexParser.LISTVIEW, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -114828269935591412L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || _la==LISTVIEW || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ApexParser.Identifier, 0); }
		public TerminalNode ABSTRACT() { return getToken(ApexParser.ABSTRACT, 0); }
		public TerminalNode AFTER() { return getToken(ApexParser.AFTER, 0); }
		public TerminalNode BEFORE() { return getToken(ApexParser.BEFORE, 0); }
		public TerminalNode BREAK() { return getToken(ApexParser.BREAK, 0); }
		public TerminalNode CATCH() { return getToken(ApexParser.CATCH, 0); }
		public TerminalNode CLASS() { return getToken(ApexParser.CLASS, 0); }
		public TerminalNode CONTINUE() { return getToken(ApexParser.CONTINUE, 0); }
		public TerminalNode DELETE() { return getToken(ApexParser.DELETE, 0); }
		public TerminalNode DO() { return getToken(ApexParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(ApexParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(ApexParser.ENUM, 0); }
		public TerminalNode EXTENDS() { return getToken(ApexParser.EXTENDS, 0); }
		public TerminalNode FINAL() { return getToken(ApexParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(ApexParser.FINALLY, 0); }
		public TerminalNode FOR() { return getToken(ApexParser.FOR, 0); }
		public TerminalNode GET() { return getToken(ApexParser.GET, 0); }
		public TerminalNode GLOBAL() { return getToken(ApexParser.GLOBAL, 0); }
		public TerminalNode IF() { return getToken(ApexParser.IF, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ApexParser.IMPLEMENTS, 0); }
		public TerminalNode INHERITED() { return getToken(ApexParser.INHERITED, 0); }
		public TerminalNode INSERT() { return getToken(ApexParser.INSERT, 0); }
		public TerminalNode INSTANCEOF() { return getToken(ApexParser.INSTANCEOF, 0); }
		public TerminalNode INTERFACE() { return getToken(ApexParser.INTERFACE, 0); }
		public TerminalNode LIST() { return getToken(ApexParser.LIST, 0); }
		public TerminalNode MAP() { return getToken(ApexParser.MAP, 0); }
		public TerminalNode MERGE() { return getToken(ApexParser.MERGE, 0); }
		public TerminalNode NEW() { return getToken(ApexParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(ApexParser.NULL, 0); }
		public TerminalNode ON() { return getToken(ApexParser.ON, 0); }
		public TerminalNode OVERRIDE() { return getToken(ApexParser.OVERRIDE, 0); }
		public TerminalNode PRIVATE() { return getToken(ApexParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ApexParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(ApexParser.PUBLIC, 0); }
		public TerminalNode RETURN() { return getToken(ApexParser.RETURN, 0); }
		public TerminalNode SET() { return getToken(ApexParser.SET, 0); }
		public TerminalNode SHARING() { return getToken(ApexParser.SHARING, 0); }
		public TerminalNode STATIC() { return getToken(ApexParser.STATIC, 0); }
		public TerminalNode SUPER() { return getToken(ApexParser.SUPER, 0); }
		public TerminalNode SWITCH() { return getToken(ApexParser.SWITCH, 0); }
		public TerminalNode TESTMETHOD() { return getToken(ApexParser.TESTMETHOD, 0); }
		public TerminalNode THIS() { return getToken(ApexParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(ApexParser.THROW, 0); }
		public TerminalNode TRANSIENT() { return getToken(ApexParser.TRANSIENT, 0); }
		public TerminalNode TRIGGER() { return getToken(ApexParser.TRIGGER, 0); }
		public TerminalNode TRY() { return getToken(ApexParser.TRY, 0); }
		public TerminalNode UNDELETE() { return getToken(ApexParser.UNDELETE, 0); }
		public TerminalNode UPDATE() { return getToken(ApexParser.UPDATE, 0); }
		public TerminalNode UPSERT() { return getToken(ApexParser.UPSERT, 0); }
		public TerminalNode VIRTUAL() { return getToken(ApexParser.VIRTUAL, 0); }
		public TerminalNode WEBSERVICE() { return getToken(ApexParser.WEBSERVICE, 0); }
		public TerminalNode WHEN() { return getToken(ApexParser.WHEN, 0); }
		public TerminalNode WHILE() { return getToken(ApexParser.WHILE, 0); }
		public TerminalNode WITH() { return getToken(ApexParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(ApexParser.WITHOUT, 0); }
		public TerminalNode USER() { return getToken(ApexParser.USER, 0); }
		public TerminalNode SYSTEM() { return getToken(ApexParser.SYSTEM, 0); }
		public TerminalNode IntegralCurrencyLiteral() { return getToken(ApexParser.IntegralCurrencyLiteral, 0); }
		public TerminalNode SELECT() { return getToken(ApexParser.SELECT, 0); }
		public TerminalNode COUNT() { return getToken(ApexParser.COUNT, 0); }
		public TerminalNode FROM() { return getToken(ApexParser.FROM, 0); }
		public TerminalNode AS() { return getToken(ApexParser.AS, 0); }
		public TerminalNode USING() { return getToken(ApexParser.USING, 0); }
		public TerminalNode SCOPE() { return getToken(ApexParser.SCOPE, 0); }
		public TerminalNode WHERE() { return getToken(ApexParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(ApexParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ApexParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(ApexParser.LIMIT, 0); }
		public TerminalNode SOQLAND() { return getToken(ApexParser.SOQLAND, 0); }
		public TerminalNode SOQLOR() { return getToken(ApexParser.SOQLOR, 0); }
		public TerminalNode NOT() { return getToken(ApexParser.NOT, 0); }
		public TerminalNode AVG() { return getToken(ApexParser.AVG, 0); }
		public TerminalNode COUNT_DISTINCT() { return getToken(ApexParser.COUNT_DISTINCT, 0); }
		public TerminalNode MIN() { return getToken(ApexParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ApexParser.MAX, 0); }
		public TerminalNode SUM() { return getToken(ApexParser.SUM, 0); }
		public TerminalNode TYPEOF() { return getToken(ApexParser.TYPEOF, 0); }
		public TerminalNode END() { return getToken(ApexParser.END, 0); }
		public TerminalNode THEN() { return getToken(ApexParser.THEN, 0); }
		public TerminalNode LIKE() { return getToken(ApexParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(ApexParser.IN, 0); }
		public TerminalNode INCLUDES() { return getToken(ApexParser.INCLUDES, 0); }
		public TerminalNode EXCLUDES() { return getToken(ApexParser.EXCLUDES, 0); }
		public TerminalNode ASC() { return getToken(ApexParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ApexParser.DESC, 0); }
		public TerminalNode NULLS() { return getToken(ApexParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(ApexParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ApexParser.LAST, 0); }
		public TerminalNode GROUP() { return getToken(ApexParser.GROUP, 0); }
		public TerminalNode ALL() { return getToken(ApexParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(ApexParser.ROWS, 0); }
		public TerminalNode VIEW() { return getToken(ApexParser.VIEW, 0); }
		public TerminalNode HAVING() { return getToken(ApexParser.HAVING, 0); }
		public TerminalNode ROLLUP() { return getToken(ApexParser.ROLLUP, 0); }
		public TerminalNode TOLABEL() { return getToken(ApexParser.TOLABEL, 0); }
		public TerminalNode OFFSET() { return getToken(ApexParser.OFFSET, 0); }
		public TerminalNode DATA() { return getToken(ApexParser.DATA, 0); }
		public TerminalNode CATEGORY() { return getToken(ApexParser.CATEGORY, 0); }
		public TerminalNode AT() { return getToken(ApexParser.AT, 0); }
		public TerminalNode ABOVE() { return getToken(ApexParser.ABOVE, 0); }
		public TerminalNode BELOW() { return getToken(ApexParser.BELOW, 0); }
		public TerminalNode ABOVE_OR_BELOW() { return getToken(ApexParser.ABOVE_OR_BELOW, 0); }
		public TerminalNode SECURITY_ENFORCED() { return getToken(ApexParser.SECURITY_ENFORCED, 0); }
		public TerminalNode SYSTEM_MODE() { return getToken(ApexParser.SYSTEM_MODE, 0); }
		public TerminalNode USER_MODE() { return getToken(ApexParser.USER_MODE, 0); }
		public TerminalNode REFERENCE() { return getToken(ApexParser.REFERENCE, 0); }
		public TerminalNode CUBE() { return getToken(ApexParser.CUBE, 0); }
		public TerminalNode FORMAT() { return getToken(ApexParser.FORMAT, 0); }
		public TerminalNode TRACKING() { return getToken(ApexParser.TRACKING, 0); }
		public TerminalNode VIEWSTAT() { return getToken(ApexParser.VIEWSTAT, 0); }
		public TerminalNode STANDARD() { return getToken(ApexParser.STANDARD, 0); }
		public TerminalNode CUSTOM() { return getToken(ApexParser.CUSTOM, 0); }
		public TerminalNode DISTANCE() { return getToken(ApexParser.DISTANCE, 0); }
		public TerminalNode GEOLOCATION() { return getToken(ApexParser.GEOLOCATION, 0); }
		public TerminalNode GROUPING() { return getToken(ApexParser.GROUPING, 0); }
		public TerminalNode CONVERT_CURRENCY() { return getToken(ApexParser.CONVERT_CURRENCY, 0); }
		public TerminalNode CALENDAR_MONTH() { return getToken(ApexParser.CALENDAR_MONTH, 0); }
		public TerminalNode CALENDAR_QUARTER() { return getToken(ApexParser.CALENDAR_QUARTER, 0); }
		public TerminalNode CALENDAR_YEAR() { return getToken(ApexParser.CALENDAR_YEAR, 0); }
		public TerminalNode DAY_IN_MONTH() { return getToken(ApexParser.DAY_IN_MONTH, 0); }
		public TerminalNode DAY_IN_WEEK() { return getToken(ApexParser.DAY_IN_WEEK, 0); }
		public TerminalNode DAY_IN_YEAR() { return getToken(ApexParser.DAY_IN_YEAR, 0); }
		public TerminalNode DAY_ONLY() { return getToken(ApexParser.DAY_ONLY, 0); }
		public TerminalNode FISCAL_MONTH() { return getToken(ApexParser.FISCAL_MONTH, 0); }
		public TerminalNode FISCAL_QUARTER() { return getToken(ApexParser.FISCAL_QUARTER, 0); }
		public TerminalNode FISCAL_YEAR() { return getToken(ApexParser.FISCAL_YEAR, 0); }
		public TerminalNode HOUR_IN_DAY() { return getToken(ApexParser.HOUR_IN_DAY, 0); }
		public TerminalNode WEEK_IN_MONTH() { return getToken(ApexParser.WEEK_IN_MONTH, 0); }
		public TerminalNode WEEK_IN_YEAR() { return getToken(ApexParser.WEEK_IN_YEAR, 0); }
		public TerminalNode CONVERT_TIMEZONE() { return getToken(ApexParser.CONVERT_TIMEZONE, 0); }
		public TerminalNode YESTERDAY() { return getToken(ApexParser.YESTERDAY, 0); }
		public TerminalNode TODAY() { return getToken(ApexParser.TODAY, 0); }
		public TerminalNode TOMORROW() { return getToken(ApexParser.TOMORROW, 0); }
		public TerminalNode LAST_WEEK() { return getToken(ApexParser.LAST_WEEK, 0); }
		public TerminalNode THIS_WEEK() { return getToken(ApexParser.THIS_WEEK, 0); }
		public TerminalNode NEXT_WEEK() { return getToken(ApexParser.NEXT_WEEK, 0); }
		public TerminalNode LAST_MONTH() { return getToken(ApexParser.LAST_MONTH, 0); }
		public TerminalNode THIS_MONTH() { return getToken(ApexParser.THIS_MONTH, 0); }
		public TerminalNode NEXT_MONTH() { return getToken(ApexParser.NEXT_MONTH, 0); }
		public TerminalNode LAST_90_DAYS() { return getToken(ApexParser.LAST_90_DAYS, 0); }
		public TerminalNode NEXT_90_DAYS() { return getToken(ApexParser.NEXT_90_DAYS, 0); }
		public TerminalNode LAST_N_DAYS_N() { return getToken(ApexParser.LAST_N_DAYS_N, 0); }
		public TerminalNode NEXT_N_DAYS_N() { return getToken(ApexParser.NEXT_N_DAYS_N, 0); }
		public TerminalNode N_DAYS_AGO_N() { return getToken(ApexParser.N_DAYS_AGO_N, 0); }
		public TerminalNode NEXT_N_WEEKS_N() { return getToken(ApexParser.NEXT_N_WEEKS_N, 0); }
		public TerminalNode LAST_N_WEEKS_N() { return getToken(ApexParser.LAST_N_WEEKS_N, 0); }
		public TerminalNode N_WEEKS_AGO_N() { return getToken(ApexParser.N_WEEKS_AGO_N, 0); }
		public TerminalNode NEXT_N_MONTHS_N() { return getToken(ApexParser.NEXT_N_MONTHS_N, 0); }
		public TerminalNode LAST_N_MONTHS_N() { return getToken(ApexParser.LAST_N_MONTHS_N, 0); }
		public TerminalNode N_MONTHS_AGO_N() { return getToken(ApexParser.N_MONTHS_AGO_N, 0); }
		public TerminalNode THIS_QUARTER() { return getToken(ApexParser.THIS_QUARTER, 0); }
		public TerminalNode LAST_QUARTER() { return getToken(ApexParser.LAST_QUARTER, 0); }
		public TerminalNode NEXT_QUARTER() { return getToken(ApexParser.NEXT_QUARTER, 0); }
		public TerminalNode NEXT_N_QUARTERS_N() { return getToken(ApexParser.NEXT_N_QUARTERS_N, 0); }
		public TerminalNode LAST_N_QUARTERS_N() { return getToken(ApexParser.LAST_N_QUARTERS_N, 0); }
		public TerminalNode N_QUARTERS_AGO_N() { return getToken(ApexParser.N_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_YEAR() { return getToken(ApexParser.THIS_YEAR, 0); }
		public TerminalNode LAST_YEAR() { return getToken(ApexParser.LAST_YEAR, 0); }
		public TerminalNode NEXT_YEAR() { return getToken(ApexParser.NEXT_YEAR, 0); }
		public TerminalNode NEXT_N_YEARS_N() { return getToken(ApexParser.NEXT_N_YEARS_N, 0); }
		public TerminalNode LAST_N_YEARS_N() { return getToken(ApexParser.LAST_N_YEARS_N, 0); }
		public TerminalNode N_YEARS_AGO_N() { return getToken(ApexParser.N_YEARS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_QUARTER() { return getToken(ApexParser.THIS_FISCAL_QUARTER, 0); }
		public TerminalNode LAST_FISCAL_QUARTER() { return getToken(ApexParser.LAST_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_FISCAL_QUARTER() { return getToken(ApexParser.NEXT_FISCAL_QUARTER, 0); }
		public TerminalNode NEXT_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.NEXT_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode LAST_N_FISCAL_QUARTERS_N() { return getToken(ApexParser.LAST_N_FISCAL_QUARTERS_N, 0); }
		public TerminalNode N_FISCAL_QUARTERS_AGO_N() { return getToken(ApexParser.N_FISCAL_QUARTERS_AGO_N, 0); }
		public TerminalNode THIS_FISCAL_YEAR() { return getToken(ApexParser.THIS_FISCAL_YEAR, 0); }
		public TerminalNode LAST_FISCAL_YEAR() { return getToken(ApexParser.LAST_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_FISCAL_YEAR() { return getToken(ApexParser.NEXT_FISCAL_YEAR, 0); }
		public TerminalNode NEXT_N_FISCAL_YEARS_N() { return getToken(ApexParser.NEXT_N_FISCAL_YEARS_N, 0); }
		public TerminalNode LAST_N_FISCAL_YEARS_N() { return getToken(ApexParser.LAST_N_FISCAL_YEARS_N, 0); }
		public TerminalNode N_FISCAL_YEARS_AGO_N() { return getToken(ApexParser.N_FISCAL_YEARS_AGO_N, 0); }
		public TerminalNode FIND() { return getToken(ApexParser.FIND, 0); }
		public TerminalNode EMAIL() { return getToken(ApexParser.EMAIL, 0); }
		public TerminalNode NAME() { return getToken(ApexParser.NAME, 0); }
		public TerminalNode PHONE() { return getToken(ApexParser.PHONE, 0); }
		public TerminalNode SIDEBAR() { return getToken(ApexParser.SIDEBAR, 0); }
		public TerminalNode FIELDS() { return getToken(ApexParser.FIELDS, 0); }
		public TerminalNode METADATA() { return getToken(ApexParser.METADATA, 0); }
		public TerminalNode PRICEBOOKID() { return getToken(ApexParser.PRICEBOOKID, 0); }
		public TerminalNode NETWORK() { return getToken(ApexParser.NETWORK, 0); }
		public TerminalNode SNIPPET() { return getToken(ApexParser.SNIPPET, 0); }
		public TerminalNode TARGET_LENGTH() { return getToken(ApexParser.TARGET_LENGTH, 0); }
		public TerminalNode DIVISION() { return getToken(ApexParser.DIVISION, 0); }
		public TerminalNode RETURNING() { return getToken(ApexParser.RETURNING, 0); }
		public TerminalNode LISTVIEW() { return getToken(ApexParser.LISTVIEW, 0); }
		public AnyIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).enterAnyId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApexParserListener ) ((ApexParserListener)listener).exitAnyId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApexParserVisitor ) return ((ApexParserVisitor<? extends T>)visitor).visitAnyId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyIdContext anyId() throws RecognitionException {
		AnyIdContext _localctx = new AnyIdContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_anyId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -562958543355906L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -985162418487297L) != 0) || _la==LISTVIEW || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 77:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 23);
		case 14:
			return precpred(_ctx, 22);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00fb\u07c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u012d\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0137"+
		"\b\u0001\n\u0001\f\u0001\u013a\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0145\b\u0003\n\u0003\f\u0003\u0148\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0005\u0004\u014d\b\u0004\n\u0004\f\u0004\u0150\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0154\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0005\u0006\u015a\b\u0006\n\u0006\f\u0006\u015d"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0161\b\u0006\n\u0006\f\u0006"+
		"\u0164\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0168\b\u0006\n\u0006"+
		"\f\u0006\u016b\t\u0006\u0001\u0006\u0003\u0006\u016e\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0174\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0178\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0180\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0187\b\t\n\t\f\t\u018a\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0190\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0197\b\u000b\n\u000b\f\u000b\u019a\t\u000b\u0001\f"+
		"\u0001\f\u0005\f\u019e\b\f\n\f\f\f\u01a1\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\r\u01a7\b\r\n\r\f\r\u01aa\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b0\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01b4"+
		"\b\u000e\n\u000e\f\u000e\u01b7\t\u000e\u0001\u000e\u0003\u000e\u01ba\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u01cf\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01d8"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01e0\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01e4"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ea"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u01f8\b\u0015\n\u0015\f\u0015\u01fb\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0005\u0016\u0200\b\u0016\n\u0016\f\u0016\u0203"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0207\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0210\b\u0017\n\u0017\f\u0017\u0213\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0218\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u021e\b\u0019\n\u0019\f\u0019\u0221\t\u0019"+
		"\u0001\u0019\u0003\u0019\u0224\b\u0019\u0003\u0019\u0226\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u022d"+
		"\b\u001a\n\u001a\f\u001a\u0230\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0236\b\u001b\n\u001b\f\u001b\u0239\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u023d\b\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0241\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0245\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0249\b\u001c\u0003\u001c\u024b\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0253\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u025a\b\u001f\n\u001f\f\u001f\u025d\t\u001f"+
		"\u0001 \u0005 \u0260\b \n \f \u0263\t \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0005!\u026b\b!\n!\f!\u026e\t!\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0003#\u0277\b#\u0001#\u0003#\u027a\b#\u0001$\u0001"+
		"$\u0003$\u027e\b$\u0001$\u0005$\u0281\b$\n$\f$\u0284\t$\u0001%\u0001%"+
		"\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u028d\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u0293\b\'\n\'\f\'\u0296\t\'\u0003\'\u0298\b\'\u0001"+
		"\'\u0003\'\u029b\b\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u02a1\b(\n("+
		"\f(\u02a4\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0005*\u02ac\b"+
		"*\n*\f*\u02af\t*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02c8\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u02cf\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0004"+
		"-\u02d6\b-\u000b-\f-\u02d7\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u02e4\b/\n/\f/\u02e7\t/\u0001/\u0001/\u0001"+
		"/\u0003/\u02ec\b/\u00010\u00050\u02ef\b0\n0\f0\u02f2\t0\u00010\u00010"+
		"\u00050\u02f6\b0\n0\f0\u02f9\t0\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0303\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u030b\b1\u00012\u00012\u00012\u00012\u00032\u0311\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00044\u031c\b4\u000b"+
		"4\f4\u031d\u00014\u00034\u0321\b4\u00014\u00034\u0324\b4\u00015\u0001"+
		"5\u00035\u0328\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0003"+
		":\u033b\b:\u0001:\u0001:\u0001:\u0001;\u0001;\u0003;\u0342\b;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0003<\u0349\b<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0003=\u0350\b=\u0001=\u0001=\u0001=\u0001>\u0001>\u0003>\u0357\b>\u0001"+
		">\u0001>\u0003>\u035b\b>\u0001>\u0001>\u0001?\u0001?\u0003?\u0361\b?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u036a\b@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001B\u0005B\u0373\bB\nB\fB\u0376\tB\u0001"+
		"B\u0001B\u0003B\u037a\bB\u0001C\u0001C\u0001C\u0003C\u037f\bC\u0001D\u0001"+
		"D\u0001D\u0003D\u0384\bD\u0001E\u0001E\u0001E\u0005E\u0389\bE\nE\fE\u038c"+
		"\tE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001G\u0001"+
		"G\u0003G\u0398\bG\u0001G\u0001G\u0003G\u039c\bG\u0001G\u0001G\u0003G\u03a0"+
		"\bG\u0003G\u03a2\bG\u0001H\u0001H\u0003H\u03a6\bH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0005L\u03b6\bL\nL\fL\u03b9\tL\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0003M\u03cd\bM\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003"+
		"M\u03dd\bM\u0001M\u0001M\u0001M\u0001M\u0003M\u03e3\bM\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0003M\u0408\bM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0005M\u0414\bM\nM\fM\u0417\tM\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u0426\bN\u0001O\u0001O\u0001O\u0003O\u042b\bO\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u0432\bO\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u0438\bO\u0001O\u0003O\u043b\bO\u0001P\u0001P\u0001P\u0003P\u0440\b"+
		"P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u044a"+
		"\bQ\u0001R\u0001R\u0001R\u0005R\u044f\bR\nR\fR\u0452\tR\u0001S\u0001S"+
		"\u0001S\u0001S\u0001S\u0003S\u0459\bS\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0467\bV\u0003"+
		"V\u0469\bV\u0001W\u0001W\u0001W\u0001W\u0005W\u046f\bW\nW\fW\u0472\tW"+
		"\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0005Y\u047e\bY\nY\fY\u0481\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0003Z\u0487"+
		"\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0003\\\u0494\b\\\u0001\\\u0003\\\u0497\b\\\u0001\\\u0003"+
		"\\\u049a\b\\\u0001\\\u0003\\\u049d\b\\\u0001\\\u0003\\\u04a0\b\\\u0001"+
		"\\\u0003\\\u04a3\b\\\u0001\\\u0003\\\u04a6\b\\\u0001\\\u0003\\\u04a9\b"+
		"\\\u0001\\\u0001\\\u0001\\\u0003\\\u04ae\b\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u04b5\b]\u0001]\u0003]\u04b8\b]\u0001]\u0003]\u04bb\b"+
		"]\u0001]\u0001]\u0001]\u0003]\u04c0\b]\u0001^\u0001^\u0001^\u0005^\u04c5"+
		"\b^\n^\f^\u04c8\t^\u0001_\u0001_\u0003_\u04cc\b_\u0001_\u0001_\u0003_"+
		"\u04d0\b_\u0001_\u0001_\u0001_\u0001_\u0003_\u04d6\b_\u0001_\u0003_\u04d9"+
		"\b_\u0001`\u0001`\u0001`\u0005`\u04de\b`\n`\f`\u04e1\t`\u0001a\u0001a"+
		"\u0003a\u04e5\ba\u0001a\u0001a\u0001a\u0003a\u04ea\ba\u0005a\u04ec\ba"+
		"\na\fa\u04ef\ta\u0001b\u0001b\u0001b\u0005b\u04f4\bb\nb\fb\u04f7\tb\u0001"+
		"c\u0001c\u0003c\u04fb\bc\u0001c\u0001c\u0003c\u04ff\bc\u0001c\u0001c\u0001"+
		"c\u0001c\u0003c\u0505\bc\u0001c\u0003c\u0508\bc\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u0536\be\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0003e\u0593\be\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0003f\u059b\bf\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001g\u0003g\u05a6\bg\u0001h\u0001h\u0003h\u05aa\bh\u0001i\u0001"+
		"i\u0001i\u0004i\u05af\bi\u000bi\fi\u05b0\u0001i\u0003i\u05b4\bi\u0001"+
		"i\u0001i\u0001j\u0001j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001"+
		"l\u0001l\u0001l\u0005l\u05c3\bl\nl\fl\u05c6\tl\u0001m\u0001m\u0001m\u0001"+
		"m\u0001n\u0001n\u0001n\u0001o\u0001o\u0001o\u0005o\u05d2\bo\no\fo\u05d5"+
		"\to\u0001o\u0001o\u0001o\u0005o\u05da\bo\no\fo\u05dd\to\u0001o\u0001o"+
		"\u0003o\u05e1\bo\u0001p\u0001p\u0001p\u0001p\u0001p\u0003p\u05e8\bp\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u05f2\bq\u0001"+
		"r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001"+
		"r\u0001r\u0001r\u0001r\u0001r\u0003r\u0603\br\u0001s\u0001s\u0001s\u0001"+
		"s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u0610\bs\u0003"+
		"s\u0612\bs\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u061a\bs\u0001"+
		"t\u0001t\u0001t\u0001t\u0005t\u0620\bt\nt\ft\u0623\tt\u0001t\u0001t\u0001"+
		"u\u0003u\u0628\bu\u0001u\u0001u\u0001v\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0003v\u0638\bv\u0001w\u0001"+
		"w\u0001w\u0005w\u063d\bw\nw\fw\u0640\tw\u0001x\u0001x\u0001x\u0001x\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0005y\u064b\by\ny\fy\u064e\ty\u0001y\u0001"+
		"y\u0003y\u0652\by\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001{\u0003"+
		"{\u065b\b{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0005{\u0664"+
		"\b{\n{\f{\u0667\t{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0005{\u0672\b{\n{\f{\u0675\t{\u0001{\u0001{\u0003{\u0679\b{"+
		"\u0001|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0005}\u0682\b}\n}\f"+
		"}\u0685\t}\u0001~\u0001~\u0003~\u0689\b~\u0001~\u0001~\u0003~\u068d\b"+
		"~\u0001~\u0001~\u0003~\u0691\b~\u0001~\u0001~\u0003~\u0695\b~\u0003~\u0697"+
		"\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u069d"+
		"\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u06a3"+
		"\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0005"+
		"\u0082\u06aa\b\u0082\n\u0082\f\u0082\u06ad\t\u0082\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0708\b\u0084\u0001\u0085"+
		"\u0003\u0085\u070b\b\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u071b\b\u0087"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0003\u0089\u0723\b\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u0727\b"+
		"\u0089\u0001\u0089\u0005\u0089\u072a\b\u0089\n\u0089\f\u0089\u072d\t\u0089"+
		"\u0001\u0089\u0003\u0089\u0730\b\u0089\u0001\u0089\u0001\u0089\u0003\u0089"+
		"\u0734\b\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0745\b\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a"+
		"\u075e\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0005\u008c\u0766\b\u008c\n\u008c\f\u008c\u0769\t\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0770"+
		"\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0776"+
		"\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u077b\b\u008d"+
		"\u0001\u008d\u0003\u008d\u077e\b\u008d\u0001\u008d\u0003\u008d\u0781\b"+
		"\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0785\b\u008d\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0005\u008e\u078a\b\u008e\n\u008e\f\u008e\u078d\t\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0003\u008e"+
		"\u0794\b\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0003\u008e\u079b\b\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0003\u008e\u07a1\b\u008e\u0001\u008e\u0001\u008e\u0003\u008e\u07a5\b"+
		"\u008e\u0003\u008e\u07a7\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u07ac\b\u008f\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001"+
		"\u0091\u0003\u0091\u07b3\b\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0005"+
		"\u0092\u07b8\b\u0092\n\u0092\f\u0092\u07bb\t\u0092\u0001\u0093\u0001\u0093"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0000\u0001\u009a\u0095\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u0000\u0017\u0001"+
		"\u0000\u0002\u0003\u0003\u0000\b\b\u0015\u0015-.\u0002\u0000\u001a\u001a"+
		"\u00c3\u00c7\u0001\u0000\u00e4\u00e5\u0001\u00009:\u0001\u0000\u00e2\u00e5"+
		"\u0001\u0000\u00d5\u00d6\u0001\u0000\u00e6\u00e7\u0001\u0000\u00d3\u00d4"+
		"\u0001\u0000\u00da\u00de\u0002\u0000\u00d2\u00d2\u00ec\u00f5\u0002\u0000"+
		"\u00d1\u00d1\u00d7\u00d7\u0001\u0000\u00e2\u00e3\u0002\u0000ZZop\u0002"+
		"\u0000\u00c3\u00c3\u00c5\u00c5\u0001\u0000cf\u0001\u0000TU\u0001\u0000"+
		"WX\u0003\u0000..\\\\jj\u0002\u0000ZZ\u00b4\u00b7\u0001\u0000mn\f\u0000"+
		"\u0002\u0003\u0010\u0010\u0014\u0014\u0016\u0016\"#&&*+33569\u00ae\u00b2"+
		"\u00c0\u00f7\u00f7\u0005\u0000\u0001 \"02\u00ae\u00b2\u00c0\u00f7\u00f7"+
		"\u08ab\u0000\u012c\u0001\u0000\u0000\u0000\u0002\u012e\u0001\u0000\u0000"+
		"\u0000\u0004\u013f\u0001\u0000\u0000\u0000\u0006\u0142\u0001\u0000\u0000"+
		"\u0000\b\u0153\u0001\u0000\u0000\u0000\n\u0155\u0001\u0000\u0000\u0000"+
		"\f\u016d\u0001\u0000\u0000\u0000\u000e\u016f\u0001\u0000\u0000\u0000\u0010"+
		"\u017b\u0001\u0000\u0000\u0000\u0012\u0183\u0001\u0000\u0000\u0000\u0014"+
		"\u018b\u0001\u0000\u0000\u0000\u0016\u0193\u0001\u0000\u0000\u0000\u0018"+
		"\u019b\u0001\u0000\u0000\u0000\u001a\u01a4\u0001\u0000\u0000\u0000\u001c"+
		"\u01b9\u0001\u0000\u0000\u0000\u001e\u01ce\u0001\u0000\u0000\u0000 \u01d7"+
		"\u0001\u0000\u0000\u0000\"\u01df\u0001\u0000\u0000\u0000$\u01e3\u0001"+
		"\u0000\u0000\u0000&\u01eb\u0001\u0000\u0000\u0000(\u01ef\u0001\u0000\u0000"+
		"\u0000*\u01f3\u0001\u0000\u0000\u0000,\u0201\u0001\u0000\u0000\u0000."+
		"\u020c\u0001\u0000\u0000\u00000\u0214\u0001\u0000\u0000\u00002\u0219\u0001"+
		"\u0000\u0000\u00004\u0229\u0001\u0000\u0000\u00006\u0237\u0001\u0000\u0000"+
		"\u00008\u024a\u0001\u0000\u0000\u0000:\u024c\u0001\u0000\u0000\u0000<"+
		"\u0250\u0001\u0000\u0000\u0000>\u0256\u0001\u0000\u0000\u0000@\u0261\u0001"+
		"\u0000\u0000\u0000B\u0267\u0001\u0000\u0000\u0000D\u026f\u0001\u0000\u0000"+
		"\u0000F\u0271\u0001\u0000\u0000\u0000H\u027b\u0001\u0000\u0000\u0000J"+
		"\u0285\u0001\u0000\u0000\u0000L\u028c\u0001\u0000\u0000\u0000N\u028e\u0001"+
		"\u0000\u0000\u0000P\u029e\u0001\u0000\u0000\u0000R\u02a7\u0001\u0000\u0000"+
		"\u0000T\u02ad\u0001\u0000\u0000\u0000V\u02c7\u0001\u0000\u0000\u0000X"+
		"\u02c9\u0001\u0000\u0000\u0000Z\u02d0\u0001\u0000\u0000\u0000\\\u02db"+
		"\u0001\u0000\u0000\u0000^\u02eb\u0001\u0000\u0000\u0000`\u0302\u0001\u0000"+
		"\u0000\u0000b\u0304\u0001\u0000\u0000\u0000d\u030c\u0001\u0000\u0000\u0000"+
		"f\u0312\u0001\u0000\u0000\u0000h\u0318\u0001\u0000\u0000\u0000j\u0325"+
		"\u0001\u0000\u0000\u0000l\u032b\u0001\u0000\u0000\u0000n\u032f\u0001\u0000"+
		"\u0000\u0000p\u0332\u0001\u0000\u0000\u0000r\u0335\u0001\u0000\u0000\u0000"+
		"t\u0338\u0001\u0000\u0000\u0000v\u033f\u0001\u0000\u0000\u0000x\u0346"+
		"\u0001\u0000\u0000\u0000z\u034d\u0001\u0000\u0000\u0000|\u0354\u0001\u0000"+
		"\u0000\u0000~\u035e\u0001\u0000\u0000\u0000\u0080\u0366\u0001\u0000\u0000"+
		"\u0000\u0082\u036e\u0001\u0000\u0000\u0000\u0084\u0374\u0001\u0000\u0000"+
		"\u0000\u0086\u037b\u0001\u0000\u0000\u0000\u0088\u0380\u0001\u0000\u0000"+
		"\u0000\u008a\u0385\u0001\u0000\u0000\u0000\u008c\u0392\u0001\u0000\u0000"+
		"\u0000\u008e\u03a1\u0001\u0000\u0000\u0000\u0090\u03a5\u0001\u0000\u0000"+
		"\u0000\u0092\u03a7\u0001\u0000\u0000\u0000\u0094\u03ac\u0001\u0000\u0000"+
		"\u0000\u0096\u03ae\u0001\u0000\u0000\u0000\u0098\u03b2\u0001\u0000\u0000"+
		"\u0000\u009a\u03cc\u0001\u0000\u0000\u0000\u009c\u0425\u0001\u0000\u0000"+
		"\u0000\u009e\u043a\u0001\u0000\u0000\u0000\u00a0\u043c\u0001\u0000\u0000"+
		"\u0000\u00a2\u0443\u0001\u0000\u0000\u0000\u00a4\u044b\u0001\u0000\u0000"+
		"\u0000\u00a6\u0453\u0001\u0000\u0000\u0000\u00a8\u045a\u0001\u0000\u0000"+
		"\u0000\u00aa\u045d\u0001\u0000\u0000\u0000\u00ac\u0468\u0001\u0000\u0000"+
		"\u0000\u00ae\u046a\u0001\u0000\u0000\u0000\u00b0\u0475\u0001\u0000\u0000"+
		"\u0000\u00b2\u0479\u0001\u0000\u0000\u0000\u00b4\u0484\u0001\u0000\u0000"+
		"\u0000\u00b6\u048a\u0001\u0000\u0000\u0000\u00b8\u048e\u0001\u0000\u0000"+
		"\u0000\u00ba\u04af\u0001\u0000\u0000\u0000\u00bc\u04c1\u0001\u0000\u0000"+
		"\u0000\u00be\u04d8\u0001\u0000\u0000\u0000\u00c0\u04da\u0001\u0000\u0000"+
		"\u0000\u00c2\u04e2\u0001\u0000\u0000\u0000\u00c4\u04f0\u0001\u0000\u0000"+
		"\u0000\u00c6\u0507\u0001\u0000\u0000\u0000\u00c8\u0509\u0001\u0000\u0000"+
		"\u0000\u00ca\u0592\u0001\u0000\u0000\u0000\u00cc\u059a\u0001\u0000\u0000"+
		"\u0000\u00ce\u05a5\u0001\u0000\u0000\u0000\u00d0\u05a9\u0001\u0000\u0000"+
		"\u0000\u00d2\u05ab\u0001\u0000\u0000\u0000\u00d4\u05b7\u0001\u0000\u0000"+
		"\u0000\u00d6\u05bc\u0001\u0000\u0000\u0000\u00d8\u05bf\u0001\u0000\u0000"+
		"\u0000\u00da\u05c7\u0001\u0000\u0000\u0000\u00dc\u05cb\u0001\u0000\u0000"+
		"\u0000\u00de\u05e0\u0001\u0000\u0000\u0000\u00e0\u05e7\u0001\u0000\u0000"+
		"\u0000\u00e2\u05f1\u0001\u0000\u0000\u0000\u00e4\u0602\u0001\u0000\u0000"+
		"\u0000\u00e6\u0619\u0001\u0000\u0000\u0000\u00e8\u061b\u0001\u0000\u0000"+
		"\u0000\u00ea\u0627\u0001\u0000\u0000\u0000\u00ec\u0637\u0001\u0000\u0000"+
		"\u0000\u00ee\u0639\u0001\u0000\u0000\u0000\u00f0\u0641\u0001\u0000\u0000"+
		"\u0000\u00f2\u0651\u0001\u0000\u0000\u0000\u00f4\u0653\u0001\u0000\u0000"+
		"\u0000\u00f6\u0678\u0001\u0000\u0000\u0000\u00f8\u067a\u0001\u0000\u0000"+
		"\u0000\u00fa\u067e\u0001\u0000\u0000\u0000\u00fc\u0696\u0001\u0000\u0000"+
		"\u0000\u00fe\u069c\u0001\u0000\u0000\u0000\u0100\u06a2\u0001\u0000\u0000"+
		"\u0000\u0102\u06a4\u0001\u0000\u0000\u0000\u0104\u06ab\u0001\u0000\u0000"+
		"\u0000\u0106\u06ae\u0001\u0000\u0000\u0000\u0108\u0707\u0001\u0000\u0000"+
		"\u0000\u010a\u070a\u0001\u0000\u0000\u0000\u010c\u070e\u0001\u0000\u0000"+
		"\u0000\u010e\u071a\u0001\u0000\u0000\u0000\u0110\u071c\u0001\u0000\u0000"+
		"\u0000\u0112\u0722\u0001\u0000\u0000\u0000\u0114\u075d\u0001\u0000\u0000"+
		"\u0000\u0116\u075f\u0001\u0000\u0000\u0000\u0118\u0762\u0001\u0000\u0000"+
		"\u0000\u011a\u076a\u0001\u0000\u0000\u0000\u011c\u07a6\u0001\u0000\u0000"+
		"\u0000\u011e\u07a8\u0001\u0000\u0000\u0000\u0120\u07ad\u0001\u0000\u0000"+
		"\u0000\u0122\u07af\u0001\u0000\u0000\u0000\u0124\u07b4\u0001\u0000\u0000"+
		"\u0000\u0126\u07bc\u0001\u0000\u0000\u0000\u0128\u07be\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0003\u0002\u0001\u0000\u012b\u012d\u0003\n\u0005\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u0001\u0001\u0000\u0000\u0000\u012e\u012f\u0005+\u0000\u0000\u012f"+
		"\u0130\u0003\u0126\u0093\u0000\u0130\u0131\u0005\u001b\u0000\u0000\u0131"+
		"\u0132\u0003\u0126\u0093\u0000\u0132\u0133\u0005\u00c9\u0000\u0000\u0133"+
		"\u0138\u0003\u0004\u0002\u0000\u0134\u0135\u0005\u00d0\u0000\u0000\u0135"+
		"\u0137\u0003\u0004\u0002\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u00ca\u0000\u0000\u013c"+
		"\u013d\u0003\u0006\u0003\u0000\u013d\u013e\u0005\u0000\u0000\u0001\u013e"+
		"\u0003\u0001\u0000\u0000\u0000\u013f\u0140\u0007\u0000\u0000\u0000\u0140"+
		"\u0141\u0007\u0001\u0000\u0000\u0141\u0005\u0001\u0000\u0000\u0000\u0142"+
		"\u0146\u0005\u00cb\u0000\u0000\u0143\u0145\u0003\b\u0004\u0000\u0144\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u00cc\u0000\u0000\u014a\u0007\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0003\u001e\u000f\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0003\"\u0011\u0000\u0152\u0154\u0003"+
		"V+\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\t\u0001\u0000\u0000\u0000\u0155\u0156\u0003\f\u0006\u0000"+
		"\u0156\u0157\u0005\u0000\u0000\u0001\u0157\u000b\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0003\u001e\u000f\u0000\u0159\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u016e\u0003\u000e\u0007\u0000"+
		"\u015f\u0161\u0003\u001e\u000f\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u016e\u0003\u0010\b\u0000\u0166"+
		"\u0168\u0003\u001e\u000f\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u0014\n\u0000\u016d\u015b"+
		"\u0001\u0000\u0000\u0000\u016d\u0162\u0001\u0000\u0000\u0000\u016d\u0169"+
		"\u0001\u0000\u0000\u0000\u016e\r\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0006\u0000\u0000\u0170\u0173\u0003\u0126\u0093\u0000\u0171\u0172\u0005"+
		"\f\u0000\u0000\u0172\u0174\u00034\u001a\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0005\u0013\u0000\u0000\u0176\u0178\u0003\u0016"+
		"\u000b\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0003\u0018"+
		"\f\u0000\u017a\u000f\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u000b\u0000"+
		"\u0000\u017c\u017d\u0003\u0126\u0093\u0000\u017d\u017f\u0005\u00cb\u0000"+
		"\u0000\u017e\u0180\u0003\u0012\t\u0000\u017f\u017e\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005\u00cc\u0000\u0000\u0182\u0011\u0001\u0000\u0000\u0000"+
		"\u0183\u0188\u0003\u0126\u0093\u0000\u0184\u0185\u0005\u00d0\u0000\u0000"+
		"\u0185\u0187\u0003\u0126\u0093\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0013\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0017\u0000\u0000"+
		"\u018c\u018f\u0003\u0126\u0093\u0000\u018d\u018e\u0005\f\u0000\u0000\u018e"+
		"\u0190\u0003\u0016\u000b\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0003\u001a\r\u0000\u0192\u0015\u0001\u0000\u0000\u0000\u0193\u0198"+
		"\u00034\u001a\u0000\u0194\u0195\u0005\u00d0\u0000\u0000\u0195\u0197\u0003"+
		"4\u001a\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000"+
		"\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u0017\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019b\u019f\u0005\u00cb\u0000\u0000\u019c\u019e\u0003\u001c"+
		"\u000e\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005\u00cc\u0000\u0000\u01a3\u0019\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a8\u0005\u00cb\u0000\u0000\u01a5\u01a7\u0003,\u0016"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0005\u00cc\u0000\u0000\u01ac\u001b\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ba\u0005\u00cf\u0000\u0000\u01ae\u01b0\u0005$\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01ba\u0003P(\u0000\u01b2\u01b4"+
		"\u0003\u001e\u000f\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003 \u0010\u0000\u01b9\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b9\u01af\u0001\u0000\u0000\u0000\u01b9\u01b5\u0001"+
		"\u0000\u0000\u0000\u01ba\u001d\u0001\u0000\u0000\u0000\u01bb\u01cf\u0003"+
		"F#\u0000\u01bc\u01cf\u0005\u0011\u0000\u0000\u01bd\u01cf\u0005\u001f\u0000"+
		"\u0000\u01be\u01cf\u0005\u001e\u0000\u0000\u01bf\u01cf\u0005\u001d\u0000"+
		"\u0000\u01c0\u01cf\u0005*\u0000\u0000\u01c1\u01cf\u0005$\u0000\u0000\u01c2"+
		"\u01cf\u0005\u0001\u0000\u0000\u01c3\u01cf\u0005\r\u0000\u0000\u01c4\u01cf"+
		"\u00052\u0000\u0000\u01c5\u01cf\u0005\u001c\u0000\u0000\u01c6\u01cf\u0005"+
		"0\u0000\u0000\u01c7\u01cf\u0005\'\u0000\u0000\u01c8\u01c9\u00055\u0000"+
		"\u0000\u01c9\u01cf\u0005#\u0000\u0000\u01ca\u01cb\u00056\u0000\u0000\u01cb"+
		"\u01cf\u0005#\u0000\u0000\u01cc\u01cd\u0005\u0014\u0000\u0000\u01cd\u01cf"+
		"\u0005#\u0000\u0000\u01ce\u01bb\u0001\u0000\u0000\u0000\u01ce\u01bc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01bd\u0001\u0000\u0000\u0000\u01ce\u01be\u0001"+
		"\u0000\u0000\u0000\u01ce\u01bf\u0001\u0000\u0000\u0000\u01ce\u01c0\u0001"+
		"\u0000\u0000\u0000\u01ce\u01c1\u0001\u0000\u0000\u0000\u01ce\u01c2\u0001"+
		"\u0000\u0000\u0000\u01ce\u01c3\u0001\u0000\u0000\u0000\u01ce\u01c4\u0001"+
		"\u0000\u0000\u0000\u01ce\u01c5\u0001\u0000\u0000\u0000\u01ce\u01c6\u0001"+
		"\u0000\u0000\u0000\u01ce\u01c7\u0001\u0000\u0000\u0000\u01ce\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cf\u001f\u0001\u0000\u0000\u0000\u01d0\u01d8\u0003"+
		"$\u0012\u0000\u01d1\u01d8\u0003(\u0014\u0000\u01d2\u01d8\u0003&\u0013"+
		"\u0000\u01d3\u01d8\u0003\u0014\n\u0000\u01d4\u01d8\u0003\u000e\u0007\u0000"+
		"\u01d5\u01d8\u0003\u0010\b\u0000\u01d6\u01d8\u0003*\u0015\u0000\u01d7"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d7\u01d1\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d7\u01d3\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8!\u0001\u0000\u0000\u0000\u01d9\u01e0"+
		"\u0003$\u0012\u0000\u01da\u01e0\u0003(\u0014\u0000\u01db\u01e0\u0003\u0014"+
		"\n\u0000\u01dc\u01e0\u0003\u000e\u0007\u0000\u01dd\u01e0\u0003\u0010\b"+
		"\u0000\u01de\u01e0\u0003*\u0015\u0000\u01df\u01d9\u0001\u0000\u0000\u0000"+
		"\u01df\u01da\u0001\u0000\u0000\u0000\u01df\u01db\u0001\u0000\u0000\u0000"+
		"\u01df\u01dc\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01df\u01de\u0001\u0000\u0000\u0000\u01e0#\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e4\u00034\u001a\u0000\u01e2\u01e4\u00051\u0000\u0000\u01e3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0003\u0126\u0093\u0000\u01e6\u01e9\u0003"+
		"<\u001e\u0000\u01e7\u01ea\u0003P(\u0000\u01e8\u01ea\u0005\u00cf\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea%\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003B!\u0000\u01ec"+
		"\u01ed\u0003<\u001e\u0000\u01ed\u01ee\u0003P(\u0000\u01ee\'\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u00034\u001a\u0000\u01f0\u01f1\u0003.\u0017\u0000"+
		"\u01f1\u01f2\u0005\u00cf\u0000\u0000\u01f2)\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u00034\u001a\u0000\u01f4\u01f5\u0003\u0126\u0093\u0000\u01f5\u01f9"+
		"\u0005\u00cb\u0000\u0000\u01f6\u01f8\u0003\u0084B\u0000\u01f7\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		"\u00cc\u0000\u0000\u01fd+\u0001\u0000\u0000\u0000\u01fe\u0200\u0003\u001e"+
		"\u000f\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202\u0206\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0204\u0207\u00034\u001a\u0000\u0205\u0207\u00051\u0000\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0003\u0126\u0093\u0000"+
		"\u0209\u020a\u0003<\u001e\u0000\u020a\u020b\u0005\u00cf\u0000\u0000\u020b"+
		"-\u0001\u0000\u0000\u0000\u020c\u0211\u00030\u0018\u0000\u020d\u020e\u0005"+
		"\u00d0\u0000\u0000\u020e\u0210\u00030\u0018\u0000\u020f\u020d\u0001\u0000"+
		"\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212/\u0001\u0000\u0000"+
		"\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0217\u0003\u0126\u0093"+
		"\u0000\u0215\u0216\u0005\u00d2\u0000\u0000\u0216\u0218\u0003\u009aM\u0000"+
		"\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000"+
		"\u02181\u0001\u0000\u0000\u0000\u0219\u0225\u0005\u00cb\u0000\u0000\u021a"+
		"\u021f\u0003\u009aM\u0000\u021b\u021c\u0005\u00d0\u0000\u0000\u021c\u021e"+
		"\u0003\u009aM\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0221\u0001"+
		"\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001"+
		"\u0000\u0000\u0000\u0222\u0224\u0005\u00d0\u0000\u0000\u0223\u0222\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001"+
		"\u0000\u0000\u0000\u0225\u021a\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0005"+
		"\u00cc\u0000\u0000\u02283\u0001\u0000\u0000\u0000\u0229\u022e\u00038\u001c"+
		"\u0000\u022a\u022b\u0005\u00d1\u0000\u0000\u022b\u022d\u00038\u001c\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u00036\u001b\u0000\u02325\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0005\u00cd\u0000\u0000\u0234\u0236\u0005\u00ce\u0000\u0000\u0235\u0233"+
		"\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u02387\u0001"+
		"\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023c\u0005"+
		"7\u0000\u0000\u023b\u023d\u0003:\u001d\u0000\u023c\u023b\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u024b\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0005\"\u0000\u0000\u023f\u0241\u0003:\u001d\u0000"+
		"\u0240\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u024b\u0001\u0000\u0000\u0000\u0242\u0244\u00058\u0000\u0000\u0243"+
		"\u0245\u0003:\u001d\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u024b\u0001\u0000\u0000\u0000\u0246\u0248"+
		"\u0003\u0126\u0093\u0000\u0247\u0249\u0003:\u001d\u0000\u0248\u0247\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001"+
		"\u0000\u0000\u0000\u024a\u023a\u0001\u0000\u0000\u0000\u024a\u023e\u0001"+
		"\u0000\u0000\u0000\u024a\u0242\u0001\u0000\u0000\u0000\u024a\u0246\u0001"+
		"\u0000\u0000\u0000\u024b9\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u00d4"+
		"\u0000\u0000\u024d\u024e\u0003\u0016\u000b\u0000\u024e\u024f\u0005\u00d3"+
		"\u0000\u0000\u024f;\u0001\u0000\u0000\u0000\u0250\u0252\u0005\u00c9\u0000"+
		"\u0000\u0251\u0253\u0003>\u001f\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0005\u00ca\u0000\u0000\u0255=\u0001\u0000\u0000\u0000\u0256"+
		"\u025b\u0003@ \u0000\u0257\u0258\u0005\u00d0\u0000\u0000\u0258\u025a\u0003"+
		"@ \u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000"+
		"\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c?\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025e\u0260\u0003\u001e\u000f\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000"+
		"\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0265\u00034\u001a\u0000\u0265"+
		"\u0266\u0003\u0126\u0093\u0000\u0266A\u0001\u0000\u0000\u0000\u0267\u026c"+
		"\u0003\u0126\u0093\u0000\u0268\u0269\u0005\u00d1\u0000\u0000\u0269\u026b"+
		"\u0003\u0126\u0093\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u026e"+
		"\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026dC\u0001\u0000\u0000\u0000\u026e\u026c\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0007\u0002\u0000\u0000\u0270E\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0005\u00f6\u0000\u0000\u0272\u0279\u0003B!\u0000"+
		"\u0273\u0276\u0005\u00c9\u0000\u0000\u0274\u0277\u0003H$\u0000\u0275\u0277"+
		"\u0003L&\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0005\u00ca\u0000\u0000\u0279\u0273\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027aG\u0001\u0000\u0000"+
		"\u0000\u027b\u0282\u0003J%\u0000\u027c\u027e\u0005\u00d0\u0000\u0000\u027d"+
		"\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0003J%\u0000\u0280\u027d\u0001"+
		"\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283I\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0286\u0003\u0126"+
		"\u0093\u0000\u0286\u0287\u0005\u00d2\u0000\u0000\u0287\u0288\u0003L&\u0000"+
		"\u0288K\u0001\u0000\u0000\u0000\u0289\u028d\u0003\u009aM\u0000\u028a\u028d"+
		"\u0003F#\u0000\u028b\u028d\u0003N\'\u0000\u028c\u0289\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028dM\u0001\u0000\u0000\u0000\u028e\u0297\u0005\u00cb\u0000\u0000"+
		"\u028f\u0294\u0003L&\u0000\u0290\u0291\u0005\u00d0\u0000\u0000\u0291\u0293"+
		"\u0003L&\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000"+
		"\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000"+
		"\u0000\u0000\u0297\u028f\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u029b\u0005\u00d0"+
		"\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0005\u00cc"+
		"\u0000\u0000\u029dO\u0001\u0000\u0000\u0000\u029e\u02a2\u0005\u00cb\u0000"+
		"\u0000\u029f\u02a1\u0003V+\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005\u00cc\u0000\u0000\u02a6"+
		"Q\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003T*\u0000\u02a8\u02a9\u0005"+
		"\u00cf\u0000\u0000\u02a9S\u0001\u0000\u0000\u0000\u02aa\u02ac\u0003\u001e"+
		"\u000f\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u00034\u001a\u0000\u02b1\u02b2\u0003.\u0017\u0000"+
		"\u02b2U\u0001\u0000\u0000\u0000\u02b3\u02c8\u0003P(\u0000\u02b4\u02c8"+
		"\u0003X,\u0000\u02b5\u02c8\u0003Z-\u0000\u02b6\u02c8\u0003b1\u0000\u02b7"+
		"\u02c8\u0003d2\u0000\u02b8\u02c8\u0003f3\u0000\u02b9\u02c8\u0003h4\u0000"+
		"\u02ba\u02c8\u0003j5\u0000\u02bb\u02c8\u0003l6\u0000\u02bc\u02c8\u0003"+
		"n7\u0000\u02bd\u02c8\u0003p8\u0000\u02be\u02c8\u0003t:\u0000\u02bf\u02c8"+
		"\u0003v;\u0000\u02c0\u02c8\u0003x<\u0000\u02c1\u02c8\u0003z=\u0000\u02c2"+
		"\u02c8\u0003|>\u0000\u02c3\u02c8\u0003~?\u0000\u02c4\u02c8\u0003\u0080"+
		"@\u0000\u02c5\u02c8\u0003R)\u0000\u02c6\u02c8\u0003\u0082A\u0000\u02c7"+
		"\u02b3\u0001\u0000\u0000\u0000\u02c7\u02b4\u0001\u0000\u0000\u0000\u02c7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02c7\u02b6\u0001\u0000\u0000\u0000\u02c7"+
		"\u02b7\u0001\u0000\u0000\u0000\u02c7\u02b8\u0001\u0000\u0000\u0000\u02c7"+
		"\u02b9\u0001\u0000\u0000\u0000\u02c7\u02ba\u0001\u0000\u0000\u0000\u02c7"+
		"\u02bb\u0001\u0000\u0000\u0000\u02c7\u02bc\u0001\u0000\u0000\u0000\u02c7"+
		"\u02bd\u0001\u0000\u0000\u0000\u02c7\u02be\u0001\u0000\u0000\u0000\u02c7"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c7\u02c0\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c7\u02c2\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c7\u02c4\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"W\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005\u0012\u0000\u0000\u02ca\u02cb"+
		"\u0003\u0096K\u0000\u02cb\u02ce\u0003V+\u0000\u02cc\u02cd\u0005\n\u0000"+
		"\u0000\u02cd\u02cf\u0003V+\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cfY\u0001\u0000\u0000\u0000\u02d0\u02d1"+
		"\u0005&\u0000\u0000\u02d1\u02d2\u0005\u001b\u0000\u0000\u02d2\u02d3\u0003"+
		"\u009aM\u0000\u02d3\u02d5\u0005\u00cb\u0000\u0000\u02d4\u02d6\u0003\\"+
		".\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u00cc\u0000"+
		"\u0000\u02da[\u0001\u0000\u0000\u0000\u02db\u02dc\u00053\u0000\u0000\u02dc"+
		"\u02dd\u0003^/\u0000\u02dd\u02de\u0003P(\u0000\u02de]\u0001\u0000\u0000"+
		"\u0000\u02df\u02ec\u0005\n\u0000\u0000\u02e0\u02e5\u0003`0\u0000\u02e1"+
		"\u02e2\u0005\u00d0\u0000\u0000\u02e2\u02e4\u0003`0\u0000\u02e3\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e7\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02ec\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003"+
		"4\u001a\u0000\u02e9\u02ea\u0003\u0126\u0093\u0000\u02ea\u02ec\u0001\u0000"+
		"\u0000\u0000\u02eb\u02df\u0001\u0000\u0000\u0000\u02eb\u02e0\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e8\u0001\u0000\u0000\u0000\u02ec_\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ef\u0007\u0003\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u0303\u0005\u00c3\u0000"+
		"\u0000\u02f4\u02f6\u0007\u0003\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u0303\u0005\u00c4\u0000"+
		"\u0000\u02fb\u0303\u0005\u00c7\u0000\u0000\u02fc\u0303\u0005\u001a\u0000"+
		"\u0000\u02fd\u0303\u0003\u0126\u0093\u0000\u02fe\u02ff\u0005\u00c9\u0000"+
		"\u0000\u02ff\u0300\u0003`0\u0000\u0300\u0301\u0005\u00ca\u0000\u0000\u0301"+
		"\u0303\u0001\u0000\u0000\u0000\u0302\u02f0\u0001\u0000\u0000\u0000\u0302"+
		"\u02f7\u0001\u0000\u0000\u0000\u0302\u02fb\u0001\u0000\u0000\u0000\u0302"+
		"\u02fc\u0001\u0000\u0000\u0000\u0302\u02fd\u0001\u0000\u0000\u0000\u0302"+
		"\u02fe\u0001\u0000\u0000\u0000\u0303a\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0005\u000f\u0000\u0000\u0305\u0306\u0005\u00c9\u0000\u0000\u0306\u0307"+
		"\u0003\u008eG\u0000\u0307\u030a\u0005\u00ca\u0000\u0000\u0308\u030b\u0003"+
		"V+\u0000\u0309\u030b\u0005\u00cf\u0000\u0000\u030a\u0308\u0001\u0000\u0000"+
		"\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030bc\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u00054\u0000\u0000\u030d\u0310\u0003\u0096K\u0000\u030e\u0311"+
		"\u0003V+\u0000\u030f\u0311\u0005\u00cf\u0000\u0000\u0310\u030e\u0001\u0000"+
		"\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311e\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0005\t\u0000\u0000\u0313\u0314\u0003P(\u0000\u0314"+
		"\u0315\u00054\u0000\u0000\u0315\u0316\u0003\u0096K\u0000\u0316\u0317\u0005"+
		"\u00cf\u0000\u0000\u0317g\u0001\u0000\u0000\u0000\u0318\u0319\u0005,\u0000"+
		"\u0000\u0319\u0323\u0003P(\u0000\u031a\u031c\u0003\u008aE\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u031b\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e"+
		"\u0320\u0001\u0000\u0000\u0000\u031f\u0321\u0003\u008cF\u0000\u0320\u031f"+
		"\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0324"+
		"\u0001\u0000\u0000\u0000\u0322\u0324\u0003\u008cF\u0000\u0323\u031b\u0001"+
		"\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324i\u0001\u0000"+
		"\u0000\u0000\u0325\u0327\u0005 \u0000\u0000\u0326\u0328\u0003\u009aM\u0000"+
		"\u0327\u0326\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032a\u0005\u00cf\u0000\u0000"+
		"\u032ak\u0001\u0000\u0000\u0000\u032b\u032c\u0005)\u0000\u0000\u032c\u032d"+
		"\u0003\u009aM\u0000\u032d\u032e\u0005\u00cf\u0000\u0000\u032em\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0005\u0004\u0000\u0000\u0330\u0331\u0005\u00cf"+
		"\u0000\u0000\u0331o\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u0007\u0000"+
		"\u0000\u0333\u0334\u0005\u00cf\u0000\u0000\u0334q\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0005>\u0000\u0000\u0336\u0337\u0007\u0004\u0000\u0000\u0337"+
		"s\u0001\u0000\u0000\u0000\u0338\u033a\u0005\u0015\u0000\u0000\u0339\u033b"+
		"\u0003r9\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0003\u009a"+
		"M\u0000\u033d\u033e\u0005\u00cf\u0000\u0000\u033eu\u0001\u0000\u0000\u0000"+
		"\u033f\u0341\u0005.\u0000\u0000\u0340\u0342\u0003r9\u0000\u0341\u0340"+
		"\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0343"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0003\u009aM\u0000\u0344\u0345\u0005"+
		"\u00cf\u0000\u0000\u0345w\u0001\u0000\u0000\u0000\u0346\u0348\u0005\b"+
		"\u0000\u0000\u0347\u0349\u0003r9\u0000\u0348\u0347\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u034b\u0003\u009aM\u0000\u034b\u034c\u0005\u00cf\u0000\u0000\u034c"+
		"y\u0001\u0000\u0000\u0000\u034d\u034f\u0005-\u0000\u0000\u034e\u0350\u0003"+
		"r9\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0003\u009aM\u0000"+
		"\u0352\u0353\u0005\u00cf\u0000\u0000\u0353{\u0001\u0000\u0000\u0000\u0354"+
		"\u0356\u0005/\u0000\u0000\u0355\u0357\u0003r9\u0000\u0356\u0355\u0001"+
		"\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u035a\u0003\u009aM\u0000\u0359\u035b\u0003B!"+
		"\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035d\u0005\u00cf\u0000"+
		"\u0000\u035d}\u0001\u0000\u0000\u0000\u035e\u0360\u0005\u0018\u0000\u0000"+
		"\u035f\u0361\u0003r9\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0003\u009aM\u0000\u0363\u0364\u0003\u009aM\u0000\u0364\u0365\u0005\u00cf"+
		"\u0000\u0000\u0365\u007f\u0001\u0000\u0000\u0000\u0366\u0367\u0005!\u0000"+
		"\u0000\u0367\u0369\u0005\u00c9\u0000\u0000\u0368\u036a\u0003\u0098L\u0000"+
		"\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000"+
		"\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036c\u0005\u00ca\u0000\u0000"+
		"\u036c\u036d\u0003P(\u0000\u036d\u0081\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0003\u009aM\u0000\u036f\u0370\u0005\u00cf\u0000\u0000\u0370\u0083\u0001"+
		"\u0000\u0000\u0000\u0371\u0373\u0003\u001e\u000f\u0000\u0372\u0371\u0001"+
		"\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0379\u0001"+
		"\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u037a\u0003"+
		"\u0086C\u0000\u0378\u037a\u0003\u0088D\u0000\u0379\u0377\u0001\u0000\u0000"+
		"\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u037a\u0085\u0001\u0000\u0000"+
		"\u0000\u037b\u037e\u0005\u0010\u0000\u0000\u037c\u037f\u0005\u00cf\u0000"+
		"\u0000\u037d\u037f\u0003P(\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e"+
		"\u037d\u0001\u0000\u0000\u0000\u037f\u0087\u0001\u0000\u0000\u0000\u0380"+
		"\u0383\u0005\"\u0000\u0000\u0381\u0384\u0005\u00cf\u0000\u0000\u0382\u0384"+
		"\u0003P(\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0382\u0001\u0000"+
		"\u0000\u0000\u0384\u0089\u0001\u0000\u0000\u0000\u0385\u0386\u0005\u0005"+
		"\u0000\u0000\u0386\u038a\u0005\u00c9\u0000\u0000\u0387\u0389\u0003\u001e"+
		"\u000f\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389\u038c\u0001\u0000"+
		"\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u038d\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000"+
		"\u0000\u0000\u038d\u038e\u0003B!\u0000\u038e\u038f\u0003\u0126\u0093\u0000"+
		"\u038f\u0390\u0005\u00ca\u0000\u0000\u0390\u0391\u0003P(\u0000\u0391\u008b"+
		"\u0001\u0000\u0000\u0000\u0392\u0393\u0005\u000e\u0000\u0000\u0393\u0394"+
		"\u0003P(\u0000\u0394\u008d\u0001\u0000\u0000\u0000\u0395\u03a2\u0003\u0092"+
		"I\u0000\u0396\u0398\u0003\u0090H\u0000\u0397\u0396\u0001\u0000\u0000\u0000"+
		"\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000"+
		"\u0399\u039b\u0005\u00cf\u0000\u0000\u039a\u039c\u0003\u009aM\u0000\u039b"+
		"\u039a\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c"+
		"\u039d\u0001\u0000\u0000\u0000\u039d\u039f\u0005\u00cf\u0000\u0000\u039e"+
		"\u03a0\u0003\u0094J\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u039f\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000\u03a1\u0395"+
		"\u0001\u0000\u0000\u0000\u03a1\u0397\u0001\u0000\u0000\u0000\u03a2\u008f"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a6\u0003T*\u0000\u03a4\u03a6\u0003\u0098"+
		"L\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a4\u0001\u0000\u0000"+
		"\u0000\u03a6\u0091\u0001\u0000\u0000\u0000\u03a7\u03a8\u00034\u001a\u0000"+
		"\u03a8\u03a9\u0003\u0126\u0093\u0000\u03a9\u03aa\u0005\u00d9\u0000\u0000"+
		"\u03aa\u03ab\u0003\u009aM\u0000\u03ab\u0093\u0001\u0000\u0000\u0000\u03ac"+
		"\u03ad\u0003\u0098L\u0000\u03ad\u0095\u0001\u0000\u0000\u0000\u03ae\u03af"+
		"\u0005\u00c9\u0000\u0000\u03af\u03b0\u0003\u009aM\u0000\u03b0\u03b1\u0005"+
		"\u00ca\u0000\u0000\u03b1\u0097\u0001\u0000\u0000\u0000\u03b2\u03b7\u0003"+
		"\u009aM\u0000\u03b3\u03b4\u0005\u00d0\u0000\u0000\u03b4\u03b6\u0003\u009a"+
		"M\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b8\u0099\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bb\u0006M\uffff\uffff\u0000\u03bb\u03cd\u0003\u009cN\u0000"+
		"\u03bc\u03cd\u0003\u009eO\u0000\u03bd\u03be\u0005\u0019\u0000\u0000\u03be"+
		"\u03cd\u0003\u00a2Q\u0000\u03bf\u03c0\u0005\u00c9\u0000\u0000\u03c0\u03c1"+
		"\u00034\u001a\u0000\u03c1\u03c2\u0005\u00ca\u0000\u0000\u03c2\u03c3\u0003"+
		"\u009aM\u0013\u03c3\u03cd\u0001\u0000\u0000\u0000\u03c4\u03c5\u0005\u00c9"+
		"\u0000\u0000\u03c5\u03c6\u0003\u009aM\u0000\u03c6\u03c7\u0005\u00ca\u0000"+
		"\u0000\u03c7\u03cd\u0001\u0000\u0000\u0000\u03c8\u03c9\u0007\u0005\u0000"+
		"\u0000\u03c9\u03cd\u0003\u009aM\u0010\u03ca\u03cb\u0007\u0006\u0000\u0000"+
		"\u03cb\u03cd\u0003\u009aM\u000f\u03cc\u03ba\u0001\u0000\u0000\u0000\u03cc"+
		"\u03bc\u0001\u0000\u0000\u0000\u03cc\u03bd\u0001\u0000\u0000\u0000\u03cc"+
		"\u03bf\u0001\u0000\u0000\u0000\u03cc\u03c4\u0001\u0000\u0000\u0000\u03cc"+
		"\u03c8\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cd"+
		"\u0415\u0001\u0000\u0000\u0000\u03ce\u03cf\n\u000e\u0000\u0000\u03cf\u03d0"+
		"\u0007\u0007\u0000\u0000\u03d0\u0414\u0003\u009aM\u000f\u03d1\u03d2\n"+
		"\r\u0000\u0000\u03d2\u03d3\u0007\u0003\u0000\u0000\u03d3\u0414\u0003\u009a"+
		"M\u000e\u03d4\u03dc\n\f\u0000\u0000\u03d5\u03d6\u0005\u00d4\u0000\u0000"+
		"\u03d6\u03dd\u0005\u00d4\u0000\u0000\u03d7\u03d8\u0005\u00d3\u0000\u0000"+
		"\u03d8\u03d9\u0005\u00d3\u0000\u0000\u03d9\u03dd\u0005\u00d3\u0000\u0000"+
		"\u03da\u03db\u0005\u00d3\u0000\u0000\u03db\u03dd\u0005\u00d3\u0000\u0000"+
		"\u03dc\u03d5\u0001\u0000\u0000\u0000\u03dc\u03d7\u0001\u0000\u0000\u0000"+
		"\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000"+
		"\u03de\u0414\u0003\u009aM\r\u03df\u03e0\n\u000b\u0000\u0000\u03e0\u03e2"+
		"\u0007\b\u0000\u0000\u03e1\u03e3\u0005\u00d2\u0000\u0000\u03e2\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e4\u0414\u0003\u009aM\f\u03e5\u03e6\n\t\u0000\u0000"+
		"\u03e6\u03e7\u0007\t\u0000\u0000\u03e7\u0414\u0003\u009aM\n\u03e8\u03e9"+
		"\n\b\u0000\u0000\u03e9\u03ea\u0005\u00e8\u0000\u0000\u03ea\u0414\u0003"+
		"\u009aM\t\u03eb\u03ec\n\u0007\u0000\u0000\u03ec\u03ed\u0005\u00ea\u0000"+
		"\u0000\u03ed\u0414\u0003\u009aM\b\u03ee\u03ef\n\u0006\u0000\u0000\u03ef"+
		"\u03f0\u0005\u00e9\u0000\u0000\u03f0\u0414\u0003\u009aM\u0007\u03f1\u03f2"+
		"\n\u0005\u0000\u0000\u03f2\u03f3\u0005\u00df\u0000\u0000\u03f3\u0414\u0003"+
		"\u009aM\u0006\u03f4\u03f5\n\u0004\u0000\u0000\u03f5\u03f6\u0005\u00e0"+
		"\u0000\u0000\u03f6\u0414\u0003\u009aM\u0005\u03f7\u03f8\n\u0003\u0000"+
		"\u0000\u03f8\u03f9\u0005\u00e1\u0000\u0000\u03f9\u0414\u0003\u009aM\u0004"+
		"\u03fa\u03fb\n\u0002\u0000\u0000\u03fb\u03fc\u0005\u00d8\u0000\u0000\u03fc"+
		"\u03fd\u0003\u009aM\u0000\u03fd\u03fe\u0005\u00d9\u0000\u0000\u03fe\u03ff"+
		"\u0003\u009aM\u0002\u03ff\u0414\u0001\u0000\u0000\u0000\u0400\u0401\n"+
		"\u0001\u0000\u0000\u0401\u0402\u0007\n\u0000\u0000\u0402\u0414\u0003\u009a"+
		"M\u0001\u0403\u0404\n\u0017\u0000\u0000\u0404\u0407\u0007\u000b\u0000"+
		"\u0000\u0405\u0408\u0003\u00a0P\u0000\u0406\u0408\u0003\u0128\u0094\u0000"+
		"\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0406\u0001\u0000\u0000\u0000"+
		"\u0408\u0414\u0001\u0000\u0000\u0000\u0409\u040a\n\u0016\u0000\u0000\u040a"+
		"\u040b\u0005\u00cd\u0000\u0000\u040b\u040c\u0003\u009aM\u0000\u040c\u040d"+
		"\u0005\u00ce\u0000\u0000\u040d\u0414\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\n\u0011\u0000\u0000\u040f\u0414\u0007\f\u0000\u0000\u0410\u0411\n\n\u0000"+
		"\u0000\u0411\u0412\u0005\u0016\u0000\u0000\u0412\u0414\u00034\u001a\u0000"+
		"\u0413\u03ce\u0001\u0000\u0000\u0000\u0413\u03d1\u0001\u0000\u0000\u0000"+
		"\u0413\u03d4\u0001\u0000\u0000\u0000\u0413\u03df\u0001\u0000\u0000\u0000"+
		"\u0413\u03e5\u0001\u0000\u0000\u0000\u0413\u03e8\u0001\u0000\u0000\u0000"+
		"\u0413\u03eb\u0001\u0000\u0000\u0000\u0413\u03ee\u0001\u0000\u0000\u0000"+
		"\u0413\u03f1\u0001\u0000\u0000\u0000\u0413\u03f4\u0001\u0000\u0000\u0000"+
		"\u0413\u03f7\u0001\u0000\u0000\u0000\u0413\u03fa\u0001\u0000\u0000\u0000"+
		"\u0413\u0400\u0001\u0000\u0000\u0000\u0413\u0403\u0001\u0000\u0000\u0000"+
		"\u0413\u0409\u0001\u0000\u0000\u0000\u0413\u040e\u0001\u0000\u0000\u0000"+
		"\u0413\u0410\u0001\u0000\u0000\u0000\u0414\u0417\u0001\u0000\u0000\u0000"+
		"\u0415\u0413\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000"+
		"\u0416\u009b\u0001\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000"+
		"\u0418\u0426\u0005(\u0000\u0000\u0419\u0426\u0005%\u0000\u0000\u041a\u0426"+
		"\u0003D\"\u0000\u041b\u041c\u00034\u001a\u0000\u041c\u041d\u0005\u00d1"+
		"\u0000\u0000\u041d\u041e\u0005\u0006\u0000\u0000\u041e\u0426\u0001\u0000"+
		"\u0000\u0000\u041f\u0420\u00051\u0000\u0000\u0420\u0421\u0005\u00d1\u0000"+
		"\u0000\u0421\u0426\u0005\u0006\u0000\u0000\u0422\u0426\u0003\u0126\u0093"+
		"\u0000\u0423\u0426\u0003\u00b6[\u0000\u0424\u0426\u0003\u010e\u0087\u0000"+
		"\u0425\u0418\u0001\u0000\u0000\u0000\u0425\u0419\u0001\u0000\u0000\u0000"+
		"\u0425\u041a\u0001\u0000\u0000\u0000\u0425\u041b\u0001\u0000\u0000\u0000"+
		"\u0425\u041f\u0001\u0000\u0000\u0000\u0425\u0422\u0001\u0000\u0000\u0000"+
		"\u0425\u0423\u0001\u0000\u0000\u0000\u0425\u0424\u0001\u0000\u0000\u0000"+
		"\u0426\u009d\u0001\u0000\u0000\u0000\u0427\u0428\u0003\u0126\u0093\u0000"+
		"\u0428\u042a\u0005\u00c9\u0000\u0000\u0429\u042b\u0003\u0098L\u0000\u042a"+
		"\u0429\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u042d\u0005\u00ca\u0000\u0000\u042d"+
		"\u043b\u0001\u0000\u0000\u0000\u042e\u042f\u0005(\u0000\u0000\u042f\u0431"+
		"\u0005\u00c9\u0000\u0000\u0430\u0432\u0003\u0098L\u0000\u0431\u0430\u0001"+
		"\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0433\u0001"+
		"\u0000\u0000\u0000\u0433\u043b\u0005\u00ca\u0000\u0000\u0434\u0435\u0005"+
		"%\u0000\u0000\u0435\u0437\u0005\u00c9\u0000\u0000\u0436\u0438\u0003\u0098"+
		"L\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043b\u0005\u00ca\u0000"+
		"\u0000\u043a\u0427\u0001\u0000\u0000\u0000\u043a\u042e\u0001\u0000\u0000"+
		"\u0000\u043a\u0434\u0001\u0000\u0000\u0000\u043b\u009f\u0001\u0000\u0000"+
		"\u0000\u043c\u043d\u0003\u0128\u0094\u0000\u043d\u043f\u0005\u00c9\u0000"+
		"\u0000\u043e\u0440\u0003\u0098L\u0000\u043f\u043e\u0001\u0000\u0000\u0000"+
		"\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000"+
		"\u0441\u0442\u0005\u00ca\u0000\u0000\u0442\u00a1\u0001\u0000\u0000\u0000"+
		"\u0443\u0449\u0003\u00a4R\u0000\u0444\u044a\u0003\u00a8T\u0000\u0445\u044a"+
		"\u0003\u00aaU\u0000\u0446\u044a\u0003\u00acV\u0000\u0447\u044a\u0003\u00ae"+
		"W\u0000\u0448\u044a\u0003\u00b2Y\u0000\u0449\u0444\u0001\u0000\u0000\u0000"+
		"\u0449\u0445\u0001\u0000\u0000\u0000\u0449\u0446\u0001\u0000\u0000\u0000"+
		"\u0449\u0447\u0001\u0000\u0000\u0000\u0449\u0448\u0001\u0000\u0000\u0000"+
		"\u044a\u00a3\u0001\u0000\u0000\u0000\u044b\u0450\u0003\u00a6S\u0000\u044c"+
		"\u044d\u0005\u00d1\u0000\u0000\u044d\u044f\u0003\u00a6S\u0000\u044e\u044c"+
		"\u0001\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u044e"+
		"\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u00a5"+
		"\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0453\u0458"+
		"\u0003\u0128\u0094\u0000\u0454\u0455\u0005\u00d4\u0000\u0000\u0455\u0456"+
		"\u0003\u0016\u000b\u0000\u0456\u0457\u0005\u00d3\u0000\u0000\u0457\u0459"+
		"\u0001\u0000\u0000\u0000\u0458\u0454\u0001\u0000\u0000\u0000\u0458\u0459"+
		"\u0001\u0000\u0000\u0000\u0459\u00a7\u0001\u0000\u0000\u0000\u045a\u045b"+
		"\u0005\u00cb\u0000\u0000\u045b\u045c\u0005\u00cc\u0000\u0000\u045c\u00a9"+
		"\u0001\u0000\u0000\u0000\u045d\u045e\u0003\u00b4Z\u0000\u045e\u00ab\u0001"+
		"\u0000\u0000\u0000\u045f\u0460\u0005\u00cd\u0000\u0000\u0460\u0461\u0003"+
		"\u009aM\u0000\u0461\u0462\u0005\u00ce\u0000\u0000\u0462\u0469\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0005\u00cd\u0000\u0000\u0464\u0466\u0005\u00ce"+
		"\u0000\u0000\u0465\u0467\u00032\u0019\u0000\u0466\u0465\u0001\u0000\u0000"+
		"\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0469\u0001\u0000\u0000"+
		"\u0000\u0468\u045f\u0001\u0000\u0000\u0000\u0468\u0463\u0001\u0000\u0000"+
		"\u0000\u0469\u00ad\u0001\u0000\u0000\u0000\u046a\u046b\u0005\u00cb\u0000"+
		"\u0000\u046b\u0470\u0003\u00b0X\u0000\u046c\u046d\u0005\u00d0\u0000\u0000"+
		"\u046d\u046f\u0003\u00b0X\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046f"+
		"\u0472\u0001\u0000\u0000\u0000\u0470\u046e\u0001\u0000\u0000\u0000\u0470"+
		"\u0471\u0001\u0000\u0000\u0000\u0471\u0473\u0001\u0000\u0000\u0000\u0472"+
		"\u0470\u0001\u0000\u0000\u0000\u0473\u0474\u0005\u00cc\u0000\u0000\u0474"+
		"\u00af\u0001\u0000\u0000\u0000\u0475\u0476\u0003\u009aM\u0000\u0476\u0477"+
		"\u0005\u00eb\u0000\u0000\u0477\u0478\u0003\u009aM\u0000\u0478\u00b1\u0001"+
		"\u0000\u0000\u0000\u0479\u047a\u0005\u00cb\u0000\u0000\u047a\u047f\u0003"+
		"\u009aM\u0000\u047b\u047c\u0005\u00d0\u0000\u0000\u047c\u047e\u0003\u009a"+
		"M\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047e\u0481\u0001\u0000\u0000"+
		"\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000"+
		"\u0000\u0480\u0482\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000"+
		"\u0000\u0482\u0483\u0005\u00cc\u0000\u0000\u0483\u00b3\u0001\u0000\u0000"+
		"\u0000\u0484\u0486\u0005\u00c9\u0000\u0000\u0485\u0487\u0003\u0098L\u0000"+
		"\u0486\u0485\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000"+
		"\u0487\u0488\u0001\u0000\u0000\u0000\u0488\u0489\u0005\u00ca\u0000\u0000"+
		"\u0489\u00b5\u0001\u0000\u0000\u0000\u048a\u048b\u0005\u00cd\u0000\u0000"+
		"\u048b\u048c\u0003\u00b8\\\u0000\u048c\u048d\u0005\u00ce\u0000\u0000\u048d"+
		"\u00b7\u0001\u0000\u0000\u0000\u048e\u048f\u0005;\u0000\u0000\u048f\u0490"+
		"\u0003\u00bc^\u0000\u0490\u0491\u0005=\u0000\u0000\u0491\u0493\u0003\u00c2"+
		"a\u0000\u0492\u0494\u0003\u00dam\u0000\u0493\u0492\u0001\u0000\u0000\u0000"+
		"\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0496\u0001\u0000\u0000\u0000"+
		"\u0495\u0497\u0003\u00dcn\u0000\u0496\u0495\u0001\u0000\u0000\u0000\u0496"+
		"\u0497\u0001\u0000\u0000\u0000\u0497\u0499\u0001\u0000\u0000\u0000\u0498"+
		"\u049a\u0003\u00ecv\u0000\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u049c\u0001\u0000\u0000\u0000\u049b\u049d"+
		"\u0003\u00f6{\u0000\u049c\u049b\u0001\u0000\u0000\u0000\u049c\u049d\u0001"+
		"\u0000\u0000\u0000\u049d\u049f\u0001\u0000\u0000\u0000\u049e\u04a0\u0003"+
		"\u00f8|\u0000\u049f\u049e\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a2\u0001\u0000\u0000\u0000\u04a1\u04a3\u0003\u00fe"+
		"\u007f\u0000\u04a2\u04a1\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a5\u0001\u0000\u0000\u0000\u04a4\u04a6\u0003\u0100"+
		"\u0080\u0000\u04a5\u04a4\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a8\u0001\u0000\u0000\u0000\u04a7\u04a9\u0003\u0102"+
		"\u0081\u0000\u04a8\u04a7\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000"+
		"\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ad\u0003\u0104"+
		"\u0082\u0000\u04ab\u04ac\u0005.\u0000\u0000\u04ac\u04ae\u0003\u011e\u008f"+
		"\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000"+
		"\u0000\u04ae\u00b9\u0001\u0000\u0000\u0000\u04af\u04b0\u0005;\u0000\u0000"+
		"\u04b0\u04b1\u0003\u00c4b\u0000\u04b1\u04b2\u0005=\u0000\u0000\u04b2\u04b4"+
		"\u0003\u00c2a\u0000\u04b3\u04b5\u0003\u00dcn\u0000\u04b4\u04b3\u0001\u0000"+
		"\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000\u04b5\u04b7\u0001\u0000"+
		"\u0000\u0000\u04b6\u04b8\u0003\u00f8|\u0000\u04b7\u04b6\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000\u04b8\u04ba\u0001\u0000\u0000"+
		"\u0000\u04b9\u04bb\u0003\u00fe\u007f\u0000\u04ba\u04b9\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bc\u04bf\u0003\u0104\u0082\u0000\u04bd\u04be\u0005.\u0000\u0000"+
		"\u04be\u04c0\u0003\u011e\u008f\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000"+
		"\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u00bb\u0001\u0000\u0000\u0000"+
		"\u04c1\u04c6\u0003\u00be_\u0000\u04c2\u04c3\u0005\u00d0\u0000\u0000\u04c3"+
		"\u04c5\u0003\u00be_\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000\u04c5\u04c8"+
		"\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c6\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c7\u00bd\u0001\u0000\u0000\u0000\u04c8\u04c6"+
		"\u0001\u0000\u0000\u0000\u04c9\u04cb\u0003\u00c0`\u0000\u04ca\u04cc\u0003"+
		"\u010c\u0086\u0000\u04cb\u04ca\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001"+
		"\u0000\u0000\u0000\u04cc\u04d9\u0001\u0000\u0000\u0000\u04cd\u04cf\u0003"+
		"\u00cae\u0000\u04ce\u04d0\u0003\u010c\u0086\u0000\u04cf\u04ce\u0001\u0000"+
		"\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d9\u0001\u0000"+
		"\u0000\u0000\u04d1\u04d2\u0005\u00c9\u0000\u0000\u04d2\u04d3\u0003\u00ba"+
		"]\u0000\u04d3\u04d5\u0005\u00ca\u0000\u0000\u04d4\u04d6\u0003\u010c\u0086"+
		"\u0000\u04d5\u04d4\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000"+
		"\u0000\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7\u04d9\u0003\u00d2i\u0000"+
		"\u04d8\u04c9\u0001\u0000\u0000\u0000\u04d8\u04cd\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d1\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000"+
		"\u04d9\u00bf\u0001\u0000\u0000\u0000\u04da\u04df\u0003\u010c\u0086\u0000"+
		"\u04db\u04dc\u0005\u00d1\u0000\u0000\u04dc\u04de\u0003\u010c\u0086\u0000"+
		"\u04dd\u04db\u0001\u0000\u0000\u0000\u04de\u04e1\u0001\u0000\u0000\u0000"+
		"\u04df\u04dd\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e0\u00c1\u0001\u0000\u0000\u0000\u04e1\u04df\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e4\u0003\u00c0`\u0000\u04e3\u04e5\u0003\u010c\u0086\u0000\u04e4"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5"+
		"\u04ed\u0001\u0000\u0000\u0000\u04e6\u04e7\u0005\u00d0\u0000\u0000\u04e7"+
		"\u04e9\u0003\u00c0`\u0000\u04e8\u04ea\u0003\u010c\u0086\u0000\u04e9\u04e8"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04ec"+
		"\u0001\u0000\u0000\u0000\u04eb\u04e6\u0001\u0000\u0000\u0000\u04ec\u04ef"+
		"\u0001\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ee"+
		"\u0001\u0000\u0000\u0000\u04ee\u00c3\u0001\u0000\u0000\u0000\u04ef\u04ed"+
		"\u0001\u0000\u0000\u0000\u04f0\u04f5\u0003\u00c6c\u0000\u04f1\u04f2\u0005"+
		"\u00d0\u0000\u0000\u04f2\u04f4\u0003\u00c6c\u0000\u04f3\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f7\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000\u0000\u04f6\u00c5\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000\u04f8\u04fa\u0003\u00c0"+
		"`\u0000\u04f9\u04fb\u0003\u010c\u0086\u0000\u04fa\u04f9\u0001\u0000\u0000"+
		"\u0000\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u0508\u0001\u0000\u0000"+
		"\u0000\u04fc\u04fe\u0003\u00cae\u0000\u04fd\u04ff\u0003\u010c\u0086\u0000"+
		"\u04fe\u04fd\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000"+
		"\u04ff\u0508\u0001\u0000\u0000\u0000\u0500\u0501\u0005\u00c9\u0000\u0000"+
		"\u0501\u0502\u0003\u00ba]\u0000\u0502\u0504\u0005\u00ca\u0000\u0000\u0503"+
		"\u0505\u0003\u010c\u0086\u0000\u0504\u0503\u0001\u0000\u0000\u0000\u0504"+
		"\u0505\u0001\u0000\u0000\u0000\u0505\u0508\u0001\u0000\u0000\u0000\u0506"+
		"\u0508\u0003\u00d2i\u0000\u0507\u04f8\u0001\u0000\u0000\u0000\u0507\u04fc"+
		"\u0001\u0000\u0000\u0000\u0507\u0500\u0001\u0000\u0000\u0000\u0507\u0506"+
		"\u0001\u0000\u0000\u0000\u0508\u00c7\u0001\u0000\u0000\u0000\u0509\u050a"+
		"\u0007\r\u0000\u0000\u050a\u00c9\u0001\u0000\u0000\u0000\u050b\u050c\u0005"+
		"H\u0000\u0000\u050c\u050d\u0005\u00c9\u0000\u0000\u050d\u050e\u0003\u00c0"+
		"`\u0000\u050e\u050f\u0005\u00ca\u0000\u0000\u050f\u0593\u0001\u0000\u0000"+
		"\u0000\u0510\u0511\u0005<\u0000\u0000\u0511\u0512\u0005\u00c9\u0000\u0000"+
		"\u0512\u0593\u0005\u00ca\u0000\u0000\u0513\u0514\u0005<\u0000\u0000\u0514"+
		"\u0515\u0005\u00c9\u0000\u0000\u0515\u0516\u0003\u00c0`\u0000\u0516\u0517"+
		"\u0005\u00ca\u0000\u0000\u0517\u0593\u0001\u0000\u0000\u0000\u0518\u0519"+
		"\u0005I\u0000\u0000\u0519\u051a\u0005\u00c9\u0000\u0000\u051a\u051b\u0003"+
		"\u00c0`\u0000\u051b\u051c\u0005\u00ca\u0000\u0000\u051c\u0593\u0001\u0000"+
		"\u0000\u0000\u051d\u051e\u0005J\u0000\u0000\u051e\u051f\u0005\u00c9\u0000"+
		"\u0000\u051f\u0520\u0003\u00c0`\u0000\u0520\u0521\u0005\u00ca\u0000\u0000"+
		"\u0521\u0593\u0001\u0000\u0000\u0000\u0522\u0523\u0005K\u0000\u0000\u0523"+
		"\u0524\u0005\u00c9\u0000\u0000\u0524\u0525\u0003\u00c0`\u0000\u0525\u0526"+
		"\u0005\u00ca\u0000\u0000\u0526\u0593\u0001\u0000\u0000\u0000\u0527\u0528"+
		"\u0005L\u0000\u0000\u0528\u0529\u0005\u00c9\u0000\u0000\u0529\u052a\u0003"+
		"\u00c0`\u0000\u052a\u052b\u0005\u00ca\u0000\u0000\u052b\u0593\u0001\u0000"+
		"\u0000\u0000\u052c\u052d\u0005_\u0000\u0000\u052d\u052e\u0005\u00c9\u0000"+
		"\u0000\u052e\u052f\u0003\u00c0`\u0000\u052f\u0530\u0005\u00ca\u0000\u0000"+
		"\u0530\u0593\u0001\u0000\u0000\u0000\u0531\u0532\u0005l\u0000\u0000\u0532"+
		"\u0535\u0005\u00c9\u0000\u0000\u0533\u0536\u0003\u00c0`\u0000\u0534\u0536"+
		"\u0003\u00cae\u0000\u0535\u0533\u0001\u0000\u0000\u0000\u0535\u0534\u0001"+
		"\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u0538\u0005"+
		"\u00ca\u0000\u0000\u0538\u0593\u0001\u0000\u0000\u0000\u0539\u053a\u0005"+
		"u\u0000\u0000\u053a\u053b\u0005\u00c9\u0000\u0000\u053b\u053c\u0003\u00cc"+
		"f\u0000\u053c\u053d\u0005\u00ca\u0000\u0000\u053d\u0593\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0005v\u0000\u0000\u053f\u0540\u0005\u00c9\u0000\u0000"+
		"\u0540\u0541\u0003\u00ccf\u0000\u0541\u0542\u0005\u00ca\u0000\u0000\u0542"+
		"\u0593\u0001\u0000\u0000\u0000\u0543\u0544\u0005w\u0000\u0000\u0544\u0545"+
		"\u0005\u00c9\u0000\u0000\u0545\u0546\u0003\u00ccf\u0000\u0546\u0547\u0005"+
		"\u00ca\u0000\u0000\u0547\u0593\u0001\u0000\u0000\u0000\u0548\u0549\u0005"+
		"x\u0000\u0000\u0549\u054a\u0005\u00c9\u0000\u0000\u054a\u054b\u0003\u00cc"+
		"f\u0000\u054b\u054c\u0005\u00ca\u0000\u0000\u054c\u0593\u0001\u0000\u0000"+
		"\u0000\u054d\u054e\u0005y\u0000\u0000\u054e\u054f\u0005\u00c9\u0000\u0000"+
		"\u054f\u0550\u0003\u00ccf\u0000\u0550\u0551\u0005\u00ca\u0000\u0000\u0551"+
		"\u0593\u0001\u0000\u0000\u0000\u0552\u0553\u0005z\u0000\u0000\u0553\u0554"+
		"\u0005\u00c9\u0000\u0000\u0554\u0555\u0003\u00ccf\u0000\u0555\u0556\u0005"+
		"\u00ca\u0000\u0000\u0556\u0593\u0001\u0000\u0000\u0000\u0557\u0558\u0005"+
		"{\u0000\u0000\u0558\u0559\u0005\u00c9\u0000\u0000\u0559\u055a\u0003\u00cc"+
		"f\u0000\u055a\u055b\u0005\u00ca\u0000\u0000\u055b\u0593\u0001\u0000\u0000"+
		"\u0000\u055c\u055d\u0005|\u0000\u0000\u055d\u055e\u0005\u00c9\u0000\u0000"+
		"\u055e\u055f\u0003\u00ccf\u0000\u055f\u0560\u0005\u00ca\u0000\u0000\u0560"+
		"\u0593\u0001\u0000\u0000\u0000\u0561\u0562\u0005}\u0000\u0000\u0562\u0563"+
		"\u0005\u00c9\u0000\u0000\u0563\u0564\u0003\u00ccf\u0000\u0564\u0565\u0005"+
		"\u00ca\u0000\u0000\u0565\u0593\u0001\u0000\u0000\u0000\u0566\u0567\u0005"+
		"~\u0000\u0000\u0567\u0568\u0005\u00c9\u0000\u0000\u0568\u0569\u0003\u00cc"+
		"f\u0000\u0569\u056a\u0005\u00ca\u0000\u0000\u056a\u0593\u0001\u0000\u0000"+
		"\u0000\u056b\u056c\u0005\u007f\u0000\u0000\u056c\u056d\u0005\u00c9\u0000"+
		"\u0000\u056d\u056e\u0003\u00ccf\u0000\u056e\u056f\u0005\u00ca\u0000\u0000"+
		"\u056f\u0593\u0001\u0000\u0000\u0000\u0570\u0571\u0005\u0080\u0000\u0000"+
		"\u0571\u0572\u0005\u00c9\u0000\u0000\u0572\u0573\u0003\u00ccf\u0000\u0573"+
		"\u0574\u0005\u00ca\u0000\u0000\u0574\u0593\u0001\u0000\u0000\u0000\u0575"+
		"\u0576\u0005\u0081\u0000\u0000\u0576\u0577\u0005\u00c9\u0000\u0000\u0577"+
		"\u0578\u0003\u00ccf\u0000\u0578\u0579\u0005\u00ca\u0000\u0000\u0579\u0593"+
		"\u0001\u0000\u0000\u0000\u057a\u057b\u0005\u00b8\u0000\u0000\u057b\u057c"+
		"\u0005\u00c9\u0000\u0000\u057c\u057d\u0003\u00c8d\u0000\u057d\u057e\u0005"+
		"\u00ca\u0000\u0000\u057e\u0593\u0001\u0000\u0000\u0000\u057f\u0580\u0005"+
		"q\u0000\u0000\u0580\u0581\u0005\u00c9\u0000\u0000\u0581\u0582\u0003\u00ce"+
		"g\u0000\u0582\u0583\u0005\u00d0\u0000\u0000\u0583\u0584\u0003\u00ceg\u0000"+
		"\u0584\u0585\u0005\u00d0\u0000\u0000\u0585\u0586\u0005\u00c7\u0000\u0000"+
		"\u0586\u0587\u0005\u00ca\u0000\u0000\u0587\u0593\u0001\u0000\u0000\u0000"+
		"\u0588\u0589\u0005s\u0000\u0000\u0589\u058a\u0005\u00c9\u0000\u0000\u058a"+
		"\u058b\u0003\u00c0`\u0000\u058b\u058c\u0005\u00ca\u0000\u0000\u058c\u0593"+
		"\u0001\u0000\u0000\u0000\u058d\u058e\u0005t\u0000\u0000\u058e\u058f\u0005"+
		"\u00c9\u0000\u0000\u058f\u0590\u0003\u00c0`\u0000\u0590\u0591\u0005\u00ca"+
		"\u0000\u0000\u0591\u0593\u0001\u0000\u0000\u0000\u0592\u050b\u0001\u0000"+
		"\u0000\u0000\u0592\u0510\u0001\u0000\u0000\u0000\u0592\u0513\u0001\u0000"+
		"\u0000\u0000\u0592\u0518\u0001\u0000\u0000\u0000\u0592\u051d\u0001\u0000"+
		"\u0000\u0000\u0592\u0522\u0001\u0000\u0000\u0000\u0592\u0527\u0001\u0000"+
		"\u0000\u0000\u0592\u052c\u0001\u0000\u0000\u0000\u0592\u0531\u0001\u0000"+
		"\u0000\u0000\u0592\u0539\u0001\u0000\u0000\u0000\u0592\u053e\u0001\u0000"+
		"\u0000\u0000\u0592\u0543\u0001\u0000\u0000\u0000\u0592\u0548\u0001\u0000"+
		"\u0000\u0000\u0592\u054d\u0001\u0000\u0000\u0000\u0592\u0552\u0001\u0000"+
		"\u0000\u0000\u0592\u0557\u0001\u0000\u0000\u0000\u0592\u055c\u0001\u0000"+
		"\u0000\u0000\u0592\u0561\u0001\u0000\u0000\u0000\u0592\u0566\u0001\u0000"+
		"\u0000\u0000\u0592\u056b\u0001\u0000\u0000\u0000\u0592\u0570\u0001\u0000"+
		"\u0000\u0000\u0592\u0575\u0001\u0000\u0000\u0000\u0592\u057a\u0001\u0000"+
		"\u0000\u0000\u0592\u057f\u0001\u0000\u0000\u0000\u0592\u0588\u0001\u0000"+
		"\u0000\u0000\u0592\u058d\u0001\u0000\u0000\u0000\u0593\u00cb\u0001\u0000"+
		"\u0000\u0000\u0594\u0595\u0005\u0082\u0000\u0000\u0595\u0596\u0005\u00c9"+
		"\u0000\u0000\u0596\u0597\u0003\u00c0`\u0000\u0597\u0598\u0005\u00ca\u0000"+
		"\u0000\u0598\u059b\u0001\u0000\u0000\u0000\u0599\u059b\u0003\u00c0`\u0000"+
		"\u059a\u0594\u0001\u0000\u0000\u0000\u059a\u0599\u0001\u0000\u0000\u0000"+
		"\u059b\u00cd\u0001\u0000\u0000\u0000\u059c\u05a6\u0003\u00c0`\u0000\u059d"+
		"\u05a6\u0003\u0106\u0083\u0000\u059e\u059f\u0005r\u0000\u0000\u059f\u05a0"+
		"\u0005\u00c9\u0000\u0000\u05a0\u05a1\u0003\u00d0h\u0000\u05a1\u05a2\u0005"+
		"\u00d0\u0000\u0000\u05a2\u05a3\u0003\u00d0h\u0000\u05a3\u05a4\u0005\u00ca"+
		"\u0000\u0000\u05a4\u05a6\u0001\u0000\u0000\u0000\u05a5\u059c\u0001\u0000"+
		"\u0000\u0000\u05a5\u059d\u0001\u0000\u0000\u0000\u05a5\u059e\u0001\u0000"+
		"\u0000\u0000\u05a6\u00cf\u0001\u0000\u0000\u0000\u05a7\u05aa\u0003\u00ea"+
		"u\u0000\u05a8\u05aa\u0003\u0106\u0083\u0000\u05a9\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a9\u05a8\u0001\u0000\u0000\u0000\u05aa\u00d1\u0001\u0000\u0000"+
		"\u0000\u05ab\u05ac\u0005M\u0000\u0000\u05ac\u05ae\u0003\u00c0`\u0000\u05ad"+
		"\u05af\u0003\u00d4j\u0000\u05ae\u05ad\u0001\u0000\u0000\u0000\u05af\u05b0"+
		"\u0001\u0000\u0000\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b0\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b3\u0001\u0000\u0000\u0000\u05b2\u05b4"+
		"\u0003\u00d6k\u0000\u05b3\u05b2\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b6\u0005"+
		"N\u0000\u0000\u05b6\u00d3\u0001\u0000\u0000\u0000\u05b7\u05b8\u00053\u0000"+
		"\u0000\u05b8\u05b9\u0003\u00c0`\u0000\u05b9\u05ba\u0005O\u0000\u0000\u05ba"+
		"\u05bb\u0003\u00d8l\u0000\u05bb\u00d5\u0001\u0000\u0000\u0000\u05bc\u05bd"+
		"\u0005\n\u0000\u0000\u05bd\u05be\u0003\u00d8l\u0000\u05be\u00d7\u0001"+
		"\u0000\u0000\u0000\u05bf\u05c4\u0003\u00c0`\u0000\u05c0\u05c1\u0005\u00d0"+
		"\u0000\u0000\u05c1\u05c3\u0003\u00c0`\u0000\u05c2\u05c0\u0001\u0000\u0000"+
		"\u0000\u05c3\u05c6\u0001\u0000\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000"+
		"\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u00d9\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000\u05c7\u05c8\u0005?\u0000\u0000"+
		"\u05c8\u05c9\u0005@\u0000\u0000\u05c9\u05ca\u0003\u010c\u0086\u0000\u05ca"+
		"\u00db\u0001\u0000\u0000\u0000\u05cb\u05cc\u0005A\u0000\u0000\u05cc\u05cd"+
		"\u0003\u00deo\u0000\u05cd\u00dd\u0001\u0000\u0000\u0000\u05ce\u05d3\u0003"+
		"\u00e0p\u0000\u05cf\u05d0\u0005E\u0000\u0000\u05d0\u05d2\u0003\u00e0p"+
		"\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d2\u05d5\u0001\u0000\u0000"+
		"\u0000\u05d3\u05d1\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d4\u05e1\u0001\u0000\u0000\u0000\u05d5\u05d3\u0001\u0000\u0000"+
		"\u0000\u05d6\u05db\u0003\u00e0p\u0000\u05d7\u05d8\u0005F\u0000\u0000\u05d8"+
		"\u05da\u0003\u00e0p\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05da\u05dd"+
		"\u0001\u0000\u0000\u0000\u05db\u05d9\u0001\u0000\u0000\u0000\u05db\u05dc"+
		"\u0001\u0000\u0000\u0000\u05dc\u05e1\u0001\u0000\u0000\u0000\u05dd\u05db"+
		"\u0001\u0000\u0000\u0000\u05de\u05df\u0005G\u0000\u0000\u05df\u05e1\u0003"+
		"\u00e0p\u0000\u05e0\u05ce\u0001\u0000\u0000\u0000\u05e0\u05d6\u0001\u0000"+
		"\u0000\u0000\u05e0\u05de\u0001\u0000\u0000\u0000\u05e1\u00df\u0001\u0000"+
		"\u0000\u0000\u05e2\u05e3\u0005\u00c9\u0000\u0000\u05e3\u05e4\u0003\u00de"+
		"o\u0000\u05e4\u05e5\u0005\u00ca\u0000\u0000\u05e5\u05e8\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e8\u0003\u00e2q\u0000\u05e7\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8\u00e1\u0001\u0000\u0000\u0000"+
		"\u05e9\u05ea\u0003\u00c0`\u0000\u05ea\u05eb\u0003\u00e4r\u0000\u05eb\u05ec"+
		"\u0003\u00e6s\u0000\u05ec\u05f2\u0001\u0000\u0000\u0000\u05ed\u05ee\u0003"+
		"\u00cae\u0000\u05ee\u05ef\u0003\u00e4r\u0000\u05ef\u05f0\u0003\u00e6s"+
		"\u0000\u05f0\u05f2\u0001\u0000\u0000\u0000\u05f1\u05e9\u0001\u0000\u0000"+
		"\u0000\u05f1\u05ed\u0001\u0000\u0000\u0000\u05f2\u00e3\u0001\u0000\u0000"+
		"\u0000\u05f3\u0603\u0005\u00d2\u0000\u0000\u05f4\u0603\u0005\u00dc\u0000"+
		"\u0000\u05f5\u0603\u0005\u00d4\u0000\u0000\u05f6\u0603\u0005\u00d3\u0000"+
		"\u0000\u05f7\u05f8\u0005\u00d4\u0000\u0000\u05f8\u0603\u0005\u00d2\u0000"+
		"\u0000\u05f9\u05fa\u0005\u00d3\u0000\u0000\u05fa\u0603\u0005\u00d2\u0000"+
		"\u0000\u05fb\u0603\u0005\u00dd\u0000\u0000\u05fc\u0603\u0005P\u0000\u0000"+
		"\u05fd\u0603\u0005Q\u0000\u0000\u05fe\u05ff\u0005G\u0000\u0000\u05ff\u0603"+
		"\u0005Q\u0000\u0000\u0600\u0603\u0005R\u0000\u0000\u0601\u0603\u0005S"+
		"\u0000\u0000\u0602\u05f3\u0001\u0000\u0000\u0000\u0602\u05f4\u0001\u0000"+
		"\u0000\u0000\u0602\u05f5\u0001\u0000\u0000\u0000\u0602\u05f6\u0001\u0000"+
		"\u0000\u0000\u0602\u05f7\u0001\u0000\u0000\u0000\u0602\u05f9\u0001\u0000"+
		"\u0000\u0000\u0602\u05fb\u0001\u0000\u0000\u0000\u0602\u05fc\u0001\u0000"+
		"\u0000\u0000\u0602\u05fd\u0001\u0000\u0000\u0000\u0602\u05fe\u0001\u0000"+
		"\u0000\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0601\u0001\u0000"+
		"\u0000\u0000\u0603\u00e5\u0001\u0000\u0000\u0000\u0604\u061a\u0005\u001a"+
		"\u0000\u0000\u0605\u061a\u0005\u00c6\u0000\u0000\u0606\u061a\u0003\u00ea"+
		"u\u0000\u0607\u061a\u0005\u00c7\u0000\u0000\u0608\u061a\u0005\u00af\u0000"+
		"\u0000\u0609\u061a\u0005\u00b0\u0000\u0000\u060a\u061a\u0005\u00b1\u0000"+
		"\u0000\u060b\u061a\u0003\u0108\u0084\u0000\u060c\u0611\u0005\u00b2\u0000"+
		"\u0000\u060d\u060f\u0005\u00d1\u0000\u0000\u060e\u0610\u0005\u00c3\u0000"+
		"\u0000\u060f\u060e\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000"+
		"\u0000\u0610\u0612\u0001\u0000\u0000\u0000\u0611\u060d\u0001\u0000\u0000"+
		"\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u061a\u0001\u0000\u0000"+
		"\u0000\u0613\u0614\u0005\u00c9\u0000\u0000\u0614\u0615\u0003\u00ba]\u0000"+
		"\u0615\u0616\u0005\u00ca\u0000\u0000\u0616\u061a\u0001\u0000\u0000\u0000"+
		"\u0617\u061a\u0003\u00e8t\u0000\u0618\u061a\u0003\u0106\u0083\u0000\u0619"+
		"\u0604\u0001\u0000\u0000\u0000\u0619\u0605\u0001\u0000\u0000\u0000\u0619"+
		"\u0606\u0001\u0000\u0000\u0000\u0619\u0607\u0001\u0000\u0000\u0000\u0619"+
		"\u0608\u0001\u0000\u0000\u0000\u0619\u0609\u0001\u0000\u0000\u0000\u0619"+
		"\u060a\u0001\u0000\u0000\u0000\u0619\u060b\u0001\u0000\u0000\u0000\u0619"+
		"\u060c\u0001\u0000\u0000\u0000\u0619\u0613\u0001\u0000\u0000\u0000\u0619"+
		"\u0617\u0001\u0000\u0000\u0000\u0619\u0618\u0001\u0000\u0000\u0000\u061a"+
		"\u00e7\u0001\u0000\u0000\u0000\u061b\u061c\u0005\u00c9\u0000\u0000\u061c"+
		"\u0621\u0003\u00e6s\u0000\u061d\u061e\u0005\u00d0\u0000\u0000\u061e\u0620"+
		"\u0003\u00e6s\u0000\u061f\u061d\u0001\u0000\u0000\u0000\u0620\u0623\u0001"+
		"\u0000\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000\u0621\u0622\u0001"+
		"\u0000\u0000\u0000\u0622\u0624\u0001\u0000\u0000\u0000\u0623\u0621\u0001"+
		"\u0000\u0000\u0000\u0624\u0625\u0005\u00ca\u0000\u0000\u0625\u00e9\u0001"+
		"\u0000\u0000\u0000\u0626\u0628\u0007\u0003\u0000\u0000\u0627\u0626\u0001"+
		"\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000\u0000\u0628\u0629\u0001"+
		"\u0000\u0000\u0000\u0629\u062a\u0007\u000e\u0000\u0000\u062a\u00eb\u0001"+
		"\u0000\u0000\u0000\u062b\u062c\u00055\u0000\u0000\u062c\u062d\u0005a\u0000"+
		"\u0000\u062d\u062e\u0005b\u0000\u0000\u062e\u0638\u0003\u00eew\u0000\u062f"+
		"\u0630\u00055\u0000\u0000\u0630\u0638\u0005g\u0000\u0000\u0631\u0632\u0005"+
		"5\u0000\u0000\u0632\u0638\u0005h\u0000\u0000\u0633\u0634\u00055\u0000"+
		"\u0000\u0634\u0638\u0005i\u0000\u0000\u0635\u0636\u00055\u0000\u0000\u0636"+
		"\u0638\u0003\u00deo\u0000\u0637\u062b\u0001\u0000\u0000\u0000\u0637\u062f"+
		"\u0001\u0000\u0000\u0000\u0637\u0631\u0001\u0000\u0000\u0000\u0637\u0633"+
		"\u0001\u0000\u0000\u0000\u0637\u0635\u0001\u0000\u0000\u0000\u0638\u00ed"+
		"\u0001\u0000\u0000\u0000\u0639\u063e\u0003\u00f0x\u0000\u063a\u063b\u0005"+
		"\u00df\u0000\u0000\u063b\u063d\u0003\u00f0x\u0000\u063c\u063a\u0001\u0000"+
		"\u0000\u0000\u063d\u0640\u0001\u0000\u0000\u0000\u063e\u063c\u0001\u0000"+
		"\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063f\u00ef\u0001\u0000"+
		"\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0641\u0642\u0003\u010c"+
		"\u0086\u0000\u0642\u0643\u0003\u00f4z\u0000\u0643\u0644\u0003\u00f2y\u0000"+
		"\u0644\u00f1\u0001\u0000\u0000\u0000\u0645\u0652\u0003\u010c\u0086\u0000"+
		"\u0646\u0647\u0005\u00c9\u0000\u0000\u0647\u064c\u0003\u010c\u0086\u0000"+
		"\u0648\u0649\u0005\u00d0\u0000\u0000\u0649\u064b\u0003\u010c\u0086\u0000"+
		"\u064a\u0648\u0001\u0000\u0000\u0000\u064b\u064e\u0001\u0000\u0000\u0000"+
		"\u064c\u064a\u0001\u0000\u0000\u0000\u064c\u064d\u0001\u0000\u0000\u0000"+
		"\u064d\u064f\u0001\u0000\u0000\u0000\u064e\u064c\u0001\u0000\u0000\u0000"+
		"\u064f\u0650\u0005\u00c9\u0000\u0000\u0650\u0652\u0001\u0000\u0000\u0000"+
		"\u0651\u0645\u0001\u0000\u0000\u0000\u0651\u0646\u0001\u0000\u0000\u0000"+
		"\u0652\u00f3\u0001\u0000\u0000\u0000\u0653\u0654\u0007\u000f\u0000\u0000"+
		"\u0654\u00f5\u0001\u0000\u0000\u0000\u0655\u0656\u0005Y\u0000\u0000\u0656"+
		"\u0657\u0005C\u0000\u0000\u0657\u065a\u0003\u00bc^\u0000\u0658\u0659\u0005"+
		"]\u0000\u0000\u0659\u065b\u0003\u00deo\u0000\u065a\u0658\u0001\u0000\u0000"+
		"\u0000\u065a\u065b\u0001\u0000\u0000\u0000\u065b\u0679\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0005Y\u0000\u0000\u065d\u065e\u0005C\u0000\u0000\u065e"+
		"\u065f\u0005^\u0000\u0000\u065f\u0660\u0005\u00c9\u0000\u0000\u0660\u0665"+
		"\u0003\u00c0`\u0000\u0661\u0662\u0005\u00d0\u0000\u0000\u0662\u0664\u0003"+
		"\u00c0`\u0000\u0663\u0661\u0001\u0000\u0000\u0000\u0664\u0667\u0001\u0000"+
		"\u0000\u0000\u0665\u0663\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000"+
		"\u0000\u0000\u0666\u0668\u0001\u0000\u0000\u0000\u0667\u0665\u0001\u0000"+
		"\u0000\u0000\u0668\u0669\u0005\u00ca\u0000\u0000\u0669\u0679\u0001\u0000"+
		"\u0000\u0000\u066a\u066b\u0005Y\u0000\u0000\u066b\u066c\u0005C\u0000\u0000"+
		"\u066c\u066d\u0005k\u0000\u0000\u066d\u066e\u0005\u00c9\u0000\u0000\u066e"+
		"\u0673\u0003\u00c0`\u0000\u066f\u0670\u0005\u00d0\u0000\u0000\u0670\u0672"+
		"\u0003\u00c0`\u0000\u0671\u066f\u0001\u0000\u0000\u0000\u0672\u0675\u0001"+
		"\u0000\u0000\u0000\u0673\u0671\u0001\u0000\u0000\u0000\u0673\u0674\u0001"+
		"\u0000\u0000\u0000\u0674\u0676\u0001\u0000\u0000\u0000\u0675\u0673\u0001"+
		"\u0000\u0000\u0000\u0676\u0677\u0005\u00ca\u0000\u0000\u0677\u0679\u0001"+
		"\u0000\u0000\u0000\u0678\u0655\u0001\u0000\u0000\u0000\u0678\u065c\u0001"+
		"\u0000\u0000\u0000\u0678\u066a\u0001\u0000\u0000\u0000\u0679\u00f7\u0001"+
		"\u0000\u0000\u0000\u067a\u067b\u0005B\u0000\u0000\u067b\u067c\u0005C\u0000"+
		"\u0000\u067c\u067d\u0003\u00fa}\u0000\u067d\u00f9\u0001\u0000\u0000\u0000"+
		"\u067e\u0683\u0003\u00fc~\u0000\u067f\u0680\u0005\u00d0\u0000\u0000\u0680"+
		"\u0682\u0003\u00fc~\u0000\u0681\u067f\u0001\u0000\u0000\u0000\u0682\u0685"+
		"\u0001\u0000\u0000\u0000\u0683\u0681\u0001\u0000\u0000\u0000\u0683\u0684"+
		"\u0001\u0000\u0000\u0000\u0684\u00fb\u0001\u0000\u0000\u0000\u0685\u0683"+
		"\u0001\u0000\u0000\u0000\u0686\u0688\u0003\u00c0`\u0000\u0687\u0689\u0007"+
		"\u0010\u0000\u0000\u0688\u0687\u0001\u0000\u0000\u0000\u0688\u0689\u0001"+
		"\u0000\u0000\u0000\u0689\u068c\u0001\u0000\u0000\u0000\u068a\u068b\u0005"+
		"V\u0000\u0000\u068b\u068d\u0007\u0011\u0000\u0000\u068c\u068a\u0001\u0000"+
		"\u0000\u0000\u068c\u068d\u0001\u0000\u0000\u0000\u068d\u0697\u0001\u0000"+
		"\u0000\u0000\u068e\u0690\u0003\u00cae\u0000\u068f\u0691\u0007\u0010\u0000"+
		"\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000"+
		"\u0000\u0691\u0694\u0001\u0000\u0000\u0000\u0692\u0693\u0005V\u0000\u0000"+
		"\u0693\u0695\u0007\u0011\u0000\u0000\u0694\u0692\u0001\u0000\u0000\u0000"+
		"\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u0697\u0001\u0000\u0000\u0000"+
		"\u0696\u0686\u0001\u0000\u0000\u0000\u0696\u068e\u0001\u0000\u0000\u0000"+
		"\u0697\u00fd\u0001\u0000\u0000\u0000\u0698\u0699\u0005D\u0000\u0000\u0699"+
		"\u069d\u0005\u00c3\u0000\u0000\u069a\u069b\u0005D\u0000\u0000\u069b\u069d"+
		"\u0003\u0106\u0083\u0000\u069c\u0698\u0001\u0000\u0000\u0000\u069c\u069a"+
		"\u0001\u0000\u0000\u0000\u069d\u00ff\u0001\u0000\u0000\u0000\u069e\u069f"+
		"\u0005`\u0000\u0000\u069f\u06a3\u0005\u00c3\u0000\u0000\u06a0\u06a1\u0005"+
		"`\u0000\u0000\u06a1\u06a3\u0003\u0106\u0083\u0000\u06a2\u069e\u0001\u0000"+
		"\u0000\u0000\u06a2\u06a0\u0001\u0000\u0000\u0000\u06a3\u0101\u0001\u0000"+
		"\u0000\u0000\u06a4\u06a5\u0005Z\u0000\u0000\u06a5\u06a6\u0005[\u0000\u0000"+
		"\u06a6\u0103\u0001\u0000\u0000\u0000\u06a7\u06a8\u0005\u000f\u0000\u0000"+
		"\u06a8\u06aa\u0007\u0012\u0000\u0000\u06a9\u06a7\u0001\u0000\u0000\u0000"+
		"\u06aa\u06ad\u0001\u0000\u0000\u0000\u06ab\u06a9\u0001\u0000\u0000\u0000"+
		"\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u0105\u0001\u0000\u0000\u0000"+
		"\u06ad\u06ab\u0001\u0000\u0000\u0000\u06ae\u06af\u0005\u00d9\u0000\u0000"+
		"\u06af\u06b0\u0003\u009aM\u0000\u06b0\u0107\u0001\u0000\u0000\u0000\u06b1"+
		"\u0708\u0005\u0083\u0000\u0000\u06b2\u0708\u0005\u0084\u0000\u0000\u06b3"+
		"\u0708\u0005\u0085\u0000\u0000\u06b4\u0708\u0005\u0086\u0000\u0000\u06b5"+
		"\u0708\u0005\u0087\u0000\u0000\u06b6\u0708\u0005\u0088\u0000\u0000\u06b7"+
		"\u0708\u0005\u0089\u0000\u0000\u06b8\u0708\u0005\u008a\u0000\u0000\u06b9"+
		"\u0708\u0005\u008b\u0000\u0000\u06ba\u0708\u0005\u008c\u0000\u0000\u06bb"+
		"\u0708\u0005\u008d\u0000\u0000\u06bc\u06bd\u0005\u008e\u0000\u0000\u06bd"+
		"\u06be\u0005\u00d9\u0000\u0000\u06be\u0708\u0003\u010a\u0085\u0000\u06bf"+
		"\u06c0\u0005\u008f\u0000\u0000\u06c0\u06c1\u0005\u00d9\u0000\u0000\u06c1"+
		"\u0708\u0003\u010a\u0085\u0000\u06c2\u06c3\u0005\u0090\u0000\u0000\u06c3"+
		"\u06c4\u0005\u00d9\u0000\u0000\u06c4\u0708\u0003\u010a\u0085\u0000\u06c5"+
		"\u06c6\u0005\u0091\u0000\u0000\u06c6\u06c7\u0005\u00d9\u0000\u0000\u06c7"+
		"\u0708\u0003\u010a\u0085\u0000\u06c8\u06c9\u0005\u0092\u0000\u0000\u06c9"+
		"\u06ca\u0005\u00d9\u0000\u0000\u06ca\u0708\u0003\u010a\u0085\u0000\u06cb"+
		"\u06cc\u0005\u0093\u0000\u0000\u06cc\u06cd\u0005\u00d9\u0000\u0000\u06cd"+
		"\u0708\u0003\u010a\u0085\u0000\u06ce\u06cf\u0005\u0094\u0000\u0000\u06cf"+
		"\u06d0\u0005\u00d9\u0000\u0000\u06d0\u0708\u0003\u010a\u0085\u0000\u06d1"+
		"\u06d2\u0005\u0095\u0000\u0000\u06d2\u06d3\u0005\u00d9\u0000\u0000\u06d3"+
		"\u0708\u0003\u010a\u0085\u0000\u06d4\u06d5\u0005\u0096\u0000\u0000\u06d5"+
		"\u06d6\u0005\u00d9\u0000\u0000\u06d6\u0708\u0003\u010a\u0085\u0000\u06d7"+
		"\u0708\u0005\u0097\u0000\u0000\u06d8\u0708\u0005\u0098\u0000\u0000\u06d9"+
		"\u0708\u0005\u0099\u0000\u0000\u06da\u06db\u0005\u009a\u0000\u0000\u06db"+
		"\u06dc\u0005\u00d9\u0000\u0000\u06dc\u0708\u0003\u010a\u0085\u0000\u06dd"+
		"\u06de\u0005\u009b\u0000\u0000\u06de\u06df\u0005\u00d9\u0000\u0000\u06df"+
		"\u0708\u0003\u010a\u0085\u0000\u06e0\u06e1\u0005\u009c\u0000\u0000\u06e1"+
		"\u06e2\u0005\u00d9\u0000\u0000\u06e2\u0708\u0003\u010a\u0085\u0000\u06e3"+
		"\u0708\u0005\u009d\u0000\u0000\u06e4\u0708\u0005\u009e\u0000\u0000\u06e5"+
		"\u0708\u0005\u009f\u0000\u0000\u06e6\u06e7\u0005\u00a0\u0000\u0000\u06e7"+
		"\u06e8\u0005\u00d9\u0000\u0000\u06e8\u0708\u0003\u010a\u0085\u0000\u06e9"+
		"\u06ea\u0005\u00a1\u0000\u0000\u06ea\u06eb\u0005\u00d9\u0000\u0000\u06eb"+
		"\u0708\u0003\u010a\u0085\u0000\u06ec\u06ed\u0005\u00a2\u0000\u0000\u06ed"+
		"\u06ee\u0005\u00d9\u0000\u0000\u06ee\u0708\u0003\u010a\u0085\u0000\u06ef"+
		"\u0708\u0005\u00a3\u0000\u0000\u06f0\u0708\u0005\u00a4\u0000\u0000\u06f1"+
		"\u0708\u0005\u00a5\u0000\u0000\u06f2\u06f3\u0005\u00a6\u0000\u0000\u06f3"+
		"\u06f4\u0005\u00d9\u0000\u0000\u06f4\u0708\u0003\u010a\u0085\u0000\u06f5"+
		"\u06f6\u0005\u00a7\u0000\u0000\u06f6\u06f7\u0005\u00d9\u0000\u0000\u06f7"+
		"\u0708\u0003\u010a\u0085\u0000\u06f8\u06f9\u0005\u00a8\u0000\u0000\u06f9"+
		"\u06fa\u0005\u00d9\u0000\u0000\u06fa\u0708\u0003\u010a\u0085\u0000\u06fb"+
		"\u0708\u0005\u00a9\u0000\u0000\u06fc\u0708\u0005\u00aa\u0000\u0000\u06fd"+
		"\u0708\u0005\u00ab\u0000\u0000\u06fe\u06ff\u0005\u00ac\u0000\u0000\u06ff"+
		"\u0700\u0005\u00d9\u0000\u0000\u0700\u0708\u0003\u010a\u0085\u0000\u0701"+
		"\u0702\u0005\u00ad\u0000\u0000\u0702\u0703\u0005\u00d9\u0000\u0000\u0703"+
		"\u0708\u0003\u010a\u0085\u0000\u0704\u0705\u0005\u00ae\u0000\u0000\u0705"+
		"\u0706\u0005\u00d9\u0000\u0000\u0706\u0708\u0003\u010a\u0085\u0000\u0707"+
		"\u06b1\u0001\u0000\u0000\u0000\u0707\u06b2\u0001\u0000\u0000\u0000\u0707"+
		"\u06b3\u0001\u0000\u0000\u0000\u0707\u06b4\u0001\u0000\u0000\u0000\u0707"+
		"\u06b5\u0001\u0000\u0000\u0000\u0707\u06b6\u0001\u0000\u0000\u0000\u0707"+
		"\u06b7\u0001\u0000\u0000\u0000\u0707\u06b8\u0001\u0000\u0000\u0000\u0707"+
		"\u06b9\u0001\u0000\u0000\u0000\u0707\u06ba\u0001\u0000\u0000\u0000\u0707"+
		"\u06bb\u0001\u0000\u0000\u0000\u0707\u06bc\u0001\u0000\u0000\u0000\u0707"+
		"\u06bf\u0001\u0000\u0000\u0000\u0707\u06c2\u0001\u0000\u0000\u0000\u0707"+
		"\u06c5\u0001\u0000\u0000\u0000\u0707\u06c8\u0001\u0000\u0000\u0000\u0707"+
		"\u06cb\u0001\u0000\u0000\u0000\u0707\u06ce\u0001\u0000\u0000\u0000\u0707"+
		"\u06d1\u0001\u0000\u0000\u0000\u0707\u06d4\u0001\u0000\u0000\u0000\u0707"+
		"\u06d7\u0001\u0000\u0000\u0000\u0707\u06d8\u0001\u0000\u0000\u0000\u0707"+
		"\u06d9\u0001\u0000\u0000\u0000\u0707\u06da\u0001\u0000\u0000\u0000\u0707"+
		"\u06dd\u0001\u0000\u0000\u0000\u0707\u06e0\u0001\u0000\u0000\u0000\u0707"+
		"\u06e3\u0001\u0000\u0000\u0000\u0707\u06e4\u0001\u0000\u0000\u0000\u0707"+
		"\u06e5\u0001\u0000\u0000\u0000\u0707\u06e6\u0001\u0000\u0000\u0000\u0707"+
		"\u06e9\u0001\u0000\u0000\u0000\u0707\u06ec\u0001\u0000\u0000\u0000\u0707"+
		"\u06ef\u0001\u0000\u0000\u0000\u0707\u06f0\u0001\u0000\u0000\u0000\u0707"+
		"\u06f1\u0001\u0000\u0000\u0000\u0707\u06f2\u0001\u0000\u0000\u0000\u0707"+
		"\u06f5\u0001\u0000\u0000\u0000\u0707\u06f8\u0001\u0000\u0000\u0000\u0707"+
		"\u06fb\u0001\u0000\u0000\u0000\u0707\u06fc\u0001\u0000\u0000\u0000\u0707"+
		"\u06fd\u0001\u0000\u0000\u0000\u0707\u06fe\u0001\u0000\u0000\u0000\u0707"+
		"\u0701\u0001\u0000\u0000\u0000\u0707\u0704\u0001\u0000\u0000\u0000\u0708"+
		"\u0109\u0001\u0000\u0000\u0000\u0709\u070b\u0007\u0003\u0000\u0000\u070a"+
		"\u0709\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b"+
		"\u070c\u0001\u0000\u0000\u0000\u070c\u070d\u0005\u00c3\u0000\u0000\u070d"+
		"\u010b\u0001\u0000\u0000\u0000\u070e\u070f\u0003\u0126\u0093\u0000\u070f"+
		"\u010d\u0001\u0000\u0000\u0000\u0710\u0711\u0005\u00c1\u0000\u0000\u0711"+
		"\u0712\u0003\u0112\u0089\u0000\u0712\u0713\u0005\u00ce\u0000\u0000\u0713"+
		"\u071b\u0001\u0000\u0000\u0000\u0714\u0715\u0005\u00cd\u0000\u0000\u0715"+
		"\u0716\u0005\u00b3\u0000\u0000\u0716\u0717\u0003\u0106\u0083\u0000\u0717"+
		"\u0718\u0003\u0112\u0089\u0000\u0718\u0719\u0005\u00ce\u0000\u0000\u0719"+
		"\u071b\u0001\u0000\u0000\u0000\u071a\u0710\u0001\u0000\u0000\u0000\u071a"+
		"\u0714\u0001\u0000\u0000\u0000\u071b\u010f\u0001\u0000\u0000\u0000\u071c"+
		"\u071d\u0005\u00c2\u0000\u0000\u071d\u071e\u0003\u0112\u0089\u0000\u071e"+
		"\u071f\u0005\u00ce\u0000\u0000\u071f\u0111\u0001\u0000\u0000\u0000\u0720"+
		"\u0721\u0005Q\u0000\u0000\u0721\u0723\u0003\u0116\u008b\u0000\u0722\u0720"+
		"\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u0726"+
		"\u0001\u0000\u0000\u0000\u0724\u0725\u0005\u00bf\u0000\u0000\u0725\u0727"+
		"\u0003\u0118\u008c\u0000\u0726\u0724\u0001\u0000\u0000\u0000\u0726\u0727"+
		"\u0001\u0000\u0000\u0000\u0727\u072b\u0001\u0000\u0000\u0000\u0728\u072a"+
		"\u0003\u0114\u008a\u0000\u0729\u0728\u0001\u0000\u0000\u0000\u072a\u072d"+
		"\u0001\u0000\u0000\u0000\u072b\u0729\u0001\u0000\u0000\u0000\u072b\u072c"+
		"\u0001\u0000\u0000\u0000\u072c\u072f\u0001\u0000\u0000\u0000\u072d\u072b"+
		"\u0001\u0000\u0000\u0000\u072e\u0730\u0003\u00fe\u007f\u0000\u072f\u072e"+
		"\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000\u0000\u0000\u0730\u0733"+
		"\u0001\u0000\u0000\u0000\u0731\u0732\u0005.\u0000\u0000\u0732\u0734\u0003"+
		"\u011e\u008f\u0000\u0733\u0731\u0001\u0000\u0000\u0000\u0733\u0734\u0001"+
		"\u0000\u0000\u0000\u0734\u0113\u0001\u0000\u0000\u0000\u0735\u0736\u0005"+
		"5\u0000\u0000\u0736\u0737\u0005\u00be\u0000\u0000\u0737\u0738\u0005\u00d2"+
		"\u0000\u0000\u0738\u075e\u0005\u00c7\u0000\u0000\u0739\u073a\u00055\u0000"+
		"\u0000\u073a\u073b\u0005a\u0000\u0000\u073b\u073c\u0005b\u0000\u0000\u073c"+
		"\u075e\u0003\u00eew\u0000\u073d\u073e\u00055\u0000\u0000\u073e\u0744\u0005"+
		"\u00bc\u0000\u0000\u073f\u0740\u0005\u00c9\u0000\u0000\u0740\u0741\u0005"+
		"\u00bd\u0000\u0000\u0741\u0742\u0005\u00d2\u0000\u0000\u0742\u0743\u0005"+
		"\u00c3\u0000\u0000\u0743\u0745\u0005\u00ca\u0000\u0000\u0744\u073f\u0001"+
		"\u0000\u0000\u0000\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u075e\u0001"+
		"\u0000\u0000\u0000\u0746\u0747\u00055\u0000\u0000\u0747\u0748\u0005\u00bb"+
		"\u0000\u0000\u0748\u0749\u0005Q\u0000\u0000\u0749\u074a\u0005\u00c9\u0000"+
		"\u0000\u074a\u074b\u0003\u0122\u0091\u0000\u074b\u074c\u0005\u00ca\u0000"+
		"\u0000\u074c\u075e\u0001\u0000\u0000\u0000\u074d\u074e\u00055\u0000\u0000"+
		"\u074e\u074f\u0005\u00bb\u0000\u0000\u074f\u0750\u0005\u00d2\u0000\u0000"+
		"\u0750\u075e\u0005\u00c7\u0000\u0000\u0751\u0752\u00055\u0000\u0000\u0752"+
		"\u0753\u0005\u00ba\u0000\u0000\u0753\u0754\u0005\u00d2\u0000\u0000\u0754"+
		"\u075e\u0005\u00c7\u0000\u0000\u0755\u0756\u00055\u0000\u0000\u0756\u0757"+
		"\u0005\u00b9\u0000\u0000\u0757\u0758\u0005\u00d2\u0000\u0000\u0758\u075e"+
		"\u0005\u00c7\u0000\u0000\u0759\u075a\u00055\u0000\u0000\u075a\u075e\u0005"+
		"i\u0000\u0000\u075b\u075c\u00055\u0000\u0000\u075c\u075e\u0005h\u0000"+
		"\u0000\u075d\u0735\u0001\u0000\u0000\u0000\u075d\u0739\u0001\u0000\u0000"+
		"\u0000\u075d\u073d\u0001\u0000\u0000\u0000\u075d\u0746\u0001\u0000\u0000"+
		"\u0000\u075d\u074d\u0001\u0000\u0000\u0000\u075d\u0751\u0001\u0000\u0000"+
		"\u0000\u075d\u0755\u0001\u0000\u0000\u0000\u075d\u0759\u0001\u0000\u0000"+
		"\u0000\u075d\u075b\u0001\u0000\u0000\u0000\u075e\u0115\u0001\u0000\u0000"+
		"\u0000\u075f\u0760\u0007\u0013\u0000\u0000\u0760\u0761\u0005\u00b8\u0000"+
		"\u0000\u0761\u0117\u0001\u0000\u0000\u0000\u0762\u0767\u0003\u011a\u008d"+
		"\u0000\u0763\u0764\u0005\u00d0\u0000\u0000\u0764\u0766\u0003\u0118\u008c"+
		"\u0000\u0765\u0763\u0001\u0000\u0000\u0000\u0766\u0769\u0001\u0000\u0000"+
		"\u0000\u0767\u0765\u0001\u0000\u0000\u0000\u0767\u0768\u0001\u0000\u0000"+
		"\u0000\u0768\u0119\u0001\u0000\u0000\u0000\u0769\u0767\u0001\u0000\u0000"+
		"\u0000\u076a\u0784\u0003\u0124\u0092\u0000\u076b\u076c\u0005\u00c9\u0000"+
		"\u0000\u076c\u076f\u0003\u011c\u008e\u0000\u076d\u076e\u0005A\u0000\u0000"+
		"\u076e\u0770\u0003\u00deo\u0000\u076f\u076d\u0001\u0000\u0000\u0000\u076f"+
		"\u0770\u0001\u0000\u0000\u0000\u0770\u0775\u0001\u0000\u0000\u0000\u0771"+
		"\u0772\u0005?\u0000\u0000\u0772\u0773\u0005\u00c0\u0000\u0000\u0773\u0774"+
		"\u0005\u00d2\u0000\u0000\u0774\u0776\u0003\u0124\u0092\u0000\u0775\u0771"+
		"\u0001\u0000\u0000\u0000\u0775\u0776\u0001\u0000\u0000\u0000\u0776\u077a"+
		"\u0001\u0000\u0000\u0000\u0777\u0778\u0005B\u0000\u0000\u0778\u0779\u0005"+
		"C\u0000\u0000\u0779\u077b\u0003\u00fa}\u0000\u077a\u0777\u0001\u0000\u0000"+
		"\u0000\u077a\u077b\u0001\u0000\u0000\u0000\u077b\u077d\u0001\u0000\u0000"+
		"\u0000\u077c\u077e\u0003\u00fe\u007f\u0000\u077d\u077c\u0001\u0000\u0000"+
		"\u0000\u077d\u077e\u0001\u0000\u0000\u0000\u077e\u0780\u0001\u0000\u0000"+
		"\u0000\u077f\u0781\u0003\u0100\u0080\u0000\u0780\u077f\u0001\u0000\u0000"+
		"\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u0782\u0001\u0000\u0000"+
		"\u0000\u0782\u0783\u0005\u00ca\u0000\u0000\u0783\u0785\u0001\u0000\u0000"+
		"\u0000\u0784\u076b\u0001\u0000\u0000\u0000\u0784\u0785\u0001\u0000\u0000"+
		"\u0000\u0785\u011b\u0001\u0000\u0000\u0000\u0786\u078b\u0003\u0124\u0092"+
		"\u0000\u0787\u0788\u0005\u00d0\u0000\u0000\u0788\u078a\u0003\u011c\u008e"+
		"\u0000\u0789\u0787\u0001\u0000\u0000\u0000\u078a\u078d\u0001\u0000\u0000"+
		"\u0000\u078b\u0789\u0001\u0000\u0000\u0000\u078b\u078c\u0001\u0000\u0000"+
		"\u0000\u078c\u07a7\u0001\u0000\u0000\u0000\u078d\u078b\u0001\u0000\u0000"+
		"\u0000\u078e\u078f\u0005_\u0000\u0000\u078f\u0790\u0005\u00c9\u0000\u0000"+
		"\u0790\u0791\u0003\u0124\u0092\u0000\u0791\u0793\u0005\u00ca\u0000\u0000"+
		"\u0792\u0794\u0003\u0124\u0092\u0000\u0793\u0792\u0001\u0000\u0000\u0000"+
		"\u0793\u0794\u0001\u0000\u0000\u0000\u0794\u07a7\u0001\u0000\u0000\u0000"+
		"\u0795\u0796\u0005t\u0000\u0000\u0796\u0797\u0005\u00c9\u0000\u0000\u0797"+
		"\u0798\u0003\u0124\u0092\u0000\u0798\u079a\u0005\u00ca\u0000\u0000\u0799"+
		"\u079b\u0003\u0124\u0092\u0000\u079a\u0799\u0001\u0000\u0000\u0000\u079a"+
		"\u079b\u0001\u0000\u0000\u0000\u079b\u07a7\u0001\u0000\u0000\u0000\u079c"+
		"\u079d\u0005l\u0000\u0000\u079d\u07a0\u0005\u00c9\u0000\u0000\u079e\u07a1"+
		"\u0003\u0124\u0092\u0000\u079f\u07a1\u0003\u00cae\u0000\u07a0\u079e\u0001"+
		"\u0000\u0000\u0000\u07a0\u079f\u0001\u0000\u0000\u0000\u07a1\u07a2\u0001"+
		"\u0000\u0000\u0000\u07a2\u07a4\u0005\u00ca\u0000\u0000\u07a3\u07a5\u0003"+
		"\u0124\u0092\u0000\u07a4\u07a3\u0001\u0000\u0000\u0000\u07a4\u07a5\u0001"+
		"\u0000\u0000\u0000\u07a5\u07a7\u0001\u0000\u0000\u0000\u07a6\u0786\u0001"+
		"\u0000\u0000\u0000\u07a6\u078e\u0001\u0000\u0000\u0000\u07a6\u0795\u0001"+
		"\u0000\u0000\u0000\u07a6\u079c\u0001\u0000\u0000\u0000\u07a7\u011d\u0001"+
		"\u0000\u0000\u0000\u07a8\u07ab\u0003\u0120\u0090\u0000\u07a9\u07aa\u0005"+
		"\u00d0\u0000\u0000\u07aa\u07ac\u0003\u011e\u008f\u0000\u07ab\u07a9\u0001"+
		"\u0000\u0000\u0000\u07ab\u07ac\u0001\u0000\u0000\u0000\u07ac\u011f\u0001"+
		"\u0000\u0000\u0000\u07ad\u07ae\u0007\u0014\u0000\u0000\u07ae\u0121\u0001"+
		"\u0000\u0000\u0000\u07af\u07b2\u0005\u00c7\u0000\u0000\u07b0\u07b1\u0005"+
		"\u00d0\u0000\u0000\u07b1\u07b3\u0003\u0122\u0091\u0000\u07b2\u07b0\u0001"+
		"\u0000\u0000\u0000\u07b2\u07b3\u0001\u0000\u0000\u0000\u07b3\u0123\u0001"+
		"\u0000\u0000\u0000\u07b4\u07b9\u0003\u0126\u0093\u0000\u07b5\u07b6\u0005"+
		"\u00d1\u0000\u0000\u07b6\u07b8\u0003\u0124\u0092\u0000\u07b7\u07b5\u0001"+
		"\u0000\u0000\u0000\u07b8\u07bb\u0001\u0000\u0000\u0000\u07b9\u07b7\u0001"+
		"\u0000\u0000\u0000\u07b9\u07ba\u0001\u0000\u0000\u0000\u07ba\u0125\u0001"+
		"\u0000\u0000\u0000\u07bb\u07b9\u0001\u0000\u0000\u0000\u07bc\u07bd\u0007"+
		"\u0015\u0000\u0000\u07bd\u0127\u0001\u0000\u0000\u0000\u07be\u07bf\u0007"+
		"\u0016\u0000\u0000\u07bf\u0129\u0001\u0000\u0000\u0000\u00c4\u012c\u0138"+
		"\u0146\u014e\u0153\u015b\u0162\u0169\u016d\u0173\u0177\u017f\u0188\u018f"+
		"\u0198\u019f\u01a8\u01af\u01b5\u01b9\u01ce\u01d7\u01df\u01e3\u01e9\u01f9"+
		"\u0201\u0206\u0211\u0217\u021f\u0223\u0225\u022e\u0237\u023c\u0240\u0244"+
		"\u0248\u024a\u0252\u025b\u0261\u026c\u0276\u0279\u027d\u0282\u028c\u0294"+
		"\u0297\u029a\u02a2\u02ad\u02c7\u02ce\u02d7\u02e5\u02eb\u02f0\u02f7\u0302"+
		"\u030a\u0310\u031d\u0320\u0323\u0327\u033a\u0341\u0348\u034f\u0356\u035a"+
		"\u0360\u0369\u0374\u0379\u037e\u0383\u038a\u0397\u039b\u039f\u03a1\u03a5"+
		"\u03b7\u03cc\u03dc\u03e2\u0407\u0413\u0415\u0425\u042a\u0431\u0437\u043a"+
		"\u043f\u0449\u0450\u0458\u0466\u0468\u0470\u047f\u0486\u0493\u0496\u0499"+
		"\u049c\u049f\u04a2\u04a5\u04a8\u04ad\u04b4\u04b7\u04ba\u04bf\u04c6\u04cb"+
		"\u04cf\u04d5\u04d8\u04df\u04e4\u04e9\u04ed\u04f5\u04fa\u04fe\u0504\u0507"+
		"\u0535\u0592\u059a\u05a5\u05a9\u05b0\u05b3\u05c4\u05d3\u05db\u05e0\u05e7"+
		"\u05f1\u0602\u060f\u0611\u0619\u0621\u0627\u0637\u063e\u064c\u0651\u065a"+
		"\u0665\u0673\u0678\u0683\u0688\u068c\u0690\u0694\u0696\u069c\u06a2\u06ab"+
		"\u0707\u070a\u071a\u0722\u0726\u072b\u072f\u0733\u0744\u075d\u0767\u076f"+
		"\u0775\u077a\u077d\u0780\u0784\u078b\u0793\u079a\u07a0\u07a4\u07a6\u07ab"+
		"\u07b2\u07b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}