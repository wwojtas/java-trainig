package Zmienne;

public class TypyProsteKonwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;
        double d2 = i; //rzutowanie niejawne

        byte by = 100;
        int i2 = by;

        float f = 123.22f;
        d2 = f;

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong; // rzutowanie jawne

        byte bajt = 102;
        short shor = 1000;
        int in = 1234234;

//        in = bajt;
//        in = shor;
//        shor = bajt;
        bajt = (byte) in;
        System.out.println(bajt);
        System.out.println(bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;
        int doubleNaInt = (int) doubleObliczenia;
        System.out.println(doubleNaInt);
        int wynik = intObliczenia / (int) doubleObliczenia;

        double double1 = 1.2;
        double double2 = 12.4;
        double wynikDouble = double2 / double1;
        System.out.println("wynikDouble: " + wynikDouble);

        int wynikInt = (int) double2 / (int) double1;
        System.out.println("Wynik int: " + wynikInt);

        int wynikInt2 = (int) (double2 / double1);
        System.out.println(wynikInt2);

        char a = 'a';
        int literkaA = a;
        System.out.println(literkaA);


    }
}
