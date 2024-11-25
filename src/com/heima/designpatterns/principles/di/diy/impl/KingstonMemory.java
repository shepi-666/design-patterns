package com.heima.designpatterns.principles.di.diy.impl;

import com.heima.designpatterns.principles.di.diy.Memory;


/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:23
 * @description:
 */
public class KingstonMemory implements Memory {

    /**
     * 保存的方法
     */
    @Override
    public void save() {
        System.out.println("save data by kingston");
    }
}
