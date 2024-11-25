package com.heima.designpatterns.principles.isolation.after.impl;

import com.heima.designpatterns.principles.isolation.after.Door;
import com.heima.designpatterns.principles.isolation.after.Waterproof;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 22:30
 * @description:
 */
public class DoorB extends Door implements Waterproof {
    @Override
    public void antiTheft() {
        System.out.println("this door is burglar-proof");
    }

    @Override
    public void waterproof() {
        System.out.println("this door is waterproof");
    }
}
