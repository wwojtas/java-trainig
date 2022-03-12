package Podstawy.KlasyAbstrakcyjneInterfejsy.klasaAbstrakcyjna;

public class KlasaZwykla extends PrzykladowaKlasaAbstrakcyjna {


    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisałem z klasy zwyklej");
    }

    @Override
    protected int metodaZParametrem(String z) {
        System.out.println("Wypisuje parametr: " + z);
        return 101;
    }
}
