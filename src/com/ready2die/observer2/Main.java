package com.ready2die.observer2;

public class Main {

    public static void main(String[] args) {

        Button button = new Button();

        button.setOnClickListener(button1 -> System.out.println(button1 + "is Clicked"));
        button.onClick();
    }
}

//class ButtonClick implements Button.OnClickListener {
//
//    @Override
//    public void onClick(Button button) {
//        System.out.println(button + "is Clicked");
//    }
//}
