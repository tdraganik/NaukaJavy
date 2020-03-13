package FileAndFolder.BufferReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {
    public static void main(String[] args) {
        String property = System.getProperty("java.version");
        System.out.println("Wersja JAVA: " + property);
        String fileName = "/home/tomasz/Pulpit/KURSY/JAVA/JavaStart/Programy/src/FileAndFolder/BufferReader/NazwaPliku.txt";
        // należy  podać całą ścieżkę do pliku
        try (
                FileReader fileReader = new FileReader(fileName);           // pozwala na odczyt znak po znaku
                BufferedReader reader = new BufferedReader(fileReader);  // pozwala na odczyt wieszami
                // jeżeli jest w try with ersources nie trzeba zamykać
        ) {
            String nextLine = null;
            int lines = 0;

            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Liczba wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
