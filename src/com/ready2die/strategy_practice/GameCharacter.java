package com.ready2die.strategy_practice;

public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공경");
        } else {
            weapon.attack();
        }
    }
}
