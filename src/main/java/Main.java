import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Vehicle mustang = new Car("Ford", "Mustang");
        Vehicle mini = new Car("BMW", "Mini Cooper");

        Vehicle ninja = new Motorcycle("Kawasaki", "Ninja 900", false);
        Vehicle fireblade = new Motorcycle("Honda", "Fireblade 450", true);

        List<Vehicle> vehicleList = List.of(mustang, mini, ninja, fireblade);

        for(Vehicle vehicle : vehicleList) {
            vehicle.start();
            vehicle.drive();
        } */

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }


    }
}
