package Podstawy.Tablice;

public class TabliceZadania {
    public static void main(String[] args) {

        // 1 zadanie
        int[] tab = new int[] {1,2,3,4,5};
        int sumaTab = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
        System.out.println("Suma elementów tablicy: " + sumaTab);

        // 2 zadanie
        double[][] tablicaDouble = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8}
        };

        System.out.println("Suma 1 wiersza:" + (tablicaDouble[0][0] + tablicaDouble[0][1] +tablicaDouble[0][2] +tablicaDouble[0][3] +tablicaDouble[0][4] ));
        System.out.println("Suma 2 wiersza:" + (tablicaDouble[1][0] + tablicaDouble[1][1] +tablicaDouble[1][2] +tablicaDouble[1][3] +tablicaDouble[1][4] ));
        System.out.println("Suma 3 wiersza:" + (tablicaDouble[2][0] + tablicaDouble[2][1] +tablicaDouble[2][2] +tablicaDouble[2][3] +tablicaDouble[2][4] ));
        System.out.println("Suma 4 wiersza:" + (tablicaDouble[3][0] + tablicaDouble[3][1] +tablicaDouble[3][2] +tablicaDouble[3][3] +tablicaDouble[3][4] ));

        for (int i = 0; i < tablicaDouble.length; i++) {
            var sum = 0;
            for (int j = 0; j < tablicaDouble[i].length; j++) {
                sum+= tablicaDouble[i][j];
            }
            System.out.println("Suma " + i + " wiersza:"  + sum);
        }

    }
}
