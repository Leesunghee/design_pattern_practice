package com.ready2die.factoryMethod;

import com.ready2die.factoryMethod.concrete.HpCreator;
import com.ready2die.factoryMethod.concrete.MpCreator;
import com.ready2die.factoryMethod.framework.Item;
import com.ready2die.factoryMethod.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();

    }
}
