package Hospital.Hospital2;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Kajtek", "Profeska", 7500.0, 1300));
        hospital.add(new Nurse("Siostra", "Basen", 1600.0, 6));
        hospital.add(new Nurse("Marta", "Kaczka", 2100.0, 3));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.getInfo());
    }

}

