package Podstawy.klasyKontynuacja.zadania.zadanie1;

public class KlasaDlaProgramista {

    private String imie;
    private String nazwisko;
    private String jezyk;
    private double zarobki;

    public KlasaDlaProgramista(){

    }

    public KlasaDlaProgramista(String podajImie, String podajNazwisko, String podajJezyk, double podajZarobki) {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

//    public void ustawImie(String podajImie){
//        imie = podajImie;
//    }
//    public void ustawNazwisko(String podajNazwisko){
//        imie = podajNazwisko;
//    }

    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzJezyk(){
        return jezyk;
    }
    public double pobierzZarobki(){
        return zarobki;
    }




}
