package KlasyAbstrakcyjneInterfejsy.interfejs;

public class Ssak implements Zwierze{

    @Override
    public void oddycha() {
        System.out.println("pluca");
    }

    @Override
    public void odzywianie() {
        System.out.println("mieso i rosliny");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("Urodziny");
    }

}
