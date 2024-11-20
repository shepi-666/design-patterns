package com.heima.designpatterns.pattern.singleton.eager1;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:17
 * @description: 饿汉式：静态成员变量的方式
 */
public class Singleton {

    // 1.私有构造方法
    private Singleton() {

    }

    // 2.在本类中创建该类的实例
    private static Singleton instance = new Singleton();

    // 3.提供一个公共的访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
