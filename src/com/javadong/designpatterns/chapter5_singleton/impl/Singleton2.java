package com.javadong.designpatterns.chapter5_singleton.impl;

/**
 * @author DongShaowei
 * @description 多线程下的单例模式
 * @date 2022/8/30 10:51
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    /**
     * 私有构造器
     */
    private Singleton2() { }

    /**
     * 迫使每个线程在进入方法之前，先等候别的线程离开此方法
     */
    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
