package Podstawy.KlasyAbstrakcyjneInterfejsy.klasaAnonimowa;

public class MainKlasaAnonimowa {
    public static void main(String[] args) {

        // tworzenie klasy anonimowej
       ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa(){
            // przesloniecie (Override) metody z klasy ZwyklaKlasa
            @Override
            public void metodaZwykla() {
//                super.metodaZwykla();
                System.out.println("Metoda wywolana z klasy anonimowej");
            }
        };
       obiektKlasyAnonimowej.metodaZwykla();
       metodaTutaj(new Button() {
           @Override
           public void onClick() {
               super.onClick();
               System.out.println(" i pokazalem cos uzytkownikowi");
           }
       });

//       ZwyklaKlasa zwyklaKlasa = new ZwyklaKlasa();
//       metodaTutaj(new ZwyklaKlasa() {
//           @Override
//           public void metodaZwykla() {
//               System.out.println("Specjalnie dla Was zmienione zachowanie");
//           }
//       });
    }

    public static void metodaTutaj(Button button) {
        button.onClick();
    }

    static class Button {
        public void onClick() {
            System.out.print("Nacisnalem na przycisk");
        }
    }
}
