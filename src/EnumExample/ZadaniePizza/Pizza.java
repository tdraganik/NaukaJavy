package EnumExample.ZadaniePizza;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean ham;
    private final boolean mushrooms;

    Pizza(boolean tomatoSauce, boolean cheese, boolean ham, boolean mushrooms) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    //    @Override
    public String toString() {
        String result = name() + " (";
        if (tomatoSauce)
            result += "Sos pomidorowy";
        if (cheese)
            result += " ,ser";
        if (ham)
            result += ", szynka";
        if (mushrooms)
            result += ", pieczarki";

        return result + ")";

    }

}

