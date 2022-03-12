package Podstawy.Klasy;

public class KlasaDlaMetod {

    // typZwracany nazwaMetody(parametry) {
    // }
    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak){
        liczba++;
        System.out.println("Wartość z metody: " + liczba + " " + pojedynczyZnak);
    }

    void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if(czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazać");
        }
    }

    int dodawanie(int a, int b){
        int wynik = a + b;
        return wynik;
    }

    double dodajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int jakasLiczba) {
        if(czyZwrocic) {
            return jakasLiczba;
        } else {
            return 0;
        }
    }

    int przykladKolejnej() {
        return 100;
    }

    void voidKtoryMialbyCosZwracac(boolean zwroc) {
        if(zwroc) {
            return;
        }
        System.out.println("Napisano bo nie zakonczono wartoscia logiczna");
    }



}
