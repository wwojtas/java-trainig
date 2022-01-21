package KlasaRzutowanieObiektow;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczba(999);
        klasaRozszerzona.wyswietlLiczba();

        KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRozszerzona;
        klasaPodstawowa.wyswietlLiczba();

        Object object = (Object) klasaRozszerzona;


    }
}
