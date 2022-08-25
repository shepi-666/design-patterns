package com.javadong.designpatterns.chapter2_observer.mine;

/**
 * @author DongShaowei
 * @description 主题类
 * @date 2022/8/25 12:43
 */
public interface Subject {

    /**
     * 注册观测者
     * @param o 观测者
     */
    public void registerObserver(Observer o);

    /**
     * 移除一个观测者
     * @param o 观测者
     */
    public void removeObserver(Observer o);

    /**
     * 通知观测者
     */
    public void notifyObservers();
}
