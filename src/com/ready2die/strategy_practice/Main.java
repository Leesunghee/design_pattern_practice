package com.ready2die.strategy_practice;

public class Main {

    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.setWeapon(new Knife());

        gameCharacter.attack();
    }
}
