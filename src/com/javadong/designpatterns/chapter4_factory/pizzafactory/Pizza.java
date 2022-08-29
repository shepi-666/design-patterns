package com.javadong.designpatterns.chapter4_factory.pizzafactory;

/**
 * @author DongShaowei
 * @description 披萨类
 * @date 2022/8/29 8:50
 */
public abstract class Pizza {
    protected String description;

    public void prepare() {
        System.out.println("A " + this.description + " is preparing ...");
    }


    public void bake() {
        System.out.println("A " + this.description + " is baking ...");
    }

    public void cut() {
        System.out.println("A " + this.description + " is cutting ...");
    }

    public void box() {
        System.out.println("A " + this.description + " is boxing ...");
    }

}
