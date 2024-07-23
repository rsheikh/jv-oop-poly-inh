package vehicles;

public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model); // new Vehicle(make, model)

        this.engine = new CarEngine(300, CarEngine.FuelType.Diesel);
    }
}
