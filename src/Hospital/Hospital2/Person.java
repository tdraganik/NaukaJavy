package Hospital.Hospital2;

public class Person {
    private String firstName;
    private String lastName;
    private Double salary;

    public Person(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ", Wypłata " + salary;
    }
}
