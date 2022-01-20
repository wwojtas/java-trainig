package Klasy;

public class Metody {
    public static void main(String[] args) {

        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(222, 'b');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 100);
        int wynikDodawania = nazwaObiektu.dodawanie(10,5);
        System.out.println(wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.1);
        System.out.println("Po przecinku: " + wynikKolejnejMetody);

        System.out.println("Wartość logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));;

        nazwaObiektu.voidKtoryMialbyCosZwracac(false);



    }
}
