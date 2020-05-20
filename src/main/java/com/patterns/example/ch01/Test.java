package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();

        mallardDuck.setFlyBehavior(new FlyRocketPower());
        mallardDuck.performFly();
    }
}
