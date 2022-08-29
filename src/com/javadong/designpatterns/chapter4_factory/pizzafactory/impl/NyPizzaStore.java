package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.Pizza;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaStore;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaType;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/29 9:10
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (PizzaType.CHEESE.getType().equals(type)) {
            return new NyStyleCheesePizza();
        } else if (PizzaType.CLAM.getType().equals(type)) {
            return new NyStyleClamPizza();
        } else if (PizzaType.VEGGIE.getType().equals(type)) {
            return new NyStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
