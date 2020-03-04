package AbstractClass.Exercise;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete){
            try{
               printOptions();
               shape = shapeCalculator.createShape();
                readComplete = true;
            } catch (InputMismatchException e){
                System.out.println("Wprowadziłeś dane w złym formacie.");
            } catch (NoSuchElementException ex){
                System.out.println("Niepoprawny identyfikator kształtu.");
            }
            finally {
                shapeCalculator.clearBuffer();
            }
        }

        System.out.println(shape);
        shapeCalculator.closeScanner();
    }

    private static void printOptions() {
        System.out.println("Wybierz figurę dla której chcesz obliczyć pole i obwód ");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");


    }
}
