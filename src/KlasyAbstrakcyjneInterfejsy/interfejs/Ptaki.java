package KlasyAbstrakcyjneInterfejsy.interfejs;

public class Ptaki implements Zwierze{
    @Override
    public void oddycha() {
        System.out.println("Pluca");
    }

    @Override
    public void odzywianie() {
        System.out.println("Ziarno");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("jajo");
    }
}
