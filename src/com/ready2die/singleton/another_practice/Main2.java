package com.ready2die.singleton.another_practice;

public class Main2 {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            // Thread 마다 구분되는 로그 작성용 파라미터
            Thread t = new ThreadSub(i);
            t.start();
            
        }

    }
}

// 외부 클래스
class ThreadSub extends Thread {
    
    int num;

    public ThreadSub(int num) {
        this.num = num;
    }
    
    @Override
    public void run() {
        LogWriter logger = LogWriter.getInstance();
        if (num < 10) {
            logger.log("*** 0" + num + " ***");
        } else {
            logger.log("*** " + num + " ***");
        }
    }
}
