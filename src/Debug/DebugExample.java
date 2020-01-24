package Debug;

import java.util.Scanner;

public class DebugExample {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = getArraySize();        //wczytuje od użytkownika dowolną liczbę całkowitą
        int[] numbers = createArray(size);//Liczba ta jest rozmiarem tablicy  która tworzona jest w metodzie createArray().
        int multiplier = getMultiplier(); // mnożnik przypisujemy do zmienniej multiplier
        multiplyAllNumbersBy(numbers, multiplier); // do multiplyAllNumbersBy przekazujemy tablice i mnożnik
        printArray(numbers);  // pokaż tablicę
    }
    private static int getArraySize() {
        System.out.println("Podaj ilość liczb do wczytania:");
        int result = sc.nextInt();
//        scanner.close();
        return result;
    }

    private static int[] createArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj kolejną liczbę:");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    private static int getMultiplier() {
        System.out.println("Podaj mnożnik:");
        return sc.nextInt();
    }

    private static void multiplyAllNumbersBy(int[] array, int multiplier) {
//        for (int number : array) {
//            number = number * multiplier;
//        }  -- błędna pętla for each nie nadaje się do operacjach na rablicy
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multiplier;
        }
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + "  ");
        }
    }
}

