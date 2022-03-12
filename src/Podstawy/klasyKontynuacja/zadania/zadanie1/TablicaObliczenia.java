package Podstawy.klasyKontynuacja.zadania.zadanie1;

public class TablicaObliczenia {

    private int[] tab;

    public TablicaObliczenia(int[] podajTablice) {
        tab = podajTablice;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public int srednia() {
        int srednia = 0;
        srednia = suma() / tab.length;
        return srednia;
    }

    public int wartoscMinimalna() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public int wartoscMaksymalna() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }


}



