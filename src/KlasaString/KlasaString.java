package KlasaString;

import java.sql.SQLOutput;

public class KlasaString {
    public static void main(String[] args) {
       String nazwaDlaStringa = "Nazwa dla stringa";
        System.out.println(nazwaDlaStringa);
        String kolejnyString = "To jest kolejny string";
        System.out.println(kolejnyString);

        String polaczoneStringi = nazwaDlaStringa + " : " + kolejnyString;
        System.out.println(polaczoneStringi);
    }
}
