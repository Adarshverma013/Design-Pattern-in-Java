package com.adarsh.behavioral.visitor.problem;

public class HeadingNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("highlight heading node");
    }
}
