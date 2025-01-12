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
    create_token_set_(ADD_SUB_EXPR, AND_EXPR, BANG_EXPRESSION_EXPR, BITOR_EXPR,
      BIT_AND_EXPR, BRACK_EXPR, CARET_EXPR, COAL_EXPR,
      DOT_EXPR, EXPR, INC_DEC_EXPR, INSTANCE_EXPR,
      LOGIC_EXPR, LT_GT_ASSI_EXPR, LT_GT_EXPR, METHOD_CALL_EXPR,
      MULTI_ASSIGN_EXPR, MUL_DIV_EXPR, NEW_CREATOR_EXPR, OR_EXPR,
      PAREN_EXPR, PAREN_TYPEF_EXPR, PRIMARY_EXPR, QUESTION_EXPR,
      SIMPLE_REF_EXPR),
  };

  /* ********************************************************** */
  // "'TRUE'"|"'FALSE'"
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, "'TRUE'");
    if (!r) r = consumeToken(b, "'FALSE'");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // integerliteralpattern
  public static boolean IntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerLiteral")) return false;
    if (!nextTokenIs(b, INTEGERLITERALPATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGERLITERALPATTERN);
    exit_section_(b, m, INTEGER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // longliteralpattern
  public static boolean LongLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LongLiteral")) return false;
    if (!nextTokenIs(b, LONGLITERALPATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LONGLITERALPATTERN);
    exit_section_(b, m, LONG_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // numberliteralpattern
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    if (!nextTokenIs(b, NUMBERLITERALPATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBERLITERALPATTERN);
    exit_section_(b, m, NUMBER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // singlequotestringliteral
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, SINGLEQUOTESTRINGLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLEQUOTESTRINGLITERAL);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // "AS" ("SYSTEM" | "USER")
  public static boolean accessLevel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessLevel")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESS_LEVEL, "<access level>");
    r = consumeToken(b, "AS");
    r = r && accessLevel_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "SYSTEM" | "USER"
  private static boolean accessLevel_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessLevel_1")) return false;
    boolean r;
    r = consumeToken(b, "SYSTEM");
    if (!r) r = consumeToken(b, "USER");
    return r;
  }

  /* ********************************************************** */
  // ATSIGN qualifiedName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, ATSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, ANNOTATION, null);
    r = consumeToken(b, ATSIGN);
    r = r && qualifiedName(b, l + 1);
    r = r && annotation_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
  private static boolean annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_2")) return false;
    annotation_2_0(b, l + 1);
    return true;
  }

  // LPAREN ( elementValuePairs | elementValue )? RPAREN
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
  // "ABSTRACT"
  //     | "AFTER"
  //     | "BEFORE"
  //     | "BREAK"
  //     | "CATCH"
  //     | "CLASS"
  //     | "CONTINUE"
  //     | "DELETE"
  //     | "DO"
  //     | "ELSE"
  //     | "ENUM"
  //     | "EXTENDS"
  //     | "FINAL"
  //     | "FINALLY"
  //     | "FOR"
  //     | "GET"
  //     | "GLOBAL"
  //     | "IF"
  //     | "IMPLEMENTS"
  //     | "INHERITED"
  //     | "INSERT"
  //     | "INSTANCEOF"
  //     | "INTERFACE"
  //     | "LIST"
  //     | "MAP"
  //     | "MERGE"
  //     | "NEW"
  //     | "NULL"
  //     | "ON"
  //     | "OVERRIDE"
  //     | "PRIVATE"
  //     | "PROTECTED"
  //     | "PUBLIC"
  //     | "RETURN"
  //     | "SET"
  //     | "SHARING"
  //     | "STATIC"
  //     | "SUPER"
  //     | "SWITCH"
  //     | "TESTMETHOD"
  //     | "THIS"
  //     | "THROW"
  //     | "TRANSIENT"
  //     | "TRIGGER"
  //     | "TRY"
  //     | "UNDELETE"
  //     | "UPDATE"
  //     | "UPSERT"
  //     | "VIRTUAL"
  //     | "WEBSERVICE"
  //     | "WHEN"
  //     | "WHILE"
  //     | "WITH"
  //     | "WITHOUT"
  //     // DML Keywords
  //     | "USER"
  //     | "SYSTEM"
  //     // SOQL Values
  //     | "IntegralCurrencyLiteral"
  //     // SOQL Specific Keywords
  //     | "SELECT"
  //     | "COUNT"
  //     | "FROM"
  //     | "AS"
  //     | "USING"
  //     | "SCOPE"
  //     | "WHERE"
  //     | "ORDER"
  //     | "BY"
  //     | "LIMIT"
  //     | "SOQLAND"
  //     | "SOQLOR"
  //     | "NOT"
  //     | "AVG"
  //     | "COUNT_DISTINCT"
  //     | "MIN"
  //     | "MAX"
  //     | "SUM"
  //     | "TYPEOF"
  //     | "END"
  //     | "THEN"
  //     | "LIKE"
  //     | "IN"
  //     | "INCLUDES"
  //     | "EXCLUDES"
  //     | "ASC"
  //     | "DESC"
  //     | "NULLS"
  //     | "FIRST"
  //     | "LAST"
  //     | "GROUP"
  //     | "ALL"
  //     | "ROWS"
  //     | "VIEW"
  //     | "HAVING"
  //     | "ROLLUP"
  //     | "TOLABEL"
  //     | "OFFSET"
  //     | "DATA"
  //     | "CATEGORY"
  //     | "AT"
  //     | "ABOVE"
  //     | "BELOW"
  //     | "ABOVE_OR_BELOW"
  //     | "SECURITY_ENFORCED"
  //     | "SYSTEM_MODE"
  //     | "USER_MODE"
  //     | "REFERENCE"
  //     | "CUBE"
  //     | "FORMAT"
  //     | "TRACKING"
  //     | "VIEWSTAT"
  //     | "STANDARD"
  //     | "CUSTOM"
  //     | "DISTANCE"
  //     | "GEOLOCATION"
  //     | "GROUPING"
  //     | "CONVERT_CURRENCY"
  //     // SOQL date functions
  //     | "CALENDAR_MONTH"
  //     | "CALENDAR_QUARTER"
  //     | "CALENDAR_YEAR"
  //     | "DAY_IN_MONTH"
  //     | "DAY_IN_WEEK"
  //     | "DAY_IN_YEAR"
  //     | "DAY_ONLY"
  //     | "FISCAL_MONTH"
  //     | "FISCAL_QUARTER"
  //     | "FISCAL_YEAR"
  //     | "HOUR_IN_DAY"
  //     | "WEEK_IN_MONTH"
  //     | "WEEK_IN_YEAR"
  //     | "CONVERT_TIMEZONE"
  //     // SOQL date formulas
  //     | "YESTERDAY"
  //     | "TODAY"
  //     | "TOMORROW"
  //     | "LAST_WEEK"
  //     | "THIS_WEEK"
  //     | "NEXT_WEEK"
  //     | "LAST_MONTH"
  //     | "THIS_MONTH"
  //     | "NEXT_MONTH"
  //     | "LAST_90_DAYS"
  //     | "NEXT_90_DAYS"
  //     | "LAST_N_DAYS_N"
  //     | "NEXT_N_DAYS_N"
  //     | "N_DAYS_AGO_N"
  //     | "NEXT_N_WEEKS_N"
  //     | "LAST_N_WEEKS_N"
  //     | "N_WEEKS_AGO_N"
  //     | "NEXT_N_MONTHS_N"
  //     | "LAST_N_MONTHS_N"
  //     | "N_MONTHS_AGO_N"
  //     | "THIS_QUARTER"
  //     | "LAST_QUARTER"
  //     | "NEXT_QUARTER"
  //     | "NEXT_N_QUARTERS_N"
  //     | "LAST_N_QUARTERS_N"
  //     | "N_QUARTERS_AGO_N"
  //     | "THIS_YEAR"
  //     | "LAST_YEAR"
  //     | "NEXT_YEAR"
  //     | "NEXT_N_YEARS_N"
  //     | "LAST_N_YEARS_N"
  //     | "N_YEARS_AGO_N"
  //     | "THIS_FISCAL_QUARTER"
  //     | "LAST_FISCAL_QUARTER"
  //     | "NEXT_FISCAL_QUARTER"
  //     | "NEXT_N_FISCAL_QUARTERS_N"
  //     | "LAST_N_FISCAL_QUARTERS_N"
  //     | "N_FISCAL_QUARTERS_AGO_N"
  //     | "THIS_FISCAL_YEAR"
  //     | "LAST_FISCAL_YEAR"
  //     | "NEXT_FISCAL_YEAR"
  //     | "NEXT_N_FISCAL_YEARS_N"
  //     | "LAST_N_FISCAL_YEARS_N"
  //     | "N_FISCAL_YEARS_AGO_N"
  //     // SOSL Keywords
  //     | "FIND"
  //     | "EMAIL"
  //     | "NAME"
  //     | "PHONE"
  //     | "SIDEBAR"
  //     | "FIELDS"
  //     | "METADATA"
  //     | "PRICEBOOKID"
  //     | "NETWORK"
  //     | "SNIPPET"
  //     | "TARGET_LENGTH"
  //     | "DIVISION"
  //     | "RETURNING"
  //     | "LISTVIEW"
  //     | identifier
  public static boolean anyId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyId")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_ID, "<any id>");
    r = consumeToken(b, "ABSTRACT");
    if (!r) r = consumeToken(b, "AFTER");
    if (!r) r = consumeToken(b, "BEFORE");
    if (!r) r = consumeToken(b, "BREAK");
    if (!r) r = consumeToken(b, "CATCH");
    if (!r) r = consumeToken(b, "CLASS");
    if (!r) r = consumeToken(b, "CONTINUE");
    if (!r) r = consumeToken(b, "DELETE");
    if (!r) r = consumeToken(b, "DO");
    if (!r) r = consumeToken(b, "ELSE");
    if (!r) r = consumeToken(b, "ENUM");
    if (!r) r = consumeToken(b, "EXTENDS");
    if (!r) r = consumeToken(b, "FINAL");
    if (!r) r = consumeToken(b, "FINALLY");
    if (!r) r = consumeToken(b, "FOR");
    if (!r) r = consumeToken(b, "GET");
    if (!r) r = consumeToken(b, "GLOBAL");
    if (!r) r = consumeToken(b, "IF");
    if (!r) r = consumeToken(b, "IMPLEMENTS");
    if (!r) r = consumeToken(b, "INHERITED");
    if (!r) r = consumeToken(b, "INSERT");
    if (!r) r = consumeToken(b, "INSTANCEOF");
    if (!r) r = consumeToken(b, "INTERFACE");
    if (!r) r = consumeToken(b, "LIST");
    if (!r) r = consumeToken(b, "MAP");
    if (!r) r = consumeToken(b, "MERGE");
    if (!r) r = consumeToken(b, "NEW");
    if (!r) r = consumeToken(b, "NULL");
    if (!r) r = consumeToken(b, "ON");
    if (!r) r = consumeToken(b, "OVERRIDE");
    if (!r) r = consumeToken(b, "PRIVATE");
    if (!r) r = consumeToken(b, "PROTECTED");
    if (!r) r = consumeToken(b, "PUBLIC");
    if (!r) r = consumeToken(b, "RETURN");
    if (!r) r = consumeToken(b, "SET");
    if (!r) r = consumeToken(b, "SHARING");
    if (!r) r = consumeToken(b, "STATIC");
    if (!r) r = consumeToken(b, "SUPER");
    if (!r) r = consumeToken(b, "SWITCH");
    if (!r) r = consumeToken(b, "TESTMETHOD");
    if (!r) r = consumeToken(b, "THIS");
    if (!r) r = consumeToken(b, "THROW");
    if (!r) r = consumeToken(b, "TRANSIENT");
    if (!r) r = consumeToken(b, "TRIGGER");
    if (!r) r = consumeToken(b, "TRY");
    if (!r) r = consumeToken(b, "UNDELETE");
    if (!r) r = consumeToken(b, "UPDATE");
    if (!r) r = consumeToken(b, "UPSERT");
    if (!r) r = consumeToken(b, "VIRTUAL");
    if (!r) r = consumeToken(b, "WEBSERVICE");
    if (!r) r = consumeToken(b, "WHEN");
    if (!r) r = consumeToken(b, "WHILE");
    if (!r) r = consumeToken(b, "WITH");
    if (!r) r = consumeToken(b, "WITHOUT");
    if (!r) r = consumeToken(b, "USER");
    if (!r) r = consumeToken(b, "SYSTEM");
    if (!r) r = consumeToken(b, "IntegralCurrencyLiteral");
    if (!r) r = consumeToken(b, "SELECT");
    if (!r) r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "FROM");
    if (!r) r = consumeToken(b, "AS");
    if (!r) r = consumeToken(b, "USING");
    if (!r) r = consumeToken(b, "SCOPE");
    if (!r) r = consumeToken(b, "WHERE");
    if (!r) r = consumeToken(b, "ORDER");
    if (!r) r = consumeToken(b, "BY");
    if (!r) r = consumeToken(b, "LIMIT");
    if (!r) r = consumeToken(b, "SOQLAND");
    if (!r) r = consumeToken(b, "SOQLOR");
    if (!r) r = consumeToken(b, "NOT");
    if (!r) r = consumeToken(b, "AVG");
    if (!r) r = consumeToken(b, "COUNT_DISTINCT");
    if (!r) r = consumeToken(b, "MIN");
    if (!r) r = consumeToken(b, "MAX");
    if (!r) r = consumeToken(b, "SUM");
    if (!r) r = consumeToken(b, "TYPEOF");
    if (!r) r = consumeToken(b, "END");
    if (!r) r = consumeToken(b, "THEN");
    if (!r) r = consumeToken(b, "LIKE");
    if (!r) r = consumeToken(b, "IN");
    if (!r) r = consumeToken(b, "INCLUDES");
    if (!r) r = consumeToken(b, "EXCLUDES");
    if (!r) r = consumeToken(b, "ASC");
    if (!r) r = consumeToken(b, "DESC");
    if (!r) r = consumeToken(b, "NULLS");
    if (!r) r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "LAST");
    if (!r) r = consumeToken(b, "GROUP");
    if (!r) r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "ROWS");
    if (!r) r = consumeToken(b, "VIEW");
    if (!r) r = consumeToken(b, "HAVING");
    if (!r) r = consumeToken(b, "ROLLUP");
    if (!r) r = consumeToken(b, "TOLABEL");
    if (!r) r = consumeToken(b, "OFFSET");
    if (!r) r = consumeToken(b, "DATA");
    if (!r) r = consumeToken(b, "CATEGORY");
    if (!r) r = consumeToken(b, "AT");
    if (!r) r = consumeToken(b, "ABOVE");
    if (!r) r = consumeToken(b, "BELOW");
    if (!r) r = consumeToken(b, "ABOVE_OR_BELOW");
    if (!r) r = consumeToken(b, "SECURITY_ENFORCED");
    if (!r) r = consumeToken(b, "SYSTEM_MODE");
    if (!r) r = consumeToken(b, "USER_MODE");
    if (!r) r = consumeToken(b, "REFERENCE");
    if (!r) r = consumeToken(b, "CUBE");
    if (!r) r = consumeToken(b, "FORMAT");
    if (!r) r = consumeToken(b, "TRACKING");
    if (!r) r = consumeToken(b, "VIEWSTAT");
    if (!r) r = consumeToken(b, "STANDARD");
    if (!r) r = consumeToken(b, "CUSTOM");
    if (!r) r = consumeToken(b, "DISTANCE");
    if (!r) r = consumeToken(b, "GEOLOCATION");
    if (!r) r = consumeToken(b, "GROUPING");
    if (!r) r = consumeToken(b, "CONVERT_CURRENCY");
    if (!r) r = consumeToken(b, "CALENDAR_MONTH");
    if (!r) r = consumeToken(b, "CALENDAR_QUARTER");
    if (!r) r = consumeToken(b, "CALENDAR_YEAR");
    if (!r) r = consumeToken(b, "DAY_IN_MONTH");
    if (!r) r = consumeToken(b, "DAY_IN_WEEK");
    if (!r) r = consumeToken(b, "DAY_IN_YEAR");
    if (!r) r = consumeToken(b, "DAY_ONLY");
    if (!r) r = consumeToken(b, "FISCAL_MONTH");
    if (!r) r = consumeToken(b, "FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "FISCAL_YEAR");
    if (!r) r = consumeToken(b, "HOUR_IN_DAY");
    if (!r) r = consumeToken(b, "WEEK_IN_MONTH");
    if (!r) r = consumeToken(b, "WEEK_IN_YEAR");
    if (!r) r = consumeToken(b, "CONVERT_TIMEZONE");
    if (!r) r = consumeToken(b, "YESTERDAY");
    if (!r) r = consumeToken(b, "TODAY");
    if (!r) r = consumeToken(b, "TOMORROW");
    if (!r) r = consumeToken(b, "LAST_WEEK");
    if (!r) r = consumeToken(b, "THIS_WEEK");
    if (!r) r = consumeToken(b, "NEXT_WEEK");
    if (!r) r = consumeToken(b, "LAST_MONTH");
    if (!r) r = consumeToken(b, "THIS_MONTH");
    if (!r) r = consumeToken(b, "NEXT_MONTH");
    if (!r) r = consumeToken(b, "LAST_90_DAYS");
    if (!r) r = consumeToken(b, "NEXT_90_DAYS");
    if (!r) r = consumeToken(b, "LAST_N_DAYS_N");
    if (!r) r = consumeToken(b, "NEXT_N_DAYS_N");
    if (!r) r = consumeToken(b, "N_DAYS_AGO_N");
    if (!r) r = consumeToken(b, "NEXT_N_WEEKS_N");
    if (!r) r = consumeToken(b, "LAST_N_WEEKS_N");
    if (!r) r = consumeToken(b, "N_WEEKS_AGO_N");
    if (!r) r = consumeToken(b, "NEXT_N_MONTHS_N");
    if (!r) r = consumeToken(b, "LAST_N_MONTHS_N");
    if (!r) r = consumeToken(b, "N_MONTHS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_QUARTER");
    if (!r) r = consumeToken(b, "LAST_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_N_QUARTERS_N");
    if (!r) r = consumeToken(b, "LAST_N_QUARTERS_N");
    if (!r) r = consumeToken(b, "N_QUARTERS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_YEAR");
    if (!r) r = consumeToken(b, "LAST_YEAR");
    if (!r) r = consumeToken(b, "NEXT_YEAR");
    if (!r) r = consumeToken(b, "NEXT_N_YEARS_N");
    if (!r) r = consumeToken(b, "LAST_N_YEARS_N");
    if (!r) r = consumeToken(b, "N_YEARS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "LAST_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_N_FISCAL_QUARTERS_N");
    if (!r) r = consumeToken(b, "LAST_N_FISCAL_QUARTERS_N");
    if (!r) r = consumeToken(b, "N_FISCAL_QUARTERS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "LAST_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "NEXT_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "NEXT_N_FISCAL_YEARS_N");
    if (!r) r = consumeToken(b, "LAST_N_FISCAL_YEARS_N");
    if (!r) r = consumeToken(b, "N_FISCAL_YEARS_AGO_N");
    if (!r) r = consumeToken(b, "FIND");
    if (!r) r = consumeToken(b, "EMAIL");
    if (!r) r = consumeToken(b, "NAME");
    if (!r) r = consumeToken(b, "PHONE");
    if (!r) r = consumeToken(b, "SIDEBAR");
    if (!r) r = consumeToken(b, "FIELDS");
    if (!r) r = consumeToken(b, "METADATA");
    if (!r) r = consumeToken(b, "PRICEBOOKID");
    if (!r) r = consumeToken(b, "NETWORK");
    if (!r) r = consumeToken(b, "SNIPPET");
    if (!r) r = consumeToken(b, "TARGET_LENGTH");
    if (!r) r = consumeToken(b, "DIVISION");
    if (!r) r = consumeToken(b, "RETURNING");
    if (!r) r = consumeToken(b, "LISTVIEW");
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // classUnit | triggerUnit
  static boolean apexFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apexFile")) return false;
    boolean r;
    r = classUnit(b, l + 1);
    if (!r) r = triggerUnit(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN expressionList? RPAREN
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
  // LBRACK expr RBRACK | LBRACK RBRACK arrayInitializer?
  public static boolean arrayCreatorRest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayCreatorRest_0(b, l + 1);
    if (!r) r = arrayCreatorRest_1(b, l + 1);
    exit_section_(b, m, ARRAY_CREATOR_REST, r);
    return r;
  }

  // LBRACK expr RBRACK
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

  // LBRACK RBRACK arrayInitializer?
  private static boolean arrayCreatorRest_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    r = r && arrayCreatorRest_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayInitializer?
  private static boolean arrayCreatorRest_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreatorRest_1_2")) return false;
    arrayInitializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE (expr (COMMA expr)* (COMMA)? )? RBRACE
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

  // (expr (COMMA expr)* (COMMA)? )?
  private static boolean arrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1")) return false;
    arrayInitializer_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)* (COMMA)?
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

  // (COMMA expr)*
  private static boolean arrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean arrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA)?
  private static boolean arrayInitializer_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
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

  // statement*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "BREAK" SEMI
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, BREAK_STATEMENT, "<break statement>");
    r = consumeToken(b, "BREAK");
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "CATCH" LPAREN modifier* qualifiedName id RPAREN block
  public static boolean catchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CATCH_CLAUSE, "<catch clause>");
    r = consumeToken(b, "CATCH");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, catchClause_2(b, l + 1)) && r;
    r = p && report_error_(b, qualifiedName(b, l + 1)) && r;
    r = p && report_error_(b, id(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
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
  // LBRACE classBodyDeclaration* RBRACE
  public static boolean classBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, CLASS_BODY, null);
    r = consumeToken(b, LBRACE);
    r = r && classBody_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
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
  // SEMI
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
  // "CLASS" id ("EXTENDS" typeRef)? ("IMPLEMENTS" typeList)? classBody
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, CLASS_DECLARATION, "<class declaration>");
    r = consumeToken(b, "CLASS");
    r = r && id(b, l + 1);
    r = r && classDeclaration_2(b, l + 1);
    r = r && classDeclaration_3(b, l + 1);
    r = r && classBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("EXTENDS" typeRef)?
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    classDeclaration_2_0(b, l + 1);
    return true;
  }

  // "EXTENDS" typeRef
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
  // typeDeclaration
  public static boolean classUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_UNIT, "<class unit>");
    r = typeDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qualifiedName formalParameters block
  public static boolean constructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    r = qualifiedName(b, l + 1);
    r = r && formalParameters(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "CONTINUE" SEMI
  public static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, CONTINUE_STATEMENT, "<continue statement>");
    r = consumeToken(b, "CONTINUE");
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // idCreatedNamePair (DOT idCreatedNamePair)*
  public static boolean createdName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATED_NAME, "<created name>");
    r = idCreatedNamePair(b, l + 1);
    r = r && createdName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT idCreatedNamePair)*
  private static boolean createdName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createdName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createdName_1", c)) break;
    }
    return true;
  }

  // DOT idCreatedNamePair
  private static boolean createdName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createdName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && idCreatedNamePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // createdName ( LBRACE RBRACE | arguments | arrayCreatorRest | mapCreatorRest | setCreatorRest)
  public static boolean creator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATOR, "<creator>");
    r = createdName(b, l + 1);
    r = r && creator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE RBRACE | arguments | arrayCreatorRest | mapCreatorRest | setCreatorRest
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
  public static boolean deleteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, DELETE_STATEMENT, "<delete statement>");
    r = consumeToken(b, "DELETE");
    r = r && deleteStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessLevel?
  private static boolean deleteStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "DO" block "WHILE" parExpression SEMI
  public static boolean doWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, DO_WHILE_STATEMENT, "<do while statement>");
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
  // anyId LPAREN expressionList? RPAREN
  public static boolean dotMethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotMethodCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_METHOD_CALL, "<dot method call>");
    r = anyId(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && dotMethodCall_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expressionList?
  private static boolean dotMethodCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotMethodCall_2")) return false;
    expressionList(b, l + 1);
    return true;
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
  // LBRACE (elementValue (COMMA elementValue)*)? (COMMA)? RBRACE
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

  // (elementValue (COMMA elementValue)*)?
  private static boolean elementValueArrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1")) return false;
    elementValueArrayInitializer_1_0(b, l + 1);
    return true;
  }

  // elementValue (COMMA elementValue)*
  private static boolean elementValueArrayInitializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValue(b, l + 1);
    r = r && elementValueArrayInitializer_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA elementValue)*
  private static boolean elementValueArrayInitializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValueArrayInitializer_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValueArrayInitializer_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA elementValue
  private static boolean elementValueArrayInitializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && elementValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA)?
  private static boolean elementValueArrayInitializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValueArrayInitializer_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // id ASSIGN elementValue
  public static boolean elementValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_VALUE_PAIR, "<element value pair>");
    r = id(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && elementValue(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // elementValuePair (COMMA? elementValuePair)*
  public static boolean elementValuePairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_VALUE_PAIRS, "<element value pairs>");
    r = elementValuePair(b, l + 1);
    r = r && elementValuePairs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? elementValuePair)*
  private static boolean elementValuePairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elementValuePairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementValuePairs_1", c)) break;
    }
    return true;
  }

  // COMMA? elementValuePair
  private static boolean elementValuePairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementValuePairs_1_0_0(b, l + 1);
    r = r && elementValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean elementValuePairs_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementValuePairs_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // typeRef id COLON expression
  public static boolean enhancedForControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enhancedForControl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_ | _UPPER_, ENHANCED_FOR_CONTROL, "<enhanced for control>");
    r = typeRef(b, l + 1);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id (COMMA id)*
  public static boolean enumConstants(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_CONSTANTS, "<enum constants>");
    r = id(b, l + 1);
    r = r && enumConstants_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA id)*
  private static boolean enumConstants_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumConstants_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumConstants_1", c)) break;
    }
    return true;
  }

  // COMMA id
  private static boolean enumConstants_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumConstants_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENUM id LBRACE enumConstants? RBRACE
  public static boolean enumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, ENUM_DECLARATION, null);
    r = consumeToken(b, ENUM);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && enumDeclaration_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // enumConstants?
  private static boolean enumDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_3")) return false;
    enumConstants(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, EXPRESSION, "<expression>");
    r = expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr (COMMA expr)*
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expr(b, l + 1, -1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expr)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression SEMI
  public static boolean expressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeRef variableDeclarators SEMI
  public static boolean fieldDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, FIELD_DECLARATION, "<field declaration>");
    r = typeRef(b, l + 1);
    r = r && variableDeclarators(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "FINALLY" block
  public static boolean finallyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyBlock")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FINALLY_BLOCK, "<finally block>");
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
    Marker m = enter_section_(b, l, _UPPER_, FOR_CONTROL, "<for control>");
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
  // "FOR" LPAREN forControl RPAREN (statement | SEMI)
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_ | _UPPER_, FOR_STATEMENT, "<for statement>");
    r = consumeToken(b, "FOR");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LPAREN));
    r = p && report_error_(b, forControl(b, l + 1)) && r;
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
  // modifier* typeRef id
  public static boolean formalParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    r = formalParameter_0(b, l + 1);
    r = r && typeRef(b, l + 1);
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean formalParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameter_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameter_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // formalParameter (COMMA formalParameter)*
  public static boolean formalParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = formalParameter(b, l + 1);
    r = r && formalParameterList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA formalParameter)*
  private static boolean formalParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formalParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formalParameterList_1", c)) break;
    }
    return true;
  }

  // COMMA formalParameter
  private static boolean formalParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && formalParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN formalParameterList? RPAREN
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
  // "GET" (SEMI | block)
  public static boolean getter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETTER, "<getter>");
    r = consumeToken(b, "GET");
    r = r && getter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMI | block
  private static boolean getter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_1")) return false;
    boolean r;
    r = consumeToken(b, SEMI);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "AFTER"
  //     | "BEFORE"
  //     | "GET"
  //     | "INHERITED"
  //     | "INSTANCEOF"
  //     | "SET"
  //     | "SHARING"
  //     | "SWITCH"
  //     | "TRANSIENT"
  //     | "TRIGGER"
  //     | "WHEN"
  //     | "WITH"
  //     | "WITHOUT"
  //     // DML Keywords
  //     | "USER"
  //     | "SYSTEM"
  //     // SOQL Values
  //     | "IntegralCurrencyLiteral"
  //     // SOQL Specific Keywords
  //     | "SELECT"
  //     | "COUNT"
  //     | "FROM"
  //     | "AS"
  //     | "USING"
  //     | "SCOPE"
  //     | "WHERE"
  //     | "ORDER"
  //     | "BY"
  //     | "LIMIT"
  //     | "SOQLAND"
  //     | "SOQLOR"
  //     | "NOT"
  //     | "AVG"
  //     | "COUNT_DISTINCT"
  //     | "MIN"
  //     | "MAX"
  //     | "SUM"
  //     | "TYPEOF"
  //     | "END"
  //     | "THEN"
  //     | "LIKE"
  //     | "IN"
  //     | "INCLUDES"
  //     | "EXCLUDES"
  //     | "ASC"
  //     | "DESC"
  //     | "NULLS"
  //     | "FIRST"
  //     | "LAST"
  //     | "GROUP"
  //     | "ALL"
  //     | "ROWS"
  //     | "VIEW"
  //     | "HAVING"
  //     | "ROLLUP"
  //     | "TOLABEL"
  //     | "OFFSET"
  //     | "DATA"
  //     | "CATEGORY"
  //     | "AT"
  //     | "ABOVE"
  //     | "BELOW"
  //     | "ABOVE_OR_BELOW"
  //     | "SECURITY_ENFORCED"
  //     | "USER_MODE"
  //     | "SYSTEM_MODE"
  //     | "REFERENCE"
  //     | "CUBE"
  //     | "FORMAT"
  //     | "TRACKING"
  //     | "VIEWSTAT"
  //     | "STANDARD"
  //     | "CUSTOM"
  //     | "DISTANCE"
  //     | "GEOLOCATION"
  //     | "GROUPING"
  //     | "CONVERT_CURRENCY"
  //     // SOQL date functions
  //     | "CALENDAR_MONTH"
  //     | "CALENDAR_QUARTER"
  //     | "CALENDAR_YEAR"
  //     | "DAY_IN_MONTH"
  //     | "DAY_IN_WEEK"
  //     | "DAY_IN_YEAR"
  //     | "DAY_ONLY"
  //     | "FISCAL_MONTH"
  //     | "FISCAL_QUARTER"
  //     | "FISCAL_YEAR"
  //     | "HOUR_IN_DAY"
  //     | "WEEK_IN_MONTH"
  //     | "WEEK_IN_YEAR"
  //     | "CONVERT_TIMEZONE"
  //     // SOQL date formulas
  //     | "YESTERDAY"
  //     | "TODAY"
  //     | "TOMORROW"
  //     | "LAST_WEEK"
  //     | "THIS_WEEK"
  //     | "NEXT_WEEK"
  //     | "LAST_MONTH"
  //     | "THIS_MONTH"
  //     | "NEXT_MONTH"
  //     | "LAST_90_DAYS"
  //     | "NEXT_90_DAYS"
  //     | "LAST_N_DAYS_N"
  //     | "NEXT_N_DAYS_N"
  //     | "N_DAYS_AGO_N"
  //     | "NEXT_N_WEEKS_N"
  //     | "LAST_N_WEEKS_N"
  //     | "N_WEEKS_AGO_N"
  //     | "NEXT_N_MONTHS_N"
  //     | "LAST_N_MONTHS_N"
  //     | "N_MONTHS_AGO_N"
  //     | "THIS_QUARTER"
  //     | "LAST_QUARTER"
  //     | "NEXT_QUARTER"
  //     | "NEXT_N_QUARTERS_N"
  //     | "LAST_N_QUARTERS_N"
  //     | "N_QUARTERS_AGO_N"
  //     | "THIS_YEAR"
  //     | "LAST_YEAR"
  //     | "NEXT_YEAR"
  //     | "NEXT_N_YEARS_N"
  //     | "LAST_N_YEARS_N"
  //     | "N_YEARS_AGO_N"
  //     | "THIS_FISCAL_QUARTER"
  //     | "LAST_FISCAL_QUARTER"
  //     | "NEXT_FISCAL_QUARTER"
  //     | "NEXT_N_FISCAL_QUARTERS_N"
  //     | "LAST_N_FISCAL_QUARTERS_N"
  //     | "N_FISCAL_QUARTERS_AGO_N"
  //     | "THIS_FISCAL_YEAR"
  //     | "LAST_FISCAL_YEAR"
  //     | "NEXT_FISCAL_YEAR"
  //     | "NEXT_N_FISCAL_YEARS_N"
  //     | "LAST_N_FISCAL_YEARS_N"
  //     | "N_FISCAL_YEARS_AGO_N"
  //     // SOSL Keywords
  //     | "FIND"
  //     | "EMAIL"
  //     | "NAME"
  //     | "PHONE"
  //     | "SIDEBAR"
  //     | "FIELDS"
  //     | "METADATA"
  //     | "PRICEBOOKID"
  //     | "NETWORK"
  //     | "SNIPPET"
  //     | "TARGET_LENGTH"
  //     | "DIVISION"
  //     | "RETURNING"
  //     | "LISTVIEW"
  //     | identifier
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = consumeToken(b, "AFTER");
    if (!r) r = consumeToken(b, "BEFORE");
    if (!r) r = consumeToken(b, "GET");
    if (!r) r = consumeToken(b, "INHERITED");
    if (!r) r = consumeToken(b, "INSTANCEOF");
    if (!r) r = consumeToken(b, "SET");
    if (!r) r = consumeToken(b, "SHARING");
    if (!r) r = consumeToken(b, "SWITCH");
    if (!r) r = consumeToken(b, "TRANSIENT");
    if (!r) r = consumeToken(b, "TRIGGER");
    if (!r) r = consumeToken(b, "WHEN");
    if (!r) r = consumeToken(b, "WITH");
    if (!r) r = consumeToken(b, "WITHOUT");
    if (!r) r = consumeToken(b, "USER");
    if (!r) r = consumeToken(b, "SYSTEM");
    if (!r) r = consumeToken(b, "IntegralCurrencyLiteral");
    if (!r) r = consumeToken(b, "SELECT");
    if (!r) r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "FROM");
    if (!r) r = consumeToken(b, "AS");
    if (!r) r = consumeToken(b, "USING");
    if (!r) r = consumeToken(b, "SCOPE");
    if (!r) r = consumeToken(b, "WHERE");
    if (!r) r = consumeToken(b, "ORDER");
    if (!r) r = consumeToken(b, "BY");
    if (!r) r = consumeToken(b, "LIMIT");
    if (!r) r = consumeToken(b, "SOQLAND");
    if (!r) r = consumeToken(b, "SOQLOR");
    if (!r) r = consumeToken(b, "NOT");
    if (!r) r = consumeToken(b, "AVG");
    if (!r) r = consumeToken(b, "COUNT_DISTINCT");
    if (!r) r = consumeToken(b, "MIN");
    if (!r) r = consumeToken(b, "MAX");
    if (!r) r = consumeToken(b, "SUM");
    if (!r) r = consumeToken(b, "TYPEOF");
    if (!r) r = consumeToken(b, "END");
    if (!r) r = consumeToken(b, "THEN");
    if (!r) r = consumeToken(b, "LIKE");
    if (!r) r = consumeToken(b, "IN");
    if (!r) r = consumeToken(b, "INCLUDES");
    if (!r) r = consumeToken(b, "EXCLUDES");
    if (!r) r = consumeToken(b, "ASC");
    if (!r) r = consumeToken(b, "DESC");
    if (!r) r = consumeToken(b, "NULLS");
    if (!r) r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "LAST");
    if (!r) r = consumeToken(b, "GROUP");
    if (!r) r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "ROWS");
    if (!r) r = consumeToken(b, "VIEW");
    if (!r) r = consumeToken(b, "HAVING");
    if (!r) r = consumeToken(b, "ROLLUP");
    if (!r) r = consumeToken(b, "TOLABEL");
    if (!r) r = consumeToken(b, "OFFSET");
    if (!r) r = consumeToken(b, "DATA");
    if (!r) r = consumeToken(b, "CATEGORY");
    if (!r) r = consumeToken(b, "AT");
    if (!r) r = consumeToken(b, "ABOVE");
    if (!r) r = consumeToken(b, "BELOW");
    if (!r) r = consumeToken(b, "ABOVE_OR_BELOW");
    if (!r) r = consumeToken(b, "SECURITY_ENFORCED");
    if (!r) r = consumeToken(b, "USER_MODE");
    if (!r) r = consumeToken(b, "SYSTEM_MODE");
    if (!r) r = consumeToken(b, "REFERENCE");
    if (!r) r = consumeToken(b, "CUBE");
    if (!r) r = consumeToken(b, "FORMAT");
    if (!r) r = consumeToken(b, "TRACKING");
    if (!r) r = consumeToken(b, "VIEWSTAT");
    if (!r) r = consumeToken(b, "STANDARD");
    if (!r) r = consumeToken(b, "CUSTOM");
    if (!r) r = consumeToken(b, "DISTANCE");
    if (!r) r = consumeToken(b, "GEOLOCATION");
    if (!r) r = consumeToken(b, "GROUPING");
    if (!r) r = consumeToken(b, "CONVERT_CURRENCY");
    if (!r) r = consumeToken(b, "CALENDAR_MONTH");
    if (!r) r = consumeToken(b, "CALENDAR_QUARTER");
    if (!r) r = consumeToken(b, "CALENDAR_YEAR");
    if (!r) r = consumeToken(b, "DAY_IN_MONTH");
    if (!r) r = consumeToken(b, "DAY_IN_WEEK");
    if (!r) r = consumeToken(b, "DAY_IN_YEAR");
    if (!r) r = consumeToken(b, "DAY_ONLY");
    if (!r) r = consumeToken(b, "FISCAL_MONTH");
    if (!r) r = consumeToken(b, "FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "FISCAL_YEAR");
    if (!r) r = consumeToken(b, "HOUR_IN_DAY");
    if (!r) r = consumeToken(b, "WEEK_IN_MONTH");
    if (!r) r = consumeToken(b, "WEEK_IN_YEAR");
    if (!r) r = consumeToken(b, "CONVERT_TIMEZONE");
    if (!r) r = consumeToken(b, "YESTERDAY");
    if (!r) r = consumeToken(b, "TODAY");
    if (!r) r = consumeToken(b, "TOMORROW");
    if (!r) r = consumeToken(b, "LAST_WEEK");
    if (!r) r = consumeToken(b, "THIS_WEEK");
    if (!r) r = consumeToken(b, "NEXT_WEEK");
    if (!r) r = consumeToken(b, "LAST_MONTH");
    if (!r) r = consumeToken(b, "THIS_MONTH");
    if (!r) r = consumeToken(b, "NEXT_MONTH");
    if (!r) r = consumeToken(b, "LAST_90_DAYS");
    if (!r) r = consumeToken(b, "NEXT_90_DAYS");
    if (!r) r = consumeToken(b, "LAST_N_DAYS_N");
    if (!r) r = consumeToken(b, "NEXT_N_DAYS_N");
    if (!r) r = consumeToken(b, "N_DAYS_AGO_N");
    if (!r) r = consumeToken(b, "NEXT_N_WEEKS_N");
    if (!r) r = consumeToken(b, "LAST_N_WEEKS_N");
    if (!r) r = consumeToken(b, "N_WEEKS_AGO_N");
    if (!r) r = consumeToken(b, "NEXT_N_MONTHS_N");
    if (!r) r = consumeToken(b, "LAST_N_MONTHS_N");
    if (!r) r = consumeToken(b, "N_MONTHS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_QUARTER");
    if (!r) r = consumeToken(b, "LAST_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_N_QUARTERS_N");
    if (!r) r = consumeToken(b, "LAST_N_QUARTERS_N");
    if (!r) r = consumeToken(b, "N_QUARTERS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_YEAR");
    if (!r) r = consumeToken(b, "LAST_YEAR");
    if (!r) r = consumeToken(b, "NEXT_YEAR");
    if (!r) r = consumeToken(b, "NEXT_N_YEARS_N");
    if (!r) r = consumeToken(b, "LAST_N_YEARS_N");
    if (!r) r = consumeToken(b, "N_YEARS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "LAST_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_FISCAL_QUARTER");
    if (!r) r = consumeToken(b, "NEXT_N_FISCAL_QUARTERS_N");
    if (!r) r = consumeToken(b, "LAST_N_FISCAL_QUARTERS_N");
    if (!r) r = consumeToken(b, "N_FISCAL_QUARTERS_AGO_N");
    if (!r) r = consumeToken(b, "THIS_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "LAST_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "NEXT_FISCAL_YEAR");
    if (!r) r = consumeToken(b, "NEXT_N_FISCAL_YEARS_N");
    if (!r) r = consumeToken(b, "LAST_N_FISCAL_YEARS_N");
    if (!r) r = consumeToken(b, "N_FISCAL_YEARS_AGO_N");
    if (!r) r = consumeToken(b, "FIND");
    if (!r) r = consumeToken(b, "EMAIL");
    if (!r) r = consumeToken(b, "NAME");
    if (!r) r = consumeToken(b, "PHONE");
    if (!r) r = consumeToken(b, "SIDEBAR");
    if (!r) r = consumeToken(b, "FIELDS");
    if (!r) r = consumeToken(b, "METADATA");
    if (!r) r = consumeToken(b, "PRICEBOOKID");
    if (!r) r = consumeToken(b, "NETWORK");
    if (!r) r = consumeToken(b, "SNIPPET");
    if (!r) r = consumeToken(b, "TARGET_LENGTH");
    if (!r) r = consumeToken(b, "DIVISION");
    if (!r) r = consumeToken(b, "RETURNING");
    if (!r) r = consumeToken(b, "LISTVIEW");
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // anyId (LT typeList GT)?
  public static boolean idCreatedNamePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idCreatedNamePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_CREATED_NAME_PAIR, "<id created name pair>");
    r = anyId(b, l + 1);
    r = r && idCreatedNamePair_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LT typeList GT)?
  private static boolean idCreatedNamePair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idCreatedNamePair_1")) return false;
    idCreatedNamePair_1_0(b, l + 1);
    return true;
  }

  // LT typeList GT
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
  // "IF" parExpression statement ("ELSE" statement)?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _UPPER_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "IF");
    p = r; // pin = 1
    r = r && report_error_(b, parExpression(b, l + 1));
    r = p && report_error_(b, statement(b, l + 1)) && r;
    r = p && ifStatement_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("ELSE" statement)?
  private static boolean ifStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_3")) return false;
    ifStatement_3_0(b, l + 1);
    return true;
  }

  // "ELSE" statement
  private static boolean ifStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ELSE");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "INSERT" accessLevel? expression SEMI
  public static boolean insertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, INSERT_STATEMENT, "<insert statement>");
    r = consumeToken(b, "INSERT");
    r = r && insertStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessLevel?
  private static boolean insertStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE interfaceMethodDeclaration* RBRACE
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

  // interfaceMethodDeclaration*
  private static boolean interfaceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceBody_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interfaceMethodDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceBody_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "INTERFACE" id ("EXTENDS" typeList)? interfaceBody
  public static boolean interfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, INTERFACE_DECLARATION, "<interface declaration>");
    r = consumeToken(b, "INTERFACE");
    r = r && id(b, l + 1);
    r = r && interfaceDeclaration_2(b, l + 1);
    r = r && interfaceBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("EXTENDS" typeList)?
  private static boolean interfaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2")) return false;
    interfaceDeclaration_2_0(b, l + 1);
    return true;
  }

  // "EXTENDS" typeList
  private static boolean interfaceDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTENDS");
    r = r && typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* (typeRef|"VOID") id formalParameters SEMI
  public static boolean interfaceMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_METHOD_DECLARATION, "<interface method declaration>");
    r = interfaceMethodDeclaration_0(b, l + 1);
    r = r && interfaceMethodDeclaration_1(b, l + 1);
    r = r && id(b, l + 1);
    r = r && formalParameters(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean interfaceMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interfaceMethodDeclaration_0", c)) break;
    }
    return true;
  }

  // typeRef|"VOID"
  private static boolean interfaceMethodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceMethodDeclaration_1")) return false;
    boolean r;
    r = typeRef(b, l + 1);
    if (!r) r = consumeToken(b, "VOID");
    return r;
  }

  /* ********************************************************** */
  // "NULL"
  // 	| IntegerLiteral
  //     | LongLiteral
  //     | NumberLiteral
  //     | StringLiteral
  //     | BooleanLiteral
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, "NULL");
    if (!r) r = IntegerLiteral(b, l + 1);
    if (!r) r = LongLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
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
  // localVariableDeclaration SEMI
  public static boolean localVariableDeclarationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localVariableDeclarationStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, LOCAL_VARIABLE_DECLARATION_STATEMENT, "<local variable declaration statement>");
    r = localVariableDeclaration(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE mapCreatorRestPair (COMMA mapCreatorRestPair )* RBRACE
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

  // (COMMA mapCreatorRestPair )*
  private static boolean mapCreatorRest_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapCreatorRest_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mapCreatorRest_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mapCreatorRest_2", c)) break;
    }
    return true;
  }

  // COMMA mapCreatorRestPair
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
  // expr MAPTO expr
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
  // methodDeclaration
  //     | fieldDeclaration
  //     | constructorDeclaration
  //     | interfaceDeclaration
  //     | classDeclaration
  //     | enumDeclaration
  //     | propertyDeclaration
  public static boolean memberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION, "<member declaration>");
    r = methodDeclaration(b, l + 1);
    if (!r) r = fieldDeclaration(b, l + 1);
    if (!r) r = constructorDeclaration(b, l + 1);
    if (!r) r = interfaceDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    if (!r) r = enumDeclaration(b, l + 1);
    if (!r) r = propertyDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "MERGE" accessLevel? expression expression SEMI
  public static boolean mergeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mergeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, MERGE_STATEMENT, "<merge statement>");
    r = consumeToken(b, "MERGE");
    r = r && mergeStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessLevel?
  private static boolean mergeStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mergeStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( typeRef | "VOID") id formalParameters ( block | SEMI )
  public static boolean methodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, METHOD_DECLARATION, "<method declaration>");
    r = methodDeclaration_0(b, l + 1);
    r = r && id(b, l + 1);
    r = r && formalParameters(b, l + 1);
    r = r && methodDeclaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeRef | "VOID"
  private static boolean methodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_0")) return false;
    boolean r;
    r = typeRef(b, l + 1);
    if (!r) r = consumeToken(b, "VOID");
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
  //     | "WITH" "SHARING"
  //     | "WITHOUT" "SHARING"
  //     | "INHERITED" "SHARING"
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
    if (!r) r = modifier_13(b, l + 1);
    if (!r) r = modifier_14(b, l + 1);
    if (!r) r = modifier_15(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "WITH" "SHARING"
  private static boolean modifier_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WITH");
    r = r && consumeToken(b, "SHARING");
    exit_section_(b, m, null, r);
    return r;
  }

  // "WITHOUT" "SHARING"
  private static boolean modifier_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WITHOUT");
    r = r && consumeToken(b, "SHARING");
    exit_section_(b, m, null, r);
    return r;
  }

  // "INHERITED" "SHARING"
  private static boolean modifier_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "INHERITED");
    r = r && consumeToken(b, "SHARING");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN expression RPAREN
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
  // "THIS"
  //     | "SUPER"
  //     | literal
  //     | typeRef DOT "CLASS"
  //     | "VOID" DOT "CLASS"
  //     | id
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = consumeToken(b, "THIS");
    if (!r) r = consumeToken(b, "SUPER");
    if (!r) r = literal(b, l + 1);
    if (!r) r = primary_3(b, l + 1);
    if (!r) r = primary_4(b, l + 1);
    if (!r) r = id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeRef DOT "CLASS"
  private static boolean primary_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeRef(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "CLASS");
    exit_section_(b, m, null, r);
    return r;
  }

  // "VOID" DOT "CLASS"
  private static boolean primary_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "VOID");
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "CLASS");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* (getter | setter)
  public static boolean propertyBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_BLOCK, "<property block>");
    r = propertyBlock_0(b, l + 1);
    r = r && propertyBlock_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean propertyBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBlock_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "propertyBlock_0", c)) break;
    }
    return true;
  }

  // getter | setter
  private static boolean propertyBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyBlock_1")) return false;
    boolean r;
    r = getter(b, l + 1);
    if (!r) r = setter(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // typeRef id LBRACE propertyBlock* RBRACE
  public static boolean propertyDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, PROPERTY_DECLARATION, "<property declaration>");
    r = typeRef(b, l + 1);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && propertyDeclaration_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // propertyBlock*
  private static boolean propertyDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propertyDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!propertyBlock(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "propertyDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id (DOT id)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_NAME, "<qualified name>");
    r = id(b, l + 1);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT id)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // DOT id
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "RETURN" expression? SEMI
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, RETURN_STATEMENT, "<return statement>");
    r = consumeToken(b, "RETURN");
    r = r && returnStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "system.runas" LPAREN expressionList? RPAREN block
  public static boolean runAsStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "runAsStatement")) return false;
    if (!nextTokenIs(b, SYSTEMRUNAS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, RUN_AS_STATEMENT, null);
    r = consumeTokens(b, 0, SYSTEMRUNAS, LPAREN);
    r = r && runAsStatement_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expressionList?
  private static boolean runAsStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "runAsStatement_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE expr (COMMA ( expr ))* RBRACE
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

  // (COMMA ( expr ))*
  private static boolean setCreatorRest_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setCreatorRest_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!setCreatorRest_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setCreatorRest_2", c)) break;
    }
    return true;
  }

  // COMMA ( expr )
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
  // "SET" (SEMI | block)
  public static boolean setter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTER, "<setter>");
    r = consumeToken(b, "SET");
    r = r && setter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMI | block
  private static boolean setter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_1")) return false;
    boolean r;
    r = consumeToken(b, SEMI);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // block
  //     | ifStatement
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
  //     | localVariableDeclarationStatement
  //     | expressionStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = block(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
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
    if (!r) r = localVariableDeclarationStatement(b, l + 1);
    if (!r) r = expressionStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "SWITCH" "ON" expression LBRACE whenControl+ RBRACE
  public static boolean switchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, SWITCH_STATEMENT, "<switch statement>");
    r = consumeToken(b, "SWITCH");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "ON"));
    r = p && report_error_(b, expression(b, l + 1)) && r;
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
  public static boolean throwStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, THROW_STATEMENT, "<throw statement>");
    r = consumeToken(b, "THROW");
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBRACE triggerBlockMember* RBRACE
  public static boolean triggerBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && triggerBlock_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, TRIGGER_BLOCK, r);
    return r;
  }

  // triggerBlockMember*
  private static boolean triggerBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!triggerBlockMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "triggerBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* triggerMemberDeclaration | statement
  public static boolean triggerBlockMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerBlockMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_BLOCK_MEMBER, "<trigger block member>");
    r = triggerBlockMember_0(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier* triggerMemberDeclaration
  private static boolean triggerBlockMember_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerBlockMember_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = triggerBlockMember_0_0(b, l + 1);
    r = r && triggerMemberDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifier*
  private static boolean triggerBlockMember_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerBlockMember_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "triggerBlockMember_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ("BEFORE"|"AFTER") ("INSERT"|"UPDATE"|"DELETE"|"UNDELETE")
  public static boolean triggerCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerCase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_CASE, "<trigger case>");
    r = triggerCase_0(b, l + 1);
    r = r && triggerCase_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "BEFORE"|"AFTER"
  private static boolean triggerCase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerCase_0")) return false;
    boolean r;
    r = consumeToken(b, "BEFORE");
    if (!r) r = consumeToken(b, "AFTER");
    return r;
  }

  // "INSERT"|"UPDATE"|"DELETE"|"UNDELETE"
  private static boolean triggerCase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerCase_1")) return false;
    boolean r;
    r = consumeToken(b, "INSERT");
    if (!r) r = consumeToken(b, "UPDATE");
    if (!r) r = consumeToken(b, "DELETE");
    if (!r) r = consumeToken(b, "UNDELETE");
    return r;
  }

  /* ********************************************************** */
  // methodDeclaration
  // //    | fieldDeclaration
  // //    | interfaceDeclaration
  //     | classDeclaration
  public static boolean triggerMemberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerMemberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_MEMBER_DECLARATION, "<trigger member declaration>");
    r = methodDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "TRIGGER" id "ON" id LPAREN triggerCase (COMMA triggerCase)* RPAREN triggerBlock
  public static boolean triggerUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerUnit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRIGGER_UNIT, "<trigger unit>");
    r = consumeToken(b, "TRIGGER");
    r = r && id(b, l + 1);
    r = r && consumeToken(b, "ON");
    r = r && id(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && triggerCase(b, l + 1);
    r = r && triggerUnit_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && triggerBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA triggerCase)*
  private static boolean triggerUnit_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerUnit_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!triggerUnit_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "triggerUnit_6", c)) break;
    }
    return true;
  }

  // COMMA triggerCase
  private static boolean triggerUnit_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "triggerUnit_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && triggerCase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "TRY" block (catchClause+ finallyBlock? | finallyBlock)
  public static boolean tryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, TRY_STATEMENT, "<try statement>");
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
  // LT typeList GT
  public static boolean typeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeArguments")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeList(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* classDeclaration
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, TYPE_DECLARATION, "<type declaration>");
    r = typeDeclaration_0(b, l + 1);
    r = r && classDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean typeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeDeclaration_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeRef (COMMA typeRef)*
  public static boolean typeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = typeRef(b, l + 1);
    r = r && typeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA typeRef)*
  private static boolean typeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeList_1", c)) break;
    }
    return true;
  }

  // COMMA typeRef
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
  // "LIST" typeArguments?
  //     | "SET" typeArguments?
  //     | "MAP" typeArguments?
  //     | id typeArguments?
  public static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = typeName_0(b, l + 1);
    if (!r) r = typeName_1(b, l + 1);
    if (!r) r = typeName_2(b, l + 1);
    if (!r) r = typeName_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "LIST" typeArguments?
  private static boolean typeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIST");
    r = r && typeName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean typeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_0_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // "SET" typeArguments?
  private static boolean typeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SET");
    r = r && typeName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean typeName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_1_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // "MAP" typeArguments?
  private static boolean typeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAP");
    r = r && typeName_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean typeName_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_2_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  // id typeArguments?
  private static boolean typeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && typeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeArguments?
  private static boolean typeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_3_1")) return false;
    typeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typeName (DOT typeName)* (LBRACK RBRACK)*
  public static boolean typeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_REF, "<type ref>");
    r = typeName(b, l + 1);
    r = r && typeRef_1(b, l + 1);
    r = r && typeRef_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT typeName)*
  private static boolean typeRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeRef_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeRef_1", c)) break;
    }
    return true;
  }

  // DOT typeName
  private static boolean typeRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && typeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LBRACK RBRACK)*
  private static boolean typeRef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeRef_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeRef_2", c)) break;
    }
    return true;
  }

  // LBRACK RBRACK
  private static boolean typeRef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "UNDELETE" accessLevel? expression SEMI
  public static boolean undeleteStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undeleteStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, UNDELETE_STATEMENT, "<undelete statement>");
    r = consumeToken(b, "UNDELETE");
    r = r && undeleteStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessLevel?
  private static boolean undeleteStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undeleteStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "UPDATE" accessLevel? expression SEMI
  public static boolean updateStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "updateStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, UPDATE_STATEMENT, "<update statement>");
    r = consumeToken(b, "UPDATE");
    r = r && updateStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessLevel?
  private static boolean updateStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "updateStatement_1")) return false;
    accessLevel(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "UPSERT" accessLevel? expression qualifiedName? SEMI
  public static boolean upsertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upsertStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, UPSERT_STATEMENT, "<upsert statement>");
    r = consumeToken(b, "UPSERT");
    r = r && upsertStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && upsertStatement_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // id (ASSIGN expression)?
  public static boolean variableDeclarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATOR, "<variable declarator>");
    r = id(b, l + 1);
    r = r && variableDeclarator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ASSIGN expression)?
  private static boolean variableDeclarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarator_1")) return false;
    variableDeclarator_1_0(b, l + 1);
    return true;
  }

  // ASSIGN expression
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
  // variableDeclarator (COMMA variableDeclarator)*
  public static boolean variableDeclarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATORS, "<variable declarators>");
    r = variableDeclarator(b, l + 1);
    r = r && variableDeclarators_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA variableDeclarator)*
  private static boolean variableDeclarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclarators_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableDeclarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclarators_1", c)) break;
    }
    return true;
  }

  // COMMA variableDeclarator
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
  // (SUB|ADD)* IntegerLiteral
  //     | (SUB|ADD)* LongLiteral
  //     | StringLiteral
  //     | NULL
  //     | id
  //     // Salesforce tolerates paren pairs around each literal,
  //     // although this is not explicitly documented.
  //     | LPAREN whenLiteral RPAREN
  public static boolean whenLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_LITERAL, "<when literal>");
    r = whenLiteral_0(b, l + 1);
    if (!r) r = whenLiteral_1(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = id(b, l + 1);
    if (!r) r = whenLiteral_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SUB|ADD)* IntegerLiteral
  private static boolean whenLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral_0_0(b, l + 1);
    r = r && IntegerLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SUB|ADD)*
  private static boolean whenLiteral_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenLiteral_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenLiteral_0_0", c)) break;
    }
    return true;
  }

  // SUB|ADD
  private static boolean whenLiteral_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // (SUB|ADD)* LongLiteral
  private static boolean whenLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral_1_0(b, l + 1);
    r = r && LongLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SUB|ADD)*
  private static boolean whenLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenLiteral_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenLiteral_1_0", c)) break;
    }
    return true;
  }

  // SUB|ADD
  private static boolean whenLiteral_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenLiteral_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, ADD);
    return r;
  }

  // LPAREN whenLiteral RPAREN
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
  //     | whenLiteral (COMMA whenLiteral)*
  //     | typeRef id
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

  // whenLiteral (COMMA whenLiteral)*
  private static boolean whenValue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenLiteral(b, l + 1);
    r = r && whenValue_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA whenLiteral)*
  private static boolean whenValue_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whenValue_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whenValue_1_1", c)) break;
    }
    return true;
  }

  // COMMA whenLiteral
  private static boolean whenValue_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && whenLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeRef id
  private static boolean whenValue_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenValue_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeRef(b, l + 1);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "WHILE" parExpression (statement | SEMI)
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _LEFT_, WHILE_STATEMENT, "<while statement>");
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
  // 0: ATOM(simple_ref_expr) ATOM(primary_expr)
  // 1: PREFIX(bang_expression_expr) ATOM(methodCall_expr) ATOM(new_creator_expr)
  // 2: POSTFIX(dot_expr) PREFIX(paren_typef_expr) PREFIX(paren_expr) POSTFIX(inc_dec_expr)
  //    BINARY(brack_expr) BINARY(mul_div_expr) BINARY(add_sub_expr) BINARY(lt_gt_expr)
  //    BINARY(lt_gt_assi_expr) POSTFIX(instance_expr) BINARY(logic_expr) BINARY(bit_and_expr)
  //    BINARY(caret_expr) BINARY(bitor_expr) BINARY(and_expr) BINARY(or_expr)
  //    BINARY(coal_expr) BINARY(question_expr) BINARY(multi_assign_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = simple_ref_expr(b, l + 1);
    if (!r) r = primary_expr(b, l + 1);
    if (!r) r = bang_expression_expr(b, l + 1);
    if (!r) r = methodCall_expr(b, l + 1);
    if (!r) r = new_creator_expr(b, l + 1);
    if (!r) r = paren_typef_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
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
      if (g < 2 && dot_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, DOT_EXPR, r, true, null);
      }
      else if (g < 2 && inc_dec_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INC_DEC_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, LBRACK)) {
        r = report_error_(b, expr(b, l, 2));
        r = consumeToken(b, RBRACK) && r;
        exit_section_(b, l, m, BRACK_EXPR, r, true, null);
      }
      else if (g < 2 && mul_div_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, MUL_DIV_EXPR, r, true, null);
      }
      else if (g < 2 && add_sub_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, ADD_SUB_EXPR, r, true, null);
      }
      else if (g < 2 && lt_gt_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, LT_GT_EXPR, r, true, null);
      }
      else if (g < 2 && lt_gt_assi_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, LT_GT_ASSI_EXPR, r, true, null);
      }
      else if (g < 2 && instance_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INSTANCE_EXPR, r, true, null);
      }
      else if (g < 2 && logic_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, LOGIC_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, BITAND)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, BIT_AND_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, CARET)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, CARET_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, BITOR)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, BITOR_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, AND)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, OR)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, COAL)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, COAL_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, QUESTION)) {
        r = report_error_(b, expr(b, l, 1));
        r = question_expr_1(b, l + 1) && r;
        exit_section_(b, l, m, QUESTION_EXPR, r, true, null);
      }
      else if (g < 2 && multi_assign_expr_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, MULTI_ASSIGN_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // identifier
  public static boolean simple_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_ref_expr")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, m, SIMPLE_REF_EXPR, r);
    return r;
  }

  // primary
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean bang_expression_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bang_expression_expr")) return false;
    if (!nextTokenIsSmart(b, BANG, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = bang_expression_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 1);
    exit_section_(b, l, m, BANG_EXPRESSION_EXPR, r, p, null);
    return r || p;
  }

  // TILDE|BANG
  private static boolean bang_expression_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bang_expression_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, TILDE);
    if (!r) r = consumeTokenSmart(b, BANG);
    return r;
  }

  // id LPAREN expressionList? RPAREN
  //     | "THIS" LPAREN expressionList? RPAREN
  //     | "SUPER" LPAREN expressionList? RPAREN
  public static boolean methodCall_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_CALL_EXPR, "<method call expr>");
    r = methodCall_expr_0(b, l + 1);
    if (!r) r = methodCall_expr_1(b, l + 1);
    if (!r) r = methodCall_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id LPAREN expressionList? RPAREN
  private static boolean methodCall_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && methodCall_expr_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionList?
  private static boolean methodCall_expr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_0_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // "THIS" LPAREN expressionList? RPAREN
  private static boolean methodCall_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "THIS");
    r = r && consumeToken(b, LPAREN);
    r = r && methodCall_expr_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionList?
  private static boolean methodCall_expr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_1_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // "SUPER" LPAREN expressionList? RPAREN
  private static boolean methodCall_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "SUPER");
    r = r && consumeToken(b, LPAREN);
    r = r && methodCall_expr_2_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionList?
  private static boolean methodCall_expr_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_expr_2_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // "NEW" creator
  public static boolean new_creator_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_creator_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_CREATOR_EXPR, "<new creator expr>");
    r = consumeTokenSmart(b, "NEW");
    r = r && creator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( DOT | QUESTIONDOT) ( dotMethodCall | anyId )
  private static boolean dot_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_expr_0_0(b, l + 1);
    r = r && dot_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT | QUESTIONDOT
  private static boolean dot_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, DOT);
    if (!r) r = consumeTokenSmart(b, QUESTIONDOT);
    return r;
  }

  // dotMethodCall | anyId
  private static boolean dot_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_0_1")) return false;
    boolean r;
    r = dotMethodCall(b, l + 1);
    if (!r) r = anyId(b, l + 1);
    return r;
  }

  public static boolean paren_typef_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_typef_expr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = paren_typef_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, PAREN_TYPEF_EXPR, r, p, null);
    return r || p;
  }

  // LPAREN typeRef RPAREN
  private static boolean paren_typef_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_typef_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && typeRef(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // INC | DEC
  private static boolean inc_dec_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inc_dec_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    return r;
  }

  // MUL|DIV
  private static boolean mul_div_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_div_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, MUL);
    if (!r) r = consumeTokenSmart(b, DIV);
    return r;
  }

  // ADD|SUB
  private static boolean add_sub_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_sub_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, ADD);
    if (!r) r = consumeTokenSmart(b, SUB);
    return r;
  }

  // LT LT | GT GT GT | GT GT
  private static boolean lt_gt_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokensSmart(b, 0, LT, LT);
    if (!r) r = parseTokensSmart(b, 0, GT, GT, GT);
    if (!r) r = parseTokensSmart(b, 0, GT, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GT | LT) ASSIGN?
  private static boolean lt_gt_assi_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lt_gt_assi_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lt_gt_assi_expr_0_0(b, l + 1);
    r = r && lt_gt_assi_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GT | LT
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

  // INSTANCEOF typeRef
  private static boolean instance_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INSTANCEOF);
    r = r && typeRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TRIPLEEQUAL | TRIPLENOTEQUAL | EQUAL | NOTEQUAL | LESSANDGREATER
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

  // COLON expr
  private static boolean question_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "question_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ASSIGN
  //       |   ADD_ASSIGN
  //       |   SUB_ASSIGN
  //       |   MUL_ASSIGN
  //       |   DIV_ASSIGN
  //       |   AND_ASSIGN
  //       |   OR_ASSIGN
  //       |   XOR_ASSIGN
  //       |   RSHIFT_ASSIGN
  //       |   URSHIFT_ASSIGN
  //       |   LSHIFT_ASSIGN
  private static boolean multi_assign_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_assign_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, ASSIGN);
    if (!r) r = consumeTokenSmart(b, ADD_ASSIGN);
    if (!r) r = consumeTokenSmart(b, SUB_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MUL_ASSIGN);
    if (!r) r = consumeTokenSmart(b, DIV_ASSIGN);
    if (!r) r = consumeTokenSmart(b, AND_ASSIGN);
    if (!r) r = consumeTokenSmart(b, OR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, XOR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, RSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, URSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, LSHIFT_ASSIGN);
    return r;
  }

}
