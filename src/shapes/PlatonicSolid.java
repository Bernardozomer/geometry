package shapes;

import utils.Out;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class PlatonicSolid extends Solid {
    protected RegularPolygon faceShape;
    protected int numberOfFaces;

    public PlatonicSolid(RegularPolygon faceShape, int numberOfFaces) {
        setFaceShape(faceShape);
        setNumberOfFaces(numberOfFaces);
        setArea();
        setVolume();
    }

    public final RegularPolygon getFaceShape() {
        return faceShape;
    }

    @Override
    public final String toFormattedString() {
        String formattedFaces = "FACES:\n" + getFaceShape().toFormattedString();

        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Number of faces", (double) getNumberOfFaces());
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return formattedFaces + "\nTHE SOLID:\n" + Out.formatShapeVars(vars);
    }

    public final void setFaceShape(RegularPolygon faceShape) {
        this.faceShape = faceShape;
    }

    public final int getNumberOfFaces() {
        return numberOfFaces;
    }

    protected final void setNumberOfFaces(int numberOfFaces){
        this.numberOfFaces = numberOfFaces;
    }
}
