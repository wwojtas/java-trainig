package Podstawy.KlasaRzutowanieObiektow;

public class KlasaPodstawowa {
    private int liczba;

    public void ustawLiczba(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlLiczba() {
        System.out.println("Liczba: " + liczba);
    }
}
