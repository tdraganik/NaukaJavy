package KeyboardInput.Calculate;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Wylicz wylicz = new Wylicz();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);

        System.out.println("Wprowadź pierwszą liczbę: ");
        double a = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Wprowadź znak:  + - * / ");
        String z = scanner.nextLine();

        System.out.println("Wprowadź drugą liczbę: ");
        double b = scanner.nextDouble();

        scanner.close();
        Double wynik = wylicz.Calculate(a,b,z);
        System.out.println(wynik);


    }
}
