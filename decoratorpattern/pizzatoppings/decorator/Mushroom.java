package design_patterns.decoratorpattern.pizzatoppings.decorator;

import design_patterns.decoratorpattern.pizzatoppings.component.BasePizza;

public class Mushroom extends ToppingsDecorator {
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
      this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
