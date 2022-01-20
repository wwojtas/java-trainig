package KlasyPrzeslanianieMetod;

public class MainPrzeslanianieMetod {
    public static void main(String[] args) {
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();
    }
}
