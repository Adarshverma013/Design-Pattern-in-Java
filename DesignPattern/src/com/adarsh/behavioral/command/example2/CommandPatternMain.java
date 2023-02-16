package com.adarsh.behavioral.command.example2;

import com.adarsh.behavioral.command.example2.fx.Button;
import com.adarsh.behavioral.command.example2.fx.Command;

public class CommandPatternMain {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();

        Command command = new AddCustomerCommand(service);

        Button button = new Button(command);

        button.click();

        CompositeCommand composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        // TODO Undoable command

    }
}
