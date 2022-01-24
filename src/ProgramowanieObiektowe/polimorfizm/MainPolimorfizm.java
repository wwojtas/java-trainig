package ProgramowanieObiektowe.polimorfizm;

public class MainPolimorfizm {
    public static void main(String[] args) {

//        Pies pies = new Pies();
//        pies.wydajDzwiek();

        // ale można też tak
//        Zwierze zwierze = new Pies();
//        zwierze.wydajDzwiek();
//
//        // i tak
//        zwierze = new Kon();
//        zwierze.wydajDzwiek();

        Osoba osoba = new Osoba();

        Pies pies = new Pies("Reksio");
        Kon kon = new Kon("Rafal");

        osoba.przygarnijZwierze(kon);
        osoba.jakNazywaSieTwojeZwierze();

    }
}
