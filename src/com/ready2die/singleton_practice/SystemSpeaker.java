package com.ready2die.singleton_practice;

public class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volume = 5;

    private SystemSpeaker() {
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
            return instance;
        } else {
            return instance;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
