package Wyjatki.WyjatkiSuper;

public class JakisException extends Exception {

    public JakisException(String message) {
//        dziedziczymy po nadrzednym exception wiec wpiszemy super
        super(message);
    }



}
