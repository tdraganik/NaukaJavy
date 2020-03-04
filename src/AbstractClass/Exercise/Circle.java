package AbstractClass.Exercise;

public class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return  Shape.PI * r * r;
    }

    @Override
    public double calculatePertmiter() {
        return 2 * Shape.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + '}' + "  Pole" + calculateArea() + " Obwód: " + calculatePertmiter();
    }
}
