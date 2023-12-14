// WeatherChannel.java
package com.baeldung.weather;
//interface deinging the contract for weather channels
public interface WeatherChannel { // method to handle weather updates
    void update(Object o);
}