package com.javadong.designpatterns.chapter2_observer.test;

import com.javadong.designpatterns.chapter2_observer.mine.Observer;
import com.javadong.designpatterns.chapter2_observer.mine.impl.CurrentConditionsDisplay;
import com.javadong.designpatterns.chapter2_observer.mine.impl.WeatherData;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 13:01
 */
public class WeatherStationTest {

    @Test
    public void testWeather() throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            weatherData.setMeasurements(i * 10, i * 10 - 5, i * 1000);
        }
    }
}
