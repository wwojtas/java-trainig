package Podstawy.ProgramowanieObiektowe.polimorfizm;

public class Osoba {

    private Zwierze zwierze;

    public void przygarnijZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public void jakNazywaSieTwojeZwierze() {
        if (zwierze != null) {
            zwierze.pzedstawSie();
        } else {
            System.out.println("Nie mam zwierzecia");
        }
    }
}
