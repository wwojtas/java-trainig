package ProgramowanieObiektowe.Podsumowanie.Telewizory;

import ProgramowanieObiektowe.Podsumowanie.Telewizory.Philips.P43PUS6523;
import ProgramowanieObiektowe.Podsumowanie.Telewizory.Philips.P55PUS7;
import ProgramowanieObiektowe.Podsumowanie.Telewizory.Samsung.UE43RU7;

import java.util.Scanner;

public class MainOOPPodsumowanie {
    public static void main(String[] args) {
        obslugaTV();
//        obslugaPilota();
    }

    private static void obslugaTV() {
        Scanner scanner = new Scanner(System.in);
//        UE43RU7 tv = new UE43RU7("Unikalny123");
//         obraz dzialania polimorfizmu poniżej
//        mimo kilku klas podrzednych,
//         możemy wywoływac metody poprzez interfejs
//        P43PUS6523 tv = new P43PUS6523("Philips-1234");
//        Telewizor tv = new UE43RU7("Samsung-987");

        Telewizor tv = new P55PUS7("Philips-AmbiLight");

        int opcja = 0;
        System.out.println("1-Włacz; 2-Wylacz; 3-Zmien program; 4-Zakoncz");
        while (opcja != 4) {
            opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj nr programu: ");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;
            }
        }
        scanner.close();
    }

//    private static void obslugaPilota() {
//        Pilot pilot = new PilotNoName();
//        Telewizor telewizor = new UE43RU7("Samsung-123");
//        pilot.sparujTelewizor(telewizor);
//
//        Scanner scanner = new Scanner(System.in);
//        int opcja;
//        System.out.println("0-nacisnij czerwony, 1. Nacisnij 1,; Nacisnij 2; Nacisnij 3; 4 - Zakoncz");
//        do {
//            opcja = scanner.nextInt();
//            switch (opcja) {
//                case 0:
//                    pilot.nacisnijCzerwony();
//                    break;
//                case 1:
//                    pilot.nacisnijJeden();
//                    break;
//                case 2:
//                    pilot.nacisnijDwa();
//                case 3:
//                    pilot.nacisnijTrzy();
//                    break;
//            }
//        }while(opcja != 4);
//
//
//        scanner.close();
//    }


}
