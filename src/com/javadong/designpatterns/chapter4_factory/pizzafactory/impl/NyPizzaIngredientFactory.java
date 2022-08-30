package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DongShaowei
 * @description 纽约原料生产工厂
 * @date 2022/8/29 10:50
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggies.add(new Garlic());
        veggies.add(new Onion());
        veggies.add(new Mushroom());
        veggies.add(new RedPepper());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
