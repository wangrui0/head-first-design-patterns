package com.patterns.example.ch02.jdk;


import java.util.Observable;

/**
 * @author wangrui
 * @date 2020/5/20.
 * @desc
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * 气象站：数据变化，调用这个方法
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
