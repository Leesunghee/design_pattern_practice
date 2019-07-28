package com.ready2die.observer.case2.step2;

public class MyClassB implements Observer {

    private Publisher obserable; // 등록될 Observable
    private boolean bPlay; // 실행 여부

    // 생성될 때 직접 자기 자신을 옵저에 등록한다.
    public MyClassB(Publisher obserable) {
        this.obserable = obserable;
        obserable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassB : 동작을 시작합니다.");
        } else {
            System.out.println("MyClassB : 동작을 정지합니다.");
            // 구독해지
            obserable.deleteObserver(this);
        }
    }

}
