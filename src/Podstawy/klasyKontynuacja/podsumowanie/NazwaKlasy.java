package Podstawy.klasyKontynuacja.podsumowanie;

public class NazwaKlasy {
    public static final String NAZWA_STRING = "nazwa string";
    private String polePrywatneString = "jakis prywatny string";
    int nazwaZmiennej = 55;

    public NazwaKlasy() {

    }

    public void nazwaMetodaVoid() {
        int nazwaZmiennej = 44;
        System.out.println("Wypisałem z metody void");


        System.out.println(nazwaZmiennej);
        System.out.println(this.nazwaZmiennej);
    }

    public void drugaMetoda() {
        int nazwaZmiennej;
        System.out.println("druga metoda");
    }

    private int metodaPrzyjmujeParametr(int a) {
        return a;
    }

    private int metodaPrzyjmujeParametr(String a) {
        return 5;
    }




}
