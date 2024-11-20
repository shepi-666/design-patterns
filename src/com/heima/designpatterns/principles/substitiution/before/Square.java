package com.heima.designpatterns.principles.substitiution;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 23:18
 * @description: 正方形
 */
public class Square extends Rectangle {

    /**
     * 设置长的方法
     * @param length
     */
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    /**
     * 设置宽的方法
     * @param width
     */
    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }


}
