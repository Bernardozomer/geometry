package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class Circle extends RoundShape{
    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public String toFormattedString() {
        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Radius", getRadius());
        vars.put("Diameter", getDiameter());
        vars.put("Circumference", getCircumference());
        vars.put("Area", getArea());

        return Out.formatShapeVars(vars);
    }

    @Override
    protected void setRadius(double radius) {
        this.radius = radius;
        setDiameter();
        setCircumference();
        setArea();
    }

    @Override
    protected void setArea() {
        area = Math.PI * Math.pow(radius, 2);
    }
}
