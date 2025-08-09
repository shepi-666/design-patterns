package com.heima.designpatterns.pattern.proxy.jdkproxy;

import com.heima.designpatterns.pattern.proxy.staticproxy.SellTicks;
import com.heima.designpatterns.pattern.proxy.staticproxy.TrainStation;

/** 测试JDK动态代理
 * @author: DongShaowei
 * @created: 2025-05-25 16:39
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        //创建被代理对象
        TrainStation trainStation = new TrainStation();
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        SellTicks proxyInstance = proxyFactory.getProxyInstance(trainStation);
        //调用代理对象方法
        proxyInstance.sell();
    }
}
