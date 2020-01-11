package KeyboardInput;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swój wiek");
        int age = scan.nextInt();
        scan.nextLine();  // bez tego wiersza program pominie imię (ponieważ zapamięta enter z nextInt)

        System.out.println("Podaj swoje imię: ");
        String firstNeme = scan.nextLine();
        ;
        System.out.println("Podaj swoje nazwiasko: ");
        String lastName = scan.nextLine();


        scan.close();

        System.out.println("Cześć " + firstNeme +" " + lastName);
        System.out.println("Masz juz " + age + " lat, starość nie radość");
        scan.close();
    }
}
