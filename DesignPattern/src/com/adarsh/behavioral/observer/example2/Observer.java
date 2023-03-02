package com.adarsh.behavioral.observer.example2;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
