package com.adarsh.behavioral.visitor.solution;

public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
