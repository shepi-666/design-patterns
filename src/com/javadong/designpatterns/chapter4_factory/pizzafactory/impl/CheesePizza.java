package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.Pizza;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaIngredientFactory;

/**
 * @author DongShaowei
 * @description 芝士披萨
 * @date 2022/8/29 21:56
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
