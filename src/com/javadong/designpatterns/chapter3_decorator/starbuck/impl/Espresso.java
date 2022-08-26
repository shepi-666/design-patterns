package com.javadong.designpatterns.chapter3_decorator.starbuck.impl;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:29
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
        this.price = 1.99;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
