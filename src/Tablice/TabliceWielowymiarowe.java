package Tablice;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {

        int[][] tablicaDwuwymiarowa = new int[10][10];
        tablicaDwuwymiarowa[0][1] = 123;
        tablicaDwuwymiarowa[4][8] = 190;
        System.out.println(tablicaDwuwymiarowa[4][8]);

        // tablica 2-wiersze, każda 3 kolumny
        int[][] nowaTablica = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("[0][0] " + nowaTablica[0][0]);
        System.out.println("[0][1] " + nowaTablica[0][1]);
        System.out.println("[1][1] " + nowaTablica[1][1]);
        System.out.println("Rozmiar całej tablicy: " + nowaTablica.length);
        System.out.println("Rozmiar kolumny 0: " + nowaTablica[0].length);



    }
}
