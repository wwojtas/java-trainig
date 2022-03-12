package Podstawy.KlasaScanner.delimiter;

import java.util.Scanner;

public class MainWczytywanieDanychZnaki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Wpisz cos: ");

        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println("Wczytałem: " + next);
        }
        System.out.println("Koniec");
        scanner.close();
    }
}
