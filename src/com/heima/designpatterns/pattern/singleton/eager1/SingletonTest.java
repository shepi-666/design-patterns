package com.heima.designpatterns.pattern.singleton.eager1;

import com.heima.designpatterns.pattern.singleton.eager2.Singleton;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:21
 * @description:
 */
public class SingletonTest {


    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
