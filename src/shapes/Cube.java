package shapes;

public class Cube extends PlatonicSolid {
    public Cube(double edgeLength) {
        super(new RegularPolygon(4, edgeLength), 6);
    }

    @Override
    protected void setArea() {
        area = getNumberOfFaces() * Math.pow(getFaceShape().getSideLength(), 2);
    }

    @Override
    protected void setVolume() {
        volume = Math.pow(getFaceShape().getSideLength(), 3);
    }
}
