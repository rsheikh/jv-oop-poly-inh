package shapes;

public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) (base * height) /2;
    }
}
