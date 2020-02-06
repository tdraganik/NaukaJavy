package EnumExample;

enum Size {
    XSMALL("Bardzo mały"), SMALL("Mały"),
    MEDIUM("Śreni"), LARGE("Duży");
    //public staticfinal Size SMALL = new Size("Mały")

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return ordinal() + " " + description + " " + name();
    }

    // name() - zwraca nazwę wartości z typu wyliczeniowego uwzg wielkość liter
// ordinal zwraca liczbę porządkową stałej wyliczeniowej
    public static Size formDescription(String description){
        Size[] values = values();
        for (Size size : values) {
            if(size.getDescription().equals(description))
                return size;
        }
        return null;
    }
}
