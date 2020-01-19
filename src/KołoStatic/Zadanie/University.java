package KołoStatic.Zadanie;

public class University {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumber());

        Student s1 = new Student("Jan", "Kowalski", 179304);
        System.out.println("Liczba studentów w trakcie zapisów: " + Student.getStudentsNumber());
        Student s2 = new Student("Marek", "Jarosz", 176532);
        Student s3 = new Student("Anna", "Jakas", 742632);

        System.out.println("Liczba studentów po zapisach: " + student.getStudentsNumber());
    }
}
