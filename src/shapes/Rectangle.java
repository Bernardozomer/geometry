package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rectangle extends Polygon {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        super(4);
        setLength(length);
        setHeight(height);
        setPerimeter();
        setArea();
    }

    @Override
    public String toFormattedString() {
        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Length", getLength());
        vars.put("Height", getHeight());
        vars.put("Perimeter", getPerimeter());
        vars.put("Area", getArea());

        return Out.formatShapeVars(vars);
    }

    @Override
    protected void setPerimeter() {
        this.perimeter = (2 * getLength()) + (2 * getHeight());
    }

    @Override
    protected void setArea() {
        this.area = getLength() * getHeight();
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }
}
