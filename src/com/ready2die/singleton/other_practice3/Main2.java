package com.ready2die.singleton.other_practice3;

import com.ready2die.singleton.other_practice3.Database;

public class Main2 {

    static int nNum = 0;

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "번째 Database");
                System.out.println("This is the " + database.getName() + " !!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 10; i++) {  //Thread가 거의 동시에 만들어지기 때문에  Database 객체가 여러개 만들어지는 문제가 있음
            Thread t = new Thread(task);
            t.start();
        }
    }
}
