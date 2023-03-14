package com.adarsh.structural.composite.problem;

public class Main {
    public static void main(String[] args) {
        Group g1 = new Group();
        g1.add(new Shape()); // square
        g1.add(new Shape()); // square

        Group g2 = new Group();
        g2.add(new Shape()); // circle
        g2.add(new Shape()); // circle

        Group g = new Group();
        g.add(g1);
        g.add(g2);
        g.render();
    }
}
