package ProgramowanieObiektowe.Podsumowanie.Telewizory.Samsung;

import ProgramowanieObiektowe.Podsumowanie.Telewizory.Telewizor;

public abstract class TelewizorSamsung implements Telewizor {

    private boolean stanWlaczony = false;
    private int numerKanalu = 1;
    private int cale;
    protected TelewizorSamsung(int cale) {
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        stanWlaczony = true;
        System.out.println("SAMSUNG TV");
        wyswietlajObraz();
    }

    @Override
    public void wylacz() {
        System.out.println("Animacja czarnosci");
        stanWlaczony = false;
    }

    @Override
    public void akcjaZasilania() {
        if (stanWlaczony) {
            wylacz();
        } else {
            wlacz();
        }
    }

    @Override
    public void przelaczProgram(int numer) {
        if(stanWlaczony) {
            numerKanalu = numer;
        }
    }

    private void wyswietlajObraz(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(stanWlaczony){
                    try {
                        System.out.println("Wyswietlaj obraz: " + numerKanalu);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
