package com.javadong.designpatterns.chapter3_decorator.starbuck.impl;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;
import com.javadong.designpatterns.chapter3_decorator.starbuck.Enums.Size;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:29
 */
public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        this.description = size.getDesc() + ": HouseBlend";
        this.price = 0.89;
        this.setSize(size);
    }

    @Override
    public double cost() {
        return this.price + getSize().getPrice();
    }
}
