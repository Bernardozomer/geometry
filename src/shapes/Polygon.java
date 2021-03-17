package shapes;

public abstract class Polygon {
    protected int numberOfSides;
    protected double perimeter;
    protected double area;

    public Polygon(int numberOfFaces) {
        setNumberOfSides(numberOfFaces);
    }

    public abstract String toFormattedString();

    public final int getNumberOfSides() {
        return numberOfSides;
    }

    protected final void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public final double getPerimeter() {
        return perimeter;
    }

    protected abstract void setPerimeter();

    public final double getArea() {
        return area;
    }

    protected abstract void setArea();
}
