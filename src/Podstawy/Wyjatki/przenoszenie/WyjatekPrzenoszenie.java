package Podstawy.Wyjatki.przenoszenie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjatekPrzenoszenie {

    public void wyjatkowaMetoda() throws FileNotFoundException {
        File file = new File("plik2.txt");
        InputStream inputStream = new FileInputStream(file);
    }
}
