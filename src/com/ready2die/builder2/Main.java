package com.ready2die.builder2;

public class Main {
    public static void main(String[] args) {

        // Computer computer = new Computer("256g ssd", "i7", 8g); // 어떤 값이 들어가야 할지 혼란 개수가 많은 경우 아래 명시적으로 판단가능
        Computer computer = ComputerBuilder
                .startWithCpu("i7")
//              .setCpu("i7")
                .setRam("8g")
                .setStorage("128g ssd")
                .build();

        System.out.println(computer.toString());
    }
}
