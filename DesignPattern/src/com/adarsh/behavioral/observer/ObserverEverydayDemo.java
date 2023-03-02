package com.adarsh.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {

    public static void main(String[] args) {
        TwitterStream stream = new TwitterStream();

        Client c1 = new Client("c1");
        Client c2 = new Client("c2");

        stream.addObserver(c1);
        stream.addObserver(c2);

        stream.someoneTweeted();
    }
}
// concrete subject
class TwitterStream extends Observable{
    public void someoneTweeted(){
        setChanged(); // signifies the observers that stream state is changed so that notifyObservers can be called
        notifyObservers(); // calls the update method
    }
}
// concrete observer
class Client implements Observer{
    private String name;
    Client(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update "+name+"'s stream, somenone tweeted.");
    }
}
