package com.ready2die.factoryMethod.concrete;

import com.ready2die.factoryMethod.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
