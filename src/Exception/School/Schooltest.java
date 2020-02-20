package Exception.School;

public class Schooltest {
    public static void main(String[] args) {
        School school = new School(3);

        try {
            school.add(new Student(1,"Janek","Wiśniewski"));
            school.add(new Student(2,"Anna", "Nowak"));
            school.add(new Student(3,"Adam", "Kowalski"));
            school.add(new Student(4,"Paweł", "Jaki"));
        } catch (NoMoreSpaceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student = school.find("Hieronim", "Wrona");

            System.out.println("Znaleziono studenta o id:  " + student.getStudentId());

        } catch (NoElementFoundException e) {
            System.out.println(e.toString());
        }

    }
}
