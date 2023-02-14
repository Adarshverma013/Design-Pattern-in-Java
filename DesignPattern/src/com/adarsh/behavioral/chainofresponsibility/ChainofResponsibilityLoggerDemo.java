package com.adarsh.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainofResponsibilityLoggerDemo {
    private static final Logger logger = Logger.getLogger(ChainofResponsibilityLoggerDemo.class.getName());

    public static void main(String[] args) {
        // level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        // level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("This will not print");
        logger.finer("This is finer log");
        logger.fine("this is fine level log");
    }
}
