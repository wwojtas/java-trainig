package ProgramowanieObiektowe.polimorfizm;

public class Kon extends Ssak{

    public Kon(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Ihaha");
    }

    @Override
    public void pzedstawSie() {
        System.out.println("Jestem Kon: " + nazwa);
    }
}
