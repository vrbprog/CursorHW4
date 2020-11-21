package vrbprog.SpaceShapes;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double height;

    public SquarePyramid(Vertice3D baseCenter, double baseWidth, double height) {
        listPoints.add(baseCenter);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.sqrt(4 * height * height + baseWidth * baseWidth) * baseWidth
                + baseWidth * baseWidth;
    }

    @Override
    public double getVolume() {
        return baseWidth * baseWidth * height / 3.0;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "listPoints=" + listPoints +
                ", baseWidth=" + baseWidth +
                ", height=" + height +
                ", Volume=" + getVolume() +
                ", Area=" + getArea() +
                '}';
    }
}
