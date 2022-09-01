package com.javadong.designpatterns.chapter5_singleton.impl;

/**
 * @author DongShaowei
 * @description 经典的单例模式
 * @date 2022/8/30 10:51
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    /**
     * 私有构造器
     */
    private Singleton1() { }

    /**
     * 获取单例的方法
     * @return 单例
     */
    public static Singleton1 getInstance() {
        // 如果之前没有创建过实例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
