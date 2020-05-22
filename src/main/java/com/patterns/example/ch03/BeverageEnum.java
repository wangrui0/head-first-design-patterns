package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public enum BeverageEnum {


    TALL("小杯"),

    GRANDE("中杯"),

    VENTI("大杯");
    
    private String description;

    BeverageEnum(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
