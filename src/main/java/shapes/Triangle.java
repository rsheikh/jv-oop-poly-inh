package shapes;

public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    int calculateArea() {
        return 0;
    }
}
