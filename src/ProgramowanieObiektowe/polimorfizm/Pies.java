package ProgramowanieObiektowe.polimorfizm;

public class Pies extends Ssak {

    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau Hau");
    }

    @Override
    public void pzedstawSie() {
        System.out.println("Jestem pies: " + nazwa);
    }
}
