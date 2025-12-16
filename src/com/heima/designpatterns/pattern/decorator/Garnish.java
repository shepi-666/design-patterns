package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:37
 * @description:
 */
public abstract class Garnish extends FastFood{

    /**
     * 快餐类对象
     */
    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
