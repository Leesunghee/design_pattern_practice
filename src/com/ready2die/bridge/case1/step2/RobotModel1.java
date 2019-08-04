package com.ready2die.bridge.case1.step2;

public class RobotModel1 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power off");
    }
}
