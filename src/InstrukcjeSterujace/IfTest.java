package InstrukcjeSterujace;

public class IfTest {

    public static void main(String[] args) {
//        User user = new User("Jan", "Kowalski");
//
//        System.out.println("Wybierz opcję: ");
//
//        System.out.println("0 - wyjście z programu");
//        System.out.println("1 - wyświtlenie informacji o użytkowniku");
//        System.out.println("2 - modyfikacja dancych");
//
//        int option = 2;
//
//        if (option == 0) {
//            System.out.println("Bye bye :-(");
//
//        } else if (option == 1) {
//            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
//
//        } else if (option == 2) {
//user.setFirstName("Marian");
//user.setLastName("Powolny");
//            System.out.println("Zmodyfikowano dane użytkownika na: " + user.getFirstName()+ " " + user.getLastName());
//        } else {
//            System.out.println("Błędna opcja");
//        }

        int a = 10;
        int b = 30;
        int c = 20;

        if (a > b) {
            System.out.println("A>B");
        } else if (b > c) {
            System.out.println("B>C");
        } else if (c > a) {
            System.out.println("C>A");
        }

        if(a>b){
            System.out.println("(2) A > B ");
        }
        if(b>c){
            System.out.println("(2) B > C");
        }
        if(c>a) {
            System.out.println("(2) C > A");
        }
    }


}
