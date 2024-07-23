package shapes;

public class Pyramid extends Shape3D{
    double height;

    public Pyramid(double height, Shape base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {

        return (this.base.calculateArea() * this.height) / 3;
    }
}
