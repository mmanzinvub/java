public class Osoba implements iVaranje{
    String ime;
    String prezime;
    double razinaEnergije;
    int starost;

    public Osoba (String ime, String prezime, double razinaEnergije, int starost) {
        this.ime = ime;
        this.prezime = prezime;
        this.razinaEnergije = razinaEnergije;
        this.starost = starost;
    }

    public String predstavljanje() {
        return "Ja sam" + ime + " " + prezime + "."
                + "Imam " + starost + " godina i razina energije mi je "
                + razinaEnergije;
    }

    public int hodanje() {
        return (int)(razinaEnergije - 10);
    }

    @Override
    public void kretanjePoVodi() {
        if ((int)(razinaEnergije) > 0) {
            razinaEnergije = (int)(razinaEnergije) - 10;
            System.out.println("Hodate po vodi.");
        }
        else {
            System.out.println("Utopili ste se zbog manjka energije.");
        }
    }

    @Override
    public void letenje() {
        if ((int)(razinaEnergije) > 0) {
            razinaEnergije = (int)(razinaEnergije) - 10;
            System.out.println("Letite.");
        }
        else {
            System.out.println("Padate prema tlu zbog manjka energije.");
        }
    }

    //setteri
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setRazinaEnergije(double razinaEnergije) {
        this.razinaEnergije = razinaEnergije;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    //getteri
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getRazinaEnergije() {
        return razinaEnergije;
    }

    public int getStarost() {
        return starost;
    }
}
