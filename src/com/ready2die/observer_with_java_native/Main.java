package com.ready2die.observer_with_java_native;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        Button button = new Button();

        button.addObserver((o, arg) -> System.out.println(o + " is Clicked"));

        button.onClick();
        button.onClick();
        button.onClick();

    }
}
