package com.javadong.designpatterns.chapter2_observer.inbuild;

import com.javadong.designpatterns.chapter2_observer.mine.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 13:30
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature
                + " degrees  and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
