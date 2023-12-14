// BasicCoffee.java
package com.coffee.decorator;
//implementation of coffee interface showing basic coffee
public class BasicCoffee implements Coffee {

    @Override
    public String brew() {
        return "Basic coffee"; //provides a basic implementation of brewing 
    } // and retuns a string indicationg its a basic coffee
}