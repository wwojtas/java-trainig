package Watki.zadania;

public class Czasoodmierzacz implements Runnable{

    @Override
    public void run() {
        for (int i = 0; ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                        e.printStackTrace();
            }
            System.out.println("minela: " + i +  " sekunda");
        }
    }
}
