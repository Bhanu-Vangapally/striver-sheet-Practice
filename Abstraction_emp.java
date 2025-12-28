
abstract class Vehicle{
    abstract public void startEngine();   // Abstract method (no body)
    public void applyBrakes(){    // Concrete method (with implementation)
        System.out.println("Brakes Applying");
    }
}

// Subclass (concrete)
class Car extends Vehicle {
    // Provides implementation for the abstract method
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Cannot instantiate Vehicle directly, but can use a reference
        myCar.startEngine(); // Output: Car engine started.
        myCar.applyBrakes(); // Output: Applying standard brakes.
    }
}
