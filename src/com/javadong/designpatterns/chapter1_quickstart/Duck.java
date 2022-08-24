package com.javadong.designpatterns.chapter1_quickstart;

/**
 * @author DongShaowei
 * @description 鸭子抽象超类
 * @date 2022/8/24 18:07
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    /**
     * 展示鸭子颜色的方法
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All the ducks float, even decoys!!");
    }
}
