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
        Map<String, Double> vars = new LinkedHashMap<>();
        vars.put("Face number of sides", (double) getFaceShape().getNumberOfSides());
        vars.put("Face length", getFaceShape().getSideLength());
        vars.put("Face perimeter", getFaceShape().getPerimeter());
        vars.put("Face area", getFaceShape().getArea());
        vars.put("Face internal angle", getFaceShape().getInternalAngle());
        vars.put("Face external angle", getFaceShape().getExternalAngle());
        vars.put("Number of faces", (double) getNumberOfFaces());
        vars.put("Total surface area", getArea());
        vars.put("Volume", getVolume());

        return Out.printShapeVars(vars);
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
