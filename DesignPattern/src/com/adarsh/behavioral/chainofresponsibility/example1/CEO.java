package com.adarsh.behavioral.chainofresponsibility.example1;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can handle any request");
    }
}
