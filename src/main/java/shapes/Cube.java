package shapes;

public class Cube extends Shape3D{

    public Cube(int size) {
//        this(size * size); // new Cube()

        new Cube(size * size);
    }

    private Cube(Rectangle base) {
       this.base = base;
    }

    @Override
    public double calculateVolume() {
        Rectangle rect = (Rectangle) this.base;

        return Math.pow(rect.length, 3);
    }
}
