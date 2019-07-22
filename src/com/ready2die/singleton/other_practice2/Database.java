package com.ready2die.singleton.other_practice2;

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

    public synchronized static Database getInstance(String name) {
        // synchronized 의 비용이 비싸다 대기하고 있는 Thread를 한 줄로 세워두고 진행하므로 병목현상이 발생할 수 있다.
        if (database == null) {
            database = new Database(name);
        }
        return database;
    }


}
