package com.heima.designpatterns.principles.di.diy;

/**
 * 硬盘接口
 */
public interface HardDisk {

    /**
     * 存储数据
     * @param data
     */
    void save(String data);

    /**
     * 获取数据的方法
     * @return
     */
    String get();
}
