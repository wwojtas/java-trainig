package Podstawy.KlasyAbstrakcyjneInterfejsy.klasaWewnetrzna;

public class Zewnetrzna {

    int poleZewnetrzne;
    int metodaZewnetrzna() {
        Wewnetrzna wewnetrzna = new Wewnetrzna();
        return -1;
    }

    class Wewnetrzna {
        int poleWewnetrzne;
        int metodaWeewnetrzna() {
            metodaZewnetrzna();
            poleZewnetrzne = 101;
            return -2;
        }
    }


}
