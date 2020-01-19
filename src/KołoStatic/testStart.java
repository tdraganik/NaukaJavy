package KołoStatic;

public class testStart {
    public static void main(String[] args) {

        double r = 4;

        Wylicz wylicz = new Wylicz();

        System.out.println(" Pole koła wynosi: " + wylicz.poleKola(r) + " cm ^2");
        System.out.println(" Obwód koła wtnosi: " + Wylicz.obwodKola(r) + " cm") ;
        // jeżeli metoda jest statyczna to możemy sie odwoływać do niej przez nazwę klasy
        System.out.println(" Gdzie PI = " + Wylicz.PI);
    }
}
