package vrbprog.PlaneShapes;

public class Triangle extends PlaneShape {

    public Triangle(Vertice2D pointOne, Vertice2D pointTwo, Vertice2D pointThree) {
        listPoints.add(pointOne);
        listPoints.add(pointTwo);
        listPoints.add(pointThree);
    }

    private double getLength(Vertice2D pointOne, Vertice2D pointTwo) {
        return Math.sqrt((pointOne.getX() - pointTwo.getX()) * (pointOne.getX() - pointTwo.getX()) +
                (pointOne.getY() - pointTwo.getY()) * (pointOne.getY() - pointTwo.getY()));
    }

    @Override
    public double getArea() {
        Vertice2D t1 = (Vertice2D) listPoints.get(0);
        Vertice2D t2 = (Vertice2D) listPoints.get(1);
        Vertice2D t3 = (Vertice2D) listPoints.get(2);
        return Math.abs(((t1.getX() - t3.getX())*(t2.getY() - t3.getY()) -
                (t2.getX() - t3.getX())*(t1.getY() - t3.getY()))/2.0);
    }

    @Override
    public double getPerimeter() {
        double lineOne = getLength((Vertice2D) listPoints.get(0), (Vertice2D) listPoints.get(1));
        double lineTwo = getLength((Vertice2D) listPoints.get(1), (Vertice2D) listPoints.get(2));
        double lineThree = getLength((Vertice2D) listPoints.get(0), (Vertice2D) listPoints.get(2));
        return lineOne + lineTwo + lineThree;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "listPoints=" + listPoints +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
