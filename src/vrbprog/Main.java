package vrbprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Problem 1. Geometry
        Vertice2D point = new Vertice2D(1,1);
        Rectangle rect = new Rectangle(point,2,4);

        Vertice2D pointTr1 = new Vertice2D(1,1);
        Vertice2D pointTr2 = new Vertice2D(1,4);
        Vertice2D pointTr3 = new Vertice2D(4,1);
        Triangle triangle = new Triangle(pointTr1, pointTr2, pointTr3);

        Circle circle = new Circle(point, 3);

        Vertice3D center = new Vertice3D(0,0,0);
        Sphere sphere = new Sphere(center,4);

        Cuboid cuboid = new Cuboid(center, 8,7,6);

        SquarePyramid pyramid = new SquarePyramid(center,4,3);

        List<Shape> listShape = new ArrayList<>(Arrays.asList(rect,triangle,circle,sphere,cuboid,pyramid));
        for (Shape shape: listShape) {
            System.out.println(shape);
        }
    }

}
