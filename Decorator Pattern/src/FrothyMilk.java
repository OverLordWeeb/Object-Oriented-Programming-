// FrothyMilk.java
package com.coffee.decorator;
// coffee decorator for adding frothy milk to the coffee
public class FrothyMilk extends CoffeeDecorator {
//constructor for setting the wrapped coffee instance 
    public FrothyMilk(Coffee coffee) {
        super(coffee);
    }
//increases the brew to include adding frothy milk to it
    public String brew() {
        return super.brew() + addFrothyMilk();
    }
//more functions for adding frothy milk
    private String addFrothyMilk() {
        return " with Frothy Milk"; // adds information about the added forthy milk 
    }
}
