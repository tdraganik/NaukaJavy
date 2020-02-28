package AbstractClass.Outhers;

public interface Example {
    default void complicetedmethod() {
        cteate();
        calculate();
        read();
        fave();
    }

    void cteate();

    void calculate();

    static void read(){};

    void fave();

}
