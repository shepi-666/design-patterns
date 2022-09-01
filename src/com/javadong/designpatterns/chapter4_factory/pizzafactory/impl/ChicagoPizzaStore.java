package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.Pizza;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaIngredientFactory;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaStore;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.enums.PizzaType;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/29 9:10
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pif = new ChicagoPizzaIngredientFactory();

        if (PizzaType.CHEESE.getType().equals(type)) {
            pizza = new CheesePizza(pif);
            pizza.setName("Chicago style cheese pizza");
        }

        if (PizzaType.CLAM.getType().equals(type)) {
            pizza = new ClamPizza(pif);
            pizza.setName("Chicago style clam pizza");
        }

        return pizza;
    }
}
