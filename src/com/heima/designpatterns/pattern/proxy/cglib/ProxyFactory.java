package com.heima.designpatterns.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/** CGLIB代理工厂，获取代理对象
 * @author: DongShaowei
 * @created: 2025-05-25 17:31
 * @description:
 */
public class ProxyFactory {

    private final TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象
     * @return
     */
    public TrainStation getProxyInstance() {
        // 1.创建 Enhancer 对象
        Enhancer enhancer = new Enhancer();
        // 2.设置父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 3.设置回调函数
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("CGLIB代理模式");
            // 调用目标对象方法
            return method.invoke(trainStation, objects);
        });

        // 4.创建代理对象

        // 5.返回代理对象
        return (TrainStation) enhancer.create();
    }

}
