package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i am a MallardDuck");
        this.performFly();
        this.performQuack();
        this.swim();
    }
}
