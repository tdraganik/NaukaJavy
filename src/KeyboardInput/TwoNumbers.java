package KeyboardInput;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        System.out.println("A + B = " + (a + b));


    }


}
