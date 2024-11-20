package com.heima.designpatterns.pattern.singleton.lazyunsafety;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:30
 * @description: 懒汉式：非线程安全
 */
public class Singleton {

    private Singleton() { }

    // 1.声明singleton类型的变量
    private static Singleton instance;

    // 2.对外提供访问方式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
} 
