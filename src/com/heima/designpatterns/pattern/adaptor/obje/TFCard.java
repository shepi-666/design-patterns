package com.heima.designpatterns.pattern.adaptor.obje;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:27
 * @description: TF卡接口
 */
public interface TFCard {

    /**
     * 读取TF卡
     * @return
     */
    String readTF();

    /**
     * 写入TF卡
     * @param msg
     */
    void writeTF(String msg);
}
