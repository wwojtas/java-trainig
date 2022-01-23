package Watki.WatkiSleep;

public class MainWatkiSleep {
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek 1: " + i);
                    // jeśli będziemy usypiać wątek to musimy obsłużyć wyjątek InterruptedException
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek 2: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();
    }
}
