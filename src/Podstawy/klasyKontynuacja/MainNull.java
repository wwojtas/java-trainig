package Podstawy.klasyKontynuacja;

public class MainNull {
//    static String str;
    static String str = new String(); // tu string nie jest nullem

    public static void main(String[] args) {
        if(str == null) {
            System.out.println("Str jest nullem");
        }
        // obiekt nie jest utworzony i nie mozna na nim wywoływać na nim żadnych metod
        // wystąpi błąd
        str.isEmpty();
    }
}
