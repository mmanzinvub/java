import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public abstract class Racun implements UpravljanjeRacunima {
    ArrayList<Artikl> listaArtikala;
    double ukupnaCijena;
    Date datumIzdavanja;

    /* stari nacin za konstruktor (default)
    public Racun (String naziv, double cijena, ArrayList<Artikl> listaArtikala, double ukupnaCijena, Date datumIzdavanja) {
        super(naziv, cijena);
        this.listaArtikala = listaArtikala;
        this.ukupnaCijena = ukupnaCijena;
        this.datumIzdavanja = datumIzdavanja;
    }
    */

    public Racun() {
        listaArtikala = new ArrayList<>();
        ukupnaCijena = 0.0;
        datumIzdavanja = new Date();
    }

    //setteri
    public void setListaArtikala (ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    public void setUkupnaCijena (double ukupnaCijena) {
        this.ukupnaCijena = ukupnaCijena;
    }

    public void setDatumIzdavanja (Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    //getteri
    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public double getUkupnaCijena() {
        return ukupnaCijena;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    //UpravljanjeRacunima metode
    public void dodajArtikl(Artikl artikl) throws NegativnaCijenaException {
        if (artikl.getCijena() < 0) {
            throw new NegativnaCijenaException();
        }
        listaArtikala.add(artikl);
        ukupnaCijena += artikl.getCijena();
    }

    public void ukloniArtikl(String nazivArtikla) throws ArtiklNepostojiException {
        Artikl zaIzbaciti = null;

        for (Artikl artiklZaIzbaciti : listaArtikala) {
            if (artiklZaIzbaciti.getNaziv().equalsIgnoreCase(nazivArtikla)) {
                zaIzbaciti = artiklZaIzbaciti;
                break;
            }
        }

        if (zaIzbaciti != null) {
            listaArtikala.remove(zaIzbaciti);
            ukupnaCijena -= zaIzbaciti.getCijena();
        } else {
            throw new ArtiklNepostojiException();
        }
    }
}
