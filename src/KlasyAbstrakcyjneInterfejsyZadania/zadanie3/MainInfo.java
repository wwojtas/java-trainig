package KlasyAbstrakcyjneInterfejsyZadania.zadanie3;

public class MainInfo {
    public static void main(String[] args) {

        Info infoAnonimowe = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("Informacja z klasy anonimowej");
            }
        };
        infoAnonimowe.wyswietlInfo();
    }

    interface Info{
        void wyswietlInfo();
    }

}
