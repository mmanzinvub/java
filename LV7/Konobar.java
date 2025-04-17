public class Konobar {
    String korisnickoIme;
    String lozinka;
    int brojNarudzbi;

    public Konobar() {
        korisnickoIme = "";
        lozinka = "";
        brojNarudzbi = 0;
    }

    //setteri
    public void setKorisnickoIme() {
        this.korisnickoIme = korisnickoIme;
    }

    public void setLozinka() {
        this.lozinka = lozinka;
    }

    public void setBrojNarudzbi() {
        this.brojNarudzbi = brojNarudzbi;
    }

    //getteri
    public String getKorisnickoIme(String korisnickoIme) {
        return korisnickoIme;
    }

    public String getLozinka(String lozinka) {
        return lozinka;
    }

    public int getBrojNarudzbi(int brojNarudzbi) {
        return brojNarudzbi;
    }
}
