package KlasyAbstrakcyjneInterfejsyUtrwalenie;

public class MainUtrwalenieKlasyInterfejsy {
    public static void main(String[] args) {
        Klasa obiekt = new Klasa() {
            // tutaj można Overridować metody z klasy anonimowej - tutaj z Klasa()

            @Override
            public void metodaKlasa() {
                System.out.println("Anonimowa klasa: metodaKlasa");
            }

            @Override
            public void metodaInterfejsu() {
                System.out.println("Anonimowa klasa: metodaInterfejsu");
            }
        };

        KlasaAbstrakcyjna obiektKlasaAbstrkcyjna =  new KlasaAbstrakcyjna() {

            @Override
            public void metodaAbstrakcyjna() {
                System.out.println("Druga klasa anonimowa: metodaAbstrakcyjna");
            }
        };

        DrugiInterfejs obiektDrugiInterfejs = new DrugiInterfejs(){

            @Override
            public int metodaDrugiegoInterfejsu() {
                return 10;
            }

            @Override
            public String kolejnaMetodaInterfejsuDrugiego() {
                return "Klasa anonimowa";
            }
        };




    }
}
