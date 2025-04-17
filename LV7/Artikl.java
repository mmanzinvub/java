public class Artikl {
    String naziv;
    double cijena;

    public Artikl(String naziv, double cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    //setteri
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    //getteri
    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }
}
