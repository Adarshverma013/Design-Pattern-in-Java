package com.adarsh.behavioral.observer.example3;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{
    private List<Observer> observers;
    private int temperature = 0;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void statusChange(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public int getStatus() {
        return temperature;
    }
}
