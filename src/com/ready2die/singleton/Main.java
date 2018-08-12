package com.ready2die.singleton;

public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolumn());
        System.out.println(speaker2.getVolumn());

        speaker1.setVolumn(11);
        System.out.println(speaker1.getVolumn());
        System.out.println(speaker2.getVolumn());

        speaker2.setVolumn(22);
        System.out.println(speaker1.getVolumn());
        System.out.println(speaker2.getVolumn());

    }
}
