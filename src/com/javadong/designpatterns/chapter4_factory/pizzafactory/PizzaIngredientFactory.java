package com.javadong.designpatterns.chapter4_factory.pizzafactory;

import java.util.List;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/29 10:45
 */
public interface PizzaIngredientFactory {

    /**
     * 生产面团的工厂方法
     * @return 面团
     */
    public Dough createDough();

    /**
     * 生产酱料的工厂方法
     * @return 酱料
     */
    public Sauce createSauce();


    /**
     * 生产芝士的工厂方法
     * @return 芝士
     */
    public Cheese createCheese();


    /**
     * 生产蔬菜的工厂方法
     * @return 蔬菜
     */
    public List<Veggies> createVeggies();


    /**
     * 生产香肠的工厂方法
     * @return 香肠
     */
    public Pepperoni createPepperoni();

    /**
     * 生产蛤蜊的工厂方法
     * @return 蛤蜊
     */
    public Clam createClam();
}
