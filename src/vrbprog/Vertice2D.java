package vrbprog;

public class Vertice2D extends Vertice {
    protected int y;

    public Vertice2D(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vertice2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
