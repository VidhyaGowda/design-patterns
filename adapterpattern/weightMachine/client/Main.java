package design_patterns.adapterpattern.weightMachine.client;

import design_patterns.adapterpattern.weightMachine.adaptee.WeightMachineForBabies;
import design_patterns.adapterpattern.weightMachine.adapter.WeightMachineAdapter;
import design_patterns.adapterpattern.weightMachine.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineForBabies weightMachineForBabies = new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachineForBabies);
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
