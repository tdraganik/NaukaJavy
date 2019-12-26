public class HelloWord {
    public static void main(String[] args) {

        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 25;
        double przyrost = 10;
        double height = 150.7;
        double lacznyWzrost = przyrost + height;
        final String pesel = "4234242423" ;



        System.out.println( firstName + " " + lastName +" ma 26 lt");
        System.out.println("Pan " + firstName + " "+ lastName +" " + "Jan Kowaski ma PESEL: " + pesel);
        System.out.println("Jan na wzrostu: " + height);
        System.out.println("Jeżeli Jan urośnie jeszcze o " + przyrost+ " to będzie miał: " + (height + przyrost) + " cm");
    }
}
