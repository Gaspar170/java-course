public class CastingDemo {
    static class Vehicle { }
static class Car extends Vehicle {
public void openTrunk() {
System.out.println("Trunk opened.");
}
}
static class Bike extends Vehicle { }

public static void main(String[] args) {
    Vehicle v1 = new Car();
Vehicle v2 = new Bike();

System.out.println("Upcasting successful.");
System.out.println("\nChecking types safely...");

if (v1 instanceof Car) {
// It is safe to cast because v1 is actually a Car.
Car c1 = (Car) v1;
c1.openTrunk();
}

if (v2 instanceof Car) {
    System.out.println("This will not print.");
} else {
System.out.println("v2 is not a Car, it is a Bike. Downcasting prevented!");
}
}
}
