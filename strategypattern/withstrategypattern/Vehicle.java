package design_patterns.strategypattern.withstrategypattern;

import design_patterns.strategypattern.withstrategypattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
