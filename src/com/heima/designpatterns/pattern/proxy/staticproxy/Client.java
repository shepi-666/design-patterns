package com.heima.designpatterns.pattern.proxy.staticproxy;

/**
 * @author: DongShaowei
 * @created: 2025-05-25 16:26
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        SellTicks proxyPoint = new ProxyPoint(trainStation);
        proxyPoint.sell();
    }
}
