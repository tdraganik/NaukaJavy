package Exception.School;

public class School {
    private Student[] students;   // pole z tablicą gdzie studenci będą przechowywani
    private int studentNumber;    // liczba studentów z pola students

    public School(int studentNumber){            // metoda pozwalająca na określenie ile studentóœ możemy zapisać
        students = new Student[studentNumber];
    }

    public void add(Student s) throws NoMoreSpaceException {
        // metoda przyjmująca studenta i zapisująca do na piwrwsze wolne miejsce do tablicy
        if(studentNumber >= students.length)
            throw new NoMoreSpaceException("Nie można dodać tylu osób " + students.length);
        students[studentNumber] = s;
        studentNumber ++;
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException{
// metoda przyjmująca imię i nazwisko i na tej podstawie wyszukujemy studenta w tablicy i zwracamy pierwszego znalezionego
        for (int i = 0; i < studentNumber; i++) {  // wywoła się tyle razy ile dodano stud do tablicy / ile razy wywołano metodę add
            if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                return students[i];
            }
        }
        throw new NoElementFoundException("Nie znaleziono szukanego elementu:  " + firstName + " " + lastName);
    }
}
