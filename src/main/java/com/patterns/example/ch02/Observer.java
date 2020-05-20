package com.patterns.example.ch02;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
