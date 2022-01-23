package Watki.WatkiInterrupt;

public class WatekInterruptedRunnable implements Runnable{
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Watek Interrupted Runnable działa");
        }
        System.out.println("Poza while i koniec");
    }
}
