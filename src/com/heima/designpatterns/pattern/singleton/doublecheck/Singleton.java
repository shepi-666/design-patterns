package com.heima.designpatterns.pattern.singleton.doublecheck;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:30
 * @description: 懒汉式：双重检查锁
 */
public class Singleton {

    private Singleton() { }

    // 1.声明singleton类型的变量，防止创建对象的时候进行指令重排序
    private static volatile Singleton instance;

    // 2.对外提供访问方式
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        // 如果发生了指令重排序，此处返回的对象可能是半成品
        return instance;
    }
} 
