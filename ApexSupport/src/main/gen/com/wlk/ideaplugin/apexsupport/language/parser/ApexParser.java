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
    create_token_set_(ADD_SUB_EXPR, AND_EXPR, ARRAY_EXPR, BITOR_EXPR,
      BIT_AND_EXPR, CARET_EXPR, CAST_EXPR, COAL_EXPR,
      DOT_EXPR, EXPR, INC_DEC_EXPR, INSTANCE_EXPR,
      LITERAL_EXPR, LOGIC_EXPR, LT_GT_ASSI_EXPR, LT_GT_EXPR,
      METHOD_CALL_EXPR, MULTI_ASSIGN_EXPR, MUL_DIV_EXPR, NEG_EXPRESSION_EXPR,
      NEW_CREATOR_EXPR, OR_EXPR, QUESTION_EXPR, SUB_EXPR),
  };

  /* ********************************************************** */
  // 'TRUE'|'FALSE'
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, "TRUE");
    if (!r) r = consumeToken(b, "FALSE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AS (SYSTEM | USER)
  public static boolean accessLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessLevel")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && accessLevel_1(b, l + 1);
    exit_section_(b, m, ACCESS_LEVEL, r);
    return r;
  }

  // SYSTEM | USER
  private static boolean accessLevel_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessLevel_1")) return false;
    boolean r;
    r = consumeToken(b, SYSTEM);
    if (!r) r = consumeToken(b, USER);
    return r;
  }

  /* ********************************************************** */
  // "@" qualifiedName ( "(" ( elementValuePairs | elementValue )? ")" )?
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, ATSIGN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION, null);
    r = consumeToken(b, ATSIGN);
    r = r && qualifiedName(b, l + 1);
    p = r; // pin = 2
    r = r && annotation_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( "(" ( elementValuePairs | elementValue )? ")" )?
  private static boolean annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2")) return false;
    annotation_2_0(b, l + 1);
    return true;
  }

  // "(" ( elementValuePairs | elementValue )? ")"
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

  // ( elementValuePairs | elementValue )?
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
  // identifier | "CLASS"
  public static boolean anyId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyId")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_ID, "<any id>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, "CLASS");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // classUnit
  static boolean apexFile(PsiBuilder b, int l) {
    return classUnit(b, l + 1);
  }

  /* ********************************************************** */
  // "(" expressionList? ")"
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
  // "[" expr "]" | "[]" arrayInitializer?
  public static boolean arrayCreatorRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CREATOR_REST, "<array creator rest>");
    r = arrayCreatorRest_0(b, l + 1);
    if (!r) r = arrayCreatorRest_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" expr "]"
  private static boolean arrayCreatorRest_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[]" arrayInitializer?
  private static boolean arrayCreatorRest_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[]");
    r = r && arrayCreatorRest_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayInitializer?
  private static boolean arrayCreatorRest_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest_1_1")) return false;
    arrayInitializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "{" (expr ("," expr)* (",")? )? "}"
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

  // (expr ("," expr)* (",")? )?
  private static boolean arrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1")) return false;
    arrayInitializer_1_0(b, l + 1);
    return true;
  }

  // expr ("," expr)* (",")?
  private static boolean arrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && arrayInitializer_1_0_1(b, l + 1);
    r = r && arrayInitializer_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expr)*
  private static boolean arrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // "," expr
  private static boolean arrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (",")?
  private static boolean arrayInitializer_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // (LBRACK RBRACK)*
  public static boolean arraySubscripts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySubscripts")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_SUBSCRIPTS, "<array subscripts>");
    while (true) {
      int c = current_position_(b);
      if (!arraySubscripts_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arraySubscripts", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // LBRACK RBRACK
  private static boolean arraySubscripts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySubscripts_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始:普通语句块">> "{" statement* "}" <<use_for_debug "匹配成功：语句块">>
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block语句>");
    r = use_for_debug(b, l + 1, "开始:普通语句块");
    r = r && consumeToken(b, LBRACE);
    r = r && block_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && use_for_debug(b, l + 1, "匹配成功：语句块");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // statement*
  private static boolean block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "BREAK" SEMI
  static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "BREAK");
    p = r; // pin = 1
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "CATCH" "(" modifier* qualifiedName identifier ")" block
  static boolean catchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "CATCH");
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, catchClause_2(b, l + 1));
    r = p && report_error_(b, qualifiedName(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, IDENTIFIER, RPAREN)) && r;
    r = p && block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // modifier*
  private static boolean catchClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catchClause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "{" classBodyDeclaration* "}"
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, classBody_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // modifier* memberDeclaration
  public static boolean classBodyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY_DECLARATION, "<class body declaration>");
    r = classBodyDeclaration_0(b, l + 1);
    r = r && memberDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean classBodyDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBodyDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classBodyDeclaration_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "CLASS" identifier
  //  ('EXTENDS' typeRef)?
  //  ("IMPLEMENTS" typeList)?
  //  classBody
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<cls>");
    r = consumeToken(b, "CLASS");
    r = r && consumeToken(b, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, classDeclaration_2(b, l + 1));
    r = p && report_error_(b, classDeclaration_3(b, l + 1)) && r;
    r = p && classBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('EXTENDS' typeRef)?
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    classDeclaration_2_0(b, l + 1);
    return true;
  }

  // 'EXTENDS' typeRef
  private static boolean classDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENDS");
    r = r && typeRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("IMPLEMENTS" typeList)?
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    classDeclaration_3_0(b, l + 1);
    return true;
  }

  // "IMPLEMENTS" typeList
  private static boolean classDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "IMPLEMENTS");
    r = r && typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：class类型">> ("VOID" | typeRef ) "." CLASS
  static boolean classSomeThing(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSomeThing")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_for_debug(b, l + 1, "开始：class类型");
    r = r && classSomeThing_1(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, CLASS);
    exit_section_(b, m, null, r);
    return r;
  }

  // "VOID" | typeRef
  private static boolean classSomeThing_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classSomeThing_1")) return false;
    boolean r;
    r = consumeToken(b, "VOID");
    if (!r) r = typeRef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // modifier*  typeDeclaration
  public static boolean classUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_UNIT, "<classunitName>");
    r = classUnit_0(b, l + 1);
    r = r && typeDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean classUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classUnit_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classUnit_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始匹配：构造器">> qualifiedName formalParameters block
  public static boolean constructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    r = use_for_debug(b, l + 1, "开始匹配：构造器");
    r = r && qualifiedName(b, l + 1);
    r = r && formalParameters(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "CONTINUE" SEMI
  static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "CONTINUE");
    p = r; // pin = 1
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // idCreatedNamePair ("." idCreatedNamePair)*
  public static boolean createdName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CREATED_NAME, "<created name>");
    r = idCreatedNamePair(b, l + 1);
    p = r; // pin = 1
    r = r && createdName_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("." idCreatedNamePair)*
  private static boolean createdName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createdName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createdName_1", c)) break;
    }
    return true;
  }

  // "." idCreatedNamePair
  private static boolean createdName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && idCreatedNamePair(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // createdName ( "{" "}" | arguments | arrayCreatorRest | mapCreatorRest | setCreatorRest)
  public static boolean creator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATOR, "<creator>");
    r = createdName(b, l + 1);
    r = r && creator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" "}" | arguments | arrayCreatorRest | mapCreatorRest | setCreatorRest
  private static boolean creator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, LBRACE, RBRACE);
    if (!r) r = arguments(b, l + 1);
    if (!r) r = arrayCreatorRest(b, l + 1);
    if (!r) r = mapCreatorRest(b, l + 1);
    if (!r) r = setCreatorRest(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "DELETE" accessLevel? expression SEMI
  static boolean deleteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "DELETE");
    p = r; // pin = 1
    r = r && report_error_(b, deleteStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean deleteStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "DO" block "WHILE" parExpression SEMI
  static boolean doWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "DO");
    p = r; // pin = 1
    r = r && report_error_(b, block(b, l + 1));
    r = p && report_error_(b, consumeToken(b, "WHILE")) && r;
    r = p && report_error_(b, parExpression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expression
  // 	| annotation
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
  // "{" (elementValue ("," elementValue)*)? (",")? "}"
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

  // (elementValue ("," elementValue)*)?
  private static boolean elementValueArrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1")) return false;
    elementValueArrayInitializer_1_0(b, l + 1);
    return true;
  }

  // elementValue ("," elementValue)*
  private static boolean elementValueArrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValue(b, l + 1);
    r = r && elementValueArrayInitializer_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," elementValue)*
  private static boolean elementValueArrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValueArrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValueArrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // "," elementValue
  private static boolean elementValueArrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && elementValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (",")?
  private static boolean elementValueArrayInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier "=" elementValue
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
  // elementValuePair (","? elementValuePair)*
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

  // (","? elementValuePair)*
  private static boolean elementValuePairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValuePairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValuePairs_1", c)) break;
    }
    return true;
  }

  // ","? elementValuePair
  private static boolean elementValuePairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValuePairs_1_0_0(b, l + 1);
    r = r && elementValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","?
  private static boolean elementValuePairs_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // typeRef identifier ":" expression
  public static boolean enhancedForControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enhancedForControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENHANCED_FOR_CONTROL, "<enhanced for control>");
    r = typeRef(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始:表达式">> !("}" | ")" | "," | ";" | ".") expr <<use_for_debug "匹配成功：表达式">>
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = use_for_debug(b, l + 1, "开始:表达式");
    r = r && expression_1(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && use_for_debug(b, l + 1, "匹配成功：表达式");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !("}" | ")" | "," | ";" | ".")
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !expression_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "}" | ")" | "," | ";" | "."
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMI);
    if (!r) r = consumeToken(b, DOT);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "尝试匹配函数调用的参数们">> expression (<<use_for_debug "尝试匹配函数调用的不定参数">> "," expression)*
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = use_for_debug(b, l + 1, "尝试匹配函数调用的参数们");
    r = r && expression(b, l + 1);
    r = r && expressionList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (<<use_for_debug "尝试匹配函数调用的不定参数">> "," expression)*
  private static boolean expressionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expressionList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_2", c)) break;
    }
    return true;
  }

  // <<use_for_debug "尝试匹配函数调用的不定参数">> "," expression
  private static boolean expressionList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_for_debug(b, l + 1, "尝试匹配函数调用的不定参数");
    r = r && consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：表达式声明">>  expression SEMI <<use_for_debug "匹配成功：表达式语句">>
  public static boolean expressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = use_for_debug(b, l + 1, "开始：表达式声明");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && use_for_debug(b, l + 1, "匹配成功：表达式语句");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeRef variableDeclarators SEMI
  public static boolean fieldDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION, "<字段声明>");
    r = typeRef(b, l + 1);
    r = r && variableDeclarators(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "FINALLY" block
  static boolean finallyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "FINALLY");
    p = r; // pin = 1
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // enhancedForControl | forInit? SEMI expression? SEMI forUpdate?
  public static boolean forControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_CONTROL, "<for control>");
    r = enhancedForControl(b, l + 1);
    if (!r) r = forControl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // forInit? SEMI expression? SEMI forUpdate?
  private static boolean forControl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forControl_1_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && forControl_1_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && forControl_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // forInit?
  private static boolean forControl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_1_0")) return false;
    forInit(b, l + 1);
    return true;
  }

  // expression?
  private static boolean forControl_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_1_2")) return false;
    expression(b, l + 1);
    return true;
  }

  // forUpdate?
  private static boolean forControl_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forControl_1_4")) return false;
    forUpdate(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // localVariableDeclaration | expressionList
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
  // "FOR" "(" forControl ")" (statement | SEMI)
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, "<for statement>");
    r = consumeToken(b, "FOR");
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, forControl(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && forStatement_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statement | SEMI
  private static boolean forStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_4")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
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
  // <<use_for_debug "开始:公式参数">> modifier* typeRef identifier
  public static boolean formalParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    r = use_for_debug(b, l + 1, "开始:公式参数");
    r = r && formalParameter_1(b, l + 1);
    r = r && typeRef(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean formalParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameter_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始:公式参数项">> formalParameter ("," formalParameter)*
  public static boolean formalParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = use_for_debug(b, l + 1, "开始:公式参数项");
    r = r && formalParameter(b, l + 1);
    r = r && formalParameterList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," formalParameter)*
  private static boolean formalParameterList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formalParameterList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameterList_2", c)) break;
    }
    return true;
  }

  // "," formalParameter
  private static boolean formalParameterList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && formalParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始:公式参数们">> "(" formalParameterList? ")" <<use_for_debug "匹配成功:公式参数们">>
  public static boolean formalParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETERS, "<formal parameters>");
    r = use_for_debug(b, l + 1, "开始:公式参数们");
    r = r && consumeToken(b, LPAREN);
    r = r && formalParameters_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && use_for_debug(b, l + 1, "匹配成功:公式参数们");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // formalParameterList?
  private static boolean formalParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameters_2")) return false;
    formalParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // anyId ("<" typeList ">")?
  public static boolean idCreatedNamePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idCreatedNamePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_CREATED_NAME_PAIR, "<id created name pair>");
    r = anyId(b, l + 1);
    r = r && idCreatedNamePair_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("<" typeList ">")?
  private static boolean idCreatedNamePair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idCreatedNamePair_1")) return false;
    idCreatedNamePair_1_0(b, l + 1);
    return true;
  }

  // "<" typeList ">"
  private static boolean idCreatedNamePair_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idCreatedNamePair_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeList(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：匹配If语句">> "IF" parExpression  <<use_for_debug "开始：if的statement">> statement ("ELSE" statement)?   <<use_for_debug "匹配成功：if语句">>
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<匹配到了ifStatement>");
    r = use_for_debug(b, l + 1, "开始：匹配If语句");
    r = r && consumeToken(b, "IF");
    p = r; // pin = 2
    r = r && report_error_(b, parExpression(b, l + 1));
    r = p && report_error_(b, use_for_debug(b, l + 1, "开始：if的statement")) && r;
    r = p && report_error_(b, statement(b, l + 1)) && r;
    r = p && report_error_(b, ifStatement_5(b, l + 1)) && r;
    r = p && use_for_debug(b, l + 1, "匹配成功：if语句") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("ELSE" statement)?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // "ELSE" statement
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ELSE");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "INSERT" accessLevel? expression SEMI
  static boolean insertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "INSERT");
    p = r; // pin = 1
    r = r && report_error_(b, insertStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean insertStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // soqlBlock | simpleLiteral
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = soqlBlock(b, l + 1);
    if (!r) r = simpleLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifier* typeRef variableDeclarators
  public static boolean localVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION, "<local variable declaration>");
    r = localVariableDeclaration_0(b, l + 1);
    r = r && typeRef(b, l + 1);
    r = r && variableDeclarators(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean localVariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "localVariableDeclaration_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：本地变量声明">> localVariableDeclaration SEMI <<use_for_debug "匹配成功：本地变量声明">>
  public static boolean localVariableDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclarationStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION_STATEMENT, "<local variable declaration statement>");
    r = use_for_debug(b, l + 1, "开始：本地变量声明");
    r = r && localVariableDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && use_for_debug(b, l + 1, "匹配成功：本地变量声明");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{" mapCreatorRestPair ("," mapCreatorRestPair )* "}"
  public static boolean mapCreatorRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapCreatorRest")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && mapCreatorRestPair(b, l + 1);
    r = r && mapCreatorRest_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MAP_CREATOR_REST, r);
    return r;
  }

  // ("," mapCreatorRestPair )*
  private static boolean mapCreatorRest_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapCreatorRest_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mapCreatorRest_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mapCreatorRest_2", c)) break;
    }
    return true;
  }

  // "," mapCreatorRestPair
  private static boolean mapCreatorRest_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapCreatorRest_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && mapCreatorRestPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr "=>" expr
  public static boolean mapCreatorRestPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapCreatorRestPair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_CREATOR_REST_PAIR, "<map creator rest pair>");
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, MAPTO);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：匹配成员声明">> constructorDeclaration
  // 	| fieldDeclaration
  // 	| methodDeclaration
  // //    | interfaceDeclaration
  //     | classDeclaration
  public static boolean memberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION, "<member declaration>");
    r = memberDeclaration_0(b, l + 1);
    if (!r) r = fieldDeclaration(b, l + 1);
    if (!r) r = methodDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<use_for_debug "开始：匹配成员声明">> constructorDeclaration
  private static boolean memberDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_for_debug(b, l + 1, "开始：匹配成员声明");
    r = r && constructorDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "MERGE" accessLevel? expression expression SEMI
  static boolean mergeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mergeStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "MERGE");
    p = r; // pin = 1
    r = r && report_error_(b, mergeStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean mergeStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mergeStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (  "VOID" | typeRef ) identifier formalParameters  ( block | SEMI ) <<use_for_debug "匹配成功:方法">>
  public static boolean methodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = methodDeclaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && formalParameters(b, l + 1);
    r = r && methodDeclaration_3(b, l + 1);
    r = r && use_for_debug(b, l + 1, "匹配成功:方法");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "VOID" | typeRef
  private static boolean methodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_0")) return false;
    boolean r;
    r = consumeToken(b, "VOID");
    if (!r) r = typeRef(b, l + 1);
    return r;
  }

  // block | SEMI
  private static boolean methodDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_3")) return false;
    boolean r;
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // annotation
  //     | "GLOBAL"
  //     | "PUBLIC"
  //     | "PROTECTED"
  //     | "PRIVATE"
  //     | "TRANSIENT"
  //     | "STATIC"
  //     | "ABSTRACT"
  //     | "FINAL"
  //     | "WEBSERVICE"
  //     | "OVERRIDE"
  //     | "VIRTUAL"
  //     | "TESTMETHOD"
  //     | sharingModifier
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = annotation(b, l + 1);
    if (!r) r = consumeToken(b, "GLOBAL");
    if (!r) r = consumeToken(b, "PUBLIC");
    if (!r) r = consumeToken(b, "PROTECTED");
    if (!r) r = consumeToken(b, "PRIVATE");
    if (!r) r = consumeToken(b, "TRANSIENT");
    if (!r) r = consumeToken(b, "STATIC");
    if (!r) r = consumeToken(b, "ABSTRACT");
    if (!r) r = consumeToken(b, "FINAL");
    if (!r) r = consumeToken(b, "WEBSERVICE");
    if (!r) r = consumeToken(b, "OVERRIDE");
    if (!r) r = consumeToken(b, "VIRTUAL");
    if (!r) r = consumeToken(b, "TESTMETHOD");
    if (!r) r = sharingModifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" expression ")"  <<use_for_debug "匹配成功：if语句的条件">>
  public static boolean parExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && use_for_debug(b, l + 1, "匹配成功：if语句的条件");
    exit_section_(b, m, PAR_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ("." identifier)*
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

  // ("." identifier)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // "." identifier
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始:return语句">> "RETURN" expression? ";"
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = use_for_debug(b, l + 1, "开始:return语句");
    r = r && consumeToken(b, "RETURN");
    p = r; // pin = 2
    r = r && report_error_(b, returnStatement_2(b, l + 1));
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expression?
  private static boolean returnStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "system.runas" "(" expressionList? ")" block
  static boolean runAsStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "runAsStatement")) return false;
    if (!nextTokenIs(b, SYSTEMRUNAS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SYSTEMRUNAS, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, runAsStatement_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expressionList?
  private static boolean runAsStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "runAsStatement_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "{" expr ("," ( expr ))* "}"
  public static boolean setCreatorRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setCreatorRest")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && expr(b, l + 1, -1);
    r = r && setCreatorRest_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SET_CREATOR_REST, r);
    return r;
  }

  // ("," ( expr ))*
  private static boolean setCreatorRest_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setCreatorRest_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!setCreatorRest_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setCreatorRest_2", c)) break;
    }
    return true;
  }

  // "," ( expr )
  private static boolean setCreatorRest_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setCreatorRest_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && setCreatorRest_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( expr )
  private static boolean setCreatorRest_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setCreatorRest_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("with" | "without" ) "sharing"
  static boolean sharingModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharingModifier")) return false;
    if (!nextTokenIs(b, "", WITH, WITHOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sharingModifier_0(b, l + 1);
    r = r && consumeToken(b, SHARING);
    exit_section_(b, m, null, r);
    return r;
  }

  // "with" | "without"
  private static boolean sharingModifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharingModifier_0")) return false;
    boolean r;
    r = consumeToken(b, WITH);
    if (!r) r = consumeToken(b, WITHOUT);
    return r;
  }

  /* ********************************************************** */
  // "NULL"
  //                        	| integerliteralpattern
  //                            | longliteralpattern
  //                            | numberliteralpattern
  //                            | SINGLEQUOTESTRINGLITERAL
  //                            | BooleanLiteral
  static boolean simpleLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleLiteral")) return false;
    boolean r;
    r = consumeToken(b, "NULL");
    if (!r) r = consumeToken(b, INTEGERLITERALPATTERN);
    if (!r) r = consumeToken(b, LONGLITERALPATTERN);
    if (!r) r = consumeToken(b, NUMBERLITERALPATTERN);
    if (!r) r = consumeToken(b, SINGLEQUOTESTRINGLITERAL);
    if (!r) r = BooleanLiteral(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "[" "SELECT" (identifier | "," | "(" | ")" | "{" | "}" | "<" | ">" | "=" | ":" | "." | "NEW" | simpleLiteral)* "]"
  public static boolean soqlBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "soqlBlock")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SOQL_BLOCK, null);
    r = consumeToken(b, LBRACK);
    r = r && consumeToken(b, "SELECT");
    p = r; // pin = 2
    r = r && report_error_(b, soqlBlock_2(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (identifier | "," | "(" | ")" | "{" | "}" | "<" | ">" | "=" | ":" | "." | "NEW" | simpleLiteral)*
  private static boolean soqlBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "soqlBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!soqlBlock_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "soqlBlock_2", c)) break;
    }
    return true;
  }

  // identifier | "," | "(" | ")" | "{" | "}" | "<" | ">" | "=" | ":" | "." | "NEW" | simpleLiteral
  private static boolean soqlBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "soqlBlock_2_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, "NEW");
    if (!r) r = simpleLiteral(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ifStatement
  //     | switchStatement
  //     | forStatement
  //     | whileStatement
  //     | doWhileStatement
  //     | tryStatement
  //     | returnStatement
  //     | throwStatement
  //     | breakStatement
  //     | continueStatement
  //     | insertStatement
  //     | updateStatement
  //     | deleteStatement
  //     | undeleteStatement
  //     | upsertStatement
  //     | mergeStatement
  //     | runAsStatement
  //     | block
  //     | localVariableDeclarationStatement
  //     | expressionStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = ifStatement(b, l + 1);
    if (!r) r = switchStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = doWhileStatement(b, l + 1);
    if (!r) r = tryStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = throwStatement(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = continueStatement(b, l + 1);
    if (!r) r = insertStatement(b, l + 1);
    if (!r) r = updateStatement(b, l + 1);
    if (!r) r = deleteStatement(b, l + 1);
    if (!r) r = undeleteStatement(b, l + 1);
    if (!r) r = upsertStatement(b, l + 1);
    if (!r) r = mergeStatement(b, l + 1);
    if (!r) r = runAsStatement(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = localVariableDeclarationStatement(b, l + 1);
    if (!r) r = expressionStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "SWITCH" "ON" expression "{" whenControl+ "}"
  public static boolean switchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STATEMENT, "<需要switch关键字>");
    r = consumeToken(b, "SWITCH");
    r = r && consumeToken(b, "ON");
    p = r; // pin = 2
    r = r && report_error_(b, expression(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LBRACE)) && r;
    r = p && report_error_(b, switchStatement_4(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // whenControl+
  private static boolean switchStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenControl(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!whenControl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switchStatement_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "THROW" expression SEMI
  static boolean throwStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "THROW");
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "TRY" block (catchClause+ finallyBlock? | finallyBlock)
  static boolean tryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "TRY");
    p = r; // pin = 1
    r = r && report_error_(b, block(b, l + 1));
    r = p && tryStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // catchClause+ finallyBlock? | finallyBlock
  private static boolean tryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStatement_2_0(b, l + 1);
    if (!r) r = finallyBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause+ finallyBlock?
  private static boolean tryStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStatement_2_0_0(b, l + 1);
    r = r && tryStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catchClause+
  private static boolean tryStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catchClause(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!catchClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tryStatement_2_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // finallyBlock?
  private static boolean tryStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2_0_1")) return false;
    finallyBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "<" typeList ">"
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, "<类型参数>", LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ARGUMENTS, "<类型参数>");
    r = consumeToken(b, LT);
    p = r; // pin = 1
    r = r && report_error_(b, typeList(b, l + 1));
    r = p && consumeToken(b, GT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // classDeclaration
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<typeDec>");
    r = classDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeRef ("," typeRef)*
  public static boolean typeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = typeRef(b, l + 1);
    r = r && typeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," typeRef)*
  private static boolean typeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeList_1", c)) break;
    }
    return true;
  }

  // "," typeRef
  private static boolean typeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "tryTypeName">> typeNameType typeArguments?
  public static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = use_for_debug(b, l + 1, "tryTypeName");
    r = r && typeNameType(b, l + 1);
    r = r && typeName_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeArguments?
  private static boolean typeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_2")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean typeNameType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeNameType")) return false;
    if (!nextTokenIs(b, "<参数的类型>", IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME_TYPE, "<参数的类型>");
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<use_for_debug "开始：类型声明">> typeName ("." typeName)* arraySubscripts
  static boolean typeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_for_debug(b, l + 1, "开始：类型声明");
    r = r && typeName(b, l + 1);
    r = r && typeRef_2(b, l + 1);
    r = r && arraySubscripts(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("." typeName)*
  private static boolean typeRef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeRef_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeRef_2", c)) break;
    }
    return true;
  }

  // "." typeName
  private static boolean typeRef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && typeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "UNDELETE" accessLevel? expression SEMI
  static boolean undeleteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undeleteStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "UNDELETE");
    p = r; // pin = 1
    r = r && report_error_(b, undeleteStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean undeleteStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undeleteStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "UPDATE" accessLevel? expression SEMI
  static boolean updateStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "updateStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "UPDATE");
    p = r; // pin = 1
    r = r && report_error_(b, updateStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean updateStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "updateStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "UPSERT" accessLevel? expression qualifiedName? SEMI
  static boolean upsertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upsertStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "UPSERT");
    p = r; // pin = 1
    r = r && report_error_(b, upsertStatement_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && report_error_(b, upsertStatement_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // accessLevel?
  private static boolean upsertStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upsertStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  // qualifiedName?
  private static boolean upsertStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upsertStatement_3")) return false;
    qualifiedName(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // variableDeclaratorId ("=" expression)?
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

  // ("=" expression)?
  private static boolean variableDeclarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator_1")) return false;
    variableDeclarator_1_0(b, l + 1);
    return true;
  }

  // "=" expression
  private static boolean variableDeclarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ('[' ']')* <<use_for_debug "匹配成功：变量声明left">>
  public static boolean variableDeclaratorId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaratorId")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && variableDeclaratorId_1(b, l + 1);
    r = r && use_for_debug(b, l + 1, "匹配成功：变量声明left");
    exit_section_(b, m, VARIABLE_DECLARATOR_ID, r);
    return r;
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
  // <<use_for_debug "开始：变量声明">> variableDeclarator ("," variableDeclarator)*
  public static boolean variableDeclarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATORS, "<variable declarators>");
    r = use_for_debug(b, l + 1, "开始：变量声明");
    r = r && variableDeclarator(b, l + 1);
    p = r; // pin = 2
    r = r && variableDeclarators_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," variableDeclarator)*
  private static boolean variableDeclarators_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableDeclarators_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclarators_2", c)) break;
    }
    return true;
  }

  // "," variableDeclarator
  private static boolean variableDeclarators_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variableDeclarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "WHEN" whenValue block
  public static boolean whenControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_CONTROL, "<when control>");
    r = consumeToken(b, "WHEN");
    r = r && whenValue(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ("-"|"+")* integerliteralpattern
  //     | ("-"|"+")* longliteralpattern
  //     | SINGLEQUOTESTRINGLITERAL
  //     | NULL
  //     | identifier
  //     // Salesforce tolerates paren pairs around each litersal,
  //     // although this is not explicitly documented.
  //     | "(" whenLiteral ")"
  public static boolean whenLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_LITERAL, "<when literal>");
    r = whenLiteral_0(b, l + 1);
    if (!r) r = whenLiteral_1(b, l + 1);
    if (!r) r = consumeToken(b, SINGLEQUOTESTRINGLITERAL);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = whenLiteral_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("-"|"+")* integerliteralpattern
  private static boolean whenLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral_0_0(b, l + 1);
    r = r && consumeToken(b, INTEGERLITERALPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("-"|"+")*
  private static boolean whenLiteral_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenLiteral_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenLiteral_0_0", c)) break;
    }
    return true;
  }

  // "-"|"+"
  private static boolean whenLiteral_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // ("-"|"+")* longliteralpattern
  private static boolean whenLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral_1_0(b, l + 1);
    r = r && consumeToken(b, LONGLITERALPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("-"|"+")*
  private static boolean whenLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenLiteral_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenLiteral_1_0", c)) break;
    }
    return true;
  }

  // "-"|"+"
  private static boolean whenLiteral_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // "(" whenLiteral ")"
  private static boolean whenLiteral_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && whenLiteral(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "ELSE"
  //     | whenLiteral ("," whenLiteral)*
  //     | typeRef identifier
  public static boolean whenValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_VALUE, "<when value>");
    r = consumeToken(b, "ELSE");
    if (!r) r = whenValue_1(b, l + 1);
    if (!r) r = whenValue_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // whenLiteral ("," whenLiteral)*
  private static boolean whenValue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral(b, l + 1);
    r = r && whenValue_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," whenLiteral)*
  private static boolean whenValue_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenValue_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenValue_1_1", c)) break;
    }
    return true;
  }

  // "," whenLiteral
  private static boolean whenValue_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && whenLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeRef identifier
  private static boolean whenValue_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeRef(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "WHILE" parExpression (statement | SEMI)
  static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "WHILE");
    p = r; // pin = 1
    r = r && report_error_(b, parExpression(b, l + 1));
    r = p && whileStatement_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statement | SEMI
  private static boolean whileStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_2")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: PREFIX(neg_expression_expr)
  // 1: ATOM(dot_expr)
  // 2: ATOM(methodCall_expr)
  // 3: ATOM(new_creator_expr)
  // 4: PREFIX(cast_expr)
  // 5: PREFIX(sub_expr)
  // 6: BINARY(question_expr)
  // 7: ATOM(multi_assign_expr)
  // 8: BINARY(array_expr)
  // 9: POSTFIX(inc_dec_expr)
  // 10: BINARY(mul_div_expr)
  // 11: BINARY(add_sub_expr)
  // 12: BINARY(lt_gt_expr)
  // 13: BINARY(lt_gt_assi_expr)
  // 14: POSTFIX(instance_expr)
  // 15: BINARY(logic_expr)
  // 16: BINARY(bit_and_expr)
  // 17: BINARY(caret_expr)
  // 18: BINARY(bitor_expr)
  // 19: BINARY(and_expr)
  // 20: BINARY(or_expr)
  // 21: BINARY(coal_expr)
  // 22: ATOM(literal_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = neg_expression_expr(b, l + 1);
    if (!r) r = dot_expr(b, l + 1);
    if (!r) r = methodCall_expr(b, l + 1);
    if (!r) r = new_creator_expr(b, l + 1);
    if (!r) r = cast_expr(b, l + 1);
    if (!r) r = sub_expr(b, l + 1);
    if (!r) r = multi_assign_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 6 && consumeTokenSmart(b, QUESTION)) {
        r = report_error_(b, expr(b, l, 5));
        r = question_expr_1(b, l + 1) && r;
        exit_section_(b, l, m, QUESTION_EXPR, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, LBRACK)) {
        r = report_error_(b, expr(b, l, 8));
        r = consumeToken(b, RBRACK) && r;
        exit_section_(b, l, m, ARRAY_EXPR, r, true, null);
      }
      else if (g < 9 && inc_dec_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INC_DEC_EXPR, r, true, null);
      }
      else if (g < 10 && mul_div_expr_0(b, l + 1)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, MUL_DIV_EXPR, r, true, null);
      }
      else if (g < 11 && add_sub_expr_0(b, l + 1)) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, ADD_SUB_EXPR, r, true, null);
      }
      else if (g < 12 && lt_gt_expr_0(b, l + 1)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, LT_GT_EXPR, r, true, null);
      }
      else if (g < 13 && lt_gt_assi_expr_0(b, l + 1)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, LT_GT_ASSI_EXPR, r, true, null);
      }
      else if (g < 14 && instance_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INSTANCE_EXPR, r, true, null);
      }
      else if (g < 15 && logic_expr_0(b, l + 1)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, LOGIC_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, BITAND)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, BIT_AND_EXPR, r, true, null);
      }
      else if (g < 17 && consumeTokenSmart(b, CARET)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, CARET_EXPR, r, true, null);
      }
      else if (g < 18 && consumeTokenSmart(b, BITOR)) {
        r = expr(b, l, 18);
        exit_section_(b, l, m, BITOR_EXPR, r, true, null);
      }
      else if (g < 19 && consumeTokenSmart(b, AND)) {
        r = expr(b, l, 19);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 20 && consumeTokenSmart(b, OR)) {
        r = expr(b, l, 20);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 21 && consumeTokenSmart(b, COAL)) {
        r = expr(b, l, 21);
        exit_section_(b, l, m, COAL_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean neg_expression_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "neg_expression_expr")) return false;
    if (!nextTokenIsSmart(b, BANG, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = neg_expression_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 0);
    exit_section_(b, l, m, NEG_EXPRESSION_EXPR, r, p, null);
    return r || p;
  }

  // "~"|"!"
  private static boolean neg_expression_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "neg_expression_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, TILDE);
    if (!r) r = consumeTokenSmart(b, BANG);
    return r;
  }

  // <<use_for_debug "开始：.调用表达式" >>
  // identifier  ( "." | "?.")  (expression |  anyId )*   <<use_for_debug "成功匹配：.调用表达式" >>
  public static boolean dot_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_EXPR, "<dotExpression>");
    r = use_for_debug(b, l + 1, "开始：.调用表达式");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && dot_expr_2(b, l + 1);
    r = r && dot_expr_3(b, l + 1);
    r = r && use_for_debug(b, l + 1, "成功匹配：.调用表达式");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "." | "?."
  private static boolean dot_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_2")) return false;
    boolean r;
    r = consumeTokenSmart(b, DOT);
    if (!r) r = consumeTokenSmart(b, QUESTIONDOT);
    return r;
  }

  // (expression |  anyId )*
  private static boolean dot_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dot_expr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dot_expr_3", c)) break;
    }
    return true;
  }

  // expression |  anyId
  private static boolean dot_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_3_0")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = anyId(b, l + 1);
    return r;
  }

  // <<use_for_debug "开始：函数调用">>  identifier "("  <<use_for_debug "函数调用的参数们">> expressionList? ")" expression?
  public static boolean methodCall_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METHOD_CALL_EXPR, "<函数调用>");
    r = use_for_debug(b, l + 1, "开始：函数调用");
    r = r && consumeTokensSmart(b, 2, IDENTIFIER, LPAREN);
    p = r; // pin = 3
    r = r && report_error_(b, use_for_debug(b, l + 1, "函数调用的参数们"));
    r = p && report_error_(b, methodCall_expr_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && methodCall_expr_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expressionList?
  private static boolean methodCall_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_4")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // expression?
  private static boolean methodCall_expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_6")) return false;
    expression(b, l + 1);
    return true;
  }

  // "NEW" creator
  public static boolean new_creator_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_creator_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NEW_CREATOR_EXPR, "<new creator expr>");
    r = consumeTokenSmart(b, "NEW");
    p = r; // pin = 1
    r = r && creator(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  public static boolean cast_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = cast_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 4);
    exit_section_(b, l, m, CAST_EXPR, r, p, null);
    return r || p;
  }

  // "(" typeRef ")"
  private static boolean cast_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && typeRef(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean sub_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sub_expr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && expr(b, l, 5);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, SUB_EXPR, r, p, null);
    return r || p;
  }

  // ":" expr
  private static boolean question_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "question_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<use_for_debug "开始匹配：赋值语句">> expr
  //   (   "="
  //       |   "+="
  //       |   "-="
  //       |   "*="
  //       |   "/="
  //       |   "&="
  //       |   "!="
  //       |   "^="
  //       |   ">>="
  //       |   ">>>="
  //       |   "<<="
  //   ) expr
  public static boolean multi_assign_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_assign_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_ASSIGN_EXPR, "<multi assign expr>");
    r = use_for_debug(b, l + 1, "开始匹配：赋值语句");
    r = r && expr(b, l + 1, -1);
    r = r && multi_assign_expr_2(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "="
  //       |   "+="
  //       |   "-="
  //       |   "*="
  //       |   "/="
  //       |   "&="
  //       |   "!="
  //       |   "^="
  //       |   ">>="
  //       |   ">>>="
  //       |   "<<="
  private static boolean multi_assign_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_assign_expr_2")) return false;
    boolean r;
    r = consumeTokenSmart(b, ASSIGN);
    if (!r) r = consumeTokenSmart(b, ADD_ASSIGN);
    if (!r) r = consumeTokenSmart(b, SUB_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MUL_ASSIGN);
    if (!r) r = consumeTokenSmart(b, DIV_ASSIGN);
    if (!r) r = consumeTokenSmart(b, AND_ASSIGN);
    if (!r) r = consumeTokenSmart(b, NOTEQUAL);
    if (!r) r = consumeTokenSmart(b, XOR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, RSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, URSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, LSHIFT_ASSIGN);
    return r;
  }

  // "++" | "--"
  private static boolean inc_dec_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inc_dec_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    return r;
  }

  // "*"|"/"
  private static boolean mul_div_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_div_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, MUL);
    if (!r) r = consumeTokenSmart(b, DIV);
    return r;
  }

  // "+"|"-"
  private static boolean add_sub_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_sub_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    return r;
  }

  // "<<" | ">>>" | ">>"
  private static boolean lt_gt_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, "<<");
    if (!r) r = consumeTokenSmart(b, ">>>");
    if (!r) r = consumeTokenSmart(b, ">>");
    return r;
  }

  // (">" | "<") ASSIGN?
  private static boolean lt_gt_assi_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_assi_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lt_gt_assi_expr_0_0(b, l + 1);
    r = r && lt_gt_assi_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ">" | "<"
  private static boolean lt_gt_assi_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_assi_expr_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, GT);
    if (!r) r = consumeTokenSmart(b, LT);
    return r;
  }

  // ASSIGN?
  private static boolean lt_gt_assi_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_assi_expr_0_1")) return false;
    consumeTokenSmart(b, ASSIGN);
    return true;
  }

  // "INSTANCEOF" typeRef
  private static boolean instance_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "INSTANCEOF");
    r = r && typeRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "===" | "!==" | "==" | "!=" | "<>"
  private static boolean logic_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logic_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, TRIPLEEQUAL);
    if (!r) r = consumeTokenSmart(b, TRIPLENOTEQUAL);
    if (!r) r = consumeTokenSmart(b, EQUAL);
    if (!r) r = consumeTokenSmart(b, NOTEQUAL);
    if (!r) r = consumeTokenSmart(b, LESSANDGREATER);
    return r;
  }

  // identifier | literal | classSomeThing <<use_for_debug "匹配成功：字面量">>
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeTokenSmart(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    if (!r) r = literal_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classSomeThing <<use_for_debug "匹配成功：字面量">>
  private static boolean literal_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classSomeThing(b, l + 1);
    r = r && use_for_debug(b, l + 1, "匹配成功：字面量");
    exit_section_(b, m, null, r);
    return r;
  }

}
