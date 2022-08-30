package com.javadong.designpatterns.chapter5_singleton.impl;

/**
 * @author DongShaowei
 * @description 双重检查锁实现单例模式
 * @date 2022/8/30 10:51
 */
public class Singleton4 {

    private volatile static Singleton4 uniqueInstance;

    private Singleton4() { };


    public static Singleton4 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
