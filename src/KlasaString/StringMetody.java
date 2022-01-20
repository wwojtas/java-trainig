package KlasaString;

import java.util.Locale;

public class StringMetody {
    public static void main(String[] args) {
        String tekst = "Jakis tekst";
        int ilosc = tekst.length();
        System.out.println(ilosc);

        System.out.println(tekst.isEmpty());

        char pojedynczyZnak = tekst.charAt(tekst.length()-1);
        System.out.println(pojedynczyZnak);

        System.out.println("Substring: " + tekst.substring(6));
        // two exuals

        String subbstring2 = tekst.substring(3, 8);
        System.out.println(subbstring2);

        // trim - usun spacje
        String trimString = "   string z trim       ";
        System.out.println(trimString);
        System.out.println(trimString.trim());

        String czyZawiera = " Czy zawiera jakis tekst  ";
        System.out.println(czyZawiera.trim().toLowerCase().startsWith("czy"));
        System.out.println(czyZawiera.contains("is"));

        System.out.println(czyZawiera.replace("k", "b"));


    }
}
