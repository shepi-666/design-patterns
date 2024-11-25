package com.heima.designpatterns.principles.isolation.before.impl;

import com.heima.designpatterns.principles.isolation.before.SafetyDoor;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 22:17
 * @description: A 品牌安全门
 */
public class DoorA implements SafetyDoor {

    /** 防盗功能*/
    @Override
    public void antiTheft() {
        System.out.println("this door is anti-theft");
    }

    /** 防火功能 */
    @Override
    public void fireProof() {
        System.out.println("this door could proof fire");
    }

    /** 防水功能 */
    @Override
    public void waterProof() {
        System.out.println("this door could proof water");

    }
}
