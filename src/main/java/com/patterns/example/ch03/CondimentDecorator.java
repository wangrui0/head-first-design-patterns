package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc 调料抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract BeverageEnum getSize();


    public abstract String getDescription();
}
