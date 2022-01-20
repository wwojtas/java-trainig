package KlasaString;

public class ZadaniaString {
    public static void main(String[] args) {
        // zad 1
        String imie = "Wojciech";
        String nazwisko = "Nowak";
        String imieINazwisko = imie + " " + nazwisko;
        String alicja = "Alicja";

        System.out.println("Imie znakow: " + imie.length());
        System.out.println("Imie znakow: " + nazwisko.length());
        System.out.println("Imie znakow: " + imieINazwisko.length());

        System.out.println("Czy imie i nazwisko sa rowne: " + imie.equals(nazwisko));
        System.out.println("Czy imie jest rowne slowu Alicja: " + (imie.equals(alicja)));
        System.out.println("nazwisko duzymi literami: " + nazwisko.toUpperCase());

        String zamienLitery = imieINazwisko.replace('o', 'u');
        System.out.println(zamienLitery);

        String osobnaLinia = "Jak";
        int iloscZnakow = osobnaLinia.length();

        for (int i = 0; i < iloscZnakow; i++) {
            System.out.println("Litera nr: " + i + " to: " + osobnaLinia.charAt(i));
        }

        for (int i = iloscZnakow - 1; i >= 0; i--) {
            System.out.println("Litera nr: " + i + " to: " + osobnaLinia.charAt(i));
        }

    }
}
