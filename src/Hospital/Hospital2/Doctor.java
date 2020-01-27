package Hospital.Hospital2;

public class Doctor extends Person {
    private double bonus;

    public Doctor(String firstName, String lastName, Double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", Premia: " + bonus;
    }
}
