package KlasaScanner.WczytywanieDanych;

import java.util.Scanner;

public class MainWczytywanieDanych {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1 sposób
//        while(true) {
//            String linia = scanner.nextLine();
//            System.out.println( "Wprowadzilem linie: " + linia);
//            if(linia.equals("koniec")) {
//                System.out.println("no to koncze dzialanie");
//                break;}
//        }
        // 2 sposób

//        String linia;
//        do{
//          linia = scanner.nextLine();
//          System.out.println( "Wprowadzilem linie: " + linia);
//        }while(!linia.equals("koniec"));
//        System.out.println("no to koncze dzialanie");

        // 3 sposób
        String linia;


        while( !(linia = scanner.nextLine()).equals("koniec")) {
            System.out.println("Wprowadzilem linie: " + linia);
        }
        System.out.println("no to koncze dzialanie");


        }
    }

