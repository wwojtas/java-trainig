package WyjatkiZadania;

public class MainWyjatkiZadania {
    public static void main(String[] args) {
        /*
        * Zadanie 1
    W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran.
    * Zobacz co się stanie, jeżeli pod b podasz liczbę 0.
    * Spróbuj obsłużyć błąd try/catchem, aby w przypadku dzielenia przez zero wyskoczył użytkownikowi komunikat:
    “Nie wolno dzielić przez 0!”
    (podpowiedź: należy obsłużyć wyjątek ArithmeticException)
        * */
        // pierwszy sposób
       /* int a = 100;
        int b = 0;
        double wynik;

        try {
            wynik = a / b;
            System.out.println("Wynik: " + wynik);
        } catch(ArithmeticException exception) {
            System.out.println("Nie wolno dzielić przez 0");
        }*/

        // drugi sposób
//        ZadaniePierwsze zadaniePierwsze = new ZadaniePierwsze();
//
//        try {
//            System.out.println(zadaniePierwsze.podzielDwieLiczby(10,0));
//        }catch(ZadaniePierwszeBJestZerem exception) {
//
//            System.out.println("Nie wolno dzielić przez 0 - wprost z klamer catch");
//            System.out.println(exception.getMessage());
//        }

        // trzeci sposób

//        ZadaniePierwsze zadaniePierwsze = new ZadaniePierwsze();
//
//        try {
//            System.out.println(zadaniePierwsze.podzielDwieLiczby(10,0));
//        } catch (ArithmeticException exception) {
//            System.out.println("Nie wolno dzielić przez 0");
//
//        }

        Matma.obwodKola(-5);






    }
}
