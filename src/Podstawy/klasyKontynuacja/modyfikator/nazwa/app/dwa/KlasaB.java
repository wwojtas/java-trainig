package Podstawy.klasyKontynuacja.modyfikator.nazwa.app.dwa;


// import Podstawy.klasyKontynuacja.modyfikator.nazwa.app.jeden.KlasaBezNiczego;
import Podstawy.klasyKontynuacja.nazwa.app.jeden.KlasaA;

public class KlasaB {
    public void metoda() {
        KlasaA obiekt = new KlasaA();
        obiekt.polePubliczne = 10;
        obiekt.metodaPubliczna();

        // klasaBezNiczego znajduje się w innym package - a klasa jest bez modyfikatora dostepu
        // obiekt niemożliwy do utworzenia
      //  KlasaBezNiczego klasaBezNiczego;
    }
}
