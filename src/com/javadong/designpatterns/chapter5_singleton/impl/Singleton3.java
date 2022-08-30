package com.javadong.designpatterns.chapter5_singleton.impl;

/**
 * @author DongShaowei
 * @description 饿汉模式的单例模式
 * @date 2022/8/30 10:51
 */
public class Singleton3 {
    /**
     * 饿汉模式创建实例,保证任何线程访问uniqueInstance静态变量之前都一定先创建此实例
     */
    private static final Singleton3 UNIQUE_INSTANCE = new Singleton3();

    private Singleton3() {};


    public static Singleton3 getInstance() {
        return UNIQUE_INSTANCE;
    }
}
