package com.ready2die.strategy.case2.step3;

public class Oracle extends Database {

    public Oracle() {
        name = "oracle";
        rows = 10;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + " 에 접속했습니다.");
    }
}
