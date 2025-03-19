public class Main {
    public static void main (String args[]) {
        Computer computer = new Computer("FA706", "ASUS", "Win10");
        Desktop desktop = new Desktop("Full size", "ASUS", "Win11", 50);
        Laptop laptop = new Laptop("T480s", "Lenovo", "Linux", 50000, 1.5);

        System.out.println(computer);
        System.out.println(desktop);
        System.out.println(laptop);
    }
}
