package observer_pattern.weather_design.observers;

import observer_pattern.weather_design.WeatherObserver;
import observer_pattern.weather_design.WeatherStation;

public class AlertSystem implements WeatherObserver{
    private WeatherStation weatherStation;
    private int temperature;
    private int windSpeed;
    private int pressure;


    public AlertSystem(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void alert(){
        // alert logic
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        pressure = weatherStation.getPressure();
        windSpeed = weatherStation.getWindSpeed();
    }
}
