package design_patterns.decoratorpattern.coffeshop.decorator;

import design_patterns.decoratorpattern.coffeshop.component.Coffee;

public class Milk extends AddOnDecorator{

    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 20;
    }

    @Override
    public String description() {
        return this.coffee.description() + ", Milk";
    }
}
