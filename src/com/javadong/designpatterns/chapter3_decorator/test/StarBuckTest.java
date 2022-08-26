package com.javadong.designpatterns.chapter3_decorator.test;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Beverage;
import com.javadong.designpatterns.chapter3_decorator.starbuck.impl.Espresso;
import com.javadong.designpatterns.chapter3_decorator.starbuck.impl.Mocha;
import com.javadong.designpatterns.chapter3_decorator.starbuck.impl.Soy;
import com.javadong.designpatterns.chapter3_decorator.starbuck.impl.Whip;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:40
 */
public class StarBuckTest {

    @Test
    public void testStarBuck() {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage);

    }
}
