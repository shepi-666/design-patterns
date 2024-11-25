package com.heima.designpatterns.pattern.singleton.lazysafety;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:30
 * @description: 懒汉式：线程安全的
 */
public class Singleton {

    private Singleton() { }

    // 1.声明singleton类型的变量
    private static Singleton instance;

    // 2.对外提供访问方式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
} 
