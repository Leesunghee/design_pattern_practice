package com.ready2die.factoryMethod.concrete;

import com.ready2die.factoryMethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
