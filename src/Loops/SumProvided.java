package Loops;

import java.util.Scanner;

public class SumProvided {
    public static void main(String[] args) {

        System.out.println("Podaj jakąś liczbę:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int sum = 0;
        for (int j = 0; j < i; j++) {
            System.out.println("Podaj tyle liczb ile na początku zadelkslaworwałes:");
            sum +=sc.nextInt();

        }
        System.out.println("Suma podanych przez Ciebie liczb wynosi: " + sum);
        sc.close();

    }
}




