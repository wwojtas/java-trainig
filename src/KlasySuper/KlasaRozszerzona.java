package KlasySuper;

public class KlasaRozszerzona extends KlasaPodstawowa{

    @Override
    void metoda() {
        super.metoda();
        System.out.println("Kolejny tekst czy operacje w klasie rozszerzonej");
    }
}
