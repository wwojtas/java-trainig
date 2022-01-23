package Watki.podwojnyStart;

public class MainWatkiPodwojnyStart {
    public static void main(String[] args) {
        Thread thread = new Thread(new MojeRunnable());
        thread.start();

        Thread thread1 = new Thread(new MojeRunnable());
        thread1.start();
    }
}
