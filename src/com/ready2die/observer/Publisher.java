package com.ready2die.observer;

public interface Publisher {
    void addObserver(Channel channel);

    void removeObserver(Channel channel);

    void notifyObserver();
}
