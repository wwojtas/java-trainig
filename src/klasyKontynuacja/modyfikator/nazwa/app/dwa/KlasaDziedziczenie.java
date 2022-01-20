package klasyKontynuacja.modyfikator.nazwa.app.dwa;

import klasyKontynuacja.modyfikator.nazwa.app.jeden.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public void metoda() {
        polePubliczne = 101;
        poleDziedziczenie = 102;
        metodaProtected();
        metodaPubliczna();
    }
}
