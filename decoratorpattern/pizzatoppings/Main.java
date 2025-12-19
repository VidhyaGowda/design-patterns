package design_patterns.decoratorpattern.pizzatoppings;

import design_patterns.decoratorpattern.pizzatoppings.component.BasePizza;
import design_patterns.decoratorpattern.pizzatoppings.component.VegDelightPizza;
import design_patterns.decoratorpattern.pizzatoppings.decorator.ExtraCheeze;
import design_patterns.decoratorpattern.pizzatoppings.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new VegDelightPizza();
        basePizza = new ExtraCheeze(new Mushroom(basePizza));
        System.out.println(basePizza.cost());
    }
}
