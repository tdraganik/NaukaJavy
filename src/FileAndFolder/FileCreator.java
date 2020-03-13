package FileAndFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {

    public static void main(String[] args) throws FileNotFoundException {
        // ścieżka i nazwa pliku
        String fileName = "/home/tomasz/Pulpit/KURSY/JAVA/JavaStart/Programy/src/FileAndFolder/File.txt";
        File file = new File(fileName);  // tworzenie nowego pliku lub katalogu o określonej lokalizacji jw

        Scanner scan = new Scanner(file);
//        boolean exists = file.exists();
//        if(!exists){
//            try {
//                exists = file.createNewFile();  // tworzenie pliku --> dla katalogi file.mkdir() - utworzy się w ramach projektu jeśli bez ścieżki
//            } catch (IOException e) {
//                System.out.println("Nie udało się utworzyć pliku ");
//            }
//        }
//        if(exists){
//            System.out.println("Udało się utworzyć plik: " + fileName);
//        }
        int lines = 0;
        while (scan.hasNextLine()){         // wykonuj dopóki w pliku jest kolejny wiersz
            String name = scan.nextLine();  // skanuj każdą linię i przypisz do name
            lines ++;                       // inkrementacja licznika linii
            System.out.print(lines + " "); // wydrukuj stan licznika linii
            System.out.println(name);  // wydrukuj w konsoli to co zczytałeś
        }
        System.out.println("Łączna liczba wierszy w pliku : " + fileName + " wynosi: " + lines);
    }
}
