package com.adarsh.behavioral.interpretor.example;

public class InterpreterMain {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alt1 = new AndExpression(terminal2,terminal3);
        // Lions or (Tigers and Bears)
        Expression alt2 = new OrExpression(terminal1,alt1);
        return new AndExpression(terminal3,alt2);
    }

    /**
     * main method - build the interpreter and then interpret a
     * specific sequence
     * @param args
     */
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
        String context = "Lions Tigers";
//        String context = "Tigers Bears";
//        String context = "Lions Bears";
        Expression define = buildInterpreterTree();

        System.out.println(context+" is "+define.interpret(context));

    }
}
