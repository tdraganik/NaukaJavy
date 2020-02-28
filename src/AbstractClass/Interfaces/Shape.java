package AbstractClass.Interfaces;

interface Shape {

    double PI = 3.14159265;

    static double getPI() {
         return PI;
     }

    double calculateArea();
    double calculatePerimeter();

    default String getData(){
        return "Pole: " + calculateArea() + " Obwód: " + calculatePerimeter();
    }

}
