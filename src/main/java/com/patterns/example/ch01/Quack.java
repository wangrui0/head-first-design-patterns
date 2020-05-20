package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
