package com.heima.designpatterns.principles.substitiution.before;

import org.junit.Test;

/**
 * @author: DongShaowei
 * @create: 2024-11-10 23:21
 * @description:
 */
public class RectangleDemo {

    /**
     * 扩宽方法
     * @param rect
     */
    public static void resize(Rectangle rect) {
        // 判断宽比长小，进行扩宽的方法
        while (rect.getLength() >= rect.getWidth()) {
            rect.setWidth(rect.getWidth() + 1.0);
        }
    }

    /**
     * 打印长方形的长和宽
     * @param rect
     */
    public static void printLengthAndWidth(Rectangle rect) {
        System.out.println("length: " + rect.getLength());
        System.out.println("width: " + rect.getWidth());
    }

    @Test
    public void testRectangle() {
        Rectangle rect = new Rectangle();
        rect.setLength(20);
        rect.setWidth(10);
        resize(rect);
        printLengthAndWidth(rect);

        Square square = new Square();
        square.setLength(20);
        resize(square);
        printLengthAndWidth(square);
    }


}
