package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我能飞！");
    }
}
