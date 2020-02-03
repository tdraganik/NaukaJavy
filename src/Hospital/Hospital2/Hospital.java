package Hospital.Hospital2;

public class Hospital {

    private static final int MAX_EMPLOYEES = 3;
    private int employeesNumber = 0;
    private Person[] persons = new Person[MAX_EMPLOYEES];

    void add(Person person) {
        if (employeesNumber < MAX_EMPLOYEES) {
            persons[employeesNumber] = person;
            employeesNumber++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result += persons[i].getInfo() + "\n";
        }
        return result;
    }
}
