package Wyjatki.wyjatkiTworzenie;

public class Uzytkownik {

    public void wprowadzHaslo(String haslo) throws NIezbytTajneHasloException {
        if (!haslo.contains("tajne")) {
            throw new NIezbytTajneHasloException();
        }
        // zrob odpowiednie rzeczy z hasłem..
    }

    public void wprowadzEmail(String email) throws NiepoprawnyEmailException {
        if (!email.contains("@")) {
            throw new NiepoprawnyEmailException();
        }
    }
}


