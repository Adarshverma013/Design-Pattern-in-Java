package com.adarsh.state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    /*
    private ToolType currentTool;
    public void mouseDown(){
        if(currentTool == ToolType.SELECTTION)
            System.out.println("Selection icon");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Brush icon");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Eraser icon");
    }
    public void mouseUp(){
        if(currentTool == ToolType.SELECTTION)
            System.out.println("Draw dashed rectangle");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Eraser something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
     */

}