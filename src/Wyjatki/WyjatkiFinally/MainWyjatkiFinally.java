package Wyjatki.WyjatkiFinally;


public class MainWyjatkiFinally {
    static String str = "String tekst";

    public static void main(String[] args) {


        try {
            System.out.println("Wszystko WIELKA LITERA " + str.toUpperCase());
            System.out.println("Znak na miejscu 100: " + str.charAt(100));

        } catch (NullPointerException exception) {
            System.out.println("Poszedl null");
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Poszedl poza zakres");
        } finally {
            System.out.println("Ja i tak zawsze sie wykonam");
        }


    }
}
