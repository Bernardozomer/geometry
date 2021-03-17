package shapes;

import utils.Out;

import java.util.HashMap;
import java.util.Map;

public class RectangularCuboid extends Solid {
    protected double length;
    protected double height;
    protected double width;

    public RectangularCuboid(double length, double height, double width) {
        setLength(length);
        setHeight(height);
        setWidth(width);
        setArea();
        setVolume();
    }

    @Override
    public String toFormattedString() {
        Map<String, Double> vars = new HashMap<>();
        vars.put("Length", getLength());
        vars.put("Height", getHeight());
        vars.put("Width", getWidth());
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return Out.printShapeVars(vars);
    }

    @Override
    protected void setArea() {
        area = 2 * (getLength() * getHeight()
                + getLength() * getWidth()
                + getHeight() * getWidth());
    }

    @Override
    protected void setVolume() {
        volume = getLength() * getHeight() * getWidth();
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

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }
}
