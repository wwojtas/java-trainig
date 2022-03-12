package Podstawy.klasyKontynuacja.modyfikator.nazwa.app.dwa;

import Podstawy.klasyKontynuacja.modyfikator.nazwa.app.jeden.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public void metoda() {
        polePubliczne = 101;
        poleDziedziczenie = 102;
        metodaProtected();
        metodaPubliczna();
    }
}
