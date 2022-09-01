package com.javadong.designpatterns.chapter4_factory.pizzafactory;

import java.util.List;

/**
 * @author DongShaowei
 * @description 披萨类
 * @date 2022/8/29 8:50
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggies> veggiesList;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    /**
     * 准备披萨的方法，我们需要收集原料
     */
    protected abstract void prepare();


    public void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder  builder = new StringBuilder("This is a ");
        if (name != null) { builder.append(name); }
        builder.append(" which is made of ");
        if (dough != null) { builder.append(dough.toString() + ", "); }
        if (sauce != null) { builder.append(sauce.toString() + ", "); }
        if (cheese != null) { builder.append(cheese.toString() + ", "); }
        if (pepperoni != null) { builder.append(pepperoni.toString() + ", "); }
        if (clam != null) { builder.append(clam.toString() + ", "); }
        if (veggiesList != null) {
            for(Veggies veggies : veggiesList) {
                builder.append(veggies.toString() + ", ");
            }
        }
        builder.replace(builder.length() - 1, builder.length(), ".");
        return builder.toString();
    }
}
