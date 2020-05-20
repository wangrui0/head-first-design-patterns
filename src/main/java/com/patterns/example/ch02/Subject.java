package com.patterns.example.ch02;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
