package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.Pizza;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaIngredientFactory;

/**
 * @author DongShaowei
 * @description 花蛤披萨
 * @date 2022/8/29 21:56
 */
public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.clam = ingredientFactory.createClam();
    }
}
