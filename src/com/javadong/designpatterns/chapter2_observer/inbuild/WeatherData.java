package com.javadong.designpatterns.chapter2_observer.inbuild;

import java.util.Observable;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 13:24
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        // 先调用此方法来表示状态已经改变
        setChanged();

        // 没有使用有参的方法，说明采用的做法是拉
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 使用拉的做法，因此有这些方法来让观察者获取状态
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
