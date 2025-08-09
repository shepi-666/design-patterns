package com.heima.designpatterns.pattern.adaptor;

import com.heima.designpatterns.pattern.adaptor.klazz.SDAdaptor;
import com.heima.designpatterns.pattern.adaptor.klazz.computer.Computer;
import com.heima.designpatterns.pattern.adaptor.klazz.sd.SDCardImpl;

/**
 * @author: DongShaowei
 * @created: 2025-08-09 17:36
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl("the data from sd card")));

        System.out.println(computer.readSD(new SDAdaptor()));

    }
}
