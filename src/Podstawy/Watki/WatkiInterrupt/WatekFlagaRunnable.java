package Podstawy.Watki.WatkiInterrupt;

public class WatekFlagaRunnable implements Runnable {

    private boolean watekDziala;

    @Override
    public void run() {
        watekDziala = true;
        while (watekDziala) {
            System.out.println("Dziala");
        }
        System.out.println( "Watek flaga zakonczyl dzialanie");
    }

    public void zatrzymajWatek() {
        watekDziala = false;
    }




}
