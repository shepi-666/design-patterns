package com.javadong.designpatterns.chapter3_decorator.starbuck.Enums;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/26 10:58
 */
public enum Size {

    // 小杯
    TOLL(0.10, "toll"),
    // 中杯
    GRANDE(0.15, "grande"),
    // 大杯
    VENTI(0.20, "venti");

    private final Double price;
    private final String desc;

    Size(Double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getDesc() {
        return this.desc;
    }
}
