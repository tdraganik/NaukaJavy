package AbstractClass.Exercise;

public class Rectangle implements Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePertmiter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a = " + a + ", b = " + b + '}'
                + " Pole: " + calculateArea() + " Obwód: " + calculatePertmiter();
    }
}
