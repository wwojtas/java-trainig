package Podstawy.klasyKontynuacja.zadania.zadanie1;

public class Matma {

    public static final double STALA_PI = 3.1415;

    public static double obwodKola(double promien){
        return 2*STALA_PI*promien;
    }

    public static double poleKola(double promien){
        return STALA_PI*Math.pow(promien, 2);
    }

    public static double obwódProstokoata(double a, double b){
        return 2*a+2*b;
    }
    public static double poleProstokoata(double a, double b){
        return a*b;
    }

    public static int suma(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public static int srednia(int[] tab) {
        int srednia = 0;
        srednia = suma(tab) / tab.length;
        return srednia;
    }

    public static int wartoscMinimalna(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int wartoscMaksymalna(int[] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
}
