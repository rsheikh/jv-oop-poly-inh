import shapes.*;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

import java.util.ArrayList;
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

        List<Shape3D> shapes3d = new ArrayList<>(List.of(new Cube(5)));

        for (Shape shape : shapes) {

            if (shape instanceof Circle circle) {
                shapes3d.add(new Sphere(circle));
                shapes3d.add(new Cylinder(5, circle));
                shapes3d.add(new Cone(5, circle));
            }

            else {
                shapes3d.add(new Prism(5, shape));
                shapes3d.add(new Pyramid(5, shape));
            }

        }

        for (Shape3D shape3d : shapes3d) {
            System.out.println(shape3d.getClass().getSimpleName() + " with " +
                    shape3d.getBase().getClass().getSimpleName() + " base | Volume = " +
                    shape3d.calculateVolume());
        }


    }
}
