package com.adarsh.behavioral.chainofresponsibility.example2;

public class Compressor extends Handler{


    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }
}
