package design_patterns.adapterpattern.weightMachine.adapter;

import design_patterns.adapterpattern.weightMachine.adaptee.WeighMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private WeighMachine weighMachine;

    public WeightMachineAdapterImpl(WeighMachine weighMachine){
        this.weighMachine = weighMachine;
    }
    @Override
    public double getWeightInKg(){
        return weighMachine.getWeightInPounds() * 0.45;
    }
}
