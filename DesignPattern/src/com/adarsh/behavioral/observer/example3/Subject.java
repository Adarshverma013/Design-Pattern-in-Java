package com.adarsh.behavioral.observer.example3;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void statusChange(int temp);
    void notifyObservers();
    int getStatus();
}
