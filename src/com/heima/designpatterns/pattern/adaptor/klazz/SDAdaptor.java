package com.heima.designpatterns.pattern.adaptor.klazz;

import com.heima.designpatterns.pattern.adaptor.klazz.sd.SDCard;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:40
 * @description:
 */
public class SDAdaptor extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adaptor read data：");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adaptor write data：");
        writeTF(msg);
    }
}
