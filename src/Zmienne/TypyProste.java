package Zmienne;

public class TypyProste {
 
    // wartości domyślne
    public static int domyslnyInt;
    public static float domyslnyFloat;
    public static char domyslnyChar;
    public static boolean domyslnyBoolean;

    public static void main(String[] args) {

        //Liczby całkowite

        byte zmiennaByte = 127;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        int zmiennaInteger = 2000000000;
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 1000000000000000L;
        System.out.println(zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Liczby zmiennoprzecinkowe

        float zmiennaFloat = 12.34f; // mniejsza precyzja - 32bity
        System.out.println("Zmienna float: " + zmiennaFloat);

        double zmiennaDouble = 12.34; // większa dokładność - 64 bity
        System.out.println("Zmienna Double: " + zmiennaDouble);

        // Pojedyncze znaki

        char zmiennaChar = 'a';
        System.out.println(zmiennaChar);

        // Wartości logiczne

        boolean zmiennaBoolean = false; // OR true
        System.out.println("Zmienna bool: " + zmiennaBoolean);

        //Typy proste - wartości domyślne

        System.out.println(domyslnyInt);
        System.out.println(domyslnyFloat);
        System.out.println(domyslnyChar);
        System.out.println(domyslnyBoolean);



    }
}
