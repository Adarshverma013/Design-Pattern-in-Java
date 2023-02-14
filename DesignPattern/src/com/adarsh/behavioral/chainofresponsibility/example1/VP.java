package com.adarsh.behavioral.chainofresponsibility.example1;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            if(request.getAmount() < 1500)
            {
                System.out.println("VPs can handle request below 1500 dollars");
            }else{
                successor.handleRequest(request);
            }
        }
    }
}
