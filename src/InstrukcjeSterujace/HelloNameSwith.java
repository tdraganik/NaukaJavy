package InstrukcjeSterujace;

public class HelloNameSwith {

    public static void main(String[] args) {
        final String name1 = "Jan";
        final String name2 = "Paweł";
        final String name3 = "Piotrek";
        final String name4 = "Wojtek";
        final String name5 = "Maciek";

        final String name = "Maciek";

        switch (name) {
            case name1:
            case name2:
            case name3:
            case name4:
                System.out.println("Spoko gość jestes");
                break;
            case name5:
                System.out.println("jednak jestes Maciek");

            default:
                System.out.println("Witaj nieznany uzytkowniku");
        }
        System.out.println("Koniec programu");
    }
}
