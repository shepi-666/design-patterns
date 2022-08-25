package com.javadong.designpatterns.chapter1_quickstart.impl;

import com.javadong.designpatterns.chapter1_quickstart.Duck;

/**
 * @author DongShaowei
 * @description 模型鸭子
 * @date 2022/8/25 8:15
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }
}
