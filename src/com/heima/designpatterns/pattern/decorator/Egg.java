package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:41
 * @description: 鸡蛋
 */
public class Egg extends Garnish{

    private final static float PRICE = 1.0f;

    public Egg(FastFood fastFood) {
        super(PRICE, "egg", fastFood);
    }

    @Override
    public float cost() {
        return getPrice()
                + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()
                + "&"
                + getFastFood().getDesc();
    }
}
