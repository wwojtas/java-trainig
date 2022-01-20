package klasyKontynuacja.modyfikator.nazwa.app.jeden;

public class KlasaA {

    public int polePubliczne; // dostępne wszędzie
    protected int poleDziedziczenie; // dostępne przy dziedziczeniu oraz w tym samym package
    private int polePrywatne; // dostepne tylko i wyłącznie w danej klasie
    int poleBezNiczego; // package - bez modyfikatora - dostepne w obrębie tego samego package

    KlasaBezNiczego klasaBezNiczego = new KlasaBezNiczego();

    public void metodaPubliczna() {

    }
    protected void metodaProtected() {

    }
    private void metodaPrivate() {
        polePrywatne = 1;
    }
    void metodaBezNIczego() {

    }


}
