package com.adarsh.behavioral.command.example1;

// client
public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light(); // receiver
        Switch lightSwitch = new Switch(); // invoker

        Command toggleCommand = new ToggleCommand(light); // concrete command

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

    }
}
