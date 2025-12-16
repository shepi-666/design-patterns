package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:36
 * @description: 炒面-具体构件
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(float price, String desc) {
        super(12, "fried noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
