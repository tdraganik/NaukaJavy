package AbstractClass.Exercise;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    // TODO: brak jest zabezpieczeń czy wartośći są > 0 i czy powstanie tójkąta jest możliwe

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
          //  if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0)
                return 0.5 * a * height;
    }

    @Override
    public double calculatePertmiter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{ " + "a= " + a + ", b= " + b + ", c= " + c + ", height= " + height + '}'
                + " Pole: " + calculateArea() + " Obwód: " + calculatePertmiter();
    }
}
