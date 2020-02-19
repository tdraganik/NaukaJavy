package Exception;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();
        try {
            car.refuel(46);  // zatankuj
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car + " litrów w baku");   // stan paliwa

        try {
            car.drive();                // jedź
            car.drive();                // jedź
            car.drive();                // jedź

        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println(car + " litrów ");    // stan paliwa

    }
}
