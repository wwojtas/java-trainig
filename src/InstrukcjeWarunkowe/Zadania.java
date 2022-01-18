package InstrukcjeWarunkowe;

public class Zadania {
    public static void main(String[] args) {
        // zad 1
        int liczba = 20;

        if (liczba % 2 != 0) {
            System.out.println("Liczba nieparzysta");
        } else {
            System.out.println("Liczba parzysta");
        }

        // zad 2 - podatek
        double kwota = 55321.89;
        if(kwota <= 85528) {
            double podatek = kwota * 0.17;
            System.out.println("Podatek: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528)   * 0.32;
            double sumPodatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Większy podatek: " + sumPodatek);
        }

        // zad - 3 kalkulator

        double liczba1 = 5;
        double liczba2 = 5;
        char znak = '/';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '/':
                wynik = liczba1 / liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            default:
                System.out.println("Błąd");
        }
        System.out.println("Wynik: " + wynik);

    }

}

