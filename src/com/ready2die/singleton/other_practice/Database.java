package com.ready2die.singleton.other_practice;

public class Database {


    private static Database database;

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
        if (database == null) {
            database = new Database(name);
        }
        return database;
    }


}
