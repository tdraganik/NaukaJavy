package toStringEqualsHashCodeExmaple.ZadanieComputerStore;

public class DataStore {

    private int regComputer = 0;
    private static final int MAX_NUMBER_COMPUTER = 100;

    private Computer[] computers = new Computer[MAX_NUMBER_COMPUTER];

    public Computer[] getComputers() {
        Computer[] comp = new Computer[regComputer];  // tworzenie tablicy z istniejących tylko rekordów
        for (int i = 0; i < regComputer; i++) {
            comp[i] = computers[i];  // do krótkiej tablicy przypisujemy całą tablicę z rzeczywistą ilością rekordów
        }
        return comp;    // zwracamy rzeczywistą tablicę
    }

     void addComp(Computer computer) {
        if (regComputer < MAX_NUMBER_COMPUTER && computer != null) {
            computers[regComputer] = computer;
            regComputer++;
        } else
            System.out.println("Nie można dodać więcej komputerów");
    }

    void printComp() {
        for (int i = 0; i < regComputer; i++) {
            System.out.println(computers[i].toString());
            System.out.println("AKtualna liczna komputerów to: " + regComputer);
        }
    }

    int checkAvailability(Computer find) {  // obiekt klasy Computer
        if (find == null)
            return 0;

        int count = 0;                              // zerowanie licznika
        for (int i = 0; i < regComputer; i++) {    // pętla zliczająca po rzeczywistej liczbie rekordów
            if (find.equals(computers[i]))       // obiekty z klasy Computer identyczne
                count++;                        // zapisuje w liczniku
        }
        return count;
    }

}
