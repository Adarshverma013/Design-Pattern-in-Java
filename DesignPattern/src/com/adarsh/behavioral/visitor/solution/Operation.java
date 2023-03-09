package com.adarsh.behavioral.visitor.solution;

// visitor
public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
