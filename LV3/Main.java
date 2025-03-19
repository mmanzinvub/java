public class Main {
    public static void main (String[] args) {
        Desktop desktop = new Desktop("Full size", "ASUS", "Win11", 50);
        Laptop laptop = new Laptop("T480s", "Lenovo", "Linux", 50000, 1.5);

        System.out.println(desktop.getComputerType());
        System.out.println(desktop.getPortabilityScore());
        System.out.println(laptop.getComputerType());
        System.out.println(laptop.getPortabilityScore());

        /*
        Kada computer postane abstract klasa onda vise nije moguce stvoriti computer objekte
        */
    }
}
