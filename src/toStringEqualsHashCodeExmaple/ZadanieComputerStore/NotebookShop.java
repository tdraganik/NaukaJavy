package toStringEqualsHashCodeExmaple.ZadanieComputerStore;

public class NotebookShop {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addComp(new Computer("HP", 22));
        dataStore.addComp(new Computer("Intel", 22));
        dataStore.addComp(new Computer("HP", 22));
        dataStore.addComp(new Computer("Celeron", 22));
        dataStore.addComp(new Computer("HP2", 65));
        dataStore.addComp(new Computer("Asus", 22));
        dataStore.addComp(new Computer("HP", 22));
        dataStore.addComp(new Computer("Huawei", 22));

        Computer findComp = new Computer("HP",22);  // obiekt który chcemy wyszukać

        int availability = dataStore.checkAvailability(findComp);

        System.out.println("Takich samych komputerów jak " + findComp.toString() + "  jest: " + availability);

        System.out.println("Wszystkie kompuetry na stanie: ");
        for (Computer c : dataStore.getComputers()) {  // pętla for po dataStore.getComputers()
            System.out.println(c);
        }

    }
}
