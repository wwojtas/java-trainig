package Enum.Enum;

public class MainTypWyliczeniowyEnum {
    public static void main(String[] args) {
        KierunekSwiata kierunek = KierunekSwiata.POLNOC;
        System.out.println(kierunek);

//        if(kierunek.equals(KierunekSwiata.POLNOC)) {
//            System.out.println("poszedl na północ");
//        } else if (kierunek == KierunekSwiata.POLUDNIE) {
//            System.out.println("Poszedl na poludnie");
//        } else if (kierunek == KierunekSwiata.WSCHOD) {
//            System.out.println("Poszedl na wschod");
//        } else if (kierunek == KierunekSwiata.ZACHOD) {
//            System.out.println("Poszedl na zachod");
//        } else {
//            System.out.println("Cos poszło nie tak");
//        }

        switch (kierunek) {
            case POLNOC -> System.out.println("Polnoc");
            case POLUDNIE -> System.out.println("POLUDNIE");
            case WSCHOD -> System.out.println("WSCHOD");
            case ZACHOD -> System.out.println("ZACHOD");
            default -> System.out.println("Cos tam");
        }

        // ordinal(), valueOf(), values()

        KierunekSwiata kierunekSwiata = KierunekSwiata.WSCHOD;
        System.out.println( "Ordinal: " + kierunekSwiata.ordinal());

        KierunekSwiata kierunekSwiataKolejny = KierunekSwiata.valueOf("WSCHOD");
        System.out.println("valueOf(): " + kierunekSwiataKolejny);

        KierunekSwiata[] kierunekSwiatas =  KierunekSwiata.values();
        for (int i = 0; i < kierunekSwiatas.length; i++) {
            System.out.println("i: " + i + " kierunek " + kierunekSwiatas[i]);
        }
        KierunekSwiata ks = KierunekSwiata.values()[2];
        System.out.println("values()[2]: " + ks);



    }
}
