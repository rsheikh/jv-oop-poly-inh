package vehicles;

public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);

        this.engine = new MotorcycleEngine(60, MotorcycleEngine.FuelType.Leaded);
        this.hasSidecar = hasSidecar;
    }
}
