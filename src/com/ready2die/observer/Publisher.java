package com.ready2die.observer;

public interface Publisher<T> {
    void addObserver(T t);

    void removeObserver(T t);

    void notifyObserver();
}
