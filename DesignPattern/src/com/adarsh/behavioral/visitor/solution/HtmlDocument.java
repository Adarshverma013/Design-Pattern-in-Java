package com.adarsh.behavioral.visitor.solution;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    List<HtmlNode> nodes = new ArrayList<>();
    public void add(HtmlNode htmlNode){
        nodes.add(htmlNode);
    }

    public void execute(Operation operation){
        for(HtmlNode node:nodes)
            node.execute(operation);
    }
}
