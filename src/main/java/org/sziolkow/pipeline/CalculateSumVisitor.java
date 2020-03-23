package org.sziolkow.pipeline;

public class CalculateSumVisitor implements Visitor {

    @Override
    public void visitSimpleRule(SimpleRule simpleRule) {
        System.out.println("Sum for Simple Rule ");
    }

    @Override
    public void visitAdvancedRule(AdvancedRule advancedRule) {
        System.out.println("Sum for Advanced Rule ");
    }
}
