// EspressoShot.java
package com.coffee.decorator;
//conrete coffe decorator adding an espresso shot to coffee 
public class EspressoShot extends CoffeeDecorator {
// constructor to place the wrapped coffee instance
    public EspressoShot(Coffee coffee) {
        super(coffee);
    }
// extends (brew ) method to include adding a espresso shot 
//so that the coffee can have different amount od espresso shots
    public String brew() {
        return super.brew() + addEspressoShot();
    }
// more functionality for adding a espresso shot 
    private String addEspressoShot() {
        return " with Espresso Shot"; // adds information about the added espresso shot
    }
}
