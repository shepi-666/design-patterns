package com.javadong.designpatterns.chapter2_observer.mine.impl;

import com.javadong.designpatterns.chapter2_observer.mine.Observer;
import com.javadong.designpatterns.chapter2_observer.mine.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 12:47
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
