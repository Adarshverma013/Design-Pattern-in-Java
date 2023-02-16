package com.adarsh.behavioral.command.example2;

import com.adarsh.behavioral.command.example2.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White image");
    }
}
