package vehicles;


public class CarEngine extends Engine {
    public enum FuelType {Unleaded, Leaded, Diesel}

    public CarEngine(int horsePower, FuelType fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType.toString();
    }
}
