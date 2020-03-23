package org.sziolkow.pipeline;

public interface ComputableRule {
    void accept(Visitor visitor);
}
