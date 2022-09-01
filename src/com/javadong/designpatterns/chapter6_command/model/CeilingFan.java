package com.javadong.designpatterns.chapter6_command.model;

/**
 * @author DongShaowei
 * @description 吊扇
 * @date 2022/9/1 9:32
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    /**
     * 高转速
     */
    public void high() {
        speed = HIGH;
        System.out.println(location + " fan is running at high speed !");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " fan is running at medium speed !");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " fan is running at low speed !");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " fan is off !");
    }

    public int getSpeed() {
        return speed;
    }
}
