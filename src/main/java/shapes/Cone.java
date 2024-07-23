package shapes;

public class Cone extends Shape3D{
    double height;

    public Cone(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {

        return (this.base.calculateArea() * this.height) / 3;
    }
}
