package klasyKontynuacja.zadania.zadanie1;

public class Programista {

    public static void main(String[] args) {

 /*       //Zadanie 1
        KlasaDlaProgramista programista = new KlasaDlaProgramista("adam", "nowak", "Angielski", 150.45);
       // KlasaDlaProgramista programista = new KlasaDlaProgramista();
//        programista.ustawImie("Jezyk");


        System.out.println(programista.pobierzImie() + " : "
                + programista.pobierzNazwisko() + " : "
                + programista.pobierzJezyk() + " : "
                + programista.pobierzZarobki() );
       */

/*
        // Zadanie 2

        int[] tab = {1, 2, 3, 4, 5, 6};
        TablicaObliczenia tablica = new TablicaObliczenia(tab);
        System.out.println(tablica.suma());
        System.out.println(tablica.srednia());
        System.out.println(tablica.wartoscMinimalna());
        System.out.println(tablica.wartoscMaksymalna());
*/


        // Zadanie 3
        System.out.println( Matma.obwodKola(3.14));
        System.out.println( Matma.poleKola(3.14));
        System.out.println( Matma.poleProstokoata(3.14, 2.15));
        System.out.println( Matma.obwódProstokoata(3.14, 2.15));

        int[] tab = {12,13,18,45};
        System.out.println(Matma.srednia(tab));



    }


}
