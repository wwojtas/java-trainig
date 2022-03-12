package Podstawy.KlasyAbstrakcyjneInterfejsyUtrwalenie;

public class Klasa extends KlasaAbstrakcyjna implements Interfejs, DrugiInterfejs {

    private int pole;
    public void metodaKlasa() {
        System.out.println("Czynnosci w klasie");
    }

    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wlasna obsluga metody abstrkacyjenj w klasie");
    }

    @Override
    public void metodaInterfejsu() {
        System.out.println("Metoda z interfejsu w klasie");
    }

    @Override
    public int metodaDrugiegoInterfejsu() {
        return 101;
    }

    @Override
    public String kolejnaMetodaInterfejsuDrugiego() {
        return "Zwracam stringa";
    }
}
