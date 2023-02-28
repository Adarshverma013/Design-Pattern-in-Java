package com.adarsh.behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo {
    private Timer timer;
    public MediatorDemo(int seconds){
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Times up!");
        }
    }

    public static void main(String[] args) {

    }
}
