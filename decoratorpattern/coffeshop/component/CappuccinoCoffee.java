package design_patterns.decoratorpattern.coffeshop.component;

public class CappuccinoCoffee extends Coffee{

    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String description() {
        return "Cappuccino Coffee";
    }
}
