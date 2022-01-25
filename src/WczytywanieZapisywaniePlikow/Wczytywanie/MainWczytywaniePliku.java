package WczytywanieZapisywaniePlikow.Wczytywanie;

import java.io.*;
import java.util.Scanner;

public class MainWczytywaniePliku {
    public static void main(String[] args) {

//        try {
//            File file = new File("D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\WczytywanieZapisywaniePlikow\\plik.txt");
//            Scanner scanner = new Scanner(file);
//
//            while(scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//        scanner.close();
//        } catch(FileNotFoundException e) {
//            System.out.println("Nie znaleziono pliku");
//        }

        try {
            String path = "D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\WczytywanieZapisywaniePlikow\\Wczytywanie\\plik.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        } catch (IOException e) {
            System.out.println("Problem z wczytywaniem pliku");
        }




    }
}
