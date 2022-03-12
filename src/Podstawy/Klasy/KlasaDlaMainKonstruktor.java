package Podstawy.Klasy;

public class KlasaDlaMainKonstruktor {
    int pierwszePole;
    int drugiePole;

    // Konstruktor - tworzenie

    KlasaDlaMainKonstruktor(){

    }

    KlasaDlaMainKonstruktor(int wartoscPierwsza){
        pierwszePole = wartoscPierwsza;
        drugiePole = 1000;
    }


    KlasaDlaMainKonstruktor(int wartoscPierwsza, int wartoscDruga) {
        System.out.println("Jestem w konstruktorze z 2 parametrami");
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }

}
