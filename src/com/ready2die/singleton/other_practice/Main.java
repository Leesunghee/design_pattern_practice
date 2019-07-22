package com.ready2die.singleton.other_practice;

public class Main {

    public static void main(String[] args) {

        Database database = Database.getInstance("first database");
        System.out.println("database name is " + database.getName());


    }
}
