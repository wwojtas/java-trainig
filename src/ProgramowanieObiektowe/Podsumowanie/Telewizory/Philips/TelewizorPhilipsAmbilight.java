package ProgramowanieObiektowe.Podsumowanie.Telewizory.Philips;

public abstract class TelewizorPhilipsAmbilight extends TelewizorPhilips {

    protected TelewizorPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }

    @Override
    public void wlacz() {
        super.wlacz();
        ambiLight();
    }

    @Override
    public void wylacz() {
        super.wylacz();
    }

    private void ambiLight() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusWlaczony){
                    try {
                        System.out.println("Wyswietl kolorki z tylu");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }




}
