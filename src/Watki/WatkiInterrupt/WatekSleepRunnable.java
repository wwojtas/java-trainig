package Watki.WatkiInterrupt;

public class WatekSleepRunnable implements Runnable{

    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Watek sleep: ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Poszedl exception w sleep()");
        }

    }
}
