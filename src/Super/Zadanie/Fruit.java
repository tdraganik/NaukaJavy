package Super.Zadanie;

public class Fruit {
    private int weight;    // w gramach
    private String type;  //  egzotyczny, jagodowy, jabłkowaty

    public Fruit(int weight, String type) {
        super();
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    String getInfo(){
        return getWeight() + getType();

    }
}
