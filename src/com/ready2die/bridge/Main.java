package com.ready2die.bridge;

public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());

        code.g().a().r().a().m();

    }
}
