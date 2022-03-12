package Podstawy.Watki.WatkiInterfejsRunnable;

public class MainWatkiRunnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new MojWatek());
        thread.start();


        // tworzenie wątku poprzez klase anonimowa
        // np gdy tylko raz jest potrzebny dany ciąg instrukcji
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Jestem z klasy anonimowej dla watkow: " + i);
                }
            }
        });
        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Bez przypisania do zmiennej: " + i);
                }
            }
        }).start();

    }
}
