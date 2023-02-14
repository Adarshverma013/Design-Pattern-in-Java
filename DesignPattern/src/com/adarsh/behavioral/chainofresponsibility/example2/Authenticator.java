package com.adarsh.behavioral.chainofresponsibility.example2;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        boolean isValid = (httpRequest.getUsername() == "admin" && httpRequest.getPassword() == "1234");
        System.out.println("Authentication");
        return !isValid;
    }
}
