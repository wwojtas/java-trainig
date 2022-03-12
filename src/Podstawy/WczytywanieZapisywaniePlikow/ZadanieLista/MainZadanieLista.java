package Podstawy.WczytywanieZapisywaniePlikow.ZadanieLista;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainZadanieLista {
    public static void main(String[] args) {

        try {
            // odczytujemy z pliku
            String path = "D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\Podstawy.WczytywanieZapisywaniePlikow\\ZadanieLista\\fragment.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // zapisujemy do pliku
            String pathWrite = "D:\\Z_WOJCIECH\\KURSY\\JAVA\\JetBrainsProjects\\src\\Podstawy.WczytywanieZapisywaniePlikow\\ZadanieLista\\fragment-kopia.txt";
            FileWriter fileWriter = new FileWriter(pathWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // dodaje scaner czytający dane z klawiatury do pytania c)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szukaną frazę: ");
            String szukanaFraza = scanner.nextLine();

            // Data
            Date nowDate = new Date();
            System.out.println(nowDate);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm");
            String actualDate = simpleDateFormat.format(nowDate);

            String line;
            int liczbaZnakow = 0;
            boolean czyZawieraFraze = false;
            int numerLini = 0;

            while ((line = bufferedReader.readLine()) != null) {
                numerLini++;

//          a) wypisz zawartosc pliku na ekran
//                System.out.println(line);

//          b) zlicz (powyżej) i wypisz ilość znaków występujących w pliku
                liczbaZnakow += line.length();

//           c) wczytaj tekst z klawiatury i sprawdz czy znajduje się dana fraza w pliku
                if (line.toLowerCase().contains(szukanaFraza.toLowerCase())) {
                    czyZawieraFraze = true;
                }

//          d) w pliku może znajdować się wiele takich fraz.
//          Znajdź wszystkie i wypisz nr linii wraz z całą linią tam gdzie znajduje się szukany tekst w postaci:
//          <nr linii>: <cała linia z szukanym tekstem>
//          Zakomentuj wypisywanie z podpunktu a), aby wynik był czytelniejszy
                if (line.toLowerCase().contains(szukanaFraza.toLowerCase())) {
                    System.out.println(numerLini + " : " + line);
                }

//          e) przekopiuj całą zwartość do nowego pliku o nazwie "fragment-kopia.txt".
//          Otwórz plik i sprawdź czy kopia została poprawnie utworzona.
//          Dopisz na końcu pliku "Kopia pliku utworzona przez <imię nazwisko>"

                bufferedWriter.write(line + "\n");
            }

            bufferedWriter.write("\n Kopia pliku została utworzona: " + actualDate);
            bufferedWriter.close();
            bufferedReader.close();
            scanner.close();

            System.out.println();
            System.out.println("Liczba znakow: " + liczbaZnakow);
            System.out.println("Czy zawiera fraze: " + czyZawieraFraze);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
