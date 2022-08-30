package com.javadong.designpatterns.chapter4_factory.test;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaStore;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.enums.PizzaType;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.impl.ChicagoPizzaStore;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.impl.NyPizzaStore;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/29 9:30
 */
public class PizzaTest {
    @Test
    public void testAbstractFactory() {
        PizzaStore store = new NyPizzaStore();
        store.orderPizza(PizzaType.CHEESE.getType());
    }
}
