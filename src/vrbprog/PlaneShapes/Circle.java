package vrbprog.PlaneShapes;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(Vertice2D center, double radius) {
        listPoints.add(center);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "listPoints=" + listPoints +
                ", radius=" + radius +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
