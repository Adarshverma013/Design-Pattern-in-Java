package com.adarsh.structural.decorator;

public class DecoratorDemo {


    public static void main(String[] args) {
        Beverage myCoffee = new ChocolateDecorator(new Espresso());
        System.out.println(myCoffee.cost());
    }
}
