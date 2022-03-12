package Podstawy.Watki.WatkiJoinIsAlive;

public class MainWatkiJoinIsAlive {
    public static void main(String[] args) {
        System.out.println("START");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Bardzo ciężko pracuję...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        System.out.println("Przed join(): czy watek zyje: " + thread.isAlive());
        try {
            thread.join();
        } catch (InterruptedException e) {
//
        }

        System.out.println("Po join(): czy watek zyje: " + thread.isAlive());
        System.out.println("STOP");
    }
}
