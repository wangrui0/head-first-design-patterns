package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public class HouseBlend extends Beverage {
    public HouseBlend(BeverageEnum beverageEnum) {
        this.setBeverageEnum(beverageEnum);
        this.description = "综合咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
