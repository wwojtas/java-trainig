package Tablice;

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
    }
}
