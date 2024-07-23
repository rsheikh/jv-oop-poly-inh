package vehicles;

public class MotorcycleEngine extends Engine {
    public enum FuelType {Unleaded, Leaded, Diesel}

    public MotorcycleEngine(int horsePower, MotorcycleEngine.FuelType fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType.toString();


    }
}
