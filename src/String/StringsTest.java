package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringsTest {

    public static void main(String[] args) {
//
//        String s1 = "Tomek";
//        String s2 = "Tomek";
//        System.out.println("s1 == s2 " + (s1 == s2));
//        System.out.println("s1.equals(s2) " + (s1.equals(s2)));
//
//        String s3 = new String("Ania");
//        String s4 = new String("Ania");
//
//        System.out.println("s3 == s4 " + (s3 == s4));
//        System.out.println("s3.equals(s4) " + (s3.equals(s4)));

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Podaj napis 1 do porównaia: ");
//        String s1 = sc.nextLine();
//
//        System.out.println("Podaj napis 2 do porównania: " );
//        String s2 = sc.nextLine();
//
//        System.out.println(s1.equals(s2));


//        String s = new StringBuilder("Hello ").append(" Word").toString();
//        System.out.println(s);
//
//
//        long start = System.nanoTime();
//
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < 1000; i++) {
//            builder.append(i + " ");
//        }
//        String z = builder.toString();
//        long time1 = System.nanoTime() - start;
//
//
//
//        long start1 = System.nanoTime();
//
//        String z1 = "";
//        for (int i = 0; i < 1000; i++) {
//            z1 += i + " ";  // dużo wolsniejsza
//        }
//        long time2 = System.nanoTime() - start1;
//
//        System.out.println(z);
//        System.out.println("Czas wykonania poprzez biulder wynosi: " + (time1) + " nanosekund");
//        System.out.println(z1);
//        System.out.println("Czas wykonania poprzez konkatenacje wynosi: " + (time2) + " nanosekund");
//        System.out.println("time2 / time1 " + time2/time1);
        String words = "  Siała baba mak nie wiedziala jak";
        System.out.println(words);

        String substring = words.substring(2, 7);
        System.out.println(substring   +  "                                           -  wycina od 2 do 7 znaku");

        String s = words.replaceAll("mak", "kukurydze"  +"                      -  podmienia \"mak \" na  \"kukurydze \"" );
        System.out.println(s);  // wyświetla podmieniony string w orygunalenje formie - WAŻNE aby przekazywać przez referencje

        String trim = words.trim();
        System.out.println(trim + "              -  bez buałych znaków");

        char c = words.charAt(9);
        System.out.println(c + "                                                 - znak na pozycji 9 oryginalenego Stringa");

        String u = words.toUpperCase();
        System.out.println(u + "                                      - zamaiana na duzę litery");

        int l = words.length();
        System.out.println(l + "                               - długość ciągu znaków");

        String[] split = trim.split(" ");
        System.out.println(split.length   +     "                       - usuwa spacje i dzieli na wyrazy i je zlicza");

        System.out.println(Arrays.toString(split)  +    "             - wyrazy do tablicy");
    }
}