package com.heima.designpatterns.principles.openclose.impl;

import com.heima.designpatterns.principles.openclose.AbstractSkin;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 22:51
 * @description: win10显示皮肤
 */
public class Win10SpecificSkin extends AbstractSkin {

    /**
     * 默认皮肤显示
     */
    @Override
    public void display() {
        System.out.println("win10 style skin");
    }
}
