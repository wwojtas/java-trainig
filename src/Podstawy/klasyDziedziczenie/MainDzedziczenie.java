package Podstawy.klasyDziedziczenie;

public class MainDzedziczenie {
    public static void main(String[] args) {

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();


        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();

        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();
        klasaBardziejRozszerzona.meotodaZKlasyBardziejRozszerzonej();


    }
}
