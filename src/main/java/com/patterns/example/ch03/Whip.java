package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BeverageEnum getSize() {
        return beverage.getBeverageEnum();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
