package shapes;

public abstract class RoundShape {
    protected double radius;
    protected double diameter;
    protected double circumference;
    protected double area;

    public abstract String toFormattedString();

    public final double getRadius() {
        return radius;
    }

    protected abstract void setRadius(double radius);

    public final double getDiameter() {
        return diameter;
    }

    protected final void setDiameter() {
        diameter = 2 * getRadius();
    }

    public final double getCircumference() {
        return circumference;
    }

    protected final void setCircumference() {
        circumference = Math.PI * getDiameter();
    }

    public final double getArea() {
        return area;
    }

    protected abstract void setArea();
}
