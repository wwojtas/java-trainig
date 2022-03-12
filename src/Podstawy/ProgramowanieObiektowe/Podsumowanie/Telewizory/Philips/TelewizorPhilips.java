package Podstawy.ProgramowanieObiektowe.Podsumowanie.Telewizory.Philips;

import Podstawy.ProgramowanieObiektowe.Podsumowanie.Telewizory.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {

    private String id;
    protected boolean statusWlaczony = false;
    private int obecnyProgram = 3;
    private int cale;

    protected TelewizorPhilips(String id, int cale){
        this.id = id;
        this.cale = cale;
    }

    public String getId() {
        return id;
    }

    public int getCale() {
        return cale;
    }

    @Override
    public void wlacz() {
        statusWlaczony = true;
        emitujSygnalNaEkran();
        System.out.println("WITAJ PHILIPS");
    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("CZARNOSC");
    }

    @Override
    public void akcjaZasilania() {
        if (statusWlaczony) {
            wylacz();
        } else {
            wlacz();
        }
    }

    @Override
    public void przelaczProgram(int numer) {
        if (statusWlaczony) {
            obecnyProgram = numer;
        }
    }

    private void emitujSygnalNaEkran() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony) {
                    try {
                        System.out.println("Obecny program: " + obecnyProgram);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }
}
