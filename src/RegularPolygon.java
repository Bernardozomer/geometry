import java.lang.Math;

/**
 * Generic representation of regular polygons. Prefers universal equations that apply to all of them
 * over adapting itself for special contexts.
 */
public class RegularPolygon
{
    private int sides;
    private double sideLength;
    private double perimeter;
    private double area;
    private double internalAngle;
    private double externalAngle;

    public void setSides(int newValue)
    {
        sides = newValue;
        setAngles();
    }

    public int getSides()
    {
        return sides;
    }

    public void setSideLength(double newValue)
    {
        sideLength = newValue;
        setPerimeter();
        setArea();
    }

    public double getSideLength() {
        return sideLength;
    }

    private void setPerimeter()
    {
        perimeter = sides * sideLength;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void setArea()
    {
        area = Math.pow(sideLength, 2) * sides / (4 * Math.tan(Math.PI / sides));
    }

    public double getArea() {
        return area;
    }

    private void setAngles()
    {
        internalAngle = (sides - 2) * 180d / sides;
        externalAngle = 360d / sides;
    }

    public double getInternalAngle() {
        return internalAngle;
    }

    public double getExternalAngle() {
        return externalAngle;
    }
}
