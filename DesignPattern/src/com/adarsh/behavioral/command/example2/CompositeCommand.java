package com.adarsh.behavioral.command.example2;

import com.adarsh.behavioral.command.example2.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for(Command command:commands){
            command.execute();
        }
    }
}
