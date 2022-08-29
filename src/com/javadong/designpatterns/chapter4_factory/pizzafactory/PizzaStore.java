package com.javadong.designpatterns.chapter4_factory.pizzafactory;

/**
 * @author DongShaowei
 * @description 披萨店的抽象类
 * @date 2022/8/29 8:49
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    /**
     * 创建披萨的方法(工厂方法)
     * @param type 披萨类型
     * @return 披萨
     */
    protected abstract Pizza createPizza(String type);
}
