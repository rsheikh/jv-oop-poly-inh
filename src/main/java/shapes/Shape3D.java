package shapes;

public abstract class Shape3D{
    protected Shape base;

    public abstract void calculateVolume();

    public Shape getBase() {
        return base;
    }
}
