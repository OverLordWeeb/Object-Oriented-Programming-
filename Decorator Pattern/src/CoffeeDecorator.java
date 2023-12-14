// CoffeeDecorator.java
package com.coffee.decorator;
//class implememting the coffee interface 
//is base class for coffee decorators 
public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;
//constructor to place the wrapped coffee instance 
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String brew() {
        return coffee.brew();
    }
}
