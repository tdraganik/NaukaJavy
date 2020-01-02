package Car.logic;

import Car.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2017, "Audi", "A5", "Czarne");
        Car car2 = new Car(2017, "Audi", "A4");

        System.out.println(car1.getModel() + " " + car1.getColor());
        System.out.println(car2.getModel() + " " + car2.getColor());

        car2.setColor("Czerwony");
        car2.setYear(-1000);

        System.out.println(car2.getModel() + " " + car2.getColor() + " " + car2.getYear() );
        System.out.println();
    }


}
