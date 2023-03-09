package com.adarsh.behavioral.visitor.problem;

/**
 * Allows us to add new operations to an object structure without
 * modifying it
 */
public class VisitorDemo {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();
    }
}
