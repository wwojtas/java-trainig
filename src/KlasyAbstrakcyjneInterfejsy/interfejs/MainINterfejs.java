package KlasyAbstrakcyjneInterfejsy.interfejs;



public class MainINterfejs {
    public static void main(String[] args) {

        Ryba ryba = new Ryba();
        Ptaki ptak = new Ptaki();
        Ssak ssak = new Ssak();

        System.out.println("Ryba");
        ryba.oddycha();
        ryba.odzywianie();
        ryba.wydawaniePokolenia();
        System.out.println();

        System.out.println("Ptaki");
        ptak.oddycha();
        ptak.odzywianie();
        ptak.wydawaniePokolenia();
        System.out.println();

        System.out.println("ssak");
        ssak.oddycha();
        ssak.odzywianie();
        ssak.wydawaniePokolenia();


    }
}
