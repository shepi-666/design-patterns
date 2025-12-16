package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:34
 * @description: 炒饭-具体构件
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
