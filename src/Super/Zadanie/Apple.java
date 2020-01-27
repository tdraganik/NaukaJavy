package Super.Zadanie;

public class Apple extends Fruit {

    public static final String TYPE = " Jabłkowaty ";
    private String variety; // odmiana



    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

   @Override
    String getInfo() {
       return super.getInfo() + getVariety();
    }
}

