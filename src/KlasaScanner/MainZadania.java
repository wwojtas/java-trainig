package KlasaScanner;

import java.util.Locale;
import java.util.Scanner;

public class MainZadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
//        String imie = scanner.next();
//        String nazwisko = scanner.next();
//        int wzrost = scanner.nextInt();
//        System.out.println("Jestem " + imie +
//                        " " + nazwisko +
//                " i mam " + wzrost + " wzrostu");

        // Zadanie 2
//        String linia;
//        scanner.useDelimiter(";");
//        while(!(linia = scanner.next()).toLowerCase().equals("x")){
//            System.out.println("Wczytano: " + linia);
//        }
//        System.out.println("Zakonczylem program");

        // Zadanie 3
        scanner.reset();
//        System.out.println("Wpisz linie ktora ma być powielona");
//        String linia = scanner.nextLine(); // czyta całą linię
//        System.out.println("Ile razy mam wyswietlić linię: ");
//        int liczbaLinii = scanner.nextInt();
//
//        for (int i = 0; i < liczbaLinii; i++) {
//            System.out.println(linia);
//        }

        // Zadanie 4

        int liczba = 0;
        int suma = 0;
        while( (liczba = scanner.nextInt()) >= 0 ){
            suma +=liczba;
        }
        System.out.println("Suma: " + suma);










    }
}
