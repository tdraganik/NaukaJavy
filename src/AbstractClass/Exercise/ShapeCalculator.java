package AbstractClass.Exercise;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {

    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj imformacje o prostokącie:");
        System.out.println("Podaj długość boku a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku b: ");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleata() {
        System.out.println("Podaj promień koła:");
        double r = sc.nextDouble();
        return new Circle(r);
    }

    private Triangle readTriangleata() {
        System.out.println("Podaj imformacje o trójkącie: ");
        System.out.println("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj długość b: ");
        double b = sc.nextDouble();
        System.out.println("Podaj długość c: ");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość height: ");
        double height = sc.nextDouble();

        return new Triangle(a, b, c, height);
    }

    public Shape createShape() {
        int shapeTpe = sc.nextInt();
        switch (shapeTpe) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleata();
            case Shape.TRIANGLE:
                return readTriangleata();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
