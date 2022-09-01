package com.javadong.designpatterns.chapter5_singleton.test;

import com.javadong.designpatterns.chapter5_singleton.impl.Singleton1;
import com.javadong.designpatterns.chapter5_singleton.impl.Singleton3;
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

    @Test
    public void testEager() {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);

    }
}
