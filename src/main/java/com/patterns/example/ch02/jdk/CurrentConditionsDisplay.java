package com.patterns.example.ch02.jdk;


import com.patterns.example.ch02.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前：temperature：" + temperature + ";humidity" + humidity);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
