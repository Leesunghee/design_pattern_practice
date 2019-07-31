package com.ready2die.adapter.case2.step1;

public class BPlayerImpl extends BPlayer {
    @Override
    public void playFile(String filename) {
        System.out.println("(B) " + filename);
    }

    @Override
    public void stopFile() {

    }
}
