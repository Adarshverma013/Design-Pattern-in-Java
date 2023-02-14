package com.adarsh.behavioral.chainofresponsibility.example1;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Directors can approve conference");
        }
        else
        {
            successor.handleRequest(request);
        }
    }
}
