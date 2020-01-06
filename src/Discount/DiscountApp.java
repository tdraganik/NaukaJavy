package Discount;

public class DiscountApp {

    public static void main(String[] args) {

        Client client1 = new Client(null, "Nowak", true);
        double price1 = 1100;

        Client client2 = new Client("Jan", null, false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double discountPrice1 = discountService.calculateDiscountPrice(client1, price1);
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);

        //wywołanie klasy do zmiennej printService
        PrintService printService = new PrintService();
        //wywołanie na zmiennej klasy printService metody printSummary z danymi (client1, cena po obniżce )

        printService.printSummary(client1, price1, discountPrice1);
        printService.printSummary(client2, price2, discountPrice2);


    }
}
