package vrbprog.SpaceShapes;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertice3D center, double radius) {
        listPoints.add(center);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * radius * radius * radius / 3.0;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "listPoints=" + listPoints +
                ", radius=" + radius +
                ", Volume=" + getVolume() +
                ", Area=" + getArea() +
                '}';
    }
}
