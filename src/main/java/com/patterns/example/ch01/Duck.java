package com.patterns.example.ch01;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public abstract class Duck {
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("所有的鸭子都会游泳！");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
