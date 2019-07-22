package com.ready2die.singleton.other_practice2;

import com.ready2die.singleton.other_practice2.Database;

public class Main {

    public static void main(String[] args) {

        Database database = Database.getInstance("first database");
        System.out.println("database name is " + database.getName());


    }
}
