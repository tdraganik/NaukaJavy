package KołoStatic.Human;

public class Word {

    public static void main(String[] args) {
        Human adam = new Human("Adam", 180);
        Human ewa = new Human("Ewa", 165);

        Human.avgHeight =  (adam.getHeight() + ewa.getHeight()) / 2;

        System.out.println(adam.getName() + " " + adam.getHeight());
        System.out.println(ewa.getName() + " " + ewa.getHeight());
        System.out.println("Średni wzrost Adama i Ewy to: " + Human.avgHeight);

//        System.out.println(adam.avgHeight);   poprawne ale nie stosować
//        System.out.println(ewa.avgHeight);

    }

}
