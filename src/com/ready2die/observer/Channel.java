package com.ready2die.observer;

public interface Channel<T> {
    void update(T t);
}
