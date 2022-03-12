package Podstawy.KlasyThis;

public class KlasaRozszerzona extends KlasaPodstawowa{

    int x;
    int y;
    int z;
    int v;
    int pole;

    KlasaRozszerzona() {
        System.out.println("Konstruktor z klasa rozszerzona");
    }

    KlasaRozszerzona(int x) {
        this.x = x;
        System.out.println("Konstruktor z klasa rozszerzona z parametrem: " + x);
    }

    KlasaRozszerzona(int x, int y) {
        this(x);
        this.y = y;
        System.out.println("Konstruktor z klasą rozszerzoną z parametrami: " + x + " " + y);
    }

    void metodaZTejKlasy() {

    }

    void metodaZParametrami(int pole) {
        this.pole = pole;
    }



}
