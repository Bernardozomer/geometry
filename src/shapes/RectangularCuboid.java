package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public class RectangularCuboid extends Solid {
    private Rectangle frontFace;
    private Rectangle sideFace;
    private Rectangle topFace;

    public RectangularCuboid(double length, double height, double width) {
        setFaces(length, height, width);
        setArea();
        setVolume();
    }

    @Override
    public String toFormattedString() {
        String formattedFaces = "FACES:\n" + getFrontFace().toFormattedString() + "\n" +
                getSideFace().toFormattedString() + "\n" + getTopFace().toFormattedString();

        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return formattedFaces + "\nTHE SHAPE ITSELF:\n" + Out.formatShapeVars(vars);
    }

    @Override
    protected void setArea() {
        area = 2 * (frontFace.getArea() + sideFace.getArea() + topFace.getArea());
    }

    @Override
    protected void setVolume() {
        // Length * height * width
        volume = getFrontFace().getLength() * getSideFace().getHeight() * getTopFace().getHeight();
    }

    public Rectangle getFrontFace() {
        return frontFace;
    }

    public Rectangle getSideFace() {
        return sideFace;
    }

    public Rectangle getTopFace() {
        return topFace;
    }

    private void setFaces(double length, double height, double width) {
        frontFace = new Rectangle(length, height);
        sideFace = new Rectangle(width, height);
        topFace = new Rectangle(length, width);
    }
}
