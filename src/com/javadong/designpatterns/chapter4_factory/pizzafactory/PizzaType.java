package com.javadong.designpatterns.chapter4_factory.pizzafactory;

/**
 * @author DongShaowei
 * @description 披萨类型的枚举类
 * @date 2022/8/29 9:22
 */
public enum PizzaType {
    CHEESE("cheese"), VEGGIE("veggie"), CLAM("clam");

    private final String type;

    public String getType() {
        return this.type;
    }

    PizzaType(String type) {
        this.type = type;
    }
}
