package shapes;

public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return 0;
    }
}
