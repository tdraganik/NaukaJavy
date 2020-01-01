package Wspolrzedne;

import Wspolrzedne.controller.PointController;
import Wspolrzedne.point.Point;

public class PointApplication {

    public static void main(String[] args) {

        Point point1 = new Point(3, 5);

        PointController pc = new PointController();  // utworzenie zmennej obiektu/klasy PoimtController


        System.out.println("Punkt "+ point1.getX() + ", " + point1.getY());

        pc.addPlus1X(point1);    // na klasie PointController używamy metodę addPlus1X ze zmiennmi z point1

        System.out.println("Punkt addX "+ point1.getX() + ", " + point1.getY());

        pc.minus1X(point1);

        System.out.println("Punkt "+ point1.getX() + ", " + point1.getY());

        pc.minus1X(point1);

        System.out.println("Punkt minusX "+ point1.getX() + ", " + point1.getY());
    }
}
