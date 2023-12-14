// DecoratorPatternDriver.java
package com.coffee.decorator;

import static com.baeldung.util.LoggerUtil.LOG;
// driver class to show the use of coffee decorators 
//importing log utility 
public class DecoratorPatternDriver {

    //entry point for the program
    public static void main(String[] args) {
        // Coffee with just one Espresso Shot
        Coffee coffee1 = new EspressoShot(new BasicCoffee());
        LOG.info(coffee1.brew());

        // Coffee with two Espresso Shots and one Frothy Milk
        Coffee coffee2 = new FrothyMilk(new EspressoShot(new EspressoShot(new BasicCoffee())));
        LOG.info(coffee2.brew()); // logs the result of the brewing coffee2 
    }
