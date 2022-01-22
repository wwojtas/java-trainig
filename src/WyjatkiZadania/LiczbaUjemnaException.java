package WyjatkiZadania;

public class LiczbaUjemnaException extends RuntimeException{

    // stworzenie własnego wyjatku
    public LiczbaUjemnaException() {
        super("Liczba nie może być ujemna - Wiadomość z konstruktora ");
    }
}
