package observer_pattern.weather_design.observers;

import observer_pattern.weather_design.WeatherObserver;
import observer_pattern.weather_design.WeatherStation;

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
