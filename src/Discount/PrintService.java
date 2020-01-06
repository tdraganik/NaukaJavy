package Discount;

class PrintService {

    public void printSummary(Client client, double originalPrice, double discountPrice) {
        printWelcomeMessage(client); // wyświetlanie powitania
        printPrices(originalPrice, discountPrice); // wyświetlanie podsumowania cen
    }

    private void printPrices(double originalPrice, double discountPrice) {
        // Komunikaty dotyczące ceny
        System.out.println("Kwota zakupów przed obniżką to: " + originalPrice);
        System.out.println("Cena do zapłaty po rabatach to: " + discountPrice);
    }

    private void printWelcomeMessage(Client client) {
        //jeżeli podał tylko imię
        if (client.getFirstName() != null && client.getLastName() == null)
            System.out.println("Witaj " + client.getFirstName());
        //jeżeli podał tylko nazwisko
        else if (client.getFirstName() != null && client.getLastName() != null)
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        // jeżeli ie podał  imienia ani zanzwiska
        else if (client.getFirstName() == null && client.getLastName() != null)
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        else
            // jeżeli nic nie podał
            System.out.println("Witaj nieznajomy");
    }


}
