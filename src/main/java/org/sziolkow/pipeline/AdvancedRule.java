package org.sziolkow.pipeline;

public class AdvancedRule implements ComputableRule{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAdvancedRule(this);
    }
}
