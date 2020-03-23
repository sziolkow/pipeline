package org.sziolkow.pipeline;

public interface Visitor {

   void visitSimpleRule(SimpleRule simpleRule);

   void visitAdvancedRule(AdvancedRule advancedRule);

}
