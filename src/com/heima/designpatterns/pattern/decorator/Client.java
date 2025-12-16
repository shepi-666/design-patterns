package com.heima.designpatterns.pattern.decorator;

/**
 * @author: DongShaowei
 * @created: 2025-08-10 20:45
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc() + ":  " + fastFood.cost());

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + ":  " + fastFood.cost());

        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + ":  " + fastFood.cost());
    }
}
