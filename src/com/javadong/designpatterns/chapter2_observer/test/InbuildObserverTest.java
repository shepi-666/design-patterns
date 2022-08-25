package com.javadong.designpatterns.chapter2_observer.test;

import com.javadong.designpatterns.chapter2_observer.inbuild.CurrentConditionsDisplay;
import com.javadong.designpatterns.chapter2_observer.inbuild.WeatherData;
import org.junit.Test;

/**
 * @author DongShaowei
 * @description
 * @date 2022/8/25 13:39
 */
public class InbuildObserverTest {

    @Test
    public void testInbuild() throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccs = new CurrentConditionsDisplay(weatherData);
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            weatherData.setMeasurements(i * 10, i * 10 - 5, i * 1000);
        }
    }
}
