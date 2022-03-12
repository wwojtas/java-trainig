package Podstawy.Watki;

public class MojDrugiWatek extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Moj drugi watek: " + i);
        }
    }
}
