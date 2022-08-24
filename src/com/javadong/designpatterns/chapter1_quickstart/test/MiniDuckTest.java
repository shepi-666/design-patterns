package com.javadong.designpatterns.chapter1_quickstart.test;

import com.javadong.designpatterns.chapter1_quickstart.Duck;
import com.javadong.designpatterns.chapter1_quickstart.impl.MallardDuck;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/24 19:36
 */
public class MiniDuckTest {

    @Test
    public void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }
}
