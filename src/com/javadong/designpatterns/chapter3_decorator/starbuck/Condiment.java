package com.javadong.designpatterns.chapter3_decorator.starbuck;

/**
 * @author DongShaowei
 * @description 调料的抽象类，继承自饮料
 * @date 2022/8/26 10:25
 */
public abstract class Condiment extends Beverage{


    /**
     * 获得饮料描述的方法
     * @return 饮料相关描述
     */
    @Override
    public abstract String getDescription();
}
