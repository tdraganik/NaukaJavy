package Hospital.Hospital1;

public class Hospital {
    private final int maxPatientsNumber = 10; //maxymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber]; //tablica na pacjentów
    private int regPatients = 0; //aktualna liczba pacjentów

    public void addPatient(Patient patient) {
        if (regPatients < maxPatientsNumber) {  // maxPatientsNumber to to samo co patients.lenght
            patients[regPatients] = patient; // dodajemy pacjenta do tablicy przekazanego do metody na miejsce 0
            regPatients++;  // inkrementacja aktualnej liczby pacjentów

        } else {
            System.out.println("Kolejka jest już pełna dzisiaj");
        }
//        patients[0] = new Patient("jan", "Kowalski", "9088978723");
//        patients[1] = new Patient("Anna", "Nowak", "83859237183");
//        patients[2] = new Patient("Paweł", "Alekin", "7393772845");
    }

    public void printPatients() {

        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getInfo());  // lub patirnts[i].getFirstName ....itd
            System.out.println("Aktualnyu stan kolejki to: " + getRegPatients());
        }

    }

    public int getRegPatients() {
        return regPatients;
    }

}

