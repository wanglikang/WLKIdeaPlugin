// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;
import static com.wlk.ideaplugin.apexsupport.language.parser.ApexParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ApexParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return apexFile(b, l + 1);
  }

  /* ********************************************************** */
  // compilationUnit
  static boolean apexFile(PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // '{' '}'
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, RBRACE);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // "CLASS" className typeParameters? ("EXTENDS" type_)? ("IMPLEMENTS" typeList)? classBody
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, CLASS_DECLARATION, "<class declaration>");
    r = consumeToken(b, "CLASS");
    r = r && className(b, l + 1);
    r = r && classDeclaration_2(b, l + 1);
    r = r && classDeclaration_3(b, l + 1);
    r = r && classDeclaration_4(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeParameters?
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  // ("EXTENDS" type_)?
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    classDeclaration_3_0(b, l + 1);
    return true;
  }

  // "EXTENDS" type_
  private static boolean classDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENDS");
    r = r && type_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("IMPLEMENTS" typeList)?
  private static boolean classDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4")) return false;
    classDeclaration_4_0(b, l + 1);
    return true;
  }

  // "IMPLEMENTS" typeList
  private static boolean classDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "IMPLEMENTS");
    r = r && typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean className(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "className")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "with sharing"    // class only
  //     | "without sharing" //class only
  // //	| annotation           // class or interface
  //     | "PUBLIC"               // class or interface
  //     | "PROTECTED"            // class or interface
  //     | "PRIVATE"              // class or interface
  //     | "STATIC"               // class or interface
  //     | "ABSTRACT"             // class or interface
  //     | "FINAL"                // class only -- does not apply to interfaces
  //     | "GLOBAL"               // class or interface
  //     | "WEBSERVICE"           // class only -- does not apply to interfaces
  //     | "OVERRIDE"             // method only
  //     | "VIRTUAL"              // method only
  //     | "TESTMETHOD"
  public static boolean classOrInterfaceModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_OR_INTERFACE_MODIFIER, "<class or interface modifier>");
    r = consumeToken(b, APEX_WITH_SHARING);
    if (!r) r = consumeToken(b, APEX_WITHOUT_SHARING);
    if (!r) r = consumeToken(b, "PUBLIC");
    if (!r) r = consumeToken(b, "PROTECTED");
    if (!r) r = consumeToken(b, "PRIVATE");
    if (!r) r = consumeToken(b, "STATIC");
    if (!r) r = consumeToken(b, "ABSTRACT");
    if (!r) r = consumeToken(b, "FINAL");
    if (!r) r = consumeToken(b, "GLOBAL");
    if (!r) r = consumeToken(b, "WEBSERVICE");
    if (!r) r = consumeToken(b, "OVERRIDE");
    if (!r) r = consumeToken(b, "VIRTUAL");
    if (!r) r = consumeToken(b, "TESTMETHOD");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier typeArguments? ('.' identifier typeArguments?)
  //     | "SET" typeArguments // 'set <' has to be defined explisitly, otherwise it clashes with SET of property setter
  //     | "MAP" typeArguments
  public static boolean classOrInterfaceType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_OR_INTERFACE_TYPE, "<class or interface type>");
    r = classOrInterfaceType_0(b, l + 1);
    if (!r) r = classOrInterfaceType_1(b, l + 1);
    if (!r) r = classOrInterfaceType_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier typeArguments? ('.' identifier typeArguments?)
  private static boolean classOrInterfaceType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && classOrInterfaceType_0_1(b, l + 1);
    r = r && classOrInterfaceType_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean classOrInterfaceType_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_0_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // '.' identifier typeArguments?
  private static boolean classOrInterfaceType_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    r = r && classOrInterfaceType_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean classOrInterfaceType_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_0_2_2")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // "SET" typeArguments
  private static boolean classOrInterfaceType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SET");
    r = r && typeArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "MAP" typeArguments
  private static boolean classOrInterfaceType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAP");
    r = r && typeArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // importDeclaration* typeDeclaration*
  public static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPILATION_UNIT, "<compilation unit>");
    r = compilationUnit_0(b, l + 1);
    r = r && compilationUnit_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // importDeclaration*
  private static boolean compilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_0", c)) break;
    }
    return true;
  }

  // typeDeclaration*
  private static boolean compilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "IMPORT" "STATIC"? qualifiedName ('.' '*')? ';'
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, "<import declaration>");
    r = consumeToken(b, "IMPORT");
    r = r && importDeclaration_1(b, l + 1);
    r = r && qualifiedName(b, l + 1);
    r = r && importDeclaration_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "STATIC"?
  private static boolean importDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_1")) return false;
    consumeToken(b, "STATIC");
    return true;
  }

  // ('.' '*')?
  private static boolean importDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_3")) return false;
    importDeclaration_3_0(b, l + 1);
    return true;
  }

  // '.' '*'
  private static boolean importDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "CHAR"
  //     | "BYTE"
  //     | "SHORT"
  //     | "INT"
  //     | "FLOAT"
  public static boolean primitiveType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitiveType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, "CHAR");
    if (!r) r = consumeToken(b, "BYTE");
    if (!r) r = consumeToken(b, "SHORT");
    if (!r) r = consumeToken(b, "INT");
    if (!r) r = consumeToken(b, "FLOAT");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ('.' identifier)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, QUALIFIED_NAME, null);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' identifier)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // '.' identifier
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_
  //     | '?' (("EXTENDS" | "SUPER") type_)?
  public static boolean typeArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ARGUMENT, "<type argument>");
    r = type_(b, l + 1);
    if (!r) r = typeArgument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '?' (("EXTENDS" | "SUPER") type_)?
  private static boolean typeArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION);
    r = r && typeArgument_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (("EXTENDS" | "SUPER") type_)?
  private static boolean typeArgument_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_1_1")) return false;
    typeArgument_1_1_0(b, l + 1);
    return true;
  }

  // ("EXTENDS" | "SUPER") type_
  private static boolean typeArgument_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeArgument_1_1_0_0(b, l + 1);
    r = r && type_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "EXTENDS" | "SUPER"
  private static boolean typeArgument_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArgument_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "EXTENDS");
    if (!r) r = consumeToken(b, "SUPER");
    return r;
  }

  /* ********************************************************** */
  // '<' typeArgument (',' typeArgument)* '>'
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeArgument(b, l + 1);
    r = r && typeArguments_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  // (',' typeArgument)*
  private static boolean typeArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeArguments_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeArguments_2", c)) break;
    }
    return true;
  }

  // ',' typeArgument
  private static boolean typeArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_ ('&' type_)*
  public static boolean typeBound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_BOUND, "<type bound>");
    r = type_(b, l + 1);
    r = r && typeBound_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('&' type_)*
  private static boolean typeBound_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBound_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeBound_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeBound_1", c)) break;
    }
    return true;
  }

  // '&' type_
  private static boolean typeBound_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBound_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITAND);
    r = r && type_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classOrInterfaceModifier* classDeclaration
  //     | ';'
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = typeDeclaration_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classOrInterfaceModifier* classDeclaration
  private static boolean typeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDeclaration_0_0(b, l + 1);
    r = r && classDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // classOrInterfaceModifier*
  private static boolean typeDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classOrInterfaceModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type_ (',' type_)*
  public static boolean typeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = type_(b, l + 1);
    r = r && typeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' type_)*
  private static boolean typeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeList_1", c)) break;
    }
    return true;
  }

  // ',' type_
  private static boolean typeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ("EXTENDS" typeBound)?
  public static boolean typeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && typeParameter_1(b, l + 1);
    exit_section_(b, m, TYPE_PARAMETER, r);
    return r;
  }

  // ("EXTENDS" typeBound)?
  private static boolean typeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_1")) return false;
    typeParameter_1_0(b, l + 1);
    return true;
  }

  // "EXTENDS" typeBound
  private static boolean typeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENDS");
    r = r && typeBound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' typeParameter (',' typeParameter)* '>'
  public static boolean typeParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeParameter(b, l + 1);
    r = r && typeParameters_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // (',' typeParameter)*
  private static boolean typeParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeParameters_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_2", c)) break;
    }
    return true;
  }

  // ',' typeParameter
  private static boolean typeParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classOrInterfaceType ARRAY_DEFINE
  //     | primitiveType ARRAY_DEFINE
  public static boolean type_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_, "<type>");
    r = type__0(b, l + 1);
    if (!r) r = type__1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classOrInterfaceType ARRAY_DEFINE
  private static boolean type__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classOrInterfaceType(b, l + 1);
    r = r && consumeToken(b, ARRAY_DEFINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // primitiveType ARRAY_DEFINE
  private static boolean type__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primitiveType(b, l + 1);
    r = r && consumeToken(b, ARRAY_DEFINE);
    exit_section_(b, m, null, r);
    return r;
  }

}
