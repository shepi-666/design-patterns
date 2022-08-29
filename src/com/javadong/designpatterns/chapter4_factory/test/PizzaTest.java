package com.javadong.designpatterns.chapter4_factory.test;

import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaStore;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.PizzaType;
import com.javadong.designpatterns.chapter4_factory.pizzafactory.impl.ChicagoPizzaStore;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/29 9:30
 */
public class PizzaTest {

    @Test
    public void testPizzaFactory() {
        PizzaStore store = new ChicagoPizzaStore();
        store.orderPizza(PizzaType.CLAM.getType());
    }
}
