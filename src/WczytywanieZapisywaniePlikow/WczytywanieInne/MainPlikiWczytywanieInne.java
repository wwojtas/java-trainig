package WczytywanieZapisywaniePlikow.WczytywanieInne;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainPlikiWczytywanieInne {
    public static void main(String[] args) {

        String path = "D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\WczytywanieZapisywaniePlikow\\WczytywanieInne\\plik_caly_odczyt.txt";
        try {
            // kolekcja i typy generyczne
            List<String> allLines = Files.readAllLines(Paths.get(path));
            System.out.println(allLines);
        } catch (IOException e) {
            System.out.println("Cos poszło nie tak");
        }

    }
}
