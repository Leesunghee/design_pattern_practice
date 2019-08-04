package com.ready2die.bridge.case1.step4;

import com.ready2die.bridge.case1.step3.IRobot;

// IRobot, RobotModel1, RobotModel2d의 변경 없이 기능을 추가하려고 한다.
public class IAction {

    private IRobot robot;

    public IAction(IRobot robot) {
        this.robot = robot;
    }

    // IRobot의 기능을 전부 똑같이 구현한다.
    public void powerOn() {
        robot.powerOn();
    }

    public void powerOff() {
        robot.powerOff();
    }
}
