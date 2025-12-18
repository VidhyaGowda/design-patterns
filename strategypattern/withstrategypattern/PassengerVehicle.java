package design_patterns.strategypattern.withstrategypattern;

import design_patterns.strategypattern.withstrategypattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
