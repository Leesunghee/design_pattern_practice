package com.ready2die.adapter.case1.step1;

public class BPlayerImpl implements BPlayer {
    @Override
    public void playFile(String filename) {
        System.out.println("(B) " + filename);
    }

    @Override
    public void stopFile() {

    }
}
