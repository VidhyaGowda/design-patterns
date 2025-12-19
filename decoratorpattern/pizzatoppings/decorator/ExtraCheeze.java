package design_patterns.decoratorpattern.pizzatoppings.decorator;

import design_patterns.decoratorpattern.pizzatoppings.component.BasePizza;

public class ExtraCheeze extends ToppingsDecorator {

    BasePizza basePizza;
    public ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }
}
