package com.adarsh.behavioral.observer.example3;

public class DisplayObserver implements Observer{
    private Subject subject;

    public DisplayObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature is: "+subject.getStatus()+" degree on display");
    }
}
