package shapes;

public class Cube extends Shape3D{

    public Cube(int size) {
        this(new Rectangle(size, size));
    }

    private Cube(Rectangle base) {
       this.base = base;
    }

    @Override
    public double calculateVolume() {
        Rectangle rect = (Rectangle) this.base;
        System.out.println(Math.pow(rect.length, 3));
        return Math.pow(rect.length, 3);
    }
}
