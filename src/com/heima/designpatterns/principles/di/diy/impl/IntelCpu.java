package com.heima.designpatterns.principles.di.diy.impl;

import com.heima.designpatterns.principles.di.diy.CPU;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:23
 * @description:
 */
public class IntelCpu implements CPU {

    @Override
    public void run() {
        System.out.println(" Intel Cpu is running");
    }
}
