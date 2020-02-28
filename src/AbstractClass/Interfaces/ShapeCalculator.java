package AbstractClass.Interfaces;

public class ShapeCalculator {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);

        double a = circle.calculateArea();
        System.out.println("Pole powierzchni koła  wynosi:  " + a);

        double b = circle.calculatePerimeter();
        System.out.println("Obwód kołą wynosi: " + b);

        double c = rectangle.calculateArea();
        System.out.println("Pole powierzni prostokąta wynosii: " + c );

        double d = rectangle.calculatePerimeter();
        System.out.println("Obwód prostokąta wynosi: " + d);

        String data = circle.getData();
        System.out.println("circle.getData()     " + data);

        System.out.println(StringUtils.reverseString("Siałą baba mak"));
    }


}
