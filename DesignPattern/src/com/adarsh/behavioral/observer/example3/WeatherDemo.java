package com.adarsh.behavioral.observer.example3;

public class WeatherDemo {
    public static void main(String[] args) {
        Subject subject = new WeatherSubject();
        Observer weatherObserver = new DisplayObserver(subject);
        subject.statusChange(10);
        subject.statusChange(20);
    }
}
