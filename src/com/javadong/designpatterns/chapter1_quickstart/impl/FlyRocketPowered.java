package com.javadong.designpatterns.chapter1_quickstart.impl;

import com.javadong.designpatterns.chapter1_quickstart.FlyBehavior;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 8:17
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
