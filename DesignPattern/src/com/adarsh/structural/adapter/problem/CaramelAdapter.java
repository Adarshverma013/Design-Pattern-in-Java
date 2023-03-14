package com.adarsh.structural.adapter.problem;

import com.adarsh.structural.adapter.problem.caramel.Caramel;

public class CaramelAdapter implements Filter{
    private Caramel caramel;

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.apply(image);
    }
}
