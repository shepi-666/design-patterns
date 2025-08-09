package com.heima.designpatterns.pattern.adaptor.klazz.computer;

import com.heima.designpatterns.pattern.adaptor.klazz.sd.SDCard;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:35
 * @description:
 */
public class Computer {

    /**
     * 读取SD卡方法
     */
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        return sdCard.readSD();
    }
}
