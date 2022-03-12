package Podstawy.Watki.WatkiInterfejsRunnable;

public class MojWatek implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jestem w moim watku: " + i);
        }
    }
}
