Used when we have to hide the system complexity from the client

The Facade design pattern provides a simplified, unified interface to a complex subsystem, 
acting as a single entry point that hides intricate underlying code, making it easier for clients to use

Let's say we have a client rides a car
-> Client doesn't know about the engine, transmission, brakes, accelerator etc
-> Client just knows about the car, and how to click on accelerator pedal, break pedal etc
-> CarFacade will hide the complexity of the car from the client

# Facade Design Pattern – Java Example
This repository demonstrates the **Facade Design Pattern** using an
order processing system.

## Without Facade
- Client directly interacts with multiple subsystems
- Tight coupling
- Harder to maintain

## With Facade
- Client interacts with a single Facade class
- Loose coupling
- Cleaner and maintainable design

## Design Pattern Used
- Facade Pattern (Structural Design Pattern)

## Use Case
Order creation involving:
- Product lookup
- Payment processing
- Invoice generation
- Notification sending
