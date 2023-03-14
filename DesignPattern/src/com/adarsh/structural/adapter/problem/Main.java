package com.adarsh.structural.adapter.problem;

import com.adarsh.structural.adapter.problem.caramel.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.applyFilter(new VividFilter());
        // imageView.applyFilter(new Caramel()); // this gives error
        imageView.applyFilter(new CaramelAdapter(new Caramel()));
    }
}
