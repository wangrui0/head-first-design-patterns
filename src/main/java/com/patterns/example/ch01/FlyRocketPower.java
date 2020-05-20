package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying with a rocket!");
    }
}
