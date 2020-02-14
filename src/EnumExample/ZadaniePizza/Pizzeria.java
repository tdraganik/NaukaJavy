package EnumExample.ZadaniePizza;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        printPizzas();
        orderPizzas();
    }

    private static void orderPizzas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jaką pizze chcesz zamówić? ");

        Pizza confirmations = Pizza.valueOf(sc.nextLine().toUpperCase());
        sc.close();
        System.out.println("Twoja zamówiona pizza to: " + confirmations.name() + " ze składnikami: " + confirmations.toString());
    }

    private static void printPizzas() {
        System.out.println("Nasze menu: ");
        Pizza[] values = Pizza.values();

        for (Pizza pizza : values) {
            System.out.println(pizza);
        }
    }
}
