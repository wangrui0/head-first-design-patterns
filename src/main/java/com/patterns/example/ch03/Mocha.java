package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc 摩卡 装饰
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BeverageEnum getSize() {
        return beverage.getBeverageEnum();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    //豆浆调料分大杯小杯
    @Override
    public double cost() {
        BeverageEnum beverageEnum = getSize();
        double cost = beverage.cost();
        if (BeverageEnum.TALL.equals(beverageEnum)) {
            cost += 0.1;
        } else if (BeverageEnum.GRANDE.equals(beverageEnum)) {
            cost += 0.15;
        } else {
            cost += 0.18;
        }
        return cost;
    }
}
