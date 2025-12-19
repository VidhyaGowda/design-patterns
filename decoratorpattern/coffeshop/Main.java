package design_patterns.decoratorpattern.coffeshop;

import design_patterns.decoratorpattern.coffeshop.component.CappuccinoCoffee;
import design_patterns.decoratorpattern.coffeshop.component.Coffee;
import design_patterns.decoratorpattern.coffeshop.decorator.Creame;
import design_patterns.decoratorpattern.coffeshop.decorator.Milk;
import design_patterns.decoratorpattern.coffeshop.decorator.Sugar;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new CappuccinoCoffee();
        coffee=new Creame(new Milk(new Sugar(coffee)));
        System.out.println(coffee.cost());
    }
}
