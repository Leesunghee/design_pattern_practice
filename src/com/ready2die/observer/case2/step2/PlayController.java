package com.ready2die.observer.case2.step2;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {

    private List<Observer> observers = new ArrayList<>();
    private boolean play; //실행여부

    public PlayController() {
    }

    // 데이터를 전달 받아 플래그 값을 변경하고,
    // 새로운 데이터가 들어왔음을 알린다.
    public void setFlag(boolean bPlay) {
        this.play = bPlay;
        notifyObservers();
    }

    // 실행 여부 플래그 값 반환
    public boolean getFlag() {
        return play;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(play);
        }
    }

    //    for (int i = 0; i < observers.size(); i++) {
    //        observers.get(i).update(play);
    //    }
    // 다음을 사용하면 구독 해지 시 다음과 같은 에러가 발생한다.
    // ConcurrentModificationException
    //    for (Observer observer:
    //    observers) {
    //        observer.update(play);
    //    }
}
