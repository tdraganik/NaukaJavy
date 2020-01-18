package Hospital;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;

        Scanner sc = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();  // w zmiennej hospital jest odwołane dla kasy Hospital

        while (option != 0) {

            System.out.println("Dostępne opcje:");
            System.out.println(exit + "- Wyście z programu");
            System.out.println(addPatient + "- Dodawanie pacjenta");
            System.out.println(printPatient + "- Wyświetlanie listy pacjentóœ ");

            System.out.println("Co chcesz zrobić?");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();

                    System.out.println("Imię: ");
                    patient.setFirstname(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextLine());

                    hospital.addPatient(patient);
                    break;

                case printPatient:
                    hospital.printPatients();
                    break;

                case exit:
                    System.out.println("Dziękujemy :-)");
                    break;

                default:
                    System.out.println("Wbrałeś nieprawidłową opcję");


            }
        }
                sc.close();

    }
}
