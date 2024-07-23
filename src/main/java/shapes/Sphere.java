package shapes;

public class Sphere extends Shape3D{


    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        Circle circle = (Circle) base;
        int radius = circle.getRadius();
        return (Math.pow(radius, 3) * Math.PI ) * (4 / 3);
    }
}
