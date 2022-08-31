package com.javadong.designpatterns.chapter6_command.model;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/31 22:47
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is on !");
    }

    public void off() {
        System.out.println("Stereo is off !");
    }

    public void setCd() {
        System.out.println("Stereo play with Cd !");
    }

    public void setDvd() {
        System.out.println("Stereo play with Dvd !");
    }

    public void setRadio() {
        System.out.println("Stereo play with Radio !");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Volume is " + volume+ "!");
    }
}
