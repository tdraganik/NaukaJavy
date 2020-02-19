package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exmaple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj mi pierwszą liczbę: ");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj mi drugą liczbę: ");
                numbers[1] = sc.nextInt();

                System.out.println("Którą z tych dwóch podanych liczb chcesz wyświetlić? ( 1 lub 2 )");

                System.out.println("Liczba: " + numbers[sc.nextInt() - 1]);
                error = false;

            } catch (InputMismatchException  e) {
                System.out.println("Niepoprawna warotść");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Odwołałeś się do nieistniejącej pozycji !!! ");
            } finally {
                sc.nextLine();
            }
        } while (error);  // wykonuj pętlę dopóki user podaje błędną wartość

        sc.close();
    }
}
