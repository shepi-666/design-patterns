package com.heima.designpatterns.pattern.singleton.eager2;


/**
 * @author: DongShaowei
 * @create: 2024-11-20 21:17
 * @description: 饿汉式：静态代码块的方式
 */
public class Singleton {

    // 1.私有构造方法
    private Singleton() { }

    // 2.声明Singleton类型的变量
    private static Singleton instance;

    // 3.静态代码块赋值
    static {
        instance = new Singleton();
    }

    // 4.提供一个公共的访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
