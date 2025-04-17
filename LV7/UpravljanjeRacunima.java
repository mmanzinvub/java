public interface UpravljanjeRacunima {
    void dodajArtikl(Artikl artikl) throws NegativnaCijenaException;
    void ukloniArtikl(String nazivArtikla) throws ArtiklNepostojiException;
}
