package ProgramowanieObiektowe.Podsumowanie.Telewizory.Samsung;

public class UE43RU7 extends TelewizorSamsung{

    private String id;
    private String hdmi1;
    private String hdmi2;
    private String opticIn;
    private String usb1;
    private String usb2;

    public UE43RU7(String id) {
        super(43);
    }

    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }

    public void setHdmi2(String hdmi2) {
        this.hdmi2 = hdmi2;
    }

    public void setOpticIn(String opticIn) {
        this.opticIn = opticIn;
    }

    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }

    public void setUsb2(String usb2) {
        this.usb2 = usb2;
    }
}
