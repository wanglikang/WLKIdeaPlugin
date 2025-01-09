//自动生成的语法分析器
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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(EXPR, EXPR_ARR_INDEX_EXPR, EXPR_LIST_EXPR, GENE_INVOCATION_EXPR,
      IF_ELSE_EXPR, NEW_EXPR, PAREN_EXPR, PLUS_MINUS_EXPR,
      PRIMARY_EXPR, QUALIFICATION_EXPR, RIGHT_ASSOC_EXPR, SUFFIX_EXPR,
      SUPER_EXPR, THIS_EXPR),
  };

  /* ********************************************************** */
  // FloatLiteral
  //     |   DoubleLiteral
  public static boolean FloatingPointLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatingPointLiteral")) return false;
    if (!nextTokenIs(b, "<floating point literal>", DOUBLELITERAL, FLOATLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOATING_POINT_LITERAL, "<floating point literal>");
    r = consumeToken(b, FLOATLITERAL);
    if (!r) r = consumeToken(b, DOUBLELITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DecIntegerLiteral
  //     |   DecLongLiteral
  //     |   HexIntegerLiteral
  //     |   HexLongLiteral
  //     |   OctIntegerLiteral
  //     |   OctLongLiteral
  public static boolean IntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = consumeToken(b, DECINTEGERLITERAL);
    if (!r) r = consumeToken(b, DECLONGLITERAL);
    if (!r) r = consumeToken(b, HEXINTEGERLITERAL);
    if (!r) r = consumeToken(b, HEXLONGLITERAL);
    if (!r) r = consumeToken(b, OCTINTEGERLITERAL);
    if (!r) r = consumeToken(b, OCTLONGLITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // '@' annotationName ('(' ( elementValuePairs | elementValue)? ')')?
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION, "<annotation>");
    r = consumeToken(b, "@");
    r = r && annotationName(b, l + 1);
    p = r; // pin = 2
    r = r && annotation_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('(' ( elementValuePairs | elementValue)? ')')?
  private static boolean annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2")) return false;
    annotation_2_0(b, l + 1);
    return true;
  }

  // '(' ( elementValuePairs | elementValue)? ')'
  private static boolean annotation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && annotation_2_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( elementValuePairs | elementValue)?
  private static boolean annotation_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2_0_1")) return false;
    annotation_2_0_1_0(b, l + 1);
    return true;
  }

  // elementValuePairs | elementValue
  private static boolean annotation_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2_0_1_0")) return false;
    boolean r;
    r = elementValuePairs(b, l + 1);
    if (!r) r = elementValue(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // variableDeclarators
  public static boolean annotationConstantRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationConstantRest")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclarators(b, l + 1);
    exit_section_(b, m, ANNOTATION_CONSTANT_REST, r);
    return r;
  }

  /* ********************************************************** */
  // annotationMethodRest
  //     | annotationConstantRest
  public static boolean annotationMethodOrConstantRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationMethodOrConstantRest")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotationMethodRest(b, l + 1);
    if (!r) r = annotationConstantRest(b, l + 1);
    exit_section_(b, m, ANNOTATION_METHOD_OR_CONSTANT_REST, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '(' ')' defaultValue?
  public static boolean annotationMethodRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationMethodRest")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LPAREN, RPAREN);
    r = r && annotationMethodRest_3(b, l + 1);
    exit_section_(b, m, ANNOTATION_METHOD_REST, r);
    return r;
  }

  // defaultValue?
  private static boolean annotationMethodRest_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationMethodRest_3")) return false;
    defaultValue(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean annotationName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, ANNOTATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '{' annotationTypeElementDeclaration* '}'
  public static boolean annotationTypeBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && annotationTypeBody_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ANNOTATION_TYPE_BODY, r);
    return r;
  }

  // annotationTypeElementDeclaration*
  private static boolean annotationTypeBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotationTypeElementDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotationTypeBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '@' "INTERFACE" identifier annotationTypeBody
  public static boolean annotationTypeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_TYPE_DECLARATION, "<annotation type declaration>");
    r = consumeToken(b, "@");
    r = r && consumeToken(b, "INTERFACE");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && annotationTypeBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifier* annotationTypeElementRest
  //     | ';'
  public static boolean annotationTypeElementDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_TYPE_ELEMENT_DECLARATION, "<annotation type element declaration>");
    r = annotationTypeElementDeclaration_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier* annotationTypeElementRest
  private static boolean annotationTypeElementDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotationTypeElementDeclaration_0_0(b, l + 1);
    r = r && annotationTypeElementRest(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifier*
  private static boolean annotationTypeElementDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementDeclaration_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotationTypeElementDeclaration_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type_ annotationMethodOrConstantRest ';'
  //     | classDeclaration ';'?
  //     | interfaceDeclaration ';'?
  //     | enumDeclaration ';'?
  //     | annotationTypeDeclaration ';'?
  public static boolean annotationTypeElementRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_TYPE_ELEMENT_REST, "<annotation type element rest>");
    r = annotationTypeElementRest_0(b, l + 1);
    if (!r) r = annotationTypeElementRest_1(b, l + 1);
    if (!r) r = annotationTypeElementRest_2(b, l + 1);
    if (!r) r = annotationTypeElementRest_3(b, l + 1);
    if (!r) r = annotationTypeElementRest_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_ annotationMethodOrConstantRest ';'
  private static boolean annotationTypeElementRest_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_(b, l + 1);
    r = r && annotationMethodOrConstantRest(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // classDeclaration ';'?
  private static boolean annotationTypeElementRest_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration(b, l + 1);
    r = r && annotationTypeElementRest_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean annotationTypeElementRest_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_1_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // interfaceDeclaration ';'?
  private static boolean annotationTypeElementRest_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceDeclaration(b, l + 1);
    r = r && annotationTypeElementRest_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean annotationTypeElementRest_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_2_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // enumDeclaration ';'?
  private static boolean annotationTypeElementRest_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumDeclaration(b, l + 1);
    r = r && annotationTypeElementRest_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean annotationTypeElementRest_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_3_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // annotationTypeDeclaration ';'?
  private static boolean annotationTypeElementRest_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotationTypeDeclaration(b, l + 1);
    r = r && annotationTypeElementRest_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean annotationTypeElementRest_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationTypeElementRest_4_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // ("DB_INSERT" | "DB_UPDATE" | "DB_DELETE" | "DB_UNDELETE") expression
  //     | apexDbUpsertExpression
  public static boolean apexDbExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexDbExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APEX_DB_EXPRESSION, "<apex db expression>");
    r = apexDbExpression_0(b, l + 1);
    if (!r) r = apexDbUpsertExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("DB_INSERT" | "DB_UPDATE" | "DB_DELETE" | "DB_UNDELETE") expression
  private static boolean apexDbExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexDbExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = apexDbExpression_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "DB_INSERT" | "DB_UPDATE" | "DB_DELETE" | "DB_UNDELETE"
  private static boolean apexDbExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexDbExpression_0_0")) return false;
    boolean r;
    r = consumeToken(b, "DB_INSERT");
    if (!r) r = consumeToken(b, "DB_UPDATE");
    if (!r) r = consumeToken(b, "DB_DELETE");
    if (!r) r = consumeToken(b, "DB_UNDELETE");
    return r;
  }

  /* ********************************************************** */
  // "DB_UPSERT" expression expression*
  public static boolean apexDbUpsertExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexDbUpsertExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APEX_DB_UPSERT_EXPRESSION, "<apex db upsert expression>");
    r = consumeToken(b, "DB_UPSERT");
    r = r && expression(b, l + 1);
    r = r && apexDbUpsertExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression*
  private static boolean apexDbUpsertExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexDbUpsertExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "apexDbUpsertExpression_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // compilationUnit
  static boolean apexFile(PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // '(' expressionList? ')'
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && arguments_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // expressionList?
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' (variableInitializer (',' variableInitializer)* ','?)? '}'
  public static boolean arrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && arrayInitializer_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ARRAY_INITIALIZER, r);
    return r;
  }

  // (variableInitializer (',' variableInitializer)* ','?)?
  private static boolean arrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1")) return false;
    arrayInitializer_1_0(b, l + 1);
    return true;
  }

  // variableInitializer (',' variableInitializer)* ','?
  private static boolean arrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableInitializer(b, l + 1);
    r = r && arrayInitializer_1_0_1(b, l + 1);
    r = r && arrayInitializer_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' variableInitializer)*
  private static boolean arrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // ',' variableInitializer
  private static boolean arrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variableInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean arrayInitializer_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '{' blockStatement* '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // blockStatement*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!blockStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // localVariableDeclarationStatement
  //     | statement
  //     | typeDeclaration
  public static boolean blockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, "<block statement>");
    r = localVariableDeclarationStatement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = typeDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "CATCH" '(' variableModifier* catchType identifier ')' block
  public static boolean catchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCH_CLAUSE, "<catch clause>");
    r = consumeToken(b, "CATCH");
    r = r && consumeToken(b, LPAREN);
    r = r && catchClause_2(b, l + 1);
    r = r && catchType(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, RPAREN);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean catchClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName ('|' qualifiedName)*
  public static boolean catchType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchType")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && catchType_1(b, l + 1);
    exit_section_(b, m, CATCH_TYPE, r);
    return r;
  }

  // ('|' qualifiedName)*
  private static boolean catchType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catchType_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchType_1", c)) break;
    }
    return true;
  }

  // '|' qualifiedName
  private static boolean catchType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITOR);
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' classBodyDeclaration* '}'
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && classBody_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // classBodyDeclaration*
  private static boolean classBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classBodyDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ';'
  //     | "STATIC"? block
  //     | modifier* memberDeclaration
  public static boolean classBodyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY_DECLARATION, "<class body declaration>");
    r = consumeToken(b, SEMI);
    if (!r) r = classBodyDeclaration_1(b, l + 1);
    if (!r) r = classBodyDeclaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "STATIC"? block
  private static boolean classBodyDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classBodyDeclaration_1_0(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "STATIC"?
  private static boolean classBodyDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration_1_0")) return false;
    consumeToken(b, "STATIC");
    return true;
  }

  // modifier* memberDeclaration
  private static boolean classBodyDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classBodyDeclaration_2_0(b, l + 1);
    r = r && memberDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifier*
  private static boolean classBodyDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBodyDeclaration_2_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "CLASS" identifier typeParameters? ("EXTENDS" type_)? ("IMPLEMENTS" typeList)? classBody
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = consumeToken(b, "CLASS");
    r = r && consumeToken(b, IDENTIFIER);
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
  // annotation           // class or interface
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
  //     | "TESTMETHOD"           // method only
  //     | "with sharing"    // class only
  //     | "without sharing"
  public static boolean classOrInterfaceModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classOrInterfaceModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_OR_INTERFACE_MODIFIER, "<class or interface modifier>");
    r = annotation(b, l + 1);
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
    if (!r) r = consumeToken(b, APEX_WITH_SHARING);
    if (!r) r = consumeToken(b, APEX_WITHOUT_SHARING);
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
  // packageDeclaration? importDeclaration* typeDeclaration*
  public static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPILATION_UNIT, "<compilation unit>");
    r = compilationUnit_0(b, l + 1);
    r = r && compilationUnit_1(b, l + 1);
    r = r && compilationUnit_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // packageDeclaration?
  private static boolean compilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_0")) return false;
    packageDeclaration(b, l + 1);
    return true;
  }

  // importDeclaration*
  private static boolean compilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_1", c)) break;
    }
    return true;
  }

  // typeDeclaration*
  private static boolean compilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type_ constantDeclarator (',' constantDeclarator)* ';'
  public static boolean constDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_DECLARATION, "<const declaration>");
    r = type_(b, l + 1);
    r = r && constantDeclarator(b, l + 1);
    r = r && constDeclaration_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' constantDeclarator)*
  private static boolean constDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDeclaration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constDeclaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constDeclaration_2", c)) break;
    }
    return true;
  }

  // ',' constantDeclarator
  private static boolean constDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && constantDeclarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ARRAY_DEFINE '=' variableInitializer
  public static boolean constantDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDeclarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ARRAY_DEFINE, ASSIGN);
    r = r && variableInitializer(b, l + 1);
    exit_section_(b, m, CONSTANT_DECLARATOR, r);
    return r;
  }

  /* ********************************************************** */
  // block
  public static boolean constructorBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // identifier formalParameters ("THROWS" qualifiedNameList)? constructorBody
  public static boolean constructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && formalParameters(b, l + 1);
    r = r && constructorDeclaration_2(b, l + 1);
    r = r && constructorBody(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR_DECLARATION, r);
    return r;
  }

  // ("THROWS" qualifiedNameList)?
  private static boolean constructorDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_2")) return false;
    constructorDeclaration_2_0(b, l + 1);
    return true;
  }

  // "THROWS" qualifiedNameList
  private static boolean constructorDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THROWS");
    r = r && qualifiedNameList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "DEFAULT" elementValue
  public static boolean defaultValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defaultValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_VALUE, "<default value>");
    r = consumeToken(b, "DEFAULT");
    r = r && elementValue(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  //     | annotation
  //     | elementValueArrayInitializer
  public static boolean elementValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_VALUE, "<element value>");
    r = expression(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    if (!r) r = elementValueArrayInitializer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' (elementValue (',' elementValue)*)? ','? '}'
  public static boolean elementValueArrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && elementValueArrayInitializer_1(b, l + 1);
    r = r && elementValueArrayInitializer_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ELEMENT_VALUE_ARRAY_INITIALIZER, r);
    return r;
  }

  // (elementValue (',' elementValue)*)?
  private static boolean elementValueArrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1")) return false;
    elementValueArrayInitializer_1_0(b, l + 1);
    return true;
  }

  // elementValue (',' elementValue)*
  private static boolean elementValueArrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValue(b, l + 1);
    r = r && elementValueArrayInitializer_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' elementValue)*
  private static boolean elementValueArrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValueArrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValueArrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // ',' elementValue
  private static boolean elementValueArrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && elementValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean elementValueArrayInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier '=' elementValue
  public static boolean elementValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && elementValue(b, l + 1);
    exit_section_(b, m, ELEMENT_VALUE_PAIR, r);
    return r;
  }

  /* ********************************************************** */
  // elementValuePair (','? elementValuePair)*
  public static boolean elementValuePairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValuePair(b, l + 1);
    r = r && elementValuePairs_1(b, l + 1);
    exit_section_(b, m, ELEMENT_VALUE_PAIRS, r);
    return r;
  }

  // (','? elementValuePair)*
  private static boolean elementValuePairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValuePairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValuePairs_1", c)) break;
    }
    return true;
  }

  // ','? elementValuePair
  private static boolean elementValuePairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValuePairs_1_0_0(b, l + 1);
    r = r && elementValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean elementValuePairs_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // variableModifier* type_ variableDeclaratorId ':' expression
  public static boolean enhancedForControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enhancedForControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENHANCED_FOR_CONTROL, "<enhanced for control>");
    r = enhancedForControl_0(b, l + 1);
    r = r && type_(b, l + 1);
    r = r && variableDeclaratorId(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean enhancedForControl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enhancedForControl_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enhancedForControl_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ';' classBodyDeclaration*
  public static boolean enumBodyDeclarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBodyDeclarations")) return false;
    if (!nextTokenIs(b, SEMI)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && enumBodyDeclarations_1(b, l + 1);
    exit_section_(b, m, ENUM_BODY_DECLARATIONS, r);
    return r;
  }

  // classBodyDeclaration*
  private static boolean enumBodyDeclarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBodyDeclarations_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classBodyDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumBodyDeclarations_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation* identifier arguments? classBody?
  public static boolean enumConstant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_CONSTANT, "<enum constant>");
    r = enumConstant_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enumConstant_2(b, l + 1);
    r = r && enumConstant_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean enumConstant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstant_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumConstant_0", c)) break;
    }
    return true;
  }

  // arguments?
  private static boolean enumConstant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstant_2")) return false;
    arguments(b, l + 1);
    return true;
  }

  // classBody?
  private static boolean enumConstant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstant_3")) return false;
    classBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enumConstant (',' enumConstant)*
  public static boolean enumConstants(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_CONSTANTS, "<enum constants>");
    r = enumConstant(b, l + 1);
    r = r && enumConstants_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' enumConstant)*
  private static boolean enumConstants_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumConstants_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumConstants_1", c)) break;
    }
    return true;
  }

  // ',' enumConstant
  private static boolean enumConstants_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumConstant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "ENUM" identifier ("IMPLEMENTS" typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
  public static boolean enumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = consumeToken(b, "ENUM");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enumDeclaration_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && enumDeclaration_4(b, l + 1);
    r = r && enumDeclaration_5(b, l + 1);
    r = r && enumDeclaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("IMPLEMENTS" typeList)?
  private static boolean enumDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_2")) return false;
    enumDeclaration_2_0(b, l + 1);
    return true;
  }

  // "IMPLEMENTS" typeList
  private static boolean enumDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "IMPLEMENTS");
    r = r && typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // enumConstants?
  private static boolean enumDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_4")) return false;
    enumConstants(b, l + 1);
    return true;
  }

  // ','?
  private static boolean enumDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // enumBodyDeclarations?
  private static boolean enumDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_6")) return false;
    enumBodyDeclarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // nonWildcardTypeArguments explicitGenericInvocationSuffix
  public static boolean explicitGenericInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicitGenericInvocation")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nonWildcardTypeArguments(b, l + 1);
    r = r && explicitGenericInvocationSuffix(b, l + 1);
    exit_section_(b, m, EXPLICIT_GENERIC_INVOCATION, r);
    return r;
  }

  /* ********************************************************** */
  // "SUPER" superSuffix
  //     | identifier arguments
  public static boolean explicitGenericInvocationSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicitGenericInvocationSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPLICIT_GENERIC_INVOCATION_SUFFIX, "<explicit generic invocation suffix>");
    r = explicitGenericInvocationSuffix_0(b, l + 1);
    if (!r) r = explicitGenericInvocationSuffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "SUPER" superSuffix
  private static boolean explicitGenericInvocationSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicitGenericInvocationSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SUPER");
    r = r && superSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier arguments
  private static boolean explicitGenericInvocationSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicitGenericInvocationSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_group
  //     | qualification_expr
  //     | suffix_expr
  //     | left_recursion_group
  //     | right_assoc_expr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<expr>");
    r = primary_group(b, l + 1);
    if (!r) r = qualification_expr(b, l + 1);
    if (!r) r = suffix_expr(b, l + 1);
    if (!r) r = left_recursion_group(b, l + 1);
    if (!r) r = right_assoc_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression '[' expression? ']'
  public static boolean expr_arr_index_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_arr_index_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_ARR_INDEX_EXPR, "<expr arr index expr>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, LBRACK);
    r = r && expr_arr_index_expr_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression?
  private static boolean expr_arr_index_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_arr_index_expr_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr '(' expressionList? ')'
  public static boolean expr_list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_list_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_LIST_EXPR, "<expr list expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && expr_list_expr_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expressionList?
  private static boolean expr_list_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_list_expr_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression (',' expression)*
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_ variableDeclarators ';'
  public static boolean fieldDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION, "<field declaration>");
    r = type_(b, l + 1);
    r = r && variableDeclarators(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "FINALLY" block
  public static boolean finallyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FINALLY_BLOCK, "<finally block>");
    r = consumeToken(b, "FINALLY");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // forInit? ';' expression? ';' forUpdate?
  // 	| enhancedForControl
  public static boolean forControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_CONTROL, "<for control>");
    r = forControl_0(b, l + 1);
    if (!r) r = enhancedForControl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // forInit? ';' expression? ';' forUpdate?
  private static boolean forControl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forControl_0_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && forControl_0_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && forControl_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // forInit?
  private static boolean forControl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_0_0")) return false;
    forInit(b, l + 1);
    return true;
  }

  // expression?
  private static boolean forControl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_0_2")) return false;
    expression(b, l + 1);
    return true;
  }

  // forUpdate?
  private static boolean forControl_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_0_4")) return false;
    forUpdate(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // localVariableDeclaration
  //     | expressionList
  public static boolean forInit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forInit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_INIT, "<for init>");
    r = localVariableDeclaration(b, l + 1);
    if (!r) r = expressionList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR '(' forControl ')' statement
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, null);
    r = consumeTokens(b, 2, FOR, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, forControl(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expressionList
  public static boolean forUpdate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forUpdate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_UPDATE, "<for update>");
    r = expressionList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variableModifier* type_ variableDeclaratorId
  public static boolean formalParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    r = formalParameter_0(b, l + 1);
    r = r && type_(b, l + 1);
    r = r && variableDeclaratorId(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean formalParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameter_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // formalParameter (',' formalParameter)* (',' lastFormalParameter)?
  //     | lastFormalParameter
  public static boolean formalParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = formalParameterList_0(b, l + 1);
    if (!r) r = lastFormalParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // formalParameter (',' formalParameter)* (',' lastFormalParameter)?
  private static boolean formalParameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formalParameter(b, l + 1);
    r = r && formalParameterList_0_1(b, l + 1);
    r = r && formalParameterList_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' formalParameter)*
  private static boolean formalParameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formalParameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameterList_0_1", c)) break;
    }
    return true;
  }

  // ',' formalParameter
  private static boolean formalParameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && formalParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' lastFormalParameter)?
  private static boolean formalParameterList_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_0_2")) return false;
    formalParameterList_0_2_0(b, l + 1);
    return true;
  }

  // ',' lastFormalParameter
  private static boolean formalParameterList_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && lastFormalParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' formalParameterList? ')'
  public static boolean formalParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && formalParameters_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FORMAL_PARAMETERS, r);
    return r;
  }

  // formalParameterList?
  private static boolean formalParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameters_1")) return false;
    formalParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr '.' explicitGenericInvocation
  public static boolean gene_invocation_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gene_invocation_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENE_INVOCATION_EXPR, "<gene invocation expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && explicitGenericInvocation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeParameters constructorDeclaration
  public static boolean genericConstructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericConstructorDeclaration")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters(b, l + 1);
    r = r && constructorDeclaration(b, l + 1);
    exit_section_(b, m, GENERIC_CONSTRUCTOR_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // typeParameters interfaceMethodDeclaration
  public static boolean genericInterfaceMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericInterfaceMethodDeclaration")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters(b, l + 1);
    r = r && interfaceMethodDeclaration(b, l + 1);
    exit_section_(b, m, GENERIC_INTERFACE_METHOD_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // typeParameters methodDeclaration
  public static boolean genericMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "genericMethodDeclaration")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters(b, l + 1);
    r = r && methodDeclaration(b, l + 1);
    exit_section_(b, m, GENERIC_METHOD_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // expr '?' expr ':' expr
  public static boolean if_else_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_ELSE_EXPR, "<if else expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, QUESTION);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // '{' interfaceBodyDeclaration* '}'
  public static boolean interfaceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && interfaceBody_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, INTERFACE_BODY, r);
    return r;
  }

  // interfaceBodyDeclaration*
  private static boolean interfaceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interfaceBodyDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* interfaceMemberDeclaration
  //     | ';'
  public static boolean interfaceBodyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBodyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_BODY_DECLARATION, "<interface body declaration>");
    r = interfaceBodyDeclaration_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier* interfaceMemberDeclaration
  private static boolean interfaceBodyDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBodyDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceBodyDeclaration_0_0(b, l + 1);
    r = r && interfaceMemberDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifier*
  private static boolean interfaceBodyDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBodyDeclaration_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceBodyDeclaration_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "INTERFACE" identifier typeParameters? ("EXTENDS" typeList)? interfaceBody
  public static boolean interfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = consumeToken(b, "INTERFACE");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && interfaceDeclaration_2(b, l + 1);
    r = r && interfaceDeclaration_3(b, l + 1);
    r = r && interfaceBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeParameters?
  private static boolean interfaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  // ("EXTENDS" typeList)?
  private static boolean interfaceDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_3")) return false;
    interfaceDeclaration_3_0(b, l + 1);
    return true;
  }

  // "EXTENDS" typeList
  private static boolean interfaceDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENDS");
    r = r && typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constDeclaration
  //     | interfaceMethodDeclaration
  //     | genericInterfaceMethodDeclaration
  //     | interfaceDeclaration
  //     | annotationTypeDeclaration
  //     | classDeclaration
  //     | enumDeclaration
  public static boolean interfaceMemberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMemberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER_DECLARATION, "<interface member declaration>");
    r = constDeclaration(b, l + 1);
    if (!r) r = interfaceMethodDeclaration(b, l + 1);
    if (!r) r = genericInterfaceMethodDeclaration(b, l + 1);
    if (!r) r = interfaceDeclaration(b, l + 1);
    if (!r) r = annotationTypeDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    if (!r) r = enumDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (type_ | "VOID") identifier formalParameters ARRAY_DEFINE ("THROWS" qualifiedNameList)? ';'
  public static boolean interfaceMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_METHOD_DECLARATION, "<interface method declaration>");
    r = interfaceMethodDeclaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && formalParameters(b, l + 1);
    r = r && consumeToken(b, ARRAY_DEFINE);
    r = r && interfaceMethodDeclaration_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_ | "VOID"
  private static boolean interfaceMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration_0")) return false;
    boolean r;
    r = type_(b, l + 1);
    if (!r) r = consumeToken(b, "VOID");
    return r;
  }

  // ("THROWS" qualifiedNameList)?
  private static boolean interfaceMethodDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration_4")) return false;
    interfaceMethodDeclaration_4_0(b, l + 1);
    return true;
  }

  // "THROWS" qualifiedNameList
  private static boolean interfaceMethodDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THROWS");
    r = r && qualifiedNameList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableModifier* type_ '...' variableDeclaratorId
  public static boolean lastFormalParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastFormalParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAST_FORMAL_PARAMETER, "<last formal parameter>");
    r = lastFormalParameter_0(b, l + 1);
    r = r && type_(b, l + 1);
    r = r && consumeToken(b, "...");
    r = r && variableDeclaratorId(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean lastFormalParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastFormalParameter_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lastFormalParameter_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expr_list_expr
  //     | expr_arr_index_expr
  //     | new_expr | this_expr | super_expr
  //     | gene_invocation_expr | plus_minus_expr | if_else_expr
  static boolean left_recursion_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "left_recursion_group")) return false;
    boolean r;
    r = expr_list_expr(b, l + 1);
    if (!r) r = expr_arr_index_expr(b, l + 1);
    if (!r) r = new_expr(b, l + 1);
    if (!r) r = this_expr(b, l + 1);
    if (!r) r = super_expr(b, l + 1);
    if (!r) r = gene_invocation_expr(b, l + 1);
    if (!r) r = plus_minus_expr(b, l + 1);
    if (!r) r = if_else_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // number
  // 	| StringLiteral
  //     | IntegerLiteral
  //     | FloatingPointLiteral
  // //    | CharacterLiteral
  // //    | BooleanLiteral
  //     | "NULL"
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = IntegerLiteral(b, l + 1);
    if (!r) r = FloatingPointLiteral(b, l + 1);
    if (!r) r = consumeToken(b, "NULL");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variableModifier* type_ variableDeclarators
  public static boolean localVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION, "<local variable declaration>");
    r = localVariableDeclaration_0(b, l + 1);
    r = r && type_(b, l + 1);
    r = r && variableDeclarators(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean localVariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "localVariableDeclaration_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // localVariableDeclaration ';'
  public static boolean localVariableDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclarationStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION_STATEMENT, "<local variable declaration statement>");
    r = localVariableDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // methodDeclaration
  //     | genericMethodDeclaration
  //     | fieldDeclaration
  //     | constructorDeclaration
  //     | genericConstructorDeclaration
  //     | interfaceDeclaration
  // //    | annotationTypeDeclaration
  //     | classDeclaration
  public static boolean memberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION, "<member declaration>");
    r = methodDeclaration(b, l + 1);
    if (!r) r = genericMethodDeclaration(b, l + 1);
    if (!r) r = fieldDeclaration(b, l + 1);
    if (!r) r = constructorDeclaration(b, l + 1);
    if (!r) r = genericConstructorDeclaration(b, l + 1);
    if (!r) r = interfaceDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block
  public static boolean methodBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    exit_section_(b, m, METHOD_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // "OVERRIDE"? (type_ | "VOID") identifier formalParameters ('[' ']')* ("THROWS" qualifiedNameList)? (
  //         methodBody
  //         | ';'
  //     )
  public static boolean methodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = methodDeclaration_0(b, l + 1);
    r = r && methodDeclaration_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && formalParameters(b, l + 1);
    r = r && methodDeclaration_4(b, l + 1);
    r = r && methodDeclaration_5(b, l + 1);
    r = r && methodDeclaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "OVERRIDE"?
  private static boolean methodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_0")) return false;
    consumeToken(b, "OVERRIDE");
    return true;
  }

  // type_ | "VOID"
  private static boolean methodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_1")) return false;
    boolean r;
    r = type_(b, l + 1);
    if (!r) r = consumeToken(b, "VOID");
    return r;
  }

  // ('[' ']')*
  private static boolean methodDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodDeclaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodDeclaration_4", c)) break;
    }
    return true;
  }

  // '[' ']'
  private static boolean methodDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("THROWS" qualifiedNameList)?
  private static boolean methodDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_5")) return false;
    methodDeclaration_5_0(b, l + 1);
    return true;
  }

  // "THROWS" qualifiedNameList
  private static boolean methodDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THROWS");
    r = r && qualifiedNameList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodBody
  //         | ';'
  private static boolean methodDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_6")) return false;
    boolean r;
    r = methodBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // classOrInterfaceModifier
  //     | "NATIVE"
  //     | "SYNCHRONIZED"
  //     | "TRANSIENT"
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = classOrInterfaceModifier(b, l + 1);
    if (!r) r = consumeToken(b, "NATIVE");
    if (!r) r = consumeToken(b, "SYNCHRONIZED");
    if (!r) r = consumeToken(b, "TRANSIENT");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr '.' "NEW"
  public static boolean new_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_EXPR, "<new expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "NEW");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' typeList '>'
  public static boolean nonWildcardTypeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonWildcardTypeArguments")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeList(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, NON_WILDCARD_TYPE_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // annotation* "PACKAGE" qualifiedName ';'
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, "<package declaration>");
    r = packageDeclaration_0(b, l + 1);
    r = r && consumeToken(b, "PACKAGE");
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean packageDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "packageDeclaration_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' expression ')'
  public static boolean parExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAR_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' expr ')'
  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAREN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // expr ('++' | '--')
  public static boolean plus_minus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_minus_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PLUS_MINUS_EXPR, "<plus minus expr>");
    r = expr(b, l + 1);
    r = r && plus_minus_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '++' | '--'
  private static boolean plus_minus_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_minus_expr_1")) return false;
    boolean r;
    r = consumeToken(b, INC);
    if (!r) r = consumeToken(b, DEC);
    return r;
  }

  /* ********************************************************** */
  // "THIS"
  //     | "SUPER"
  //     | identifier
  //     | literal
  //     | type_ '.' "CLASS"
  //     | "VOID" '.' "CLASS"
  //     | nonWildcardTypeArguments (explicitGenericInvocationSuffix | "THIS" arguments)
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = consumeToken(b, "THIS");
    if (!r) r = consumeToken(b, "SUPER");
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    if (!r) r = primary_4(b, l + 1);
    if (!r) r = primary_5(b, l + 1);
    if (!r) r = primary_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_ '.' "CLASS"
  private static boolean primary_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "CLASS");
    exit_section_(b, m, null, r);
    return r;
  }

  // "VOID" '.' "CLASS"
  private static boolean primary_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "VOID");
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "CLASS");
    exit_section_(b, m, null, r);
    return r;
  }

  // nonWildcardTypeArguments (explicitGenericInvocationSuffix | "THIS" arguments)
  private static boolean primary_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nonWildcardTypeArguments(b, l + 1);
    r = r && primary_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // explicitGenericInvocationSuffix | "THIS" arguments
  private static boolean primary_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = explicitGenericInvocationSuffix(b, l + 1);
    if (!r) r = primary_6_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "THIS" arguments
  private static boolean primary_6_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_6_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THIS");
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier  | paren_expr | primary_expr
  static boolean primary_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_group")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = primary_expr(b, l + 1);
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
  // expr '?'? '.' identifier
  public static boolean qualification_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualification_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFICATION_EXPR, "<qualification expr>");
    r = expr(b, l + 1);
    r = r && qualification_expr_1(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '?'?
  private static boolean qualification_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualification_expr_1")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // identifier ('.' identifier)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
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
  // qualifiedName (',' qualifiedName)*
  public static boolean qualifiedNameList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedNameList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && qualifiedNameList_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME_LIST, r);
    return r;
  }

  // (',' qualifiedName)*
  private static boolean qualifiedNameList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedNameList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedNameList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedNameList_1", c)) break;
    }
    return true;
  }

  // ',' qualifiedName
  private static boolean qualifiedNameList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedNameList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
  public static boolean resource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE, "<resource>");
    r = resource_0(b, l + 1);
    r = r && classOrInterfaceType(b, l + 1);
    r = r && variableDeclaratorId(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // variableModifier*
  private static boolean resource_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableModifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "resource_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' resources ';'? ')'
  public static boolean resourceSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resourceSpecification")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && resources(b, l + 1);
    r = r && resourceSpecification_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, RESOURCE_SPECIFICATION, r);
    return r;
  }

  // ';'?
  private static boolean resourceSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resourceSpecification_2")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // resource (';' resource)*
  public static boolean resources(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resources")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESOURCES, "<resources>");
    r = resource(b, l + 1);
    r = r && resources_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' resource)*
  private static boolean resources_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resources_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!resources_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "resources_1", c)) break;
    }
    return true;
  }

  // ';' resource
  private static boolean resources_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resources_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && resource(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr ('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=' )
  //     expr
  public static boolean right_assoc_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "right_assoc_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, RIGHT_ASSOC_EXPR, "<right assoc expr>");
    r = expr(b, l + 1);
    r = r && right_assoc_expr_1(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%='
  private static boolean right_assoc_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "right_assoc_expr_1")) return false;
    boolean r;
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, ADD_ASSIGN);
    if (!r) r = consumeToken(b, SUB_ASSIGN);
    if (!r) r = consumeToken(b, MUL_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, AND_ASSIGN);
    if (!r) r = consumeToken(b, OR_ASSIGN);
    if (!r) r = consumeToken(b, XOR_ASSIGN);
    if (!r) r = consumeToken(b, RSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, URSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, LSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    return r;
  }

  /* ********************************************************** */
  // block
  //     | "IF" parExpression statement ("ELSE" statement)?
  //     | forStatement
  //     | "WHILE" parExpression statement
  //     | "DO" statement "WHILE" parExpression ';'
  //     | "RUNAS" '(' expression ')' statement
  //     | "TRY" block (catchClause+ finallyBlock? | finallyBlock)
  //     | "TRY" resourceSpecification block catchClause* finallyBlock?
  //     | "RETURN" expression? ';'
  //     | "THROW" expression ';'
  //     | "BREAK" identifier? ';'
  //     | "CONTINUE" identifier? ';'
  //     | ';'
  //     | statementExpression ';'
  //     | identifier ':' statement
  //     | apexDbExpression ';'
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = block(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = statement_4(b, l + 1);
    if (!r) r = statement_5(b, l + 1);
    if (!r) r = statement_6(b, l + 1);
    if (!r) r = statement_7(b, l + 1);
    if (!r) r = statement_8(b, l + 1);
    if (!r) r = statement_9(b, l + 1);
    if (!r) r = statement_10(b, l + 1);
    if (!r) r = statement_11(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    if (!r) r = statement_13(b, l + 1);
    if (!r) r = statement_14(b, l + 1);
    if (!r) r = statement_15(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "IF" parExpression statement ("ELSE" statement)?
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "IF");
    r = r && parExpression(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && statement_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("ELSE" statement)?
  private static boolean statement_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_3")) return false;
    statement_1_3_0(b, l + 1);
    return true;
  }

  // "ELSE" statement
  private static boolean statement_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ELSE");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "WHILE" parExpression statement
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WHILE");
    r = r && parExpression(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "DO" statement "WHILE" parExpression ';'
  private static boolean statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DO");
    r = r && statement(b, l + 1);
    r = r && consumeToken(b, "WHILE");
    r = r && parExpression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // "RUNAS" '(' expression ')' statement
  private static boolean statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "RUNAS");
    r = r && consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "TRY" block (catchClause+ finallyBlock? | finallyBlock)
  private static boolean statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TRY");
    r = r && block(b, l + 1);
    r = r && statement_6_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause+ finallyBlock? | finallyBlock
  private static boolean statement_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_6_2_0(b, l + 1);
    if (!r) r = finallyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause+ finallyBlock?
  private static boolean statement_6_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_6_2_0_0(b, l + 1);
    r = r && statement_6_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause+
  private static boolean statement_6_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catchClause(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!catchClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_6_2_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // finallyBlock?
  private static boolean statement_6_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6_2_0_1")) return false;
    finallyBlock(b, l + 1);
    return true;
  }

  // "TRY" resourceSpecification block catchClause* finallyBlock?
  private static boolean statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TRY");
    r = r && resourceSpecification(b, l + 1);
    r = r && block(b, l + 1);
    r = r && statement_7_3(b, l + 1);
    r = r && statement_7_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause*
  private static boolean statement_7_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_7_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catchClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_7_3", c)) break;
    }
    return true;
  }

  // finallyBlock?
  private static boolean statement_7_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_7_4")) return false;
    finallyBlock(b, l + 1);
    return true;
  }

  // "RETURN" expression? ';'
  private static boolean statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "RETURN");
    r = r && statement_8_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean statement_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // "THROW" expression ';'
  private static boolean statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "THROW");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // "BREAK" identifier? ';'
  private static boolean statement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BREAK");
    r = r && statement_10_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean statement_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_10_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // "CONTINUE" identifier? ';'
  private static boolean statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONTINUE");
    r = r && statement_11_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean statement_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_11_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // statementExpression ';'
  private static boolean statement_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statementExpression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier ':' statement
  private static boolean statement_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // apexDbExpression ';'
  private static boolean statement_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = apexDbExpression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean statementExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statementExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_EXPRESSION, "<statement expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' type_ ')' expression
  //     | ('+' | '-' | '++' | '--') expression
  //     |  ('~' | '!') expression
  public static boolean suffix_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX_EXPR, "<suffix expr>");
    r = suffix_expr_0(b, l + 1);
    if (!r) r = suffix_expr_1(b, l + 1);
    if (!r) r = suffix_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' type_ ')' expression
  private static boolean suffix_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type_(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' | '-' | '++' | '--') expression
  private static boolean suffix_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix_expr_1_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-' | '++' | '--'
  private static boolean suffix_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr_1_0")) return false;
    boolean r;
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, INC);
    if (!r) r = consumeToken(b, DEC);
    return r;
  }

  // ('~' | '!') expression
  private static boolean suffix_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix_expr_2_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '~' | '!'
  private static boolean suffix_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_expr_2_0")) return false;
    boolean r;
    r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, BANG);
    return r;
  }

  /* ********************************************************** */
  // arguments
  //     | '.' identifier arguments?
  public static boolean superSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superSuffix")) return false;
    if (!nextTokenIs(b, "<super suffix>", DOT, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPER_SUFFIX, "<super suffix>");
    r = arguments(b, l + 1);
    if (!r) r = superSuffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.' identifier arguments?
  private static boolean superSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    r = r && superSuffix_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arguments?
  private static boolean superSuffix_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superSuffix_1_2")) return false;
    arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr '.' "SUPER" superSuffix
  public static boolean super_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "super_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUPER_EXPR, "<super expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "SUPER");
    r = r && superSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr '.' "THIS"
  public static boolean this_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THIS_EXPR, "<this expr>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "THIS");
    exit_section_(b, l, m, r, false, null);
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

  /* ********************************************************** */
  // variableDeclaratorId ('=' variableInitializer)?
  public static boolean variableDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclaratorId(b, l + 1);
    r = r && variableDeclarator_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATOR, r);
    return r;
  }

  // ('=' variableInitializer)?
  private static boolean variableDeclarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator_1")) return false;
    variableDeclarator_1_0(b, l + 1);
    return true;
  }

  // '=' variableInitializer
  private static boolean variableDeclarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && variableInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ('[' ']')*
  public static boolean variableDeclaratorId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaratorId")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATOR_ID, null);
    r = consumeToken(b, IDENTIFIER);
    p = r; // pin = 1
    r = r && variableDeclaratorId_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('[' ']')*
  private static boolean variableDeclaratorId_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaratorId_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableDeclaratorId_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaratorId_1", c)) break;
    }
    return true;
  }

  // '[' ']'
  private static boolean variableDeclaratorId_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaratorId_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableDeclarator (',' variableDeclarator)*
  public static boolean variableDeclarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclarator(b, l + 1);
    r = r && variableDeclarators_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATORS, r);
    return r;
  }

  // (',' variableDeclarator)*
  private static boolean variableDeclarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableDeclarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclarators_1", c)) break;
    }
    return true;
  }

  // ',' variableDeclarator
  private static boolean variableDeclarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variableDeclarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arrayInitializer
  //     | expression
  public static boolean variableInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_INITIALIZER, "<variable initializer>");
    r = arrayInitializer(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "FINAL"
  //     | annotation
  public static boolean variableModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_MODIFIER, "<variable modifier>");
    r = consumeToken(b, "FINAL");
    if (!r) r = annotation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
