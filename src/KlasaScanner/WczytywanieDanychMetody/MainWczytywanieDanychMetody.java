package KlasaScanner.WczytywanieDanychMetody;

import java.util.Scanner;

public class MainWczytywanieDanychMetody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // 1 sposób
//        while(scanner.hasNextInt()) {
//            int intValue = scanner.nextInt();
//            System.out.println("Wpisano: " + intValue);
//        }

        // 2 sposób
//        while(scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println("Wpisano: " + line);
//        }

        // 3 sposób
        String next;
        while(!(next = scanner.next()).equals("X")) {
            System.out.println("Wpisany next: " + next);
        }

        //System.out.println("Zakonczylem dzialaniae");





        }

    }

