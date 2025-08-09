package com.heima.designpatterns.pattern.proxy.staticproxy;

/**
 * @author: DongShaowei
 * @created: 2025-05-25 16:25
 * @description:
 */
public class ProxyPoint implements SellTicks{

    /**
     * 火车站
     */
    private TrainStation trainStation;

    public ProxyPoint(TrainStation trainStation) {
        this.trainStation = trainStation;
    }

    /**
     * 代售点卖票
     */
    @Override
    public void sell() {
        // 代理点收取代理点手续费
        System.out.println("代理点收取代理点手续费");
        trainStation.sell();
    }
}
