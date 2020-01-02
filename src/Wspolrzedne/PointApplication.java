package Wspolrzedne;

import Wspolrzedne.controller.PointController;
import Wspolrzedne.point.Point;

public class PointApplication {

    public static void main(String[] args) {

        Point point1 = new Point(10, 20);

        PointController pc = new PointController();  // utworzenie zmennej obiektu/klasy PoimtController

        final int addX = 0;
        final int addY = 1;
        final int minus1X = 2;
        final int minus1Y = 3;


int option = addX;

switch (option){
    case addX:
        pc.addX(point1);
        break;
    case addY:
        pc.addY(point1);
        break;
    case minus1X:
        pc.minus1X(point1);
        break;
    case minus1Y:
        pc.minus1Y(point1);
        break;
    default:
        System.out.println("Wybrano błędną opcję");
}
        System.out.println("Punkt startowy: (" + point1.getX() + ", " + point1.getY() + ")");




//        System.out.println("Punkt wyjąciowy "+ point1.getX() + ", " + point1.getY());
//
//        pc.addX(point1);    // na klasie PointController używamy metodę addPlus1X ze zmiennmi z point1
//        System.out.println("Punkt addX "+ point1.getX() + ", " + point1.getY());
//
//        pc.addY(point1);
//        System.out.println("Punkt addY "+ point1.getX() + ", " + point1.getY());
//
//        pc.minus1X(point1);
//        System.out.println("Punkt minus1X "+ point1.getX() + ", " + point1.getY());
//
//        pc.minus1Y(point1);
//        System.out.println("Punkt minus1Y "+ point1.getX() + ", " + point1.getY());
    }
}
