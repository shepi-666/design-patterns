package com.heima.designpatterns.pattern.adaptor.klazz.sd;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:31
 * @description:
 */
public class SDCardImpl implements SDCard{

    /**
     * 存储数据
     */
    private String msg;


    @Override
    public String readSD() {
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        this.msg = msg;
    }

    public SDCardImpl (String msg) {
        this.msg = msg;
    }

    public SDCardImpl () {

    }
}
