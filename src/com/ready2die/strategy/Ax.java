package com.ready2die.strategy;

public class Ax implements Weapon {

    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
