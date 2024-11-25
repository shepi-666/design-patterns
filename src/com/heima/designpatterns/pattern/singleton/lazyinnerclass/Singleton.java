package com.heima.designpatterns.pattern.singleton.lazyinnerclass;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:53
 * @description: 懒汉式-静态内部类的方式
 */
public class Singleton {

    private Singleton() { }

    // definition of the static inner class
    private static class SingletonHolder {
        // define and initialize the outer instance in inner-class
        private static final Singleton INSTANCE = new Singleton();
    }

    // provide the public access
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
