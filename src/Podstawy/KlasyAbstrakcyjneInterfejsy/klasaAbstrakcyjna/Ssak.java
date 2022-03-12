package Podstawy.KlasyAbstrakcyjneInterfejsy.klasaAbstrakcyjna;

public abstract class Ssak {
     public void karmieniePotomstwa() {
         System.out.println("karmie mlekiem");
     }

     public void temperaturaCiala() {
         System.out.println("Temperatura ciala stała");
     }

     public void podajIloscKonczyn() {
         System.out.println("Mam 4 konczyny");
     }

     public abstract void wydajDzwiek();
     public abstract void przzemieszczanieSie();

}
