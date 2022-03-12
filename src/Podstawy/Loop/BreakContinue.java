package Podstawy.Loop;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i > 5) {
                continue;
            }
            System.out.println("zmienna: " + i);
        }
        System.out.println("==============================");
        for (int i = 1; i <= 20 ; i++) {
            if(i == 17) break;
            System.out.println("Zmienna w drugiej petli: " + i);

        }


    }
}
