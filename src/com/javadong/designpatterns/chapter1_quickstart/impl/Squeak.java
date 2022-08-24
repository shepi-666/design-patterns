package com.javadong.designpatterns.chapter1_quickstart.impl;

import com.javadong.designpatterns.chapter1_quickstart.QuackBehavior;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/24 19:32
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
