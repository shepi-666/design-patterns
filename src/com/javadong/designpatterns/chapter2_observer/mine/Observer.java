package com.javadong.designpatterns.chapter2_observer.mine;

/**
 * @author DongShaowei
 * @description 观察者类
 * @date 2022/8/25 12:44
 */
public interface Observer {

    /**
     * 更新气象参数的方法
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure);
}
