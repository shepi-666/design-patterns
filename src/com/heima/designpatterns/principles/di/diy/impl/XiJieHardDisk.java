package com.heima.designpatterns.principles.di.old;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:20
 * @description:
 */
public class XiJieHardDisk {

    /**
     * 存储数据的方法
     * @param data
     */
    public void save(String data) {
        System.out.println("the data: " + data + " has been saved");
    }

    public String get() {
        System.out.println("data: XiJie Disk");
        return "best hard disk for you ";
    }
}
