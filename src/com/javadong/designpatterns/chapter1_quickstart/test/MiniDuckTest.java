package com.javadong.designpatterns.chapter1_quickstart.test;

import com.javadong.designpatterns.chapter1_quickstart.Duck;
import com.javadong.designpatterns.chapter1_quickstart.impl.FlyRocketPowered;
import com.javadong.designpatterns.chapter1_quickstart.impl.MallardDuck;
import com.javadong.designpatterns.chapter1_quickstart.impl.ModelDuck;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/24 19:36
 */
public class MiniDuckTest {

    @Test
    public void testMallardDuck() {
        // 测试绿头鸭子
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();


        // 测试模型鸭子
        Duck model = new ModelDuck();
        model.performFly();;
        model.performQuack();
        model.display();
        System.out.println("====================");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
