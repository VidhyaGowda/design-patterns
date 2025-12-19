package design_patterns.decoratorpattern.coffeshop.component;

public class EspressoCoffee extends Coffee{

    @Override
    public int cost() {
        return 190;
    }

    @Override
    public String description() {
        return "Espresso Coffee";
    }
}
