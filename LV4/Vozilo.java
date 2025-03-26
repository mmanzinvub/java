public abstract class Vozilo {
    String registracijskaOznaka;
    int brojSjedala;
    int brojVrata;

    public Vozilo (String registracijskaOznaka, int brojSjedala, int brojVrata) {
        this.registracijskaOznaka = registracijskaOznaka;
        this.brojSjedala = brojSjedala;
        this.brojVrata = brojVrata;
    }

    public abstract int vozi();

    //setteri
    public void setRegistracijskaOznaka(String registracijskaOznaka) {
        this.registracijskaOznaka = registracijskaOznaka;
    }

    public void setBrojSjedala(int brojSjedala) {
        this.brojSjedala = brojSjedala;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    //getteri
    public String getRegistracijskaOznaka() {
        return registracijskaOznaka;
    }

    public int getBrojSjedala() {
        return brojSjedala;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

}
