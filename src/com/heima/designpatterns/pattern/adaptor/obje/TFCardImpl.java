package com.heima.designpatterns.pattern.adaptor.obje;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:28
 * @description:
 */
public class TFCardImpl implements TFCard {

    /**
     * 存储数据
     */
    private String msg = "default data";

    @Override
    public String readTF() {
        System.out.println("TF card read data："+ msg);
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF card write data："+ msg);
        this.msg = msg;
    }
}
