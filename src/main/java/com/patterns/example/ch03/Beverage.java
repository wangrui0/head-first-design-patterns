package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc 饮料抽象类
 */
public abstract class Beverage {
    private BeverageEnum beverageEnum;

    public BeverageEnum getBeverageEnum() {
        return beverageEnum;
    }

    public void setBeverageEnum(BeverageEnum beverageEnum) {
        this.beverageEnum = beverageEnum;
    }

    String description = "unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
