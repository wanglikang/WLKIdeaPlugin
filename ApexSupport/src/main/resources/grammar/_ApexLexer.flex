package grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;

%%

%{
  public _ApexLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ApexLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_]+[a-zA-Z0-9_]*
SINGLEQUOTESTRINGLITERAL=\'[a-zA-Z0-9]+\'
DATELITERAL=[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]
TIMELITERAL=[0-9][0-9]:[0-9][0-9]:[0-9][0-9][\.\d+]?[z|[[+-][0-9]+[:\d+]?]]
DATETIMELITERAL=[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]t[0-9][0-9]:[0-9][0-9]:[0-9][0-9][\.\d+]?[z|[[+-][0-9]+[:\d+]?]]
INTEGERLITERALPATTERN=[0-9]+
LONGLITERALPATTERN=[0-9]+[lL]
NUMBERLITERALPATTERN=[0-9]*\.[0-9]+[dD]
COMMENT="/"\*.*?\*"/"
LINE_COMMENT="//"[^\r\n]*[\r|\n]?
WS=[ \t\n\x0B\f\r]

%%
<YYINITIAL> {
  {WHITE_SPACE}                    { return WHITE_SPACE; }

  "abstract"                       { return ABSTRACT; }
  "after"                          { return AFTER; }
  "before"                         { return BEFORE; }
  "break"                          { return BREAK; }
  "catch"                          { return CATCH; }
  "class"                          { return CLASS; }
  "continue"                       { return CONTINUE; }
  "delete"                         { return DELETE; }
  "do"                             { return DO; }
  "else"                           { return ELSE; }
  "enum"                           { return ENUM; }
  "extends"                        { return EXTENDS; }
  "final"                          { return FINAL; }
  "finally"                        { return FINALLY; }
  "for"                            { return FOR; }
  "get"                            { return GET; }
  "global"                         { return GLOBAL; }
  "if"                             { return IF; }
  "implements"                     { return IMPLEMENTS; }
  "inherited"                      { return INHERITED; }
  "insert"                         { return INSERT; }
  "instanceof"                     { return INSTANCEOF; }
  "interface"                      { return INTERFACE; }
  "merge"                          { return MERGE; }
  "new"                            { return NEW; }
  "null"                           { return NULL; }
  "on"                             { return ON; }
  "override"                       { return OVERRIDE; }
  "private"                        { return PRIVATE; }
  "protected"                      { return PROTECTED; }
  "public"                         { return PUBLIC; }
  "return"                         { return RETURN; }
  "system.runas"                   { return SYSTEMRUNAS; }
  "set"                            { return SET; }
  "sharing"                        { return SHARING; }
  "static"                         { return STATIC; }
  "super"                          { return SUPER; }
  "switch"                         { return SWITCH; }
  "testmethod"                     { return TESTMETHOD; }
  "this"                           { return THIS; }
  "throw"                          { return THROW; }
  "transient"                      { return TRANSIENT; }
  "trigger"                        { return TRIGGER; }
  "try"                            { return TRY; }
  "undelete"                       { return UNDELETE; }
  "update"                         { return UPDATE; }
  "upsert"                         { return UPSERT; }
  "virtual"                        { return VIRTUAL; }
  "void"                           { return VOID; }
  "webservice"                     { return WEBSERVICE; }
  "when"                           { return WHEN; }
  "while"                          { return WHILE; }
  "with"                           { return WITH; }
  "without"                        { return WITHOUT; }
  "list"                           { return LIST; }
  "map"                            { return MAP; }
  "system"                         { return SYSTEM; }
  "user"                           { return USER; }
  "select"                         { return SELECT; }
  "count"                          { return COUNT; }
  "from"                           { return FROM; }
  "as"                             { return AS; }
  "using"                          { return USING; }
  "scope"                          { return SCOPE; }
  "where"                          { return WHERE; }
  "order"                          { return ORDER; }
  "by"                             { return BY; }
  "limit"                          { return LIMIT; }
  "and"                            { return SOQLAND; }
  "or"                             { return SOQLOR; }
  "not"                            { return NOT; }
  "avg"                            { return AVG; }
  "count_distinct"                 { return COUNT_DISTINCT; }
  "min"                            { return MIN; }
  "max"                            { return MAX; }
  "sum"                            { return SUM; }
  "typeof"                         { return TYPEOF; }
  "end"                            { return END; }
  "then"                           { return THEN; }
  "like"                           { return LIKE; }
  "in"                             { return IN; }
  "includes"                       { return INCLUDES; }
  "excludes"                       { return EXCLUDES; }
  "asc"                            { return ASC; }
  "desc"                           { return DESC; }
  "nulls"                          { return NULLS; }
  "first"                          { return FIRST; }
  "last"                           { return LAST; }
  "group"                          { return GROUP; }
  "all"                            { return ALL; }
  "rows"                           { return ROWS; }
  "view"                           { return VIEW; }
  "having"                         { return HAVING; }
  "rollup"                         { return ROLLUP; }
  "tolabel"                        { return TOLABEL; }
  "offset"                         { return OFFSET; }
  "data"                           { return DATA; }
  "category"                       { return CATEGORY; }
  "at"                             { return AT; }
  "above"                          { return ABOVE; }
  "below"                          { return BELOW; }
  "above_or_below"                 { return ABOVE_OR_BELOW; }
  "security_enforced"              { return SECURITY_ENFORCED; }
  "system_mode"                    { return SYSTEM_MODE; }
  "user_mode"                      { return USER_MODE; }
  "reference"                      { return REFERENCE; }
  "cube"                           { return CUBE; }
  "format"                         { return FORMAT; }
  "tracking"                       { return TRACKING; }
  "viewstat"                       { return VIEWSTAT; }
  "custom"                         { return CUSTOM; }
  "standard"                       { return STANDARD; }
  "distance"                       { return DISTANCE; }
  "geolocation"                    { return GEOLOCATION; }
  "grouping"                       { return GROUPING; }
  "convertcurrency"                { return CONVERT_CURRENCY; }
  "calendar_month"                 { return CALENDAR_MONTH; }
  "calendar_quarter"               { return CALENDAR_QUARTER; }
  "calendar_year"                  { return CALENDAR_YEAR; }
  "day_in_month"                   { return DAY_IN_MONTH; }
  "day_in_week"                    { return DAY_IN_WEEK; }
  "day_in_year"                    { return DAY_IN_YEAR; }
  "day_only"                       { return DAY_ONLY; }
  "fiscal_month"                   { return FISCAL_MONTH; }
  "fiscal_quarter"                 { return FISCAL_QUARTER; }
  "fiscal_year"                    { return FISCAL_YEAR; }
  "hour_in_day"                    { return HOUR_IN_DAY; }
  "week_in_month"                  { return WEEK_IN_MONTH; }
  "week_in_year"                   { return WEEK_IN_YEAR; }
  "converttimezone"                { return CONVERT_TIMEZONE; }
  "yesterday"                      { return YESTERDAY; }
  "today"                          { return TODAY; }
  "tomorrow"                       { return TOMORROW; }
  "last_week"                      { return LAST_WEEK; }
  "this_week"                      { return THIS_WEEK; }
  "next_week"                      { return NEXT_WEEK; }
  "last_month"                     { return LAST_MONTH; }
  "this_month"                     { return THIS_MONTH; }
  "next_month"                     { return NEXT_MONTH; }
  "last_90_days"                   { return LAST_90_DAYS; }
  "next_90_days"                   { return NEXT_90_DAYS; }
  "last_n_days"                    { return LAST_N_DAYS_N; }
  "next_n_days"                    { return NEXT_N_DAYS_N; }
  "n_days_ago"                     { return N_DAYS_AGO_N; }
  "next_n_weeks"                   { return NEXT_N_WEEKS_N; }
  "last_n_weeks"                   { return LAST_N_WEEKS_N; }
  "n_weeks_ago"                    { return N_WEEKS_AGO_N; }
  "next_n_months"                  { return NEXT_N_MONTHS_N; }
  "last_n_months"                  { return LAST_N_MONTHS_N; }
  "n_months_ago"                   { return N_MONTHS_AGO_N; }
  "this_quarter"                   { return THIS_QUARTER; }
  "last_quarter"                   { return LAST_QUARTER; }
  "next_quarter"                   { return NEXT_QUARTER; }
  "next_n_quarters"                { return NEXT_N_QUARTERS_N; }
  "last_n_quarters"                { return LAST_N_QUARTERS_N; }
  "n_quarters_ago"                 { return N_QUARTERS_AGO_N; }
  "this_year"                      { return THIS_YEAR; }
  "last_year"                      { return LAST_YEAR; }
  "next_year"                      { return NEXT_YEAR; }
  "next_n_years"                   { return NEXT_N_YEARS_N; }
  "last_n_years"                   { return LAST_N_YEARS_N; }
  "n_years_ago"                    { return N_YEARS_AGO_N; }
  "this_fiscal_quarter"            { return THIS_FISCAL_QUARTER; }
  "last_fiscal_quarter"            { return LAST_FISCAL_QUARTER; }
  "next_fiscal_quarter"            { return NEXT_FISCAL_QUARTER; }
  "next_n_fiscal_quarters"         { return NEXT_N_FISCAL_QUARTERS_N; }
  "last_n_fiscal_quarters"         { return LAST_N_FISCAL_QUARTERS_N; }
  "n_fiscal_quarters_ago"          { return N_FISCAL_QUARTERS_AGO_N; }
  "this_fiscal_year"               { return THIS_FISCAL_YEAR; }
  "last_fiscal_year"               { return LAST_FISCAL_YEAR; }
  "next_fiscal_year"               { return NEXT_FISCAL_YEAR; }
  "next_n_fiscal_years"            { return NEXT_N_FISCAL_YEARS_N; }
  "last_n_fiscal_years"            { return LAST_N_FISCAL_YEARS_N; }
  "n_fiscal_years_ago"             { return N_FISCAL_YEARS_AGO_N; }
  "find"                           { return FIND; }
  "email"                          { return EMAIL; }
  "name"                           { return NAME; }
  "phone"                          { return PHONE; }
  "sidebar"                        { return SIDEBAR; }
  "fields"                         { return FIELDS; }
  "metadata"                       { return METADATA; }
  "pricebookid"                    { return PRICEBOOKID; }
  "network"                        { return NETWORK; }
  "snippet"                        { return SNIPPET; }
  "target_length"                  { return TARGET_LENGTH; }
  "division"                       { return DIVISION; }
  "returning"                      { return RETURNING; }
  "listview"                       { return LISTVIEW; }
  "("                              { return LPAREN; }
  ")"                              { return RPAREN; }
  "{"                              { return LBRACE; }
  "}"                              { return RBRACE; }
  "["                              { return LBRACK; }
  "]"                              { return RBRACK; }
  ";"                              { return SEMI; }
  ","                              { return COMMA; }
  "."                              { return DOT; }
  "="                              { return ASSIGN; }
  ">"                              { return GT; }
  "<"                              { return LT; }
  "!"                              { return BANG; }
  "~"                              { return TILDE; }
  "?."                             { return QUESTIONDOT; }
  "?"                              { return QUESTION; }
  ":"                              { return COLON; }
  "=="                             { return EQUAL; }
  "==="                            { return TRIPLEEQUAL; }
  "!="                             { return NOTEQUAL; }
  "<>"                             { return LESSANDGREATER; }
  "!=="                            { return TRIPLENOTEQUAL; }
  "&&"                             { return AND; }
  "||"                             { return OR; }
  "??"                             { return COAL; }
  "++"                             { return INC; }
  "--"                             { return DEC; }
  "+"                              { return ADD; }
  "-"                              { return SUB; }
  "*"                              { return MUL; }
  "/"                              { return DIV; }
  "&"                              { return BITAND; }
  "|"                              { return BITOR; }
  "^"                              { return CARET; }
  "=>"                             { return MAPTO; }
  "+="                             { return ADD_ASSIGN; }
  "-="                             { return SUB_ASSIGN; }
  "*="                             { return MUL_ASSIGN; }
  "/="                             { return DIV_ASSIGN; }
  "&="                             { return AND_ASSIGN; }
  "|="                             { return OR_ASSIGN; }
  "^="                             { return XOR_ASSIGN; }
  "<<="                            { return LSHIFT_ASSIGN; }
  ">>="                            { return RSHIFT_ASSIGN; }
  ">>>="                           { return URSHIFT_ASSIGN; }
  "@"                              { return ATSIGN; }

  {IDENTIFIER}                     { return IDENTIFIER; }
  {SINGLEQUOTESTRINGLITERAL}       { return SINGLEQUOTESTRINGLITERAL; }
  {DATELITERAL}                    { return DATELITERAL; }
  {TIMELITERAL}                    { return TIMELITERAL; }
  {DATETIMELITERAL}                { return DATETIMELITERAL; }
  {INTEGERLITERALPATTERN}          { return INTEGERLITERALPATTERN; }
  {LONGLITERALPATTERN}             { return LONGLITERALPATTERN; }
  {NUMBERLITERALPATTERN}           { return NUMBERLITERALPATTERN; }
  {COMMENT}                        { return COMMENT; }
  {LINE_COMMENT}                   { return LINE_COMMENT; }
  {WS}                             { return WS; }

}

[^] { return BAD_CHARACTER; }
