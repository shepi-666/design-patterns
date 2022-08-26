package com.javadong.designpatterns.chapter3_decorator.starbuck.impl;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;
import com.javadong.designpatterns.chapter3_decorator.starbuck.Condiment;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:33
 */
public class Whip extends Condiment {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.price = 0.10;
        this.description = "Whip";
    }

    @Override
    public double cost() {
        return this.price + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }
}
