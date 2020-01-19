package KołoStatic;

import java.util.Scanner;

public class PrintNumbers {
    private static final int EXIT = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Podaj pierwszą liczbę: ");
            int start = sc.nextInt();
            System.out.println("Podaj drugą liczbę: ");

            int end = sc.nextInt();

            printNumbers(start, end);

            System.out.println("Koniec programu - wprowadź " + EXIT);
        }
        while (sc.nextInt() != EXIT);

        sc.close();

    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
