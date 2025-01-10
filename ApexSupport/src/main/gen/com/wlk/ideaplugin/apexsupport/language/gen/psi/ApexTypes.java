// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexElementType;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.impl.*;

public interface ApexTypes {

  IElementType CLASS_BODY = new ApexElementType("CLASS_BODY");
  IElementType CLASS_DECLARATION = new ApexElementType("CLASS_DECLARATION");
  IElementType CLASS_NAME = new ApexElementType("CLASS_NAME");
  IElementType CLASS_OR_INTERFACE_MODIFIER = new ApexElementType("CLASS_OR_INTERFACE_MODIFIER");
  IElementType CLASS_OR_INTERFACE_TYPE = new ApexElementType("CLASS_OR_INTERFACE_TYPE");
  IElementType COMPILATION_UNIT = new ApexElementType("COMPILATION_UNIT");
  IElementType IMPORT_DECLARATION = new ApexElementType("IMPORT_DECLARATION");
  IElementType PRIMITIVE_TYPE = new ApexElementType("PRIMITIVE_TYPE");
  IElementType QUALIFIED_NAME = new ApexElementType("QUALIFIED_NAME");
  IElementType TYPE_ = new ApexElementType("TYPE_");
  IElementType TYPE_ARGUMENT = new ApexElementType("TYPE_ARGUMENT");
  IElementType TYPE_ARGUMENTS = new ApexElementType("TYPE_ARGUMENTS");
  IElementType TYPE_BOUND = new ApexElementType("TYPE_BOUND");
  IElementType TYPE_DECLARATION = new ApexElementType("TYPE_DECLARATION");
  IElementType TYPE_LIST = new ApexElementType("TYPE_LIST");
  IElementType TYPE_PARAMETER = new ApexElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new ApexElementType("TYPE_PARAMETERS");

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
      if (type == CLASS_BODY) {
        return new ApexClassBodyImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ApexClassDeclarationImpl(node);
      }
      else if (type == CLASS_NAME) {
        return new ApexClassNameImpl(node);
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
      else if (type == IMPORT_DECLARATION) {
        return new ApexImportDeclarationImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new ApexPrimitiveTypeImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new ApexQualifiedNameImpl(node);
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
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
