-> Creational Design Pattern
-> Ex that uses this pattern: StringBuilder

//Problem statement
-> Used when given class has too many parameters
-> Refer the issues mentioned in WithoutBuilderPattern.java

Builder Pattern : Follows Step By Step construction of an Object
Lets say we have a Home Object with parameters walls, door, windows, roof, etc
So addRoof, addWall, addDoor, addWindow - will happen step by step.
then the entire home object is created (Build() is called)

The fields in WithBuilderPattern & WithBuilderPatternBuilder are same 
-> leads to code duplicacy which is a con