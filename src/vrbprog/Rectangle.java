package vrbprog;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;

    public Rectangle(Vertice2D point, double width, double height) {
        listPoints.add(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "listPoints=" + listPoints +
                ", width=" + width +
                ", height=" + height +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
