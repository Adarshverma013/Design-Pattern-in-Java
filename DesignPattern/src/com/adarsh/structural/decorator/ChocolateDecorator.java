package com.adarsh.structural.decorator;

public class ChocolateDecorator extends AddonsDecorator{
    public Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 5+this.beverage.cost();
    }
}
