package Klasy;

public class MainKonstruktor {
    public static void main(String[] args) {
        KlasaDlaMainKonstruktor klasaKonstruktor = new KlasaDlaMainKonstruktor(200);
//        klasaKonstruktor.pierwszePole = 5;
//        klasaKonstruktor.drugiePole = 105;

        System.out.println(klasaKonstruktor.pierwszePole);
        System.out.println(klasaKonstruktor.drugiePole);

        KlasaDwaDlaKonstruktor klasaDwa = new KlasaDwaDlaKonstruktor();

        KlasaDlaMainKonstruktor klasaKon = new KlasaDlaMainKonstruktor();
        System.out.println(klasaKon.pierwszePole);
        System.out.println(klasaKon.drugiePole);

    }
}
