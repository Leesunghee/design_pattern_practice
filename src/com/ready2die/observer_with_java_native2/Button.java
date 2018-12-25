package com.ready2die.observer_with_java_native2;

public class Button {

    public Button(Observable<String> observable) {
        this.observable = observable;
    }

    private Observable<String> observable;

    public void addObserver(Observable.Observer<String> o) {
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.setChanged();
        observable.notifyObservers(null);
    }

    public void onClick() {
        notifyObservers();
    }
}
