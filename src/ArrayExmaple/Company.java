package ArrayExmaple;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];

        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Anna", "Kowalska", 2499);
        employees[2] = new Employee("Pawel", "Zych", 2000);
        employees[3] = new Employee("Zuzanna", "Wojak", 4000);

        int employeeIndex = 1;
        if (employeeIndex >= 0 && employeeIndex <= employees.length) {
            System.out.println(employees[employeeIndex].getFirstName() + " "
                    + employees[employeeIndex].getLastName() + " "
                    + employees[employeeIndex].getSalary() + " zł");
        }  else {
            System.out.println("Szukasz poza rozmiarem tablicy");
        }
        System.out.println(employees.length); // new Employee[20]
    }





}
