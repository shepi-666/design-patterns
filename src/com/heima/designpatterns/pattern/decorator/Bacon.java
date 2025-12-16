package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:41
 * @description: 培根类-装饰者局角色
 */
public class Bacon extends Garnish{

    private final static float PRICE = 2.0f;

    public Bacon(FastFood fastFood) {
        super(PRICE, "bacon", fastFood);
    }

    @Override
    public float cost() {
        return getPrice()
                + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()
                + "&"
                + getFastFood().getDesc();
    }
}
