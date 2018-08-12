package com.ready2die.strategy;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA() {

//        위임한다.
        ainterface.funcA();
        ainterface.funcA();


        // ~ 기능이 필요합니다. 개발해주세요

    }
}
