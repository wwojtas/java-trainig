package KlasyThis;

public class MainThis {
    public static void main(String[] args) {
        KlasaRozszerzona obiekt1 = new KlasaRozszerzona();
        System.out.println("ODDZIELENIE");
        KlasaRozszerzona obiekt2 = new KlasaRozszerzona(111);
        System.out.println("ODDZIELENIE");
        KlasaRozszerzona obiekt3 = new KlasaRozszerzona(1,2);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

        obiekt3.metodaZParametrami(1234);
        System.out.println("Pole: " + obiekt3.pole);
     }





}
