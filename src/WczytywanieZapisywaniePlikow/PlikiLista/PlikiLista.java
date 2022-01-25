package WczytywanieZapisywaniePlikow.PlikiLista;

import java.util.ArrayList;
import java.util.List;

public class PlikiLista {
    public static void main(String[] args) {

        int[] tab = new int[10];
//        Typy proste   -> Klasa osłonowa;
//        int           -> Integer;
//        boolean       -> Boolean;
//        char          -> Character;
//        float         -> Float;
//        double        -> Double;

        List<Integer> mojaLista = new ArrayList<>();
        // dodawania elementów do listy
        mojaLista.add(10);
        mojaLista.add(5);
        mojaLista.add(-101);
        mojaLista.add(55000);
        mojaLista.add(1234);
//        mojaLista.remove(2);

        // wyswietl całą listę
        System.out.println(mojaLista);

        // pobieranie elementów z listy
//        mojaLista.get(i);
        for (int i = 0; i < mojaLista.size(); i++) {
            System.out.println(mojaLista.get(i));
        }

//        tworzenie kolejnej listy
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("a");


    }
}
