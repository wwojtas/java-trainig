package Wyjatki.checkUncheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;

public class MainWyjatkiCheckUncheck {
    public static void main(String[] args) {

        File file = new File("plik2.txt");
        // check exception
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      //  SQLException - to też wyjatek typu check

        //uncheck exception - możemy ale nie musimy ich obsługiwać
//        NullPointerException, ArrayIndexOutOfBoundsException


    }
}
