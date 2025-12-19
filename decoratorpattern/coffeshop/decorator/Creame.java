package design_patterns.decoratorpattern.coffeshop.decorator;

import design_patterns.decoratorpattern.coffeshop.component.Coffee;

public class Creame extends AddOnDecorator {

    Coffee coffee;

    public Creame(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 40;
    }

    @Override
    public String description() {
        return this.coffee.description() + ", Creame";
    }
}
