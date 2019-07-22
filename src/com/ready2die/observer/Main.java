package com.ready2die.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer);
        observable.addObserver(observer2);
        observable.setNews("news");


    }
}
