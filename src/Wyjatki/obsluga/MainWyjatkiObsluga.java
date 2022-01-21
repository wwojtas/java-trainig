package Wyjatki.obsluga;

public class MainWyjatkiObsluga {
    static String str;
    static int[] tablica;

    public static void main(String[] args) {

//        try {
//            System.out.println("Przed wykonaniem");
//            System.out.println("Czy pusty: " + str.isEmpty());
//            System.out.println("Po wykonaniu");
//        } catch (NullPointerException exception) {
//            System.out.println("nie utworzyles stringa");
//        }
    tablica = new int[3];
        try {
            tablica[0] = 10;
            tablica[1] = 12;
            tablica[2] = 13;

            System.out.println("Wszystko poszło OK");
        } catch(NullPointerException | ArrayIndexOutOfBoundsException  exception) {
            System.out.println("Hej Utworz tablice co najmniej 2 elementow");
        }

//        System.out.println("Na koniec programu wypisz to cos");
    }
}
