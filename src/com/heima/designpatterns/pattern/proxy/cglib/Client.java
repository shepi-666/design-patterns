package com.heima.designpatterns.pattern.proxy.cglib;

/**
 * @author: DongShaowei
 * @created: 2025-05-25 17:36
 * @description: CGLIB代理模式测试类
 */
public class Client {

    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyInstance();
        // 调用代理对象方法
        proxyObject.sell();
    }
}
