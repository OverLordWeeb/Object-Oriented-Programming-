// ObserverWeatherChannel.java
package com.baeldung.weather;

import java.util.Observable;
import java.util.Observer;
//implements the observers interface for the weather channels
public class ObserverWeatherChannel implements Observer {

    private String weather;
//handles the updates 
    @Override
    public void update(Observable o, Object weather) {
        this.setWeather((String) weather);
    }
//gets the current weather 
    public String getWeather() {
        return weather;
    }
//sets the weather
    public void setWeather(String weather) {
        this.weather = weather;
    }
}