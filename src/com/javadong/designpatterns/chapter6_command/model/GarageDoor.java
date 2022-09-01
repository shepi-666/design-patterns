package com.javadong.designpatterns.chapter6_command.model;

/**
 * @author DongShaowei
 * @description 车库门
 * @date 2022/8/31 21:49
 */
public class GarageDoor {

    public void up() {
        System.out.println("Garage door is up !");
    }

    public void down() {
        System.out.println("Garage door is down !");
    }

    public void stop() {
        System.out.println("Garage door is stop !");
    }

    public void lightOn() {
        System.out.println("Garage light is on !");
    }

    public void lightOff() {
        System.out.println("Garage light is off !");
    }

}
