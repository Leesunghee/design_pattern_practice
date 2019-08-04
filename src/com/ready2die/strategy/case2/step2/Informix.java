package com.ready2die.strategy.case2.step2;

public class MySQL extends Database {

    public MySQL() {
        name = "MySQL";
        rows = 20;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + "접속했습니다.");
    }
}
