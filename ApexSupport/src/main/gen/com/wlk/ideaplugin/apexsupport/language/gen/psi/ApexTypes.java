//自动生成的语法分析器
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexElementType;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.impl.*;

public interface ApexTypes {

  IElementType ANNOTATION = new ApexElementType("ANNOTATION");
  IElementType ANNOTATION_CONSTANT_REST = new ApexElementType("ANNOTATION_CONSTANT_REST");
  IElementType ANNOTATION_METHOD_OR_CONSTANT_REST = new ApexElementType("ANNOTATION_METHOD_OR_CONSTANT_REST");
  IElementType ANNOTATION_METHOD_REST = new ApexElementType("ANNOTATION_METHOD_REST");
  IElementType ANNOTATION_NAME = new ApexElementType("ANNOTATION_NAME");
  IElementType ANNOTATION_TYPE_BODY = new ApexElementType("ANNOTATION_TYPE_BODY");
  IElementType ANNOTATION_TYPE_DECLARATION = new ApexElementType("ANNOTATION_TYPE_DECLARATION");
  IElementType ANNOTATION_TYPE_ELEMENT_DECLARATION = new ApexElementType("ANNOTATION_TYPE_ELEMENT_DECLARATION");
  IElementType ANNOTATION_TYPE_ELEMENT_REST = new ApexElementType("ANNOTATION_TYPE_ELEMENT_REST");
  IElementType APEX_DB_EXPRESSION = new ApexElementType("APEX_DB_EXPRESSION");
  IElementType APEX_DB_UPSERT_EXPRESSION = new ApexElementType("APEX_DB_UPSERT_EXPRESSION");
  IElementType ARGUMENTS = new ApexElementType("ARGUMENTS");
  IElementType ARRAY_INITIALIZER = new ApexElementType("ARRAY_INITIALIZER");
  IElementType BLOCK = new ApexElementType("BLOCK");
  IElementType BLOCK_STATEMENT = new ApexElementType("BLOCK_STATEMENT");
  IElementType CATCH_CLAUSE = new ApexElementType("CATCH_CLAUSE");
  IElementType CATCH_TYPE = new ApexElementType("CATCH_TYPE");
  IElementType CLASS_BODY = new ApexElementType("CLASS_BODY");
  IElementType CLASS_BODY_DECLARATION = new ApexElementType("CLASS_BODY_DECLARATION");
  IElementType CLASS_DECLARATION = new ApexElementType("CLASS_DECLARATION");
  IElementType CLASS_OR_INTERFACE_MODIFIER = new ApexElementType("CLASS_OR_INTERFACE_MODIFIER");
  IElementType CLASS_OR_INTERFACE_TYPE = new ApexElementType("CLASS_OR_INTERFACE_TYPE");
  IElementType COMPILATION_UNIT = new ApexElementType("COMPILATION_UNIT");
  IElementType CONSTANT_DECLARATOR = new ApexElementType("CONSTANT_DECLARATOR");
  IElementType CONSTRUCTOR_BODY = new ApexElementType("CONSTRUCTOR_BODY");
  IElementType CONSTRUCTOR_DECLARATION = new ApexElementType("CONSTRUCTOR_DECLARATION");
  IElementType CONST_DECLARATION = new ApexElementType("CONST_DECLARATION");
  IElementType DEFAULT_VALUE = new ApexElementType("DEFAULT_VALUE");
  IElementType ELEMENT_VALUE = new ApexElementType("ELEMENT_VALUE");
  IElementType ELEMENT_VALUE_ARRAY_INITIALIZER = new ApexElementType("ELEMENT_VALUE_ARRAY_INITIALIZER");
  IElementType ELEMENT_VALUE_PAIR = new ApexElementType("ELEMENT_VALUE_PAIR");
  IElementType ELEMENT_VALUE_PAIRS = new ApexElementType("ELEMENT_VALUE_PAIRS");
  IElementType ENHANCED_FOR_CONTROL = new ApexElementType("ENHANCED_FOR_CONTROL");
  IElementType ENUM_BODY_DECLARATIONS = new ApexElementType("ENUM_BODY_DECLARATIONS");
  IElementType ENUM_CONSTANT = new ApexElementType("ENUM_CONSTANT");
  IElementType ENUM_CONSTANTS = new ApexElementType("ENUM_CONSTANTS");
  IElementType ENUM_DECLARATION = new ApexElementType("ENUM_DECLARATION");
  IElementType EXPLICIT_GENERIC_INVOCATION = new ApexElementType("EXPLICIT_GENERIC_INVOCATION");
  IElementType EXPLICIT_GENERIC_INVOCATION_SUFFIX = new ApexElementType("EXPLICIT_GENERIC_INVOCATION_SUFFIX");
  IElementType EXPR = new ApexElementType("EXPR");
  IElementType EXPRESSION = new ApexElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new ApexElementType("EXPRESSION_LIST");
  IElementType EXPR_ARR_INDEX_EXPR = new ApexElementType("EXPR_ARR_INDEX_EXPR");
  IElementType EXPR_LIST_EXPR = new ApexElementType("EXPR_LIST_EXPR");
  IElementType FIELD_DECLARATION = new ApexElementType("FIELD_DECLARATION");
  IElementType FINALLY_BLOCK = new ApexElementType("FINALLY_BLOCK");
  IElementType FLOATING_POINT_LITERAL = new ApexElementType("FLOATING_POINT_LITERAL");
  IElementType FORMAL_PARAMETER = new ApexElementType("FORMAL_PARAMETER");
  IElementType FORMAL_PARAMETERS = new ApexElementType("FORMAL_PARAMETERS");
  IElementType FORMAL_PARAMETER_LIST = new ApexElementType("FORMAL_PARAMETER_LIST");
  IElementType FOR_CONTROL = new ApexElementType("FOR_CONTROL");
  IElementType FOR_INIT = new ApexElementType("FOR_INIT");
  IElementType FOR_STATEMENT = new ApexElementType("FOR_STATEMENT");
  IElementType FOR_UPDATE = new ApexElementType("FOR_UPDATE");
  IElementType GENERIC_CONSTRUCTOR_DECLARATION = new ApexElementType("GENERIC_CONSTRUCTOR_DECLARATION");
  IElementType GENERIC_INTERFACE_METHOD_DECLARATION = new ApexElementType("GENERIC_INTERFACE_METHOD_DECLARATION");
  IElementType GENERIC_METHOD_DECLARATION = new ApexElementType("GENERIC_METHOD_DECLARATION");
  IElementType GENE_INVOCATION_EXPR = new ApexElementType("GENE_INVOCATION_EXPR");
  IElementType IF_ELSE_EXPR = new ApexElementType("IF_ELSE_EXPR");
  IElementType IMPORT_DECLARATION = new ApexElementType("IMPORT_DECLARATION");
  IElementType INTEGER_LITERAL = new ApexElementType("INTEGER_LITERAL");
  IElementType INTERFACE_BODY = new ApexElementType("INTERFACE_BODY");
  IElementType INTERFACE_BODY_DECLARATION = new ApexElementType("INTERFACE_BODY_DECLARATION");
  IElementType INTERFACE_DECLARATION = new ApexElementType("INTERFACE_DECLARATION");
  IElementType INTERFACE_MEMBER_DECLARATION = new ApexElementType("INTERFACE_MEMBER_DECLARATION");
  IElementType INTERFACE_METHOD_DECLARATION = new ApexElementType("INTERFACE_METHOD_DECLARATION");
  IElementType LAST_FORMAL_PARAMETER = new ApexElementType("LAST_FORMAL_PARAMETER");
  IElementType LITERAL = new ApexElementType("LITERAL");
  IElementType LOCAL_VARIABLE_DECLARATION = new ApexElementType("LOCAL_VARIABLE_DECLARATION");
  IElementType LOCAL_VARIABLE_DECLARATION_STATEMENT = new ApexElementType("LOCAL_VARIABLE_DECLARATION_STATEMENT");
  IElementType MEMBER_DECLARATION = new ApexElementType("MEMBER_DECLARATION");
  IElementType METHOD_BODY = new ApexElementType("METHOD_BODY");
  IElementType METHOD_DECLARATION = new ApexElementType("METHOD_DECLARATION");
  IElementType MODIFIER = new ApexElementType("MODIFIER");
  IElementType NEW_EXPR = new ApexElementType("NEW_EXPR");
  IElementType NON_WILDCARD_TYPE_ARGUMENTS = new ApexElementType("NON_WILDCARD_TYPE_ARGUMENTS");
  IElementType PACKAGE_DECLARATION = new ApexElementType("PACKAGE_DECLARATION");
  IElementType PAREN_EXPR = new ApexElementType("PAREN_EXPR");
  IElementType PAR_EXPRESSION = new ApexElementType("PAR_EXPRESSION");
  IElementType PLUS_MINUS_EXPR = new ApexElementType("PLUS_MINUS_EXPR");
  IElementType PRIMARY = new ApexElementType("PRIMARY");
  IElementType PRIMARY_EXPR = new ApexElementType("PRIMARY_EXPR");
  IElementType PRIMITIVE_TYPE = new ApexElementType("PRIMITIVE_TYPE");
  IElementType QUALIFICATION_EXPR = new ApexElementType("QUALIFICATION_EXPR");
  IElementType QUALIFIED_NAME = new ApexElementType("QUALIFIED_NAME");
  IElementType QUALIFIED_NAME_LIST = new ApexElementType("QUALIFIED_NAME_LIST");
  IElementType RESOURCE = new ApexElementType("RESOURCE");
  IElementType RESOURCES = new ApexElementType("RESOURCES");
  IElementType RESOURCE_SPECIFICATION = new ApexElementType("RESOURCE_SPECIFICATION");
  IElementType RIGHT_ASSOC_EXPR = new ApexElementType("RIGHT_ASSOC_EXPR");
  IElementType STATEMENT = new ApexElementType("STATEMENT");
  IElementType STATEMENT_EXPRESSION = new ApexElementType("STATEMENT_EXPRESSION");
  IElementType STRING_LITERAL = new ApexElementType("STRING_LITERAL");
  IElementType SUFFIX_EXPR = new ApexElementType("SUFFIX_EXPR");
  IElementType SUPER_EXPR = new ApexElementType("SUPER_EXPR");
  IElementType SUPER_SUFFIX = new ApexElementType("SUPER_SUFFIX");
  IElementType THIS_EXPR = new ApexElementType("THIS_EXPR");
  IElementType TYPE_ = new ApexElementType("TYPE_");
  IElementType TYPE_ARGUMENT = new ApexElementType("TYPE_ARGUMENT");
  IElementType TYPE_ARGUMENTS = new ApexElementType("TYPE_ARGUMENTS");
  IElementType TYPE_BOUND = new ApexElementType("TYPE_BOUND");
  IElementType TYPE_DECLARATION = new ApexElementType("TYPE_DECLARATION");
  IElementType TYPE_LIST = new ApexElementType("TYPE_LIST");
  IElementType TYPE_PARAMETER = new ApexElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new ApexElementType("TYPE_PARAMETERS");
  IElementType VARIABLE_DECLARATOR = new ApexElementType("VARIABLE_DECLARATOR");
  IElementType VARIABLE_DECLARATORS = new ApexElementType("VARIABLE_DECLARATORS");
  IElementType VARIABLE_DECLARATOR_ID = new ApexElementType("VARIABLE_DECLARATOR_ID");
  IElementType VARIABLE_INITIALIZER = new ApexElementType("VARIABLE_INITIALIZER");
  IElementType VARIABLE_MODIFIER = new ApexElementType("VARIABLE_MODIFIER");

