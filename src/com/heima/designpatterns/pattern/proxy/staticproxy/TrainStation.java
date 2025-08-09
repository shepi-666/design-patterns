package com.heima.designpatterns.pattern.proxy.staticproxy;

/**
 * 火车站类
 * @author: DongShaowei
 * @created: 2025-05-25 16:24
 * @description:
 */
public class TrainStation implements SellTicks{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
