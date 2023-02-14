package com.adarsh.behavioral.chainofresponsibility.example2;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest){
        handler.handle(httpRequest);
    }
}
