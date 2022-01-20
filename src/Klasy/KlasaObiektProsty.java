package Klasy;

public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100;

        PrzykladDlaKlasaObiektProsty przyklad = new PrzykladDlaKlasaObiektProsty();
        PrzykladDlaKlasaObiektProsty przykladDrugi = new PrzykladDlaKlasaObiektProsty();

        przyklad.pole = 123;
        przykladDrugi.pole = 333;

        System.out.println("Przyklad: " + przyklad.pole);
        System.out.println("Przyklad drugi: " + przykladDrugi.pole);

    }
}
