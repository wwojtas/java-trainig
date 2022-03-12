package Podstawy.Zadania_Zmienne_Operatory;

public class First {

    public static void main(String[] args) {

        //1. zadanie
        byte age = 40;
        float height = 1.76f;
        float weight = 72.3f;

        System.out.println("Mam: " + age + " lat");
        System.out.println("Mam: " + height + " wzrostu");
        System.out.println("Tyle: " + weight + " waze");

        // 2 zadanie - moje BMI
        float BMI = weight / (float) Math.pow(height, 2);
        System.out.println("Moje BMI wynosi: " +   BMI);

        // 3 skonwertuj wynik
        int intBMI = (int) BMI;
        System.out.println("Moje BMI w integer wynosi: " +   intBMI);

        // 4 liczba typu całkowitego
        int integerNumber = 12;
        int a = 2;
        int b = 3;
        int c = 11;
        System.out.println("Liczby typu całkowitego: " + integerNumber / a + " -- " + integerNumber / b + " -- " + integerNumber / c );
        System.out.println("Liczby typu całkowitego: " + integerNumber % a + " -- " + integerNumber % b + " -- " + integerNumber % c );

        // 5. co ujrzymy na ekranie
        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        // 6. Przypisz wartość wykraczajaca poza rozmiar zmiennej
//        Integer.MAX_VALUE
//        int zmiennaTypuInteger = 2147483647;
//        int zmiennaTypuInteger2 = 2147483646;
//        System.out.println(zmiennaTypuInteger + " === " + zmiennaTypuInteger2);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);
    }
}
