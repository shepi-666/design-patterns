package com.javadong.designpatterns.chapter3_decorator.starbuck;

import com.javadong.designpatterns.chapter3_decorator.starbuck.Enums.Size;

/**
 * @author DongShaowei
 * @description 饮料的基类
 * @date 2022/8/26 10:22
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";
    public Double price = 0.0;
    private Size size;

    public String getDescription() { return description; }

    /**
     * 计算饮料价格的方法
     * @return 饮料价格
     */
    public abstract double cost();

    @Override
    public String toString() {
        return this.getDescription() + " $" + this.cost();
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
