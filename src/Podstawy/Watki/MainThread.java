package Podstawy.Watki;

public class MainThread {
    public static void main(String[] args) {

        Thread watek1 = new MojPierwszyWatek();
        Thread watek2 = new MojDrugiWatek();
        watek1.start();
        watek2.start();

    }
}
