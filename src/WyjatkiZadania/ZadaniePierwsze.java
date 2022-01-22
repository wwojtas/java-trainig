package WyjatkiZadania;

public class ZadaniePierwsze {

    // drugi sposób

    public double podzielDwieLiczby(int a, int b) throws ZadaniePierwszeBJestZerem {

        if(b == 0) throw new ZadaniePierwszeBJestZerem();
        double wynik = a / b;
        return wynik;

    }

    //    trzeci sposób

//    public double podzielDwieLiczby(int a, int b) {
//
//        if(b == 0) throw new ArithmeticException();
//        double wynik = a / b;
//        return wynik;
//    }




}
