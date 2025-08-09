package com.heima.designpatterns.pattern.adaptor.obje;

import com.heima.designpatterns.pattern.adaptor.obje.sd.SDCard;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:40
 * @description:
 */
public class SDAdaptor implements SDCard {

    private TFCard tfCard;

    @Override
    public String readSD() {
        System.out.println("adaptor read data：");
        return this.tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adaptor write data：");
        tfCard.writeTF(msg);
    }

    public TFCard setTF(TFCard tfCard) {
        this.tfCard = tfCard;
        return tfCard;
    }
}
