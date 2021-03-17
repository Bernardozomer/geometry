package shapes;

public class Tetrahedron extends PlatonicSolid {
    public Tetrahedron(double edgeLength) {
        super(new RegularPolygon(3, edgeLength), 4);
    }

    @Override
    protected void setArea() {
        area = Math.pow(getFaceShape().getSideLength(), 2) * Math.sqrt(3);
    }

    @Override
    protected void setVolume() {
        volume = Math.pow(getFaceShape().getSideLength(), 3) / 12 * Math.sqrt(2);
    }
}
