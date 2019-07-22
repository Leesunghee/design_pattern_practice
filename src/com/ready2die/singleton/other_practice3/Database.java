package com.ready2die.singleton.other_practice3;

public class Database {


    private static Database database = new Database("products");

    private String name;

    public String getName() {
        return name;
    }

    private Database(String name) {
//        super();
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance(String name) {
        return database;
    }


}
