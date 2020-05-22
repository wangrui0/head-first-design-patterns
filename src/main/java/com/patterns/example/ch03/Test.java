package com.patterns.example.ch03;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        //定一个espresso 咖啡
        Espresso espresso = new Espresso(BeverageEnum.TALL);
        System.out.println(espresso.getDescription() + ";花费:" + espresso.cost());
        //来一杯调料为：mocha,whip的DarkRoast 咖啡
        DarkRoast darkRoast = new DarkRoast(BeverageEnum.TALL);
        Mocha mocha = new Mocha(darkRoast);
        Whip whip = new Whip(mocha);
        //或者
        Whip whip2 = new Whip(new Mocha(new DarkRoast(BeverageEnum.GRANDE)));
        System.out.println(whip2.getDescription() + ";花费:" + whip2.cost());
        //调料为豆浆,摩卡，奶泡的houseBlend
        Soy soy = new Soy(new Mocha(new Whip(new HouseBlend(BeverageEnum.GRANDE))));
        System.out.println(soy.getDescription() + ";花费:" + soy.cost());


    }
}
