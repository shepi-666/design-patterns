package com.heima.designpatterns.pattern.adaptor.obje.sd;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:30
 * @description:
 */
public interface SDCard {

    /**
     * 读取SD卡方法
     * @return
     */
    String readSD();

    /**
     * 写入SD卡方法
     * @param msg
     */
    void writeSD(String msg);
}
