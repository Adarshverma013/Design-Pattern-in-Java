package com.adarsh.behavioral.observer.example2;

public class SpreadSheet extends Observer{

    public SpreadSheet(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void changeValue(int num){
        subject.setValue(num);
    }

    @Override
    void update() {
        System.out.println("Num changed in SpreadSheet to: "+subject.getValue());
    }
}
