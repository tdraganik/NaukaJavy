package Exception;

public class Car {
    private static final double FUEL_CONSUMTION = 8; //  średnie spalanie   8 litrów na 100 km
    private static final double MAX_FUEL = 50;
    private double fuel = 5;  // ilość paliwa wa baku

    public void refuel(double additionalFuel) {        // zatankowanie samochodu
        if (fuel + additionalFuel > MAX_FUEL) {
            throw   new IllegalArgumentException("Nie zmieści Ci się tyle paliwa, zmieścisz maksymalnie " + (MAX_FUEL - fuel));
        } else
            fuel += additionalFuel;                     // dodaj do obecnej ilośći paliwo
    }

    public void drive() {                        // Zużyj paliwa na odległości 100 kn
        if (fuel - FUEL_CONSUMTION < 0) {
            throw new IllegalStateException("Masz za mało paliwa na podróż - ZATANKUJ !!!");
        }
        else
            fuel -= FUEL_CONSUMTION;
    }
    @Override
    public String toString() {

        return "Stan paliwa: " + fuel;
    }
}

