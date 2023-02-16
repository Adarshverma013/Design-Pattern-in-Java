package com.adarsh.behavioral.command.example1;

// invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }
}
