package com.javadong.designpatterns.chapter4_factory.pizzafactory.impl;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DongShaowei
 * @description 芝加哥原料生产工厂
 * @date 2022/8/29 10:50
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new KetchupSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggies.add(new BlackOlives());
        veggies.add(new Eggplant());
        veggies.add(new Spinach());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new DriedClam();
    }
}
