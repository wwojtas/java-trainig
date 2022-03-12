package Podstawy.Wyjatki.wyjatkiTworzenie;

public class MainWyjatkiTworzenie {
    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("jan@przyklad");
            uzytkownik.wprowadzHaslo("tajne");
            System.out.println("Wszystk poszlo OK");
        } catch (NIezbytTajneHasloException e) {
            System.out.println("Haslo niezbyt bezpieczne");
        } catch (NiepoprawnyEmailException exception) {
            System.out.println("Email nie zawiera @");
        }


        System.out.println("Czy doszedlem tutaj?");

    }
}
