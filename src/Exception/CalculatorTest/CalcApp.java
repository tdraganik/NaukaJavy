package Exception.CalculatorTest;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public CalcApp() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);  // kropka zamiast przecinka w liczbach z częścią dzisiętną

        double a = 0;
        double b = 0;
        String operatpr = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = sc.nextDouble();
                sc.nextLine();
                System.out.println(" Podaj operator + . - , * lub / ");
                operatpr = sc.nextLine();
                System.out.println("Podaj drugą liczbę:");
                b = sc.nextDouble();
                sc.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś błedne dane");
                sc.nextLine();
            }

        }
        try {
            double result = CaculatorTest.calculate(a, b, operatpr);
            System.out.println(a + operatpr + b + " = " + result);

        } catch (UnknownOperaporException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się wyliczyć wyniku wyrażenia " + a + operatpr + b);
        }


    }
}
