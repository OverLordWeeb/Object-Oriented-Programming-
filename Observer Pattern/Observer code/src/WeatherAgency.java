// WeatherAgency.java
package com.baeldung.weather;

import java.util.ArrayList;
import java.util.List;


//shows a weather agency that provides weather updates
public class WeatherAgency {
    private String weather;
    private List<WeatherChannel> channels = new ArrayList<>();
//adds a wasther channel as a observer to get weather updates
    public void addObserver(WeatherChannel channel) {
        this.channels.add(channel);
    }
// removes a weather channel as a observer to stop receiving updates
    public void removeObserver(WeatherChannel channel) {
        this.channels.remove(channel);
    }
// sets the weather and lets all the registered weather channels know 
//about the change 
    public void setWeather(String weather) {
        this.weather = weather;
        for (WeatherChannel channel : this.channels) {
            channel.update(this.weather);
        }
    }
}