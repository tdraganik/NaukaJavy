package Exception.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        do {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                double i = sc.nextInt();
                System.out.println("Podaj drugą liczbę: ");
                double j = sc.nextInt();
                error = false;

                double sum = i + j;
                double minus = i - j;
                double multiple = i * j;
                double div = i / j;

                System.out.println("Suma:" + sum);
                System.out.println("Minus: " + minus);
                System.out.println("Mnożenie: " + multiple);
                if(j != 0){
                    System.out.println("Dzielenie: " + div);
                }else
                    throw new ArithmeticException("Pamiętaj cholero nie dziel nigdy przez ZERO");

                sc.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Podaj poprawną wartość liczbową");
            } catch(ArithmeticException e){
                System.err.println("ArithmeticException się trafił ");

            } catch(IllegalStateException e) {
                System.out.println("xxxxxxxx");
            }
            finally {
                sc.nextLine();

            }
        } while (error = true);
        sc.close();
    }

}
