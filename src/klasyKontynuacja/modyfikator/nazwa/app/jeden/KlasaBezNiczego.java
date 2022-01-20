package klasyKontynuacja.modyfikator.nazwa.app.jeden;

class KlasaBezNiczego {
    public void metoda(){
        KlasaA obiekt = new KlasaA();
        obiekt.poleDziedziczenie = 202;
        obiekt.poleBezNiczego = 302;
        obiekt.metodaPubliczna();
        obiekt.metodaBezNIczego();
        obiekt.metodaProtected();


    }

}
