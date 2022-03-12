package Podstawy.Enum.EnumKlasa;

public enum Pizza {
    MALA(20, 9.90F),
    DUZA(34, 16.95F),
    FAMILIJNA(42, 21.00F),
    XXL(50, 29.90F);

    private int rozmiar;
    private float cena;

    private Pizza(int rozmiar, float cena) {
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public float getCena() {
        return cena;
    }
}
