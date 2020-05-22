package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc 豆浆
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BeverageEnum getSize() {
        return beverage.getBeverageEnum();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
