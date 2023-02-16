package com.adarsh.behavioral.interpretor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpretorDemo {
    public static void main(String[] args) {
        String input = "Lions and tigers and bears";

        Pattern p  = Pattern.compile("(lion|cat|dog|tiger|bear)");
        Matcher matcher = p.matcher(input);
        while(matcher.find())
        {
            System.out.println("Found a " + matcher.group()+ ".");
        }
    }
}
