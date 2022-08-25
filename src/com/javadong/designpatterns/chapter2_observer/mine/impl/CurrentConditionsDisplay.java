package com.javadong.designpatterns.chapter2_observer.mine.impl;

import com.javadong.designpatterns.chapter2_observer.mine.DisplayElement;
import com.javadong.designpatterns.chapter2_observer.mine.Observer;
import com.javadong.designpatterns.chapter2_observer.mine.Subject;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 12:55
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public CurrentConditionsDisplay() {}

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature
                + " degrees  and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
