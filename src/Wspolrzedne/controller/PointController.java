package Wspolrzedne.controller;
import Wspolrzedne.point.Point;

public class PointController {



    // metody do manupulowania danymi x i y - tu do dodawaia/odejmowaia  do/od  nich 1
    public void addX(Point p){   // szablon do przesłania zmiennej X i  dowaniaa 1 do X
         int currentX = p.getX();  // pobieramy przesłane współrzędne X do zmiennej curentX
         p.setX(currentX + 1);   // dodajemy do tego co pobierze metoda  1
     }
    public void addY(Point p) {
        int currentY = p.getY();
        p.setY(currentY + 1);
    }
    public void minus1X(Point p) {
        int currentX = p.getX();
        p.setX(currentX - 1);
    }
    public void minus1Y(Point p) {
        int currentY = p.getY();
        p.setY(currentY - 1);
    }

}
