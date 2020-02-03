package Hospital.Hospital1;


public class Patient {
    String firstname;
    String lastName;
    String pesel;

    public Patient(String firstname, String lastName, String pesel) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.pesel = pesel;
    }
    public Patient() {
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    String getInfo() {
       return firstname + ", " + lastName + ", " + pesel;
    }

}
