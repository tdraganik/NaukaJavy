package AbstractClass.Outhers;

public class Amphibia implements Car, Boat {

    @Override
    public void printName() {
        System.out.println("Amphibia to trochę: " );
        Car.super.printName();
        System.out.println(" a trochę: " );
        Boat.super.printName();
    }
}
