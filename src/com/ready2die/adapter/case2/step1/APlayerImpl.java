package com.ready2die.adapter.case2.step1;

public class APlayerImpl implements APlayer {

    @Override
    public void play(String filename) {
        System.out.println("(A) " + filename);
    }

    @Override
    public void stop() {

    }
}
