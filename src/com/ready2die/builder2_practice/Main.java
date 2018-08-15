package com.ready2die.builder2_practice;

public class Main {
    public static void main(String[] args) {


        Computer computer1 = ComputerBuilder.start()
            .setCpu("i7")
            .setRam("8g")
            .setStorage("256g ssd")
            .build();

        Computer computer2 = ComputerBuilder.startWithSetCpu("i7++")
            .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
