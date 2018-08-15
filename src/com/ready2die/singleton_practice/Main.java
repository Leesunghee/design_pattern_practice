package com.ready2die.singleton_practice;

public class Main {
    public static void main(String[] args) {

        SystemSpeaker speaker = SystemSpeaker.getInstance();

        speaker.setVolume(56);
        System.out.println(speaker.getVolume());

        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        speaker1.setVolume(13);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker.getVolume());
    }
}
