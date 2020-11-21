package vrbprog.SpaceShapes;
import vrbprog.PlaneShapes.Vertice2D;

public class Vertice3D extends Vertice2D {

    private int z;

    public Vertice3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vertice3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
