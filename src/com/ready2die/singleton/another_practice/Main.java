package com.ready2die.singleton.another_practice;

public class Main {

    public static void main(String[] args) {

        LogWriter logger;

        logger = LogWriter.getInstance();
        logger.log("홍길동");

        logger = LogWriter.getInstance();
        logger.log("이반장");
    }
}
