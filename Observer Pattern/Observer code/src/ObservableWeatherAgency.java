// ObservableWeatherAgency.java
package com.baeldung.weather;

import java.util.Observable;
//represents weather agency that informs observers of change
public class ObservableWeatherAgency extends Observable {
    private String weather;
//sets the weather and informs the registered observers 
    public void setWeather(String weather) {
        this.weather = weather;
        setChanged();
        notifyObservers(weather);
    }
}