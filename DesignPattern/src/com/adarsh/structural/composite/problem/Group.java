package com.adarsh.structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> objects = new ArrayList<>();

    public void add(Object shape){
        objects.add(shape);
    }
    public void render(){
        for(Object object:objects){
            if (object instanceof Shape)
                ((Shape) object).render();
            else
            {
                ((Group)object).render();
            }
        }
    }
}
