package design_patterns.decoratorpattern.coffeshop.component;

public class DecafCoffee extends Coffee{

    @Override
    public int cost() {
        return 90;
    }

    @Override
    public String description() {
        return "DeCaf Coffee";
    }
}
