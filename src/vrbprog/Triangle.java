package vrbprog;

public class Triangle extends PlaneShape {

    public Triangle(Vertice2D pointOne, Vertice2D pointTwo, Vertice2D pointThree) {
        listPoints.add(pointOne);
        listPoints.add(pointTwo);
        listPoints.add(pointThree);
        type = "triangle";
    }

    private double getLength(Vertice2D pointOne, Vertice2D pointTwo) {
        return Math.sqrt((pointOne.x - pointTwo.x) * (pointOne.x - pointTwo.x) +
                (pointOne.y - pointTwo.y) * (pointOne.y - pointTwo.y));
    }

    @Override
    public double getArea() {
        Vertice2D t1 = (Vertice2D) listPoints.get(0);
        Vertice2D t2 = (Vertice2D) listPoints.get(1);
        Vertice2D t3 = (Vertice2D) listPoints.get(2);
        return Math.abs(((t1.x - t3.x)*(t2.y - t3.y) - (t2.x - t3.x)*(t1.y - t3.y))/2.0);
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
