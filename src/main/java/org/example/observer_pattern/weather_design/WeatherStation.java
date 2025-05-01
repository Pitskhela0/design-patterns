package org.example.observer_pattern.weather_design;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject{
    private List<WeatherObserver> observerList;
    private int temperature;
    private int windSpeed;
    private int pressure;

    public WeatherStation(){
        observerList = new ArrayList<WeatherObserver>();
        temperature = 0;
        windSpeed = 0;
        pressure = 0;
    }
    @Override
    public void addObserver(WeatherObserver w) {
        observerList.add(w);
    }

    @Override
    public void removeObserver(WeatherObserver w) {
        observerList.remove(w);
    }

    @Override
    public void notifyWeatherObservers() {
        for(WeatherObserver w: observerList){
            w.notify();
        }
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyWeatherObservers();
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
        notifyWeatherObservers();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyWeatherObservers();
    }
}
