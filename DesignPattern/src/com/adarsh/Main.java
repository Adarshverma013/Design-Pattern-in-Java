package com.adarsh;

import com.adarsh.iterator.BrowseHistory;
import com.adarsh.iterator.Iterator;
import com.adarsh.memento.Editor;
import com.adarsh.memento.History;
import com.adarsh.state.Canvas;
import com.adarsh.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        //memento pattern
        // Single responsiblity principle
        /* var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        */


        // State Pattern
        // Open CLose Principle - classes should be open for extension but closed for modification
       /* var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        */


        //Iterator Pattern
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }


    }
}
