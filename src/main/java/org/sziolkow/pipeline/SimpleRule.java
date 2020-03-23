package org.sziolkow.pipeline;

public class SimpleRule implements ComputableRule{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSimpleRule(this);
    }
}
