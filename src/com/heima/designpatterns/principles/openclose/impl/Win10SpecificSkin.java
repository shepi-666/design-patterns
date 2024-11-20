package com.heima.designpatterns.principles.openclose.impl;

import com.heima.designpatterns.principles.openclose.AbstractSkin;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 22:51
 * @description: 默认显示皮肤
 */
public class DefaultSpecificSkin extends AbstractSkin {

    /**
     * 默认皮肤显示
     */
    @Override
    public void display() {
        System.out.println("default skin");
    }
}
