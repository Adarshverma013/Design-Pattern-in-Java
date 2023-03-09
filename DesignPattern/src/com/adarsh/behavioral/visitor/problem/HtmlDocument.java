package com.adarsh.behavioral.visitor.problem;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    List<HtmlNode> nodes = new ArrayList<>();
    public void add(HtmlNode htmlNode){
        nodes.add(htmlNode);
    }
    public void highlight(){
        for(HtmlNode node:nodes)
            node.highlight();
    }
}
