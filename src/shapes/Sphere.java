package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sphere extends RoundShape {
    private double volume;

    public Sphere(double radius) {
        setRadius(radius);
    }

    @Override
    public String toFormattedString() {
        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Radius", getRadius());
        vars.put("Diameter", getDiameter());
        vars.put("Circumference", getCircumference());
        vars.put("Area", getArea());
        vars.put("Volume", getVolume());

        return Out.formatShapeVars(vars);
    }

    @Override
    protected void setRadius(double radius) {
        this.radius = radius;
        setDiameter();
        setCircumference();
        setArea();
        setVolume();
    }

    @Override
    protected void setArea() {
        area = 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    public double getVolume() {
        return volume;
    }

    private void setVolume() {
        volume = Math.PI * Math.pow(getDiameter(), 3) / 6;
    }
}
