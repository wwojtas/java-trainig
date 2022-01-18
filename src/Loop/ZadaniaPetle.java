package Loop;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import static java.lang.System.out;

public class ZadaniaPetle {
    public static void main(String[] args) {


        // zad 1 - wypisz na ekran
        /*
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }

        int i = 30;
        while(i >= 0) {
            System.out.println(i);
            i--;
        }
        */

        // zad 2 -wypisz liczby parzyste
        /*
        for (int i = 1; i <= 30 ; i++) {
            int liczbaParzysta = i % 2;
            if(liczbaParzysta == 0) System.out.println(i);
        }
*/

        // zad 3 - dwie dowolne liczby a i b; a < b
    /*
        int a = 10;
        int b = 21;

        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
*/
        //zad 4 -tablica 10 elementów
/*

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
*/

        // zad 5 - oblicz sume tablicy
/*
        int[] tab = new int[10];
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println(sum);
*/
        // zad 6 - silnia
/*

        int silnia = 5;
        int wynik = 1;

        for (int i = 1; i <= silnia; i++) {
            wynik *= i;
        }
        System.out.println(wynik);
*/

        // zad 7 - trójkąt

//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // zad 8

//        int n = 5;
//        int liczbaGwiazdekLustrzanych = 1;
//        int liczbaSpacjiLustrzanych = n - 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= liczbaSpacjiLustrzanych; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= liczbaGwiazdekLustrzanych; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            liczbaSpacjiLustrzanych--;
//            liczbaGwiazdekLustrzanych++;
//        }


        // LUB

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
