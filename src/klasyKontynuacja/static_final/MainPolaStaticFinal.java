package klasyKontynuacja.static_final;

public class MainPolaStaticFinal {

    public static void main(String[] args) {

        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;
        KlasaStaticFinal.poleStatic = 15;
        obiekt.poleStatic = 123;
        System.out.println("KlasaStaticFinal.poleStatic: " + KlasaStaticFinal.poleStatic);
        KlasaStaticFinal.metodaStatyczna();

        // final
        System.out.println("Pole final: " + obiekt.poleFinal);

        //static final



    }
}
