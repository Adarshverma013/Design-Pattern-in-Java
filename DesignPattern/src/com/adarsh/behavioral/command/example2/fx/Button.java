package com.adarsh.behavioral.command.example2.fx;

public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        // ...
        /**
         * At this point don't know what action will be
         * performed when the button is clicked
         * the work is delegated to command to execute it
         * Button does not know about customer requirement
         */
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
