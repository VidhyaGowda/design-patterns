package design_patterns.strategypattern.withstrategypattern;

import design_patterns.strategypattern.withstrategypattern.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
