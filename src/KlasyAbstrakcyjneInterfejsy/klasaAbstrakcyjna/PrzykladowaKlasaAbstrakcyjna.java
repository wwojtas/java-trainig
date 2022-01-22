package KlasyAbstrakcyjneInterfejsy.klasaAbstrakcyjna;

public abstract class PrzykladowaKlasaAbstrakcyjna {

    public void jakasMetoda() {
        System.out.println("Wypisz cos na ekran z klasy abstrkcyjnej");
    }

    public abstract void metodaAbstrakcyjna();

    protected abstract int metodaZParametrem(String z);


}
