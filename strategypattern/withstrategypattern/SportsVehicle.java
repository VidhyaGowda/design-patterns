package design_patterns.strategypattern.withstrategypattern;

import design_patterns.strategypattern.withstrategypattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
