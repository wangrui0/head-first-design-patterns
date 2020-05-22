package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public class DarkRoast extends Beverage {


    public DarkRoast(BeverageEnum beverageEnum) {
        this.setBeverageEnum(beverageEnum);
        this.description = "深烘咖啡";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
