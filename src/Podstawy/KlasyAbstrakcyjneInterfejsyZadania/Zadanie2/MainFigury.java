package Podstawy.KlasyAbstrakcyjneInterfejsyZadania.Zadanie2;

public class MainFigury {
    public static void main(String[] args) {

        Kolo kolo = new Kolo(4);
        System.out.println(kolo.pole());
        System.out.println(kolo.obwod());


        Prostokat prostokat = new Prostokat(4,6);
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());


    }
}