  IElementType ABSTRACT = new ApexTokenType("abstract");
  IElementType ADD = new ApexTokenType("+");
  IElementType ADD_ASSIGN = new ApexTokenType("+=");
  IElementType AND = new ApexTokenType("&&");
  IElementType AND_ASSIGN = new ApexTokenType("&=");
  IElementType APEXDOC_COMMENT = new ApexTokenType("APEXDOC_COMMENT");
  IElementType APEXDOC_COMMENT_START = new ApexTokenType("^/**");
  IElementType APEX_WITHOUT_SHARING = new ApexTokenType("without sharing");
  IElementType APEX_WITH_SHARING = new ApexTokenType("with sharing");
  IElementType ARRAY_DEFINE = new ApexTokenType("ARRAY_DEFINE");
  IElementType ASSIGN = new ApexTokenType("=");
  IElementType BANG = new ApexTokenType("!");
  IElementType BITAND = new ApexTokenType("&");
  IElementType BITOR = new ApexTokenType("|");
  IElementType BREAK = new ApexTokenType("break");
  IElementType CARET = new ApexTokenType("^");
  IElementType CLASS = new ApexTokenType("class");
  IElementType COLON = new ApexTokenType(":");
  IElementType COMMA = new ApexTokenType(",");
  IElementType COMMENT = new ApexTokenType("COMMENT");
  IElementType CONTINUE = new ApexTokenType("continue");
  IElementType DB_DELETE = new ApexTokenType("delete");
  IElementType DB_INSERT = new ApexTokenType("insert");
  IElementType DB_UNDELETE = new ApexTokenType("undelete");
  IElementType DB_UPDATE = new ApexTokenType("update");
  IElementType DB_UPSERT = new ApexTokenType("upsert");
  IElementType DEC = new ApexTokenType("--");
  IElementType DECINTEGERLITERAL = new ApexTokenType("DecIntegerLiteral");
  IElementType DECLONGLITERAL = new ApexTokenType("DecLongLiteral");
  IElementType DIV = new ApexTokenType("/");
  IElementType DIV_ASSIGN = new ApexTokenType("/=");
  IElementType DO = new ApexTokenType("do");
  IElementType DOT = new ApexTokenType(".");
  IElementType DOUBLELITERAL = new ApexTokenType("DoubleLiteral");
  IElementType ELSE = new ApexTokenType("else");
  IElementType EQUAL = new ApexTokenType("==");
  IElementType FINAL = new ApexTokenType("final");
  IElementType FLOATLITERAL = new ApexTokenType("FloatLiteral");
  IElementType FOR = new ApexTokenType("for");
  IElementType GE = new ApexTokenType(">=");
  IElementType GLOBAL = new ApexTokenType("global");
  IElementType GT = new ApexTokenType(">");
  IElementType HEXINTEGERLITERAL = new ApexTokenType("HexIntegerLiteral");
  IElementType HEXLONGLITERAL = new ApexTokenType("HexLongLiteral");
  IElementType IDENTIFIER = new ApexTokenType("identifier");
  IElementType IF = new ApexTokenType("if");
  IElementType INC = new ApexTokenType("++");
  IElementType KEYWORDIDENTIFIER = new ApexTokenType("keywordidentifier");
  IElementType LAMBDA_LIKE = new ApexTokenType("=>");
  IElementType LBRACE = new ApexTokenType("{");
  IElementType LBRACK = new ApexTokenType("[");
  IElementType LE = new ApexTokenType("<=");
  IElementType LINE_COMMENT = new ApexTokenType("LINE_COMMENT");
  IElementType LPAREN = new ApexTokenType("(");
  IElementType LSHIFT_ASSIGN = new ApexTokenType("<<=");
  IElementType LT = new ApexTokenType("<");
  IElementType MOD = new ApexTokenType("%");
  IElementType MOD_ASSIGN = new ApexTokenType("%=");
  IElementType MUL = new ApexTokenType("*");
  IElementType MUL_ASSIGN = new ApexTokenType("*=");
  IElementType NEW = new ApexTokenType("new");
  IElementType NOTEQUAL = new ApexTokenType("!=");
  IElementType NUMBER = new ApexTokenType("number");
  IElementType OCTINTEGERLITERAL = new ApexTokenType("OctIntegerLiteral");
  IElementType OCTLONGLITERAL = new ApexTokenType("OctLongLiteral");
  IElementType OR = new ApexTokenType("||");
  IElementType OR_ASSIGN = new ApexTokenType("|=");
  IElementType OVERRIDE = new ApexTokenType("override");
  IElementType PRIVATE = new ApexTokenType("private");
  IElementType PROTECTED = new ApexTokenType("protected");
  IElementType PUBLIC = new ApexTokenType("public");
  IElementType QUESTION = new ApexTokenType("?");
  IElementType RBRACE = new ApexTokenType("}");
  IElementType RBRACK = new ApexTokenType("]");
  IElementType RETURN = new ApexTokenType("return");
  IElementType RPAREN = new ApexTokenType(")");
  IElementType RSHIFT_ASSIGN = new ApexTokenType(">>=");
  IElementType RUNAS = new ApexTokenType("runas");
  IElementType SEMI = new ApexTokenType(";");
  IElementType STATIC = new ApexTokenType("static");
  IElementType STRING = new ApexTokenType("string");
  IElementType SUB = new ApexTokenType("-");
  IElementType SUB_ASSIGN = new ApexTokenType("-=");
  IElementType SUPER = new ApexTokenType("super");
  IElementType TESTMETHOD = new ApexTokenType("testmethod");
  IElementType THIS = new ApexTokenType("this");
  IElementType THROW = new ApexTokenType("throw");
  IElementType TILDE = new ApexTokenType("~");
  IElementType TRY = new ApexTokenType("try");
  IElementType URSHIFT_ASSIGN = new ApexTokenType(">>>=");
  IElementType VIRTUAL = new ApexTokenType("virtual");
  IElementType WEBSERVICE = new ApexTokenType("webservice");
  IElementType WHILE = new ApexTokenType("while");
  IElementType WS = new ApexTokenType("WS");
  IElementType XOR_ASSIGN = new ApexTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new ApexAnnotationImpl(node);
      }
      else if (type == ANNOTATION_CONSTANT_REST) {
        return new ApexAnnotationConstantRestImpl(node);
      }
      else if (type == ANNOTATION_METHOD_OR_CONSTANT_REST) {
        return new ApexAnnotationMethodOrConstantRestImpl(node);
      }
      else if (type == ANNOTATION_METHOD_REST) {
        return new ApexAnnotationMethodRestImpl(node);
      }
      else if (type == ANNOTATION_NAME) {
        return new ApexAnnotationNameImpl(node);
      }
      else if (type == ANNOTATION_TYPE_BODY) {
        return new ApexAnnotationTypeBodyImpl(node);
      }
      else if (type == ANNOTATION_TYPE_DECLARATION) {
        return new ApexAnnotationTypeDeclarationImpl(node);
      }
      else if (type == ANNOTATION_TYPE_ELEMENT_DECLARATION) {
        return new ApexAnnotationTypeElementDeclarationImpl(node);
      }
      else if (type == ANNOTATION_TYPE_ELEMENT_REST) {
        return new ApexAnnotationTypeElementRestImpl(node);
      }
      else if (type == APEX_DB_EXPRESSION) {
        return new ApexApexDbExpressionImpl(node);
      }
      else if (type == APEX_DB_UPSERT_EXPRESSION) {
        return new ApexApexDbUpsertExpressionImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new ApexArgumentsImpl(node);
      }
      else if (type == ARRAY_INITIALIZER) {
        return new ApexArrayInitializerImpl(node);
      }
      else if (type == BLOCK) {
        return new ApexBlockImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new ApexBlockStatementImpl(node);
      }
      else if (type == CATCH_CLAUSE) {
        return new ApexCatchClauseImpl(node);
      }
      else if (type == CATCH_TYPE) {
        return new ApexCatchTypeImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new ApexClassBodyImpl(node);
      }
      else if (type == CLASS_BODY_DECLARATION) {
        return new ApexClassBodyDeclarationImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ApexClassDeclarationImpl(node);
      }
      else if (type == CLASS_OR_INTERFACE_MODIFIER) {
        return new ApexClassOrInterfaceModifierImpl(node);
      }
      else if (type == CLASS_OR_INTERFACE_TYPE) {
        return new ApexClassOrInterfaceTypeImpl(node);
      }
      else if (type == COMPILATION_UNIT) {
        return new ApexCompilationUnitImpl(node);
      }
      else if (type == CONSTANT_DECLARATOR) {
        return new ApexConstantDeclaratorImpl(node);
      }
      else if (type == CONSTRUCTOR_BODY) {
        return new ApexConstructorBodyImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION) {
        return new ApexConstructorDeclarationImpl(node);
      }
      else if (type == CONST_DECLARATION) {
        return new ApexConstDeclarationImpl(node);
      }
      else if (type == DEFAULT_VALUE) {
        return new ApexDefaultValueImpl(node);
      }
      else if (type == ELEMENT_VALUE) {
        return new ApexElementValueImpl(node);
      }
      else if (type == ELEMENT_VALUE_ARRAY_INITIALIZER) {
        return new ApexElementValueArrayInitializerImpl(node);
      }
      else if (type == ELEMENT_VALUE_PAIR) {
        return new ApexElementValuePairImpl(node);
      }
      else if (type == ELEMENT_VALUE_PAIRS) {
        return new ApexElementValuePairsImpl(node);
      }
      else if (type == ENHANCED_FOR_CONTROL) {
        return new ApexEnhancedForControlImpl(node);
      }
      else if (type == ENUM_BODY_DECLARATIONS) {
        return new ApexEnumBodyDeclarationsImpl(node);
      }
      else if (type == ENUM_CONSTANT) {
        return new ApexEnumConstantImpl(node);
      }
      else if (type == ENUM_CONSTANTS) {
        return new ApexEnumConstantsImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new ApexEnumDeclarationImpl(node);
      }
      else if (type == EXPLICIT_GENERIC_INVOCATION) {
        return new ApexExplicitGenericInvocationImpl(node);
      }
      else if (type == EXPLICIT_GENERIC_INVOCATION_SUFFIX) {
        return new ApexExplicitGenericInvocationSuffixImpl(node);
      }
      else if (type == EXPR) {
        return new ApexExprImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ApexExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new ApexExpressionListImpl(node);
      }
      else if (type == EXPR_ARR_INDEX_EXPR) {
        return new ApexExprArrIndexExprImpl(node);
      }
      else if (type == EXPR_LIST_EXPR) {
        return new ApexExprListExprImpl(node);
      }
      else if (type == FIELD_DECLARATION) {
        return new ApexFieldDeclarationImpl(node);
      }
      else if (type == FINALLY_BLOCK) {
        return new ApexFinallyBlockImpl(node);
      }
      else if (type == FLOATING_POINT_LITERAL) {
        return new ApexFloatingPointLiteralImpl(node);
      }
      else if (type == FORMAL_PARAMETER) {
        return new ApexFormalParameterImpl(node);
      }
      else if (type == FORMAL_PARAMETERS) {
        return new ApexFormalParametersImpl(node);
      }
      else if (type == FORMAL_PARAMETER_LIST) {
        return new ApexFormalParameterListImpl(node);
      }
      else if (type == FOR_CONTROL) {
        return new ApexForControlImpl(node);
      }
      else if (type == FOR_INIT) {
        return new ApexForInitImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new ApexForStatementImpl(node);
      }
      else if (type == FOR_UPDATE) {
        return new ApexForUpdateImpl(node);
      }
      else if (type == GENERIC_CONSTRUCTOR_DECLARATION) {
        return new ApexGenericConstructorDeclarationImpl(node);
      }
      else if (type == GENERIC_INTERFACE_METHOD_DECLARATION) {
        return new ApexGenericInterfaceMethodDeclarationImpl(node);
      }
      else if (type == GENERIC_METHOD_DECLARATION) {
        return new ApexGenericMethodDeclarationImpl(node);
      }
      else if (type == GENE_INVOCATION_EXPR) {
        return new ApexGeneInvocationExprImpl(node);
      }
      else if (type == IF_ELSE_EXPR) {
        return new ApexIfElseExprImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new ApexImportDeclarationImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new ApexIntegerLiteralImpl(node);
      }
      else if (type == INTERFACE_BODY) {
        return new ApexInterfaceBodyImpl(node);
      }
      else if (type == INTERFACE_BODY_DECLARATION) {
        return new ApexInterfaceBodyDeclarationImpl(node);
      }
      else if (type == INTERFACE_DECLARATION) {
        return new ApexInterfaceDeclarationImpl(node);
      }
      else if (type == INTERFACE_MEMBER_DECLARATION) {
        return new ApexInterfaceMemberDeclarationImpl(node);
      }
      else if (type == INTERFACE_METHOD_DECLARATION) {
        return new ApexInterfaceMethodDeclarationImpl(node);
      }
      else if (type == LAST_FORMAL_PARAMETER) {
        return new ApexLastFormalParameterImpl(node);
      }
      else if (type == LITERAL) {
        return new ApexLiteralImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATION) {
        return new ApexLocalVariableDeclarationImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATION_STATEMENT) {
        return new ApexLocalVariableDeclarationStatementImpl(node);
      }
      else if (type == MEMBER_DECLARATION) {
        return new ApexMemberDeclarationImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new ApexMethodBodyImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new ApexMethodDeclarationImpl(node);
      }
      else if (type == MODIFIER) {
        return new ApexModifierImpl(node);
      }
      else if (type == NEW_EXPR) {
        return new ApexNewExprImpl(node);
      }
      else if (type == NON_WILDCARD_TYPE_ARGUMENTS) {
        return new ApexNonWildcardTypeArgumentsImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new ApexPackageDeclarationImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new ApexParenExprImpl(node);
      }
      else if (type == PAR_EXPRESSION) {
        return new ApexParExpressionImpl(node);
      }
      else if (type == PLUS_MINUS_EXPR) {
        return new ApexPlusMinusExprImpl(node);
      }
      else if (type == PRIMARY) {
        return new ApexPrimaryImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new ApexPrimaryExprImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new ApexPrimitiveTypeImpl(node);
      }
      else if (type == QUALIFICATION_EXPR) {
        return new ApexQualificationExprImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new ApexQualifiedNameImpl(node);
      }
      else if (type == QUALIFIED_NAME_LIST) {
        return new ApexQualifiedNameListImpl(node);
      }
      else if (type == RESOURCE) {
        return new ApexResourceImpl(node);
      }
      else if (type == RESOURCES) {
        return new ApexResourcesImpl(node);
      }
      else if (type == RESOURCE_SPECIFICATION) {
        return new ApexResourceSpecificationImpl(node);
      }
      else if (type == RIGHT_ASSOC_EXPR) {
        return new ApexRightAssocExprImpl(node);
      }
      else if (type == STATEMENT) {
        return new ApexStatementImpl(node);
      }
      else if (type == STATEMENT_EXPRESSION) {
        return new ApexStatementExpressionImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new ApexStringLiteralImpl(node);
      }
      else if (type == SUFFIX_EXPR) {
        return new ApexSuffixExprImpl(node);
      }
      else if (type == SUPER_EXPR) {
        return new ApexSuperExprImpl(node);
      }
      else if (type == SUPER_SUFFIX) {
        return new ApexSuperSuffixImpl(node);
      }
      else if (type == THIS_EXPR) {
        return new ApexThisExprImpl(node);
      }
      else if (type == TYPE_) {
        return new ApexType_Impl(node);
      }
      else if (type == TYPE_ARGUMENT) {
        return new ApexTypeArgumentImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new ApexTypeArgumentsImpl(node);
      }
      else if (type == TYPE_BOUND) {
        return new ApexTypeBoundImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new ApexTypeDeclarationImpl(node);
      }
      else if (type == TYPE_LIST) {
        return new ApexTypeListImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new ApexTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new ApexTypeParametersImpl(node);
      }
      else if (type == VARIABLE_DECLARATOR) {
        return new ApexVariableDeclaratorImpl(node);
      }
      else if (type == VARIABLE_DECLARATORS) {
        return new ApexVariableDeclaratorsImpl(node);
      }
      else if (type == VARIABLE_DECLARATOR_ID) {
        return new ApexVariableDeclaratorIdImpl(node);
      }
      else if (type == VARIABLE_INITIALIZER) {
        return new ApexVariableInitializerImpl(node);
      }
      else if (type == VARIABLE_MODIFIER) {
        return new ApexVariableModifierImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
