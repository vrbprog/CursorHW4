package vrbprog;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertice3D basePoint, double width, double height, double depth) {
        listPoints.add(basePoint);
        this.width = width;
        this.height = height;
        this.depth = depth;
        type = "cuboid";
    }

    @Override
    public double getArea() {
        return 2*(width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "listPoints=" + listPoints +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", Volume=" + getVolume() +
                ", Area=" + getArea() +
                '}';
    }
}
