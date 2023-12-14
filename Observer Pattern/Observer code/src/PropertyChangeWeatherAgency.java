// PropertyChangeWeatherAgency.java
package com.baeldung.weather;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
//represents a weather agency that notifies property change 
public class PropertyChangeWeatherAgency {
    private String weather;

    private PropertyChangeSupport support;

    public PropertyChangeWeatherAgency() {
        support = new PropertyChangeSupport(this);
    }
//adds prperty change listener
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
//removes a property change listener
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
//sets the weatehr and nofifies all the registered property change listeners
    public void setWeather(String value) {
        support.firePropertyChange("weather", this.weather, value);
        this.weather = value;
    }
}