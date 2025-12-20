package design_patterns.builderdesignpattern;

public class WithBuilderPattern {
    int rollNum;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    String course;
    int feesPaid;
    int feesRemaining;

    public WithBuilderPattern(WithBuilderPatternBuilder builder) {
        this.rollNum = builder.rollNum;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.course = builder.course;
        this.feesPaid = builder.feesPaid;
        this.feesRemaining = builder.feesRemaining;
    }
}
