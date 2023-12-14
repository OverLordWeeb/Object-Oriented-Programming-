// PropertyChangeWeatherChannel.java
package com.baeldung.weather;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
// this class implements the property change listener interface
// making so that it can be listening for propert change evernts and reactiving to them
public class PropertyChangeWeatherChannel implements PropertyChangeListener {
//private instance varible to store the current weather info
    private String weather;

    //this method is called when property change event happens
    // it updates weather ifnormation based on new value which is provided
    // in event
    public void propertyChange(PropertyChangeEvent evt) {
        this.setWeather((String) evt.getNewValue());
    }

    //retrieve the current weather information
    public String getWeather() {
        return weather;
    }
    
    //method to set weather information
    public void setWeather(String weather) {
        this.weather = weather;
    }
}