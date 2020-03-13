package FileAndFolder.BufferReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        String property = System.getProperty("java.version");
        System.out.println("Wersja JAVA: " + property);
        String fileName = "/home/tomasz/Pulpit/KURSY/JAVA/JavaStart/Programy/src/FileAndFolder/BufferReader/NazwaPliku.txt";

        try (
                FileWriter fileWriter = new FileWriter(fileName, true);  // flaga true pozwala na dopisywanie
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            writer.write("Anna");
            writer.newLine();
            writer.write("Ola");
            writer.newLine();
            writer.write("Basia");
            writer.newLine();
            writer.write("Róża \n");
            writer.write("Imię \n");
            writer.flush(); // Zamyka strumień, najpierw go opróżniając. Pozwala zapisać do pliku poprzez flush

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
