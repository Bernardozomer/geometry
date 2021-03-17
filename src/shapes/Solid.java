package shapes;

public abstract class Solid {
    protected double area;
    protected double volume;

    public abstract String toFormattedString();

    public final double getArea() {
        return area;
    }

    protected abstract void setArea();

    public final double getVolume() {
        return volume;
    }

    protected abstract void setVolume();
}
