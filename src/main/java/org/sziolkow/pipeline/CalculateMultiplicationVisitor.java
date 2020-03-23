package org.sziolkow.pipeline;

public class CalculateMultiplicationVisitor implements Visitor {

    @Override
    public void visitSimpleRule(SimpleRule simpleRule) {
        System.out.println("Multiplication for Simple Rule ");
    }

    @Override
    public void visitAdvancedRule(AdvancedRule advancedRule) {
        System.out.println("Multiplication for Advanced Rule ");
    }
}
