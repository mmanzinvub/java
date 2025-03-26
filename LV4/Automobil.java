public class Automobil extends Vozilo implements iVaranje {
    String marka;
    double zapremninaGoriva;

    public Automobil (String registracijskaOznaka, String marka,int brojSjedala, int brojVrata, double zapremninaGoriva) {
        super(registracijskaOznaka, brojSjedala, brojVrata);
        this.marka = marka;
        this.zapremninaGoriva = zapremninaGoriva;
    }

    @Override
    public int vozi() {
        return (int)(zapremninaGoriva - 10);
    }

    @Override
    public void letenje() {
        if ((int)(zapremninaGoriva) > 0) {
            zapremninaGoriva = (int)(zapremninaGoriva - 10);
            System.out.println("Auto je u zraku.");
        }
        else {
            System.out.println("Auto pada.");
        }
    }

    @Override
    public void kretanjePoVodi() {
        if ((int)(zapremninaGoriva) > 0) {
            zapremninaGoriva = (int)(zapremninaGoriva - 10);
            System.out.println("Vas auto je sad brod.");
        }
        else {
            System.out.println("Auto se utopio.");
        }
    }

    //setteri
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setZapremninaGoriva(double zapremninaGoriva) {
        this.zapremninaGoriva = zapremninaGoriva;
    }

    //getteri
    public String getMarka() {
        return marka;
    }

    public double getZapremninaGoriva() {
        return zapremninaGoriva;
    }
}
