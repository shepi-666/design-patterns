package com.heima.designpatterns.principles.di.diy.impl;

import com.heima.designpatterns.principles.di.diy.HardDisk;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:20
 * @description:
 */
public class XiJieHardDisk implements HardDisk {

    /**
     * 存储数据的方法
     * @param data
     */
    @Override
    public void save(String data) {
        System.out.println("the data: " + data + " has been saved");
    }

    @Override
    public String get() {
        System.out.println("data: XiJie Disk");
        return "best hard disk for you ";
    }
}
