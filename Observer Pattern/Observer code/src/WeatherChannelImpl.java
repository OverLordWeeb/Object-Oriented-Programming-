// WeatherChannelImpl.java
package com.baeldung.weather;
// weather channel interface 
public class WeatherChannelImpl implements WeatherChannel {
//private instnace variable to store current weather info
    private String weather;
//this method is called when weather update is received 
//it updates the internal weather info
    @Override
    public void update(Object weather) {
        this.setWeather((String) weather);
    }
//returns the current weather information
    public String getWeather() {
        return weather;
    }
//setter method set the weather information
    public void setWeather(String weather) {
        this.weather = weather;
    }
}