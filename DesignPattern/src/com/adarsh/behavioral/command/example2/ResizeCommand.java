package com.adarsh.behavioral.command.example2;

import com.adarsh.behavioral.command.example2.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
