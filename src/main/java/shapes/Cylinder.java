package shapes;

public class Cylinder extends Shape3D{
    double height;

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateVolume() {

    }
}
