public enum Smjerovi {
    SJEVER ("N"),
    JUG ("S"),
    ISTOK ("E"),
    ZAPAD ("W");

    private String kratica;

    Smjerovi(String kratica) {
        this.kratica = kratica;
    }

    public String getKratica() {
        return kratica;
    }
}


