package org.example.observer_pattern.weather_design;

public interface WeatherSubject {
    public void addObserver(WeatherObserver w);
    public void removeObserver(WeatherObserver w);
    public void notifyWeatherObservers();

}
