package design_patterns.builderdesignpattern;

public class WithBuilderPatternBuilder {
    int rollNum;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    String course;
    int feesPaid;
    int feesRemaining;

    public WithBuilderPatternBuilder(int rollNum) {
        this.rollNum = rollNum;
    }
}
