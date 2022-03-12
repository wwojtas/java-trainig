package Podstawy.Tablice;

public class TabliceJednowymiarowe {
    public static void main(String[] args) {

        int[] tablica; // nie zdefiniowano jakiego rozmiaru tablica
        tablica = new int[10]; // utworzenie tablicy o 10 elementach - utworzenie w pamięci komputera
        // indeks w tablicy
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;
        System.out.println(tablica[5]);

        double[] tabliceDouble = new double[5];
        tabliceDouble[0] = 12.5;
        tabliceDouble[1] = 55.5;
        tabliceDouble[2] = 111.1;
        System.out.println(tabliceDouble[0]);

        // tablica char
        char[] tablicaChar = new char[10];
        System.out.println(tablicaChar[0]);
        // skrócony zapis utworzenia tablicy
        int[] nowaTablicaInt = new int[] {10,50,99,101};
        // lub
        //int[] nowaTablicaInt = {10,50,99,101};
        System.out.println(nowaTablicaInt[0]);

        System.out.println("tablica int: " + tablica.length);
        System.out.println("tablica char: " + tablicaChar.length);
        System.out.println("Nowa tablica int: " + nowaTablicaInt.length);
    }
}
