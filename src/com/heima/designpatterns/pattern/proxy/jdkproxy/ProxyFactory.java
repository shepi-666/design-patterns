package com.heima.designpatterns.pattern.proxy.jdkproxy;

import com.heima.designpatterns.pattern.proxy.staticproxy.SellTicks;
import com.heima.designpatterns.pattern.proxy.staticproxy.TrainStation;
import com.sun.deploy.net.proxy.*;

import java.net.URL;

/** 获取代理对象工厂类
 * @author: DongShaowei
 * @created: 2025-05-25 16:33
 * @description:
 */
public class ProxyFactory {

    /**
     * 火车站
     */
    private TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象
     * @param sellTicks
     * @return
     */
    public SellTicks getProxyInstance(SellTicks sellTicks){

        // 返回Jdk代理对象
        return (SellTicks) java.lang.reflect.Proxy.newProxyInstance(
                sellTicks.getClass().getClassLoader(), // 加载接口的类加载器
                sellTicks.getClass().getInterfaces(), // 代理对象和真实对象实现相同的接口
                // 代理对象调用方法时，会执行这个方法
                (proxy, method, args) -> {
                    System.out.println("Jdk代售点收取手续费");
                    // 调用真实对象方法
                    Object obj = method.invoke(trainStation, args);
                    return obj;
                }
        );
    }
}
