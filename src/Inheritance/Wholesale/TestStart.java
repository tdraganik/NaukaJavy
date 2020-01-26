package Inheritance.Wholesale;

public class TestStart {
    public static void main(String[] args) {

        Tire tire = new Tire(1264,"Pirelli", "Dębica", "Winter",225,17);
        ExhaustPart exhaustPart = new ExhaustPart(324234, "Jakas", "Bieżnik", "Całoroczne", false);

        tire.printInfo();
        exhaustPart.printInfo();

    }
}
