package com.ready2die.bridge;

public class SoundMorseCodeFunction implements MorseCodeFunction {

    @Override
    public void dot() {
        System.out.print("Beep ");
    }

    @Override
    public void dash() {
        System.out.print("Long beep ");
    }

    @Override
    public void space() {
        System.out.print("Space ");
    }
}
