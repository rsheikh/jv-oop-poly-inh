package vehicles;

public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);

        this.engine = new MotorcycleEngine(60, MotorcycleEngine.FuelType.Leaded);
        this.hasSidecar = hasSidecar;
    }

    @Override
    protected void accelerate() {
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.5D;
            case "Leaded" -> 1.2D;
            case "Diesel" -> 1.8D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", ((this.engine.horsePower * fuelMod) * Math.exp(Math.sqrt(i)) / 2)* (this.hasSidecar ? 0.8 : 1.0)));
        }
    }
}
