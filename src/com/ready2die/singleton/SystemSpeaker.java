package com.ready2die.singleton;

public class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volumn;

    private SystemSpeaker() {
        volumn = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {

            //시스템 스피커
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");
        }
        return instance;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }
}
