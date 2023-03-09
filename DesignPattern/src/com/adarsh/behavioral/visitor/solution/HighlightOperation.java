package com.adarsh.behavioral.visitor.solution;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlighting Heading Node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlighting anchor Node");
    }
}
