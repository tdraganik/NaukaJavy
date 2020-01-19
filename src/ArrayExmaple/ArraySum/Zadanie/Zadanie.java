package ArrayExmaple.ArraySum.Zadanie;

import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Wprowadz liczbę: ");
            int liczba = sc.nextInt();

            sum += liczba;
            System.out.println("Suma wprowadzonych liczb wynosi: " + sum);

            if ((sum > 100)&&(sum % 2 == 0)){
                System.out.println(sum + " Jest większa niż 100 i parzysta");
            }else if(sum > 100){
                System.out.println(sum + " Jest większa niż 100 i nieparzysta");
                sc.nextLine();
                return;
            }


        }


    }
}
