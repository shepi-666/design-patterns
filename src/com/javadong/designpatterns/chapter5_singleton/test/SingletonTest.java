package com.javadong.designpatterns.chapter5_singleton.test;

import com.javadong.designpatterns.chapter5_singleton.impl.Singleton1;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/30 10:53
 */
public class SingletonTest {

    @Test
    public void testClassic() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();

        System.out.println(instance1 == instance2);
    }
}
