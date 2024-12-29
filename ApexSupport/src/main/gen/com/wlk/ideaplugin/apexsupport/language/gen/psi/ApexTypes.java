// This is a generated file. Not intended for manual editing.
package com.wlk.ideaplugin.apexsupport.language.gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexElementType;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
import com.wlk.ideaplugin.apexsupport.language.gen.psi.impl.*;

public interface ApexTypes {
  IElementType PUBLIC = new ApexElementType("public");
  IElementType WITHOUT = new ApexElementType("without");
  IElementType SHARING = new ApexElementType("sharing");
  IElementType CLASS = new ApexElementType("class");
  IElementType IMPLEMENTS = new ApexElementType("implements");
  IElementType STRING = new ApexElementType("String");

  IElementType PROPERTY = new ApexElementType("PROPERTY");

  IElementType COMMENT = new ApexTokenType("COMMENT");
  IElementType CRLF = new ApexTokenType("CRLF");
  IElementType KEY = new ApexTokenType("KEY");
  IElementType SEPARATOR = new ApexTokenType("SEPARATOR");
  IElementType VALUE = new ApexTokenType("VALUE");

  public static IElementType createElementTypeByName(String name,int col,int row){
    return new ApexTokenType(name,col,row);
  }
  public static IElementType createElementTypeByName(String name,int col,int row,Object value){
    return new ApexTokenType(name,col,row,value);
  }

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new ApexPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
