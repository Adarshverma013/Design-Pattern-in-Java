package com.adarsh.structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> components = new ArrayList<>();
    @Override
    public void render() {
        for(Component component:components)
            component.render();
    }

    public void add(Component component){
        components.add(component);
    }
}
