package KlasyAbstrakcyjneInterfejsy.interfejs;

import java.sql.SQLOutput;

public class Ryba implements Zwierze{

    @Override
    public void oddycha() {
        System.out.println("Skrzela");
    }

    @Override
    public void odzywianie() {
        System.out.println("Robaki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("Ikra");
    }
}
