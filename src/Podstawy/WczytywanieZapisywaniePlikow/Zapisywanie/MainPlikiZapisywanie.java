package Podstawy.WczytywanieZapisywaniePlikow.Zapisywanie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlikiZapisywanie {
    public static void main(String[] args) {

        try {
            String path = "D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\Podstawy.WczytywanieZapisywaniePlikow\\Zapisywanie\\plik_zapis.txt";
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Wiersz 1\n");
            bufferedWriter.write("Wiersz 2\n");
            bufferedWriter.write("Wiersz 3");
            bufferedWriter.newLine();
            bufferedWriter.write("Wiersz 4");
            bufferedWriter.newLine();
            bufferedWriter.write("Wiersz 5\n");

            bufferedWriter.close();

        }catch (IOException e) {
            System.out.println("Bład na operacjach z plikiem");
        }

    }
}
