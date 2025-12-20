package design_patterns.builderdesignpattern;

public class WithoutBuilderPattern {
    int rollNum;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    String course;
    int feesPaid;
    int feesRemaining;

    public WithoutBuilderPattern(int rollNum, String name, int age, String address, String phoneNumber, String email, String course, int feesPaid, int feesRemaining) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
        this.feesPaid = feesPaid;
        this.feesRemaining = feesRemaining;
    }

    // Lets say for this class we have only rollNumber as a mandatory field
    // and rest are optional

    //So lets say only certain fields come in picture - in order to deal with this
    //we might come up with a constructor with lesser parameters

    public WithoutBuilderPattern(int rollNum){
        this.rollNum = rollNum;
    }

    public WithoutBuilderPattern(int rollNum, String name){
        this.rollNum = rollNum;
        this.name = name;
    }

    public WithoutBuilderPattern(int rollNum, String name, int age){
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

    //Lets say the input parameters would come as rollnum, Name, feesPaid
//    public WithoutBuilderPattern(int rollNum, String name, int feesPaid){
//        this.rollNum = rollNum;
//        this.name = name;
//        this.feesPaid = feesPaid;
//    }

    //Since signature is same - compilation error - Issue to address!
    //This is where Builder Design Pattern comes into picture
}
