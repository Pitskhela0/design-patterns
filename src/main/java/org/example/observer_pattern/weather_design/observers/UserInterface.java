package org.example.observer_pattern.weather_design.observers;

import org.example.observer_pattern.weather_design.WeatherObserver;
import org.example.observer_pattern.weather_design.WeatherStation;
import org.example.observer_pattern.weather_design.WeatherSubject;

public class UserInterface implements WeatherObserver {
    private WeatherStation weatherStation;
    private int temperature;
    private int windSpeed;
    private int pressure;


    public UserInterface(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void display(){
        // display logic
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        pressure = weatherStation.getPressure();
        windSpeed = weatherStation.getWindSpeed();
    }
}
