package com.adarsh.behavioral.command.example1;

// receiver
public class Light {

    private boolean isOn = false;

    public void toggle(){
        if(isOn) {
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Switched on");
    }

    public void off(){
        System.out.println("Switched off");
    }
}
