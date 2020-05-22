package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso(BeverageEnum beverageEnum) {
        this.setBeverageEnum(beverageEnum);
        this.description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
