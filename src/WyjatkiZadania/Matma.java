package WyjatkiZadania;

public class Matma {
    public static final double MY_PI = 3.1415;

    // tu nie piszemy w funkcji throws bo to jest wyjątek
    // typu uncheck - czyli taki który nie musimy koniecznie obsłużyć
    public static double obwodKola(double r) {
        if( r < 0) throw new LiczbaUjemnaException();
        return 2 * MY_PI * r;
    }

    public static double poleKola(double r) {
        return MY_PI * Math.pow(r, 2);
    }

    public static double obwodProstokota(double a, double b) {
        return 2 * (a + b);
    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }
}
