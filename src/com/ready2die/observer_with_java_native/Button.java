package com.ready2die.observer_with_java_native;

import java.util.Observable;

public class Button extends Observable { // Observable이 클래스이기 때문에 자바에서는 다중상속이 불가 버튼 같은 경우 다른 View와 같은 다른 클래스를 상속 받을 가능성이 크기 때문에 다중상속의 문제가 발생할 수 있다.

    public void onClick() {
        setChanged(); // Observable의 changed 값을 변경해줘야 notifyObservers가 제대로 동작을 함.
        notifyObservers();
    }


}
