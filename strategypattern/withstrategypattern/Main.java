package design_patterns.strategypattern.withstrategypattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}
