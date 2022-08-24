package com.javadong.designpatterns.chapter1_quickstart.impl;

import com.javadong.designpatterns.chapter1_quickstart.FlyBehavior;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/24 19:28
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
