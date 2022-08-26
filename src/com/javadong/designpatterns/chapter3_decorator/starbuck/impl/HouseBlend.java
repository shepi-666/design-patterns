package com.javadong.designpatterns.chapter3_decorator.starbuck.impl;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:29
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
        this.price = 0.89;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
