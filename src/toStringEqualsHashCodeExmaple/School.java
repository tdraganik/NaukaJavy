package toStringEqualsHashCodeExmaple;

public class School {
    public static void main(String[] args) {

        Student student0 = new Student("Jankowski", 25);
        Student student1 = new Student("Jankowski", 25);
        Student student3 = new Student("Nowak", 33);

//        System.out.print("student1 == stucent2      ");
//        System.out.println(student0 == student1);  // false - WSKAZUJE NA DWA RÓŻNE OBIEKTY

        System.out.print("student0.equals(student1)      ");
        boolean studentequals = student0.equals(student1);
        System.out.println(studentequals);

//        System.out.println(student0 instanceof Student); //true
//        System.out.println(student0 instanceof Person); // true
// porównanie poprzez .getClass()  uwzględnia tylko bieżący typ
        // natomiast instanceoff uwzględnia również obiekty nadrzędne

        int hash0 = student0.hashCode();
        int hash1 = student1.hashCode();
        int hash3 = student3.hashCode();
        System.out.println(hash0);
        System.out.println(hash1);
        System.out.println(hash3);

        System.out.println(student0); // to samo co student0.toStrong();
    }
}
