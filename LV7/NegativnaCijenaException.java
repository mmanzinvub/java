public class NegativnaCijenaException extends Exception {
    public NegativnaCijenaException() {
        super("Cijena artikla je manja od 0.");
    }
}
