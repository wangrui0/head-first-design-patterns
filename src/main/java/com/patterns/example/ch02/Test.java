package com.patterns.example.ch02;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1.0f, 2.0f, 3.0f);
        weatherData.setMeasurements(1.1f, 2.2f, 3.3f);
    }
}
