public class Zarulja {
    int serijskiBroj;
    boolean stanje;
    String imeProizvodaca;

    public Zarulja(String imeProizvodaca, int serijskiBroj, boolean stanje) {
        this.imeProizvodaca = imeProizvodaca;
        this.serijskiBroj = serijskiBroj;
        this.stanje = false;
    }

    public boolean isStanje() {
        return stanje;
    }

    public void paliGasi() {
        stanje= !stanje;
        }
    }
