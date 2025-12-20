package design_patterns.adapterpattern.weightMachine.adaptee;

public class WeightMachineForBabies implements WeighMachine{
    @Override
    public double getWeightInPounds(){
        return 28;
    }
}
