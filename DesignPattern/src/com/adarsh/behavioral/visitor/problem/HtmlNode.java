package com.adarsh.behavioral.visitor.problem;

/**
 * Problem is when we are adding any new functionality like this highlight
 * we have to go through every class implementing this interface and make the change
 * violating open/close principle
 */
public interface HtmlNode {
    void highlight();
}
