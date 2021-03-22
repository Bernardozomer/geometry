package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cone extends Solid {
    private Circle base;
    private double height;
    private double slantHeight;
    private double lateralArea;

    public Cone(double radius, double height) {
        setBase(new Circle(radius));
        setHeight(height);
        setSlantHeight();
        setLateralArea();
        setArea();
        setVolume();
    }

    @Override
    public String toFormattedString() {
        String formattedBase = "BASE:\n" + getBase().toFormattedString();

        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Height", getHeight());
        vars.put("Slant height", getSlantHeight());
        vars.put("Lateral surface area", getLateralArea());
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return formattedBase + "\nTHE SOLID:\n" + Out.formatShapeVars(vars);
    }

    @Override
    protected void setArea() {
        area = Math.PI * getBase().getRadius() * (getSlantHeight() + getBase().getRadius());
    }

    @Override
    protected void setVolume() {
        volume = 1 / 3d * Math.PI * Math.pow(getBase().getRadius(), 2) * getHeight();
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

    public double getSlantHeight() {
        return slantHeight;
    }

    private void setSlantHeight() {
        slantHeight = Math.sqrt(Math.pow(getBase().getRadius(), 2) + Math.pow(getHeight(), 2));
    }

    public double getLateralArea() {
        return lateralArea;
    }

    private void setLateralArea() {
        lateralArea = Math.PI * getBase().getRadius() * getSlantHeight();
    }
}
