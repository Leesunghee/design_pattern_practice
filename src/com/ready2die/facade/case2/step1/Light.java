package com.ready2die.facade.case2.step1;

public class Computer {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Computer를 켬.");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Computer를 끔.");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
