package com.javadong.designpatterns.chapter1_quickstart.impl;

import com.javadong.designpatterns.chapter1_quickstart.Duck;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/24 19:34
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
