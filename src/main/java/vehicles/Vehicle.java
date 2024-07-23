package vehicles;

public abstract class Vehicle {
    String make;
    String model;
    int speed;
    Engine engine;


    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
