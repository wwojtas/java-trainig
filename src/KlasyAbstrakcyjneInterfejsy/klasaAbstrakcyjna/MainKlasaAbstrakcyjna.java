package KlasyAbstrakcyjneInterfejsy.klasaAbstrakcyjna;

public class MainKlasaAbstrakcyjna {
    public static void main(String[] args) {

        KlasaZwykla obiekt = new KlasaZwykla();
        obiekt.metodaAbstrakcyjna();
        obiekt.metodaZParametrem("Hej");
        obiekt.jakasMetoda();

        Pies pies = new Pies();
        Kot kot = new Kot();
        Konik konik = new Konik();
        System.out.println("PIES");
        pies.wydajDzwiek();
        pies.przzemieszczanieSie();
        pies.karmieniePotomstwa();
        pies.podajIloscKonczyn();
        pies.temperaturaCiala();

        System.out.println("KOT");
        kot.wydajDzwiek();
        kot.przzemieszczanieSie();
        kot.karmieniePotomstwa();
        kot.podajIloscKonczyn();
        kot.temperaturaCiala();

        System.out.println("Konik");
        konik.wydajDzwiek();
        konik.przzemieszczanieSie();
        konik.karmieniePotomstwa();
        konik.podajIloscKonczyn();
        konik.temperaturaCiala();

    }
}
