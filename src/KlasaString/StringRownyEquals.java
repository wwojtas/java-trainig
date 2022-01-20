package KlasaString;

public class StringRownyEquals {
    public static void main(String[] args) {

        // sprawdza czy ten sam adres w pamieci komputera
        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";

        if(strLiteral1 == strLiteral2) {
            System.out.println("rowne");
        }

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");

        if(strObject1 == strObject2) {
            System.out.println("rowne -- Tak");
        } else {
            System.out.println("nie - NIe");
        }

        System.out.println(strLiteral1.equals(strLiteral2));
        System.out.println(strObject1.equals(strObject2));
        System.out.println(strObject1.equals(strLiteral1));

        String innyTekst = "inny tekst";

    }
}
