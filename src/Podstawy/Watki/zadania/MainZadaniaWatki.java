package Podstawy.Watki.zadania;

public class MainZadaniaWatki {
    public static void main(String[] args) {

        // Zadanie 1
//        Thread watek1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
////            e.printStackTrace();
//                }
//                System.out.println("“Ta informacja została wypisana z klasy anonimowej i z mojego wątku”");
//            }
//        });
//        watek1.start();

        // Zadanie 2
//        Thread licznikCzasu = new Thread(new Czasoodmierzacz());
//
//        licznikCzasu.start();

        // Zadanie 3

        // 1 sposob

//        Thread watek3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println("Bede pierwszy to ja: watek3");
//                }
//                System.out.println("Zakonczylem: watek3");
//            }
//        });
//
//
//        Thread watek4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println("Bede pierwszy to ja: watek4");
//
//                }
//                System.out.println("Zakonczylem: watek4");
//            }
//        });
//
//        watek3.start();
//        watek4.start();

        // 2 sposób

        Scigacz scigacz1 = new Scigacz("Scigacz nr 1");
        Scigacz scigacz2 = new Scigacz("Scigacz nr 2");

        Thread scigacz2Thread = new Thread(scigacz2);
        Thread scigacz1Thread = new Thread(scigacz1);


        scigacz1Thread.start();
        scigacz2Thread.start();







    }
}
