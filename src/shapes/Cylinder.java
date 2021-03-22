package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cylinder extends Solid {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height) {
        setBase(new Circle(radius));
        setHeight(height);
        setArea();
        setVolume();
    }

    @Override
    public String toFormattedString() {
        String formattedBase = "BASE:\n" + getBase().toFormattedString();

        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Height", getHeight());
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return formattedBase + "\nTHE SOLID:\n" + Out.formatShapeVars(vars);
    }

    @Override
    protected void setArea() {
        this.area = Math.PI * getBase().getDiameter() * (getBase().getRadius() + getHeight());
    }

    @Override
    protected void setVolume() {
        volume = Math.PI * Math.pow(getBase().getRadius(), 2) * getHeight();
    }

    public Circle getBase() {
        return base;
    }

    private void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }
}
