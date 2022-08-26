package com.javadong.designpatterns.chapter3_decorator.starbuck.impl;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;
import com.javadong.designpatterns.chapter3_decorator.starbuck.Enums.Size;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:29
 */
public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.description = size.getDesc() + ": Espresso";
        this.price = 1.99;
        this.setSize(size);
    }

    @Override
    public double cost() {
        return this.price + getSize().getPrice();
    }
}
