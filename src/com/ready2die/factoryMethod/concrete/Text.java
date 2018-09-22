package com.ready2die.factoryMethod.concrete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Text {

    public static void main(String[] args) {
        String str = "Text";
        String str2 = "text2";

        String test ="text2";

        //language=JSON
        String json = "{\n" +
                "\"name\": \"lee\"}";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("new.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
