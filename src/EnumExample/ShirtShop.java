package EnumExample;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dostepne rozmiary thirt-ów: ");
        Size[] enumy = Size.values();  // values zwraca wszystkie wartości w typie wyliczeniowym
        for (Size value : enumy) {
            System.out.println("Wszystkie Enumy: " + value.toString());
        }

        System.out.println("Podaj swój rozmiar:  " );

        String size = scanner.nextLine();

        Size shirtSize = Size.formDescription(size);

        //valueOf  -  dodanie Stringa XSMALL do zmiennej typu Size ENUMa (musi istnieć !!!)

        Tshirt tshirt1 = new Tshirt();
        tshirt1.setSize(shirtSize);

        System.out.println("Rozmair tshirt1 " + tshirt1.getSize());




    }
}
