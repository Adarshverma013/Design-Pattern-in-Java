package com.adarsh.behavioral.chainofresponsibility.example2;

public class ChainofResponsibilityDemo2 {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin","1234"));
    }
}
