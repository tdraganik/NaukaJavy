package AbstractClass.Interfaces;

class Circle implements Shape {

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
        return Shape.getPI() * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return Shape.getPI() * r;
    }
}
