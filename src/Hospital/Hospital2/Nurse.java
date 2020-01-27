package Hospital.Hospital2;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String firstName, String lastName, Double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public Nurse(String firstName, String lastName, Double salary) {
        super(firstName, lastName, salary);
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Nadgodziny" + overtime;
    }
}
