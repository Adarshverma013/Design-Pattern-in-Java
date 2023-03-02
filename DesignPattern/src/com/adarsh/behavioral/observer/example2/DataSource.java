package com.adarsh.behavioral.observer.example2;

public class DataSource extends Subject{
    private int value;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
    }
}
