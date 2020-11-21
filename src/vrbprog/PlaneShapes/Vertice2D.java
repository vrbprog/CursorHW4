package vrbprog.PlaneShapes;
import vrbprog.Shapes.Vertice;

public class Vertice2D extends Vertice {

    private int y;

    public Vertice2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vertice2D{" +
                "x=" + getX() +
                ", y=" + y +
                '}';
    }
}
