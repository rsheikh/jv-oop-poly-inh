import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle mustang = new Car("Ford", "Mustang");
        Vehicle mini = new Car("BMW", "Mini Cooper");

        Vehicle ninja = new Motorcycle("Kawasaki", "Ninja 900", false);
        Vehicle fireblade = new Motorcycle("Honda", "Fireblade 450", true);

        List<Vehicle> vehicleList = List.of(mustang, mini, ninja, fireblade);

        for(Vehicle vehicle : vehicleList) {
            vehicle.start();
            vehicle.drive();
        }

    }
}
