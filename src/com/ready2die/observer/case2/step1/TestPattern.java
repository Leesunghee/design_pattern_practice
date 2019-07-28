package com.ready2die.observer.case2.step1;

public class TestPattern {

    public static void main(String[] args) {

        PlayController controller = new PlayController();

        Observer ob1 = new MyClassA();
        Observer ob2 = new MyClassB();

        // 구독자(옵저버) 등록
        controller.addObserver(ob1);
        controller.addObserver(ob2);

        // 메시지 등록
        controller.setFlag(false);

        // 구독 해지
        controller.deleteObserver(ob2);

        System.out.println("------------------------");

        //메시지 등록
        controller.setFlag(true);

        System.out.println();
    }
}
