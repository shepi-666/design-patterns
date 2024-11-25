package com.heima.designpatterns.principles.substitiution.after;

import com.heima.designpatterns.principles.substitiution.after.impl.Rectangle;
import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-18 21:01
 * @description: 长方形的测试类
 */
public class RectangleDemo {

    @Test
    public void test() {
        Rectangle rect = new Rectangle();
        rect.setLength(20);
        rect.setWidth(10);
        // 调用扩宽的方法
        RectangleDemo.resize(rect);

        RectangleDemo.printLengthAndWidth(rect);
    }

    /**
     * 扩宽的方法
     * @param rect
     */
    public static void resize(Rectangle rect) {
        while (rect.getLength() >= rect.getWidth()) {
            rect.setWidth(rect.getWidth() + 1.0);
        }
    }

    /**
     * 获取长和宽
     * @param quad
     */
    public static void printLengthAndWidth(Quadrilateral quad) {
        System.out.println(quad.getLength());
        System.out.println(quad.getWidth());
    }
}
