package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegularPolygon extends Polygon {
    private double sideLength;
    private double internalAngle;
    private double externalAngle;

    public RegularPolygon(int numberOfFaces, double sideLength) {
        super(numberOfFaces);
        setSideLength(sideLength);
        setPerimeter();
        setArea();
        setAngles();
    }

    @Override
    public String toFormattedString() {
        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Number of sides", (double) getNumberOfSides());
        vars.put("Side length", getSideLength());
        vars.put("Perimeter", getPerimeter());
        vars.put("Area", getArea());
        vars.put("Internal angle", getInternalAngle());
        vars.put("External angle", getExternalAngle());

        return Out.printShapeVars(vars);
    }

    @Override
    protected void setPerimeter() {
        perimeter = getNumberOfSides() * getSideLength();
    }

    @Override
    protected void setArea() {
        area = (1 / 4d) * getNumberOfSides() * Math.pow(getSideLength(), 2)
                * (1 / Math.tan(Math.PI / getNumberOfSides()));
    }

    public double getSideLength() {
        return sideLength;
    }

    private void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getInternalAngle() {
        return internalAngle;
    }

    public double getExternalAngle() {
        return externalAngle;
    }

    private void setAngles() {
        internalAngle = ((getNumberOfSides() - 2) / (double) getNumberOfSides()) * 180;
        externalAngle = 360d / getNumberOfSides();
    }
}
