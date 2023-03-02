package com.adarsh.behavioral.observer.example2;

public class Chart extends Observer{
    public Chart(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void changeValue(int num){
        subject.setValue(num);
    }

    @Override
    void update() {
        System.out.println("Num changed in Chart to: "+subject.getValue());
    }
}
