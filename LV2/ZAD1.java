public class ZAD1 {
    public static void main(String[] args) {
        Zarulja[] zarulje = new Zarulja[10];

        for (int i = 0; i < zarulje.length; i++) {
            zarulje[i] = new Zarulja("Osram", i,false);
            if (i % 2 == 0) {
                zarulje[i].paliGasi();
            }
            System.out.println(zarulje[i].isStanje());
        }
    }
}
